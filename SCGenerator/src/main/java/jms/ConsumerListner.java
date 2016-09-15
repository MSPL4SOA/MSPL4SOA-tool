package jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import scfactory.SCGenerator;
import state.StateMessagingDP;

public class ConsumerListner implements MessageListener {

	SCGenerator amGenerator;
	Session session;

	public ConsumerListner(SCGenerator configurationGenerating, Session session) {
		this.amGenerator = configurationGenerating;
		this.session = session;
	}

	// variable for in pattern
	public void onMessage(Message message) {
		Object reponseMessage = null;
		
		
		if (amGenerator.extractCapabilityFromContract().broker.transactional == true)
			try {
				session.commit();
			} catch (JMSException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}

		if (message != null) {

			// headers state
//			String serviceNameState;
//			String methodNameState;
			String state;
			try {
//				serviceNameState = message.getStringProperty("service_name_state");
//				methodNameState = message.getStringProperty("method_name_state");

				
				if (amGenerator.extractCapabilityFromContract().stateMessaging == true) {
					state = message.getStringProperty(StateMessagingDP.HeaderName) + "\n";
					//
//					System.out.println("StateHeader: " + state);
					
					
					if (amGenerator.extractCapabilityFromContract().stateRepository == true)
						amGenerator.stateMessagingDP.setStateInDisk(state);

					
					if (amGenerator.extractCapabilityFromContract().temporaryMemory == true)
						amGenerator.stateMessagingDP.setStateInMemory(state);
				}
				//
				// //////////////////
			} catch (JMSException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (message instanceof ObjectMessage) {
				try {
					reponseMessage = ((ObjectMessage) message).getObject();

				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			else if (message instanceof TextMessage) {
				try {
					reponseMessage = ((TextMessage) message).getText();

				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		// this.configurationGenerating.setResponse(reponseMessage);
		this.amGenerator.getReponseList().add(reponseMessage);
//
//		try
//
//		{
//			if (configurationGenerating.getFeaturesList().contains("ClientACK"))
//				message.acknowledge();
//		} catch (
//
//		JMSException e)
//
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//		System.out.println("ObjectMessage: " + reponseMessage);
	}

}
