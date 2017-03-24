package SP_aircraftcarrier1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_3;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_4;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_5;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_6;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_1;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_2;

import SP_aircraftcarrier1.input.InputDataClassName_3_3;
import SP_aircraftcarrier1.input.InputDataClassName_3_4;
import SP_aircraftcarrier1.input.InputDataClassName_3_5;
import SP_aircraftcarrier1.input.InputDataClassName_3_1;
import SP_aircraftcarrier1.input.InputDataClassName_3_2;

public class Composers_rest_ServiceName_3 extends RESTEasyMessageComposer {

	State_ServiceName_3_CapabilityName_3_3 instanceState_ServiceName_3_CapabilityName_3_3;
	State_ServiceName_3_CapabilityName_3_4 instanceState_ServiceName_3_CapabilityName_3_4;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_3_3")) {
			InputDataClassName_3_3 in = new InputDataClassName_3_3();

			in.setInputName_3_3_1((Integer) source.getParameters()[0]);
			in.setInputName_3_3_2((String) source.getParameters()[1]);
			in.setInputName_3_3_5((String) source.getParameters()[2]);
			in.setInputName_3_3_6((Integer) source.getParameters()[3]);
			in.setInputName_3_3_3((String) source.getParameters()[4]);
			in.setInputName_3_3_4((Float) source.getParameters()[5]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_4")) {
			InputDataClassName_3_4 in = new InputDataClassName_3_4();

			in.setInputName_3_4_1((Integer) source.getParameters()[0]);
			in.setInputName_3_4_8((String) source.getParameters()[1]);
			in.setInputName_3_4_9((Integer) source.getParameters()[2]);
			in.setInputName_3_4_6((Float) source.getParameters()[3]);
			in.setInputName_3_4_7((Integer) source.getParameters()[4]);
			in.setInputName_3_4_4((String) source.getParameters()[5]);
			in.setInputName_3_4_5((String) source.getParameters()[6]);
			in.setInputName_3_4_2((Float) source.getParameters()[7]);
			in.setInputName_3_4_3((String) source.getParameters()[8]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_5")) {
			InputDataClassName_3_5 in = new InputDataClassName_3_5();

			in.setInputName_3_5_1((Float) source.getParameters()[0]);
			in.setInputName_3_5_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_1")) {
			InputDataClassName_3_1 in = new InputDataClassName_3_1();

			in.setInputName_3_1_3((Float) source.getParameters()[0]);
			in.setInputName_3_1_4((String) source.getParameters()[1]);
			in.setInputName_3_1_1((String) source.getParameters()[2]);
			in.setInputName_3_1_2((String) source.getParameters()[3]);
			in.setInputName_3_1_5((Float) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_3_2")) {
			InputDataClassName_3_2 in = new InputDataClassName_3_2();

			in.setInputName_3_2_2((String) source.getParameters()[0]);
			in.setInputName_3_2_3((String) source.getParameters()[1]);
			in.setInputName_3_2_1((Integer) source.getParameters()[2]);
			in.setInputName_3_2_4((Float) source.getParameters()[3]);
			in.setInputName_3_2_5((Float) source.getParameters()[4]);
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
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_3_CapabilityName_3_3");

		if (opName.equals("CapabilityName_3_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_3.getState()
							.toString());

		instanceState_ServiceName_3_CapabilityName_3_4 = (State_ServiceName_3_CapabilityName_3_4) ctx
				.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_3_CapabilityName_3_4");

		if (opName.equals("CapabilityName_3_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_3_CapabilityName_3_4.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
