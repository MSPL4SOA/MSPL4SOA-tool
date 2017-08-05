package SP_aircraftcarrier1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_4;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_5;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_6;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_7;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_1;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_2;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_3;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_8;

import SP_aircraftcarrier1.input.InputDataClassName_6_4;
import SP_aircraftcarrier1.input.InputDataClassName_6_5;
import SP_aircraftcarrier1.input.InputDataClassName_6_6;
import SP_aircraftcarrier1.input.InputDataClassName_6_1;
import SP_aircraftcarrier1.input.InputDataClassName_6_2;
import SP_aircraftcarrier1.input.InputDataClassName_6_3;
import SP_aircraftcarrier1.input.InputDataClassName_6_8;

public class Composers_rest_ServiceName_6 extends RESTEasyMessageComposer {

	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	State_ServiceName_6_CapabilityName_6_5 instanceState_ServiceName_6_CapabilityName_6_5;
	State_ServiceName_6_CapabilityName_6_6 instanceState_ServiceName_6_CapabilityName_6_6;
	State_ServiceName_6_CapabilityName_6_7 instanceState_ServiceName_6_CapabilityName_6_7;
	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;
	State_ServiceName_6_CapabilityName_6_3 instanceState_ServiceName_6_CapabilityName_6_3;
	State_ServiceName_6_CapabilityName_6_8 instanceState_ServiceName_6_CapabilityName_6_8;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_6_4")) {
			InputDataClassName_6_4 in = new InputDataClassName_6_4();

			in.setInputName_6_4_1((String) source.getParameters()[0]);
			in.setInputName_6_4_2((Float) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_5")) {
			InputDataClassName_6_5 in = new InputDataClassName_6_5();

			in.setInputName_6_5_1((Integer) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_6")) {
			InputDataClassName_6_6 in = new InputDataClassName_6_6();

			in.setInputName_6_6_1((Float) source.getParameters()[0]);
			in.setInputName_6_6_2((Integer) source.getParameters()[1]);
			in.setInputName_6_6_3((String) source.getParameters()[2]);
			in.setInputName_6_6_4((Float) source.getParameters()[3]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_1")) {
			InputDataClassName_6_1 in = new InputDataClassName_6_1();

			in.setInputName_6_1_2((Float) source.getParameters()[0]);
			in.setInputName_6_1_3((Integer) source.getParameters()[1]);
			in.setInputName_6_1_4((Float) source.getParameters()[2]);
			in.setInputName_6_1_5((String) source.getParameters()[3]);
			in.setInputName_6_1_6((Float) source.getParameters()[4]);
			in.setInputName_6_1_1((Float) source.getParameters()[5]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_2")) {
			InputDataClassName_6_2 in = new InputDataClassName_6_2();

			in.setInputName_6_2_1((Integer) source.getParameters()[0]);
			in.setInputName_6_2_2((String) source.getParameters()[1]);
			in.setInputName_6_2_3((String) source.getParameters()[2]);
			in.setInputName_6_2_4((Integer) source.getParameters()[3]);
			in.setInputName_6_2_5((Float) source.getParameters()[4]);
			in.setInputName_6_2_6((String) source.getParameters()[5]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_3")) {
			InputDataClassName_6_3 in = new InputDataClassName_6_3();

			in.setInputName_6_3_8((String) source.getParameters()[0]);
			in.setInputName_6_3_1((Integer) source.getParameters()[1]);
			in.setInputName_6_3_2((String) source.getParameters()[2]);
			in.setInputName_6_3_3((Integer) source.getParameters()[3]);
			in.setInputName_6_3_4((Integer) source.getParameters()[4]);
			in.setInputName_6_3_5((Float) source.getParameters()[5]);
			in.setInputName_6_3_6((Integer) source.getParameters()[6]);
			in.setInputName_6_3_7((Integer) source.getParameters()[7]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_6_8")) {
			InputDataClassName_6_8 in = new InputDataClassName_6_8();

			in.setInputName_6_8_3((String) source.getParameters()[0]);
			in.setInputName_6_8_4((String) source.getParameters()[1]);
			in.setInputName_6_8_5((Float) source.getParameters()[2]);
			in.setInputName_6_8_6((String) source.getParameters()[3]);
			in.setInputName_6_8_7((Float) source.getParameters()[4]);
			in.setInputName_6_8_1((Integer) source.getParameters()[5]);
			in.setInputName_6_8_2((Float) source.getParameters()[6]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_6_CapabilityName_6_4 = (State_ServiceName_6_CapabilityName_6_4) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_4");

		if (opName.equals("CapabilityName_6_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_4.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_5 = (State_ServiceName_6_CapabilityName_6_5) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_5");

		if (opName.equals("CapabilityName_6_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_5.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_6 = (State_ServiceName_6_CapabilityName_6_6) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_6");

		if (opName.equals("CapabilityName_6_6"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_6.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_7 = (State_ServiceName_6_CapabilityName_6_7) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_7");

		if (opName.equals("CapabilityName_6_7"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_7.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_2 = (State_ServiceName_6_CapabilityName_6_2) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_2");

		if (opName.equals("CapabilityName_6_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_2.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_3 = (State_ServiceName_6_CapabilityName_6_3) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_3");

		if (opName.equals("CapabilityName_6_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_3.getState()
							.toString());

		instanceState_ServiceName_6_CapabilityName_6_8 = (State_ServiceName_6_CapabilityName_6_8) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_8");

		if (opName.equals("CapabilityName_6_8"))
			target.addHeader("state_header",
					instanceState_ServiceName_6_CapabilityName_6_8.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
