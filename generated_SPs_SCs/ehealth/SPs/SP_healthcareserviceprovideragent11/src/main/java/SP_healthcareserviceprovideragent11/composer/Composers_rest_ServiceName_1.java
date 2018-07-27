package SP_submarine1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_submarine1.state.State_ServiceName_1_CapabilityName_1_1;
import SP_submarine1.state.State_ServiceName_1_CapabilityName_1_2;
import SP_submarine1.state.State_ServiceName_1_CapabilityName_1_3;

import SP_submarine1.input.InputDataClassName_1_1;
import SP_submarine1.input.InputDataClassName_1_2;
import SP_submarine1.input.InputDataClassName_1_3;

public class Composers_rest_ServiceName_1 extends RESTEasyMessageComposer {

	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;
	State_ServiceName_1_CapabilityName_1_3 instanceState_ServiceName_1_CapabilityName_1_3;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			InputDataClassName_1_1 in = new InputDataClassName_1_1();

			in.setInputName_1_1_1((Float) source.getParameters()[0]);
			in.setInputName_1_1_2((Float) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_1_2")) {
			InputDataClassName_1_2 in = new InputDataClassName_1_2();

			in.setInputName_1_2_1((Float) source.getParameters()[0]);
			in.setInputName_1_2_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_1_3")) {
			InputDataClassName_1_3 in = new InputDataClassName_1_3();

			in.setInputName_1_3_1((Float) source.getParameters()[0]);
			in.setInputName_1_3_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_1_CapabilityName_1_1 = (State_ServiceName_1_CapabilityName_1_1) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_1_CapabilityName_1_1");

		if (opName.equals("CapabilityName_1_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_1_CapabilityName_1_1.getState()
							.toString());

		instanceState_ServiceName_1_CapabilityName_1_2 = (State_ServiceName_1_CapabilityName_1_2) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_1_CapabilityName_1_2");

		if (opName.equals("CapabilityName_1_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_1_CapabilityName_1_2.getState()
							.toString());

		instanceState_ServiceName_1_CapabilityName_1_3 = (State_ServiceName_1_CapabilityName_1_3) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_1_CapabilityName_1_3");

		if (opName.equals("CapabilityName_1_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_1_CapabilityName_1_3.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
