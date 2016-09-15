package jms;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.UUID;
import java.util.logging.Logger;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.Topic;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import features.jms.Broker;
import scfactory.SCGenerator;
import scfactory.SCGeneratorException;
import scfactory.InputFactory;
import state.StateMessagingDP;

public class JMSFactory {

	// Mondatory
	private static final Logger log = Logger.getLogger(JMSFactory.class.getName());

	// Mondatory
	private Context context;
//	private String brokerName;
	private ConnectionFactory connectionFactory;
	private Connection connection;
	private Session session;

	// variable for out pattern (topic use)
	private Destination inDest;
	private MessageProducer producer;
	// variable for in pattern
	// queue or topic
	private Destination outDest;
	private MessageConsumer consumer;

//	private MessageConsumer errorConsumer;
//	private Session sessionError;

	private String clientId;

	private int ack;
	private Object data;

	private ObjectMessage message;
	private String subscriptionName;

	SCGenerator amGenerator;

	public JMSFactory(SCGenerator amGenerator) throws SCGeneratorException {
		this.amGenerator = amGenerator;

		if (amGenerator.extractCapabilityFromContract().getInputs().size() != 0)
			this.data = InputFactory.getInstance(amGenerator);
		else
			this.data = null;
	}

	// Mondatory
	public void initConf() throws GeneratingJMSException, JMSException, NamingException {

		try {
			// Variable
			// broker type;
			// if (featuresList.contains("ActiveMQ"))
			// brokerName = "ActiveMQ";
			// if (featuresList.contains("HornetQ"))
			// brokerName = "HornetQ";

			Broker broker = amGenerator.extractCapabilityFromContract().broker;
			
//			System.out.println(broker.getInitialContextFactory());
//			System.out.println(broker.getProviderUrl());
//			System.out.println(broker.getSecurityPrincipal());
//			System.out.println(broker.getSecurityCredentials());
//			
//			System.exit(-1);
			// for (Broker brokerTemp : jndijms.getBrokerList()) {
			//
			// if (brokerTemp.getBrokerName().equalsIgnoreCase(brokerName)) {
			// broker = brokerTemp;
			// break;
			// }
			// }
			
			// Mondatory
			final Properties env = new Properties();
			env.put(Context.INITIAL_CONTEXT_FACTORY, broker.getInitialContextFactory());
			env.put(Context.PROVIDER_URL, System.getProperty(Context.PROVIDER_URL, broker.getProviderUrl()));
			env.put(Context.SECURITY_PRINCIPAL, System.getProperty("username", broker.getSecurityPrincipal()));
			env.put(Context.SECURITY_CREDENTIALS, System.getProperty("password", broker.getSecurityCredentials()));

			context = new InitialContext(env);
			//
			connectionFactory = (ConnectionFactory) context
					.lookup(System.getProperty("connection.factory", broker.getConnectionConsumerFactory()));
			//
			// this.context.close();
			//
//			log.info("Found connection factory \"" + broker.getConnectionConsumerFactory() + "\" in JNDI");
			//

			connection = connectionFactory.createConnection(
					System.getProperty("username", broker.getSecurityPrincipal()),
					System.getProperty("password", broker.getSecurityCredentials()));

			//
			if (amGenerator.extractCapabilityFromContract().broker.durable == true) {

				clientId = UUID.randomUUID().toString();
//				log.info("clientId for durable subscriber: " + clientId);
				connection.setClientID(clientId);
			}

			if (amGenerator.extractCapabilityFromContract().broker.acknowledgement == true) {
				// if (featuresList.contains("AutoACK"))
				// ack = Session.AUTO_ACKNOWLEDGE;
				// else if (featuresList.contains("ClientACK"))
				// ack = Session.CLIENT_ACKNOWLEDGE;
				// else if (featuresList.contains("DUPS_OKACK"))
				// ack = Session.DUPS_OK_ACKNOWLEDGE;

				ack = Session.AUTO_ACKNOWLEDGE;
				session = connection.createSession(false, ack);
			}

			if (amGenerator.extractCapabilityFromContract().broker.transactional == true) {
				session = connection.createSession(true, Session.DUPS_OK_ACKNOWLEDGE);
				
			}
			// the args are variable

			// C2P
			// if (featuresList.contains("InWay")) {

			// if (featuresList.contains("InQueue")) {
			// inDest = (Destination)
			// context.lookup(System.getProperty("destination",
			// broker.getQueueIn()));

			inDest = session.createQueue(broker.getQueueIn());
//			log.info("Found destination \"" + System.getProperty("destination", broker.getQueueIn()) + "\" in JNDI");
			// } else {
			// // inDest = (Destination)
			// // context.lookup(System.getProperty("destination",
			// // broker.getTopic()));
			// inDest = session.createTopic(broker.getTopic());
			// }

			producer = session.createProducer(inDest);
			//
			// the args are variable

			if (amGenerator.extractCapabilityFromContract().broker.persistentDelivery == true)
				producer.setDeliveryMode(DeliveryMode.PERSISTENT);
			else
				producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			// if (featuresList.contains("ErrorQueue")) {
			// // errorConsumer
			// // Variable
			// sessionError = connection.createSession(false,
			// Session.AUTO_ACKNOWLEDGE);
			// Destination queueeErrDest =
			// sessionError.createQueue(broker.getQueueError());
			// errorConsumer = sessionError.createConsumer(queueeErrDest);
			//
			// DLKMessageListner dlkMessageListner = new
			// DLKMessageListner(this.configurationGenerating);
			//
			// errorConsumer.setMessageListener(dlkMessageListner);
			// // }
			// }

			// Not used yet
			// Consumer cc = new Consumer(session);
			// cc.createQueue(broker.getQueueOut());
			// cc.createConsumer();
			// cc.setMessageListener();

			// P2C
			if (amGenerator.extractCapabilityFromContract().getOutputs().size() != 0) {

				// if (featuresList.contains("OutWay")) {
				// variable for in pattern
				//

				if (amGenerator.extractCapabilityFromContract().broker.publishSubscribe == true) {
					// if (featuresList.contains("Server")) {

					// outDest = (Destination)
					// context.lookup(System.getProperty("destination",
					// broker.getTopic()));
					outDest = session.createTopic(broker.getTopic());

//					log.info("Found destination \"" + System.getProperty("destination", broker.getTopic())
//							+ "\" in JNDI");
					// } else if (featuresList.contains("Temporary"))
					// outDest = session.createTemporaryTopic();
				} else {
					// if (featuresList.contains("AsynchronousQueue"))
					// if (featuresList.contains("Server")) {
					// outDest = (Destination)
					// context.lookup(System.getProperty("destination",
					// broker.getQueueOut()));

					outDest = session.createQueue(broker.getQueueOut());
//					log.info("Found destination \"" + System.getProperty("destination", broker.getQueueOut())
//							+ "\" in JNDI");
					// }
					// // or
					// else if (featuresList.contains("Temporary"))
					// outDest = session.createTemporaryQueue();
					//
				}

				if (amGenerator.extractCapabilityFromContract().broker.durable == true
						&& amGenerator.extractCapabilityFromContract().broker.publishSubscribe == true) {
					subscriptionName = "DurableSubscriber";
					consumer = session.createDurableSubscriber((Topic) outDest, subscriptionName);
				} else
					consumer = session.createConsumer(outDest);

				// Only for asynchronous client
				// Variable

				if (amGenerator.extractCapabilityFromContract().asynchronous == true) {
					ConsumerListner consumerListner = new ConsumerListner(this.amGenerator, session);
					consumer.setMessageListener(consumerListner);
				}
			}

			connection.start();

			// C2P
			// if (featuresList.contains("InWay"))
			this.sendMessageData();

			// if (featuresList.contains("OutWay"))
			// variable for synchronous client

			if (amGenerator.extractCapabilityFromContract().synchronous == true
					&& amGenerator.extractCapabilityFromContract().getOutputs().size() != 0) {
				SynchronousConsumer synchronousConsumer = new SynchronousConsumer(this.amGenerator,
						consumer, session);
				synchronousConsumer.handleOutPut();
			}

		} catch (Exception e) {
//			e.printStackTrace();
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			throw new GeneratingJMSException(errors.toString());
		}
		// // update here
		// finally {
		// closeJMS();
		// }
	}

