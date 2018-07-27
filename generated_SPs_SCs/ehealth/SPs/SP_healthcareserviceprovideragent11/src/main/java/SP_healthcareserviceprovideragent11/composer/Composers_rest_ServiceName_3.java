package SP_submarine1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_submarine1.state.State_ServiceName_3_CapabilityName_3_3;
import SP_submarine1.state.State_ServiceName_3_CapabilityName_3_1;
import SP_submarine1.state.State_ServiceName_3_CapabilityName_3_2;

import SP_submarine1.input.InputDataClassName_3_3;
import SP_submarine1.input.InputDataClassName_3_1;
import SP_submarine1.input.InputDataClassName_3_2;

public class Composers_rest_ServiceName_3 extends RESTEasyMessageComposer {

	State_ServiceName_3_CapabilityName_3_3 instanceState_ServiceName_3_CapabilityName_3_3;
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_3_3")) {
			InputDataClassName_3_3 in = new InputDataClassName_3_3();

			in.setInputName_3_3_1((Integer) source.getParameters()[0]);
			in.setInputName_3_3_2((Float) source.getParameters()[1]);
			in.setInputName_3_3_3((Float) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_1")) {
			InputDataClassName_3_1 in = new InputDataClassName_3_1();

			in.setInputName_3_1_3((Float) source.getParameters()[0]);
			in.setInputName_3_1_4((String) source.getParameters()[1]);
			in.setInputName_3_1_1((Float) source.getParameters()[2]);
			in.setInputName_3_1_2((String) source.getParameters()[3]);
			in.setInputName_3_1_5((Float) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_2")) {
			InputDataClassName_3_2 in = new InputDataClassName_3_2();

			in.setInputName_3_2_2((Float) source.getParameters()[0]);
			in.setInputName_3_2_1((String) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_3_CapabilityName_3_3 = (State_ServiceName_3_CapabilityName_3_3) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_3_CapabilityName_3_3");

		if (opName.equals("CapabilityName_3_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_3.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_1 = (State_ServiceName_3_CapabilityName_3_1) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_3_CapabilityName_3_1");

		if (opName.equals("CapabilityName_3_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_1.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_2 = (State_ServiceName_3_CapabilityName_3_2) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_3_CapabilityName_3_2");

		if (opName.equals("CapabilityName_3_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_2.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}