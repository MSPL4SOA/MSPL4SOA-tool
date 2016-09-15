package jms;

import java.io.File;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import scfactory.SCGenerator;
import util.Functions;
import state.StateMessagingDP;

public class SynchronousConsumer {

	SCGenerator amGenerator;
	private MessageConsumer consumer;
	Session session;

	public SynchronousConsumer(SCGenerator configurationGenerating, MessageConsumer consumer, Session session) {
		this.amGenerator = configurationGenerating;
		this.consumer = consumer;
		this.session = session;
	}

	public void handleOutPut() throws JMSException {
		// variable for synchronous client
		// while (true) {
		// Message m =
		// consumer.receive(this.configurationGenerating.getSleepConf());
		Message message = consumer.receive();

		if (amGenerator.extractCapabilityFromContract().broker.transactional == true)
			session.commit();

		Object reponseMessage = null;

		if (message != null) {

			if (amGenerator.extractCapabilityFromContract().stateMessaging == true) {
				// headers state
				// String serviceNameState =
				// message.getStringProperty("service_name_state");
				// String methodNameState =
				// message.getStringProperty("method_name_state");
				String state = message.getStringProperty("state") + "\n";
				//

				state = message.getStringProperty(StateMessagingDP.HeaderName) + "\n";
				//
				// System.out.println("state: " + state);

				if (amGenerator.extractCapabilityFromContract().stateRepository == true)
					amGenerator.stateMessagingDP.setStateInDisk(state);

				if (amGenerator.extractCapabilityFromContract().temporaryMemory == true)
					amGenerator.stateMessagingDP.setStateInMemory(state);

				//
				// //////////////////

				// System.out.println("state: " + state);
			}

			if (message instanceof TextMessage) {
				reponseMessage = ((TextMessage) message).getText();
			} else if (message instanceof ObjectMessage) {
				reponseMessage = ((ObjectMessage) message).getObject();
			}
			// break;
		}
		// }

		this.amGenerator.getReponseList().add(reponseMessage);

		// try
		//
		// {
		// if (configurationGenerating.getFeaturesList().contains("ClientACK"))
		// message.acknowledge();
		// } catch (
		//
		// JMSException e)
		//
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// System.out.println("ObjectMessage: " + reponseMessage);
	}

	public MessageConsumer getConsumer() {
		return consumer;
	}

	public void setConsumer(MessageConsumer consumer) {
		this.consumer = consumer;
	}

}
