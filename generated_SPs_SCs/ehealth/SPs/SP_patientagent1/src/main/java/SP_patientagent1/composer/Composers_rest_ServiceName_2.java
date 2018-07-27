package SP_aircraftcarrier1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_4;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_5;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_1;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_2;
import SP_aircraftcarrier1.state.State_ServiceName_2_CapabilityName_2_3;

import SP_aircraftcarrier1.input.InputDataClassName_2_4;
import SP_aircraftcarrier1.input.InputDataClassName_2_5;
import SP_aircraftcarrier1.input.InputDataClassName_2_1;
import SP_aircraftcarrier1.input.InputDataClassName_2_2;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_4")) {
			InputDataClassName_2_4 in = new InputDataClassName_2_4();

			in.setInputName_2_4_1((Float) source.getParameters()[0]);
			in.setInputName_2_4_2((Integer) source.getParameters()[1]);
			in.setInputName_2_4_3((Float) source.getParameters()[2]);
			in.setInputName_2_4_4((Float) source.getParameters()[3]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_5")) {
			InputDataClassName_2_5 in = new InputDataClassName_2_5();

			in.setInputName_2_5_1((Float) source.getParameters()[0]);
			in.setInputName_2_5_2((String) source.getParameters()[1]);
			in.setInputName_2_5_3((String) source.getParameters()[2]);
			in.setInputName_2_5_4((String) source.getParameters()[3]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((Integer) source.getParameters()[0]);
			in.setInputName_2_1_2((Float) source.getParameters()[1]);
			in.setInputName_2_1_3((Float) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_2")) {
			InputDataClassName_2_2 in = new InputDataClassName_2_2();

			in.setInputName_2_2_1((Float) source.getParameters()[0]);
			in.setInputName_2_2_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_2_CapabilityName_2_4 = (State_ServiceName_2_CapabilityName_2_4) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_2_CapabilityName_2_4");

		if (opName.equals("CapabilityName_2_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_4.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_5 = (State_ServiceName_2_CapabilityName_2_5) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_2_CapabilityName_2_5");

		if (opName.equals("CapabilityName_2_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_5.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_2_CapabilityName_2_1");

		if (opName.equals("CapabilityName_2_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_3 = (State_ServiceName_2_CapabilityName_2_3) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_2_CapabilityName_2_3");

		if (opName.equals("CapabilityName_2_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_3.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
