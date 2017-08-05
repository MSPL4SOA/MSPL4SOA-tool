package test.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import test.state.State_ServiceName_3_CapabilityName_3_3;
import test.state.State_ServiceName_3_CapabilityName_3_4;
import test.state.State_ServiceName_3_CapabilityName_3_5;
import test.state.State_ServiceName_3_CapabilityName_3_6;
import test.state.State_ServiceName_3_CapabilityName_3_1;
import test.state.State_ServiceName_3_CapabilityName_3_2;

import test.input.InputDataClassName_3_3;
import test.input.InputDataClassName_3_5;
import test.input.InputDataClassName_3_6;
import test.input.InputDataClassName_3_1;
import test.input.InputDataClassName_3_2;

public class Composers_rest_ServiceName_3 extends RESTEasyMessageComposer {

	State_ServiceName_3_CapabilityName_3_4 instanceState_ServiceName_3_CapabilityName_3_4;
	State_ServiceName_3_CapabilityName_3_5 instanceState_ServiceName_3_CapabilityName_3_5;
	State_ServiceName_3_CapabilityName_3_6 instanceState_ServiceName_3_CapabilityName_3_6;
	State_ServiceName_3_CapabilityName_3_1 instanceState_ServiceName_3_CapabilityName_3_1;
	State_ServiceName_3_CapabilityName_3_2 instanceState_ServiceName_3_CapabilityName_3_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_3_3")) {
			InputDataClassName_3_3 in = new InputDataClassName_3_3();

			in.setInputName_3_3_1((Float) source.getParameters()[0]);
			in.setInputName_3_3_2((Float) source.getParameters()[1]);
			in.setInputName_3_3_5((String) source.getParameters()[2]);
			in.setInputName_3_3_6((Integer) source.getParameters()[3]);
			in.setInputName_3_3_3((Float) source.getParameters()[4]);
			in.setInputName_3_3_4((Integer) source.getParameters()[5]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_5")) {
			InputDataClassName_3_5 in = new InputDataClassName_3_5();

			in.setInputName_3_5_9((String) source.getParameters()[0]);
			in.setInputName_3_5_7((Float) source.getParameters()[1]);
			in.setInputName_3_5_8((Float) source.getParameters()[2]);
			in.setInputName_3_5_5((Integer) source.getParameters()[3]);
			in.setInputName_3_5_6((Float) source.getParameters()[4]);
			in.setInputName_3_5_3((Integer) source.getParameters()[5]);
			in.setInputName_3_5_4((Float) source.getParameters()[6]);
			in.setInputName_3_5_1((String) source.getParameters()[7]);
			in.setInputName_3_5_2((String) source.getParameters()[8]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_6")) {
			InputDataClassName_3_6 in = new InputDataClassName_3_6();

			in.setInputName_3_6_6((Float) source.getParameters()[0]);
			in.setInputName_3_6_7((Float) source.getParameters()[1]);
			in.setInputName_3_6_4((String) source.getParameters()[2]);
			in.setInputName_3_6_5((Integer) source.getParameters()[3]);
			in.setInputName_3_6_2((String) source.getParameters()[4]);
			in.setInputName_3_6_3((Float) source.getParameters()[5]);
			in.setInputName_3_6_1((String) source.getParameters()[6]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_1")) {
			InputDataClassName_3_1 in = new InputDataClassName_3_1();

			in.setInputName_3_1_3((String) source.getParameters()[0]);
			in.setInputName_3_1_4((Float) source.getParameters()[1]);
			in.setInputName_3_1_1((String) source.getParameters()[2]);
			in.setInputName_3_1_2((String) source.getParameters()[3]);
			in.setInputName_3_1_5((Float) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_2")) {
			InputDataClassName_3_2 in = new InputDataClassName_3_2();

			in.setInputName_3_2_2((Float) source.getParameters()[0]);
			in.setInputName_3_2_3((Integer) source.getParameters()[1]);
			in.setInputName_3_2_1((String) source.getParameters()[2]);
			in.setInputName_3_2_8((String) source.getParameters()[3]);
			in.setInputName_3_2_9((String) source.getParameters()[4]);
			in.setInputName_3_2_6((Integer) source.getParameters()[5]);
			in.setInputName_3_2_7((Integer) source.getParameters()[6]);
			in.setInputName_3_2_4((Float) source.getParameters()[7]);
			in.setInputName_3_2_5((Integer) source.getParameters()[8]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_3_CapabilityName_3_4 = (State_ServiceName_3_CapabilityName_3_4) ctx
				.lookup("java:global/test/State_ServiceName_3_CapabilityName_3_4");

		if (opName.equals("CapabilityName_3_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_4.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_5 = (State_ServiceName_3_CapabilityName_3_5) ctx
				.lookup("java:global/test/State_ServiceName_3_CapabilityName_3_5");

		if (opName.equals("CapabilityName_3_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_5.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_6 = (State_ServiceName_3_CapabilityName_3_6) ctx
				.lookup("java:global/test/State_ServiceName_3_CapabilityName_3_6");

		if (opName.equals("CapabilityName_3_6"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_6.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_1 = (State_ServiceName_3_CapabilityName_3_1) ctx
				.lookup("java:global/test/State_ServiceName_3_CapabilityName_3_1");

		if (opName.equals("CapabilityName_3_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_1.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_2 = (State_ServiceName_3_CapabilityName_3_2) ctx
				.lookup("java:global/test/State_ServiceName_3_CapabilityName_3_2");

		if (opName.equals("CapabilityName_3_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_2.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
