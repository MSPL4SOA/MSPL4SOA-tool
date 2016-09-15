package sp_manager.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import sp_manager.state.State_ServiceName_4_CapabilityName_4_1;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_2;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_3;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_4;
import sp_manager.state.State_ServiceName_4_CapabilityName_4_5;

import sp_manager.input.InputDataClassName_4_3;
import sp_manager.input.InputDataClassName_4_4;
import sp_manager.input.InputDataClassName_4_5;

public class Composers_rest_ServiceName_4 extends RESTEasyMessageComposer {

	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;
	State_ServiceName_4_CapabilityName_4_2 instanceState_ServiceName_4_CapabilityName_4_2;
	State_ServiceName_4_CapabilityName_4_4 instanceState_ServiceName_4_CapabilityName_4_4;
	State_ServiceName_4_CapabilityName_4_5 instanceState_ServiceName_4_CapabilityName_4_5;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_4_3")) {
			InputDataClassName_4_3 in = new InputDataClassName_4_3();

			in.setInputName_4_3_1((Integer) source.getParameters()[0]);
			in.setInputName_4_3_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_4")) {
			InputDataClassName_4_4 in = new InputDataClassName_4_4();

			in.setInputName_4_4_1((Float) source.getParameters()[0]);
			in.setInputName_4_4_2((Integer) source.getParameters()[1]);
			in.setInputName_4_4_3((String) source.getParameters()[2]);
			in.setInputName_4_4_4((Float) source.getParameters()[3]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_5")) {
			InputDataClassName_4_5 in = new InputDataClassName_4_5();

			in.setInputName_4_5_1((Float) source.getParameters()[0]);
			in.setInputName_4_5_2((String) source.getParameters()[1]);
			in.setInputName_4_5_3((String) source.getParameters()[2]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_4_CapabilityName_4_1 = (State_ServiceName_4_CapabilityName_4_1) ctx
				.lookup("java:global/sp_manager/State_ServiceName_4_CapabilityName_4_1");

		if (opName.equals("CapabilityName_4_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_1.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_2 = (State_ServiceName_4_CapabilityName_4_2) ctx
				.lookup("java:global/sp_manager/State_ServiceName_4_CapabilityName_4_2");

		if (opName.equals("CapabilityName_4_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_2.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_4 = (State_ServiceName_4_CapabilityName_4_4) ctx
				.lookup("java:global/sp_manager/State_ServiceName_4_CapabilityName_4_4");

		if (opName.equals("CapabilityName_4_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_4.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_5 = (State_ServiceName_4_CapabilityName_4_5) ctx
				.lookup("java:global/sp_manager/State_ServiceName_4_CapabilityName_4_5");

		if (opName.equals("CapabilityName_4_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_5.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