	// variable for out pattern (topic use)
	public void sendMessageObject(Object data) throws JMSException {

		this.message = session.createObjectMessage();
		message.setObject((Serializable) data);

		this.addHeaders();

		if (amGenerator.extractCapabilityFromContract().getOutputs().size() != 0)
			this.addCallbackHeaders();

		if (amGenerator.extractCapabilityFromContract().twoWayState == true)
			this.addStateHeader();

		//
		// //variable for out pattern (topic use)
		this.producer.send(message);

		if (amGenerator.extractCapabilityFromContract().broker.transactional == true)
			this.session.commit();

//		log.info(message.toString());
	}

	@SuppressWarnings("unchecked")
	public void sendMessageData() throws JMSException {
		if (data instanceof ArrayList) {
			for (Object dataObject : (ArrayList<Object>) data) {
				sendMessageObject(dataObject);
			}
		} else
			sendMessageObject(data);
	}

	public void addCallbackHeaders() throws JMSException {
		message.setJMSReplyTo(outDest);
		message.setJMSCorrelationID(message.getJMSCorrelationID());
	}

	// variable for out pattern (topic use)
	public void addHeaders() throws JMSException {
		// variable
		// Mondatory
		message.setStringProperty("service_name", amGenerator.extractCapabilityFromContract().serviceName);
		message.setStringProperty("method_name", amGenerator.extractCapabilityFromContract().name);

		// message.setStringProperty("features",
		// Functions.listToString(featuresList, " "));

		if (amGenerator.extractCapabilityFromContract().authentification == true) {

			message.setStringProperty("username", amGenerator.extractCapabilityFromContract().username);
			message.setStringProperty("password", amGenerator.extractCapabilityFromContract().password);
		}
	}

	public void addStateHeader() throws JMSException {
		// String state = util.Functions.fileToString("state/" + serviceName +
		// "." + methodName + ".txt");

		message.setStringProperty(StateMessagingDP.HeaderName, amGenerator.stateMessagingDP.getState());
	}

	// Mondatory
	public void closeJMS() throws JMSException, NamingException {
		// variable for out pattern (topic use)

		// if (featuresList.contains("InWay"))
		this.producer.close();

		if (amGenerator.extractCapabilityFromContract().getOutputs().size() != 0) {
			this.consumer.close();
			// for durable topic

			if (amGenerator.extractCapabilityFromContract().broker.durable == true
					&& amGenerator.extractCapabilityFromContract().broker.publishSubscribe == true)
				this.session.unsubscribe(subscriptionName);
		}

		// if (ConfigurationGenerating.existFeature("AsynchronousErrorQueue",
		// featuresList))
		// this.sessionError.close();

		// Mondatory
		this.session.close();
		this.connection.stop();
		this.connection.close();

	}

}
