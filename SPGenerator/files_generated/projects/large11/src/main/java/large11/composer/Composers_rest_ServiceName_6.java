package large11.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import large11.state.State_ServiceName_6_CapabilityName_6_1;
import large11.state.State_ServiceName_6_CapabilityName_6_2;
import large11.state.State_ServiceName_6_CapabilityName_6_3;
import large11.state.State_ServiceName_6_CapabilityName_6_4;
import large11.state.State_ServiceName_6_CapabilityName_6_5;
import large11.state.State_ServiceName_6_CapabilityName_6_6;

import large11.input.InputDataClassName_6_1;
import large11.input.InputDataClassName_6_2;
import large11.input.InputDataClassName_6_3;
import large11.input.InputDataClassName_6_4;
import large11.input.InputDataClassName_6_5;
import large11.input.InputDataClassName_6_6;

public class Composers_rest_ServiceName_6 extends RESTEasyMessageComposer {

	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;
	State_ServiceName_6_CapabilityName_6_3 instanceState_ServiceName_6_CapabilityName_6_3;
	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	State_ServiceName_6_CapabilityName_6_5 instanceState_ServiceName_6_CapabilityName_6_5;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_6_1")) {
			InputDataClassName_6_1 in = new InputDataClassName_6_1();

			in.setInputName_6_1_1((Integer) source.getParameters()[0]);
			in.setInputName_6_1_2((Float) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_2")) {
			InputDataClassName_6_2 in = new InputDataClassName_6_2();

			in.setInputName_6_2_1((Float) source.getParameters()[0]);
			in.setInputName_6_2_2((Float) source.getParameters()[1]);
			in.setInputName_6_2_3((String) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_3")) {
			InputDataClassName_6_3 in = new InputDataClassName_6_3();

			in.setInputName_6_3_1((Integer) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_4")) {
			InputDataClassName_6_4 in = new InputDataClassName_6_4();

			in.setInputName_6_4_1((Float) source.getParameters()[0]);
			in.setInputName_6_4_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_5")) {
			InputDataClassName_6_5 in = new InputDataClassName_6_5();

			in.setInputName_6_5_1((Float) source.getParameters()[0]);
			in.setInputName_6_5_2((Integer) source.getParameters()[1]);
			in.setInputName_6_5_3((Integer) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_6")) {
			InputDataClassName_6_6 in = new InputDataClassName_6_6();

			in.setInputName_6_6_1((Float) source.getParameters()[0]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_6_CapabilityName_6_2 = (State_ServiceName_6_CapabilityName_6_2) ctx
				.lookup("java:global/large11/State_ServiceName_6_CapabilityName_6_2");

		if (opName.equals("CapabilityName_6_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_2.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_3 = (State_ServiceName_6_CapabilityName_6_3) ctx
				.lookup("java:global/large11/State_ServiceName_6_CapabilityName_6_3");

		if (opName.equals("CapabilityName_6_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_3.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_4 = (State_ServiceName_6_CapabilityName_6_4) ctx
				.lookup("java:global/large11/State_ServiceName_6_CapabilityName_6_4");

		if (opName.equals("CapabilityName_6_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_4.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_5 = (State_ServiceName_6_CapabilityName_6_5) ctx
				.lookup("java:global/large11/State_ServiceName_6_CapabilityName_6_5");

		if (opName.equals("CapabilityName_6_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_5.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
