package SP_all.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_all.state.State_ServiceName_4_CapabilityName_4_2;
import SP_all.state.State_ServiceName_4_CapabilityName_4_3;
import SP_all.state.State_ServiceName_4_CapabilityName_4_4;
import SP_all.state.State_ServiceName_4_CapabilityName_4_5;
import SP_all.state.State_ServiceName_4_CapabilityName_4_1;

import SP_all.input.InputDataClassName_4_2;
import SP_all.input.InputDataClassName_4_3;
import SP_all.input.InputDataClassName_4_5;
import SP_all.input.InputDataClassName_4_1;

public class Composers_rest_ServiceName_4 extends RESTEasyMessageComposer {

	State_ServiceName_4_CapabilityName_4_2 instanceState_ServiceName_4_CapabilityName_4_2;
	State_ServiceName_4_CapabilityName_4_3 instanceState_ServiceName_4_CapabilityName_4_3;
	State_ServiceName_4_CapabilityName_4_4 instanceState_ServiceName_4_CapabilityName_4_4;
	State_ServiceName_4_CapabilityName_4_5 instanceState_ServiceName_4_CapabilityName_4_5;
	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_4_2")) {
			InputDataClassName_4_2 in = new InputDataClassName_4_2();

			in.setInputName_4_2_7((Integer) source.getParameters()[0]);
			in.setInputName_4_2_8((Integer) source.getParameters()[1]);
			in.setInputName_4_2_3((String) source.getParameters()[2]);
			in.setInputName_4_2_4((String) source.getParameters()[3]);
			in.setInputName_4_2_5((Float) source.getParameters()[4]);
			in.setInputName_4_2_6((Integer) source.getParameters()[5]);
			in.setInputName_4_2_1((Float) source.getParameters()[6]);
			in.setInputName_4_2_2((Float) source.getParameters()[7]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_3")) {
			InputDataClassName_4_3 in = new InputDataClassName_4_3();

			in.setInputName_4_3_2((Float) source.getParameters()[0]);
			in.setInputName_4_3_1((String) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_5")) {
			InputDataClassName_4_5 in = new InputDataClassName_4_5();

			in.setInputName_4_5_1((Integer) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_1")) {
			InputDataClassName_4_1 in = new InputDataClassName_4_1();

			in.setInputName_4_1_1((String) source.getParameters()[0]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_4_CapabilityName_4_2 = (State_ServiceName_4_CapabilityName_4_2) ctx
				.lookup("java:global/SP_all/State_ServiceName_4_CapabilityName_4_2");

		if (opName.equals("CapabilityName_4_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_2.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_3 = (State_ServiceName_4_CapabilityName_4_3) ctx
				.lookup("java:global/SP_all/State_ServiceName_4_CapabilityName_4_3");

		if (opName.equals("CapabilityName_4_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_3.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_4 = (State_ServiceName_4_CapabilityName_4_4) ctx
				.lookup("java:global/SP_all/State_ServiceName_4_CapabilityName_4_4");

		if (opName.equals("CapabilityName_4_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_4.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_5 = (State_ServiceName_4_CapabilityName_4_5) ctx
				.lookup("java:global/SP_all/State_ServiceName_4_CapabilityName_4_5");

		if (opName.equals("CapabilityName_4_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_5.getState()
							.toString());

		instanceState_ServiceName_4_CapabilityName_4_1 = (State_ServiceName_4_CapabilityName_4_1) ctx
				.lookup("java:global/SP_all/State_ServiceName_4_CapabilityName_4_1");

		if (opName.equals("CapabilityName_4_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_1.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
