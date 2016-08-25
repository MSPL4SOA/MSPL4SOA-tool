package jms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "broker")
public class Broker {

	protected String brokerName;
	protected String initialContextFactory;
	protected String providerUrl;
	protected String securityPrincipal;
	protected String securityCredentials;
	protected String connectionFactory;
	protected String connectionConsumerFactory;
	protected String queueError;
	public String queueIn;
	public String queueOut;
	public String topic;

	public boolean transactional;
	public boolean acknowledgement;
	public boolean persistentDelivery;

	public boolean publishSubscribe;
	public boolean durable;
	// public static int capabilityCompt = 1;

	public String serviceName;
	public String capabilityName;

	public Broker() {
		this.brokerName = "HornetQ";
		this.queueError = "net implemented";
		this.initialContextFactory = "org.jboss.naming.remote.client.InitialContextFactory";
		this.providerUrl = "remote://localhost:4447";
		this.securityPrincipal = "guest";
		this.securityCredentials = "jboss@dmin88";
		this.connectionFactory = "#ConnectionFactory";
		this.connectionConsumerFactory = "jms/RemoteConnectionFactory";

		// this.queueIn = "in_queue_" + capability.service.interfaceName + "_" +
		// capability.name;
		// this.queueOut = "out_queue_" + capability.service.interfaceName + "_"
		// + capability.name;
		// this.topic = "topic_" + capability.service.interfaceName + "_" +
		// capability.name;

		// this.queueIn = "inQueue";
		// this.queueOut = "outQueue";
		// this.topic = "topicHornetq";
	}

	public void setQueues() {
		this.queueIn = "in_queue_" + serviceName + "_" + capabilityName;
		this.queueOut = "out_queue_" + serviceName + "_" + capabilityName;
		this.topic = "topic_" + serviceName + "_" + capabilityName;
	}

	// public Broker(String brokerName) {
	//
	// if (brokerName.equalsIgnoreCase("ActiveMQ")) {
	//
	// this.brokerName = "ActiveMQ";
	// this.queueIn = "queue_in";// topic_amq
	// this.queueOut = "queue_out";
	// this.queueError = "DLK";
	// this.initialContextFactory =
	// "org.apache.activemq.jndi.ActiveMQInitialContextFactory";
	// this.providerUrl = "tcp://localhost:61616";
	// this.securityPrincipal = "guest";
	// this.securityCredentials = "jboss@dmin88";
	// this.connectionFactory = "ConnectionFactory";
	// this.topic = "topic_amq";
	// }
	//
	// else if (brokerName.equalsIgnoreCase("HornetQ")) {
	//
	// this.brokerName = "HornetQ";
	// this.queueIn = "inQueue";
	// this.queueOut = "outQueue";
	// this.queueError = "DLQ";
	// this.initialContextFactory =
	// "org.jboss.naming.remote.client.InitialContextFactory";
	// this.providerUrl = "remote://localhost:4447";
	// this.securityPrincipal = "guest";
	// this.securityCredentials = "jboss@dmin88";
	// this.connectionFactory = "jms/RemoteConnectionFactory";
	// this.topic = "topicHornetq";
	// }
	//
	// }

	public String getQueueIn() {
		return queueIn;
	}

	public String getQueueOut() {
		return queueOut;
	}

	public String getInitialContextFactory() {
		return initialContextFactory;
	}

	public String getProviderUrl() {
		return providerUrl;
	}

	public String getSecurityPrincipal() {
		return securityPrincipal;
	}

	public String getSecurityCredentials() {
		return securityCredentials;
	}

	public String getConnectionFactory() {
		return connectionFactory;
	}

	public String getQueueError() {
		return queueError;
	}

	public String getTopic() {
		return topic;
	}

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public boolean istransactional() {
		return transactional;
	}

	public boolean isacknowledgement() {
		return acknowledgement;
	}

	public boolean ispersistentDelivery() {
		return persistentDelivery;
	}

	public String getCapabilityName() {
		return capabilityName;
	}

	public String getConnectionConsumerFactory() {
		return connectionConsumerFactory;
	}

	public String getServiceName() {
		return serviceName;
	}
	
	public boolean ispublishSubscribe() {
		return publishSubscribe;
	}
	
	public boolean isdurable() {
		return durable;
	}
}
