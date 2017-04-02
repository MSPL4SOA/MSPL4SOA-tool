package SP_submarine1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_submarine1.state.State_ServiceName_2_CapabilityName_2_4;
import SP_submarine1.state.State_ServiceName_2_CapabilityName_2_1;
import SP_submarine1.state.State_ServiceName_2_CapabilityName_2_2;
import SP_submarine1.state.State_ServiceName_2_CapabilityName_2_3;

import SP_submarine1.input.InputDataClassName_2_4;
import SP_submarine1.input.InputDataClassName_2_1;
import SP_submarine1.input.InputDataClassName_2_3;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;
	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_4")) {
			InputDataClassName_2_4 in = new InputDataClassName_2_4();

			in.setInputName_2_4_1((Float) source.getParameters()[0]);
			in.setInputName_2_4_2((String) source.getParameters()[1]);
			in.setInputName_2_4_3((Float) source.getParameters()[2]);
			in.setInputName_2_4_4((Integer) source.getParameters()[3]);
			in.setInputName_2_4_5((Integer) source.getParameters()[4]);
			in.setInputName_2_4_6((String) source.getParameters()[5]);
			in.setInputName_2_4_7((Float) source.getParameters()[6]);
			in.setInputName_2_4_8((Float) source.getParameters()[7]);
			in.setInputName_2_4_9((Integer) source.getParameters()[8]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((Float) source.getParameters()[0]);
			in.setInputName_2_1_2((String) source.getParameters()[1]);
			in.setInputName_2_1_3((Float) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_3")) {
			InputDataClassName_2_3 in = new InputDataClassName_2_3();

			in.setInputName_2_3_1((String) source.getParameters()[0]);
			in.setInputName_2_3_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_2_CapabilityName_2_1");

		if (opName.equals("CapabilityName_2_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_2 = (State_ServiceName_2_CapabilityName_2_2) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_2_CapabilityName_2_2");

		if (opName.equals("CapabilityName_2_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_2.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_3 = (State_ServiceName_2_CapabilityName_2_3) ctx
				.lookup("java:global/SP_submarine1/State_ServiceName_2_CapabilityName_2_3");

		if (opName.equals("CapabilityName_2_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_3.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
