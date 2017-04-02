package SP_command.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_command.state.State_ServiceName_5_CapabilityName_5_5;
import SP_command.state.State_ServiceName_5_CapabilityName_5_6;
import SP_command.state.State_ServiceName_5_CapabilityName_5_1;
import SP_command.state.State_ServiceName_5_CapabilityName_5_2;
import SP_command.state.State_ServiceName_5_CapabilityName_5_3;
import SP_command.state.State_ServiceName_5_CapabilityName_5_4;

import SP_command.input.InputDataClassName_5_5;
import SP_command.input.InputDataClassName_5_6;
import SP_command.input.InputDataClassName_5_1;
import SP_command.input.InputDataClassName_5_2;
import SP_command.input.InputDataClassName_5_3;

public class Composers_rest_ServiceName_5 extends RESTEasyMessageComposer {

	State_ServiceName_5_CapabilityName_5_5 instanceState_ServiceName_5_CapabilityName_5_5;
	State_ServiceName_5_CapabilityName_5_6 instanceState_ServiceName_5_CapabilityName_5_6;
	State_ServiceName_5_CapabilityName_5_1 instanceState_ServiceName_5_CapabilityName_5_1;
	State_ServiceName_5_CapabilityName_5_3 instanceState_ServiceName_5_CapabilityName_5_3;
	State_ServiceName_5_CapabilityName_5_4 instanceState_ServiceName_5_CapabilityName_5_4;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_5_5")) {
			InputDataClassName_5_5 in = new InputDataClassName_5_5();

			in.setInputName_5_5_1((Integer) source.getParameters()[0]);
			in.setInputName_5_5_2((Integer) source.getParameters()[1]);
			in.setInputName_5_5_3((String) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_5_6")) {
			InputDataClassName_5_6 in = new InputDataClassName_5_6();

			in.setInputName_5_6_8((Integer) source.getParameters()[0]);
			in.setInputName_5_6_9((String) source.getParameters()[1]);
			in.setInputName_5_6_6((String) source.getParameters()[2]);
			in.setInputName_5_6_7((String) source.getParameters()[3]);
			in.setInputName_5_6_1((Float) source.getParameters()[4]);
			in.setInputName_5_6_4((Float) source.getParameters()[5]);
			in.setInputName_5_6_5((Float) source.getParameters()[6]);
			in.setInputName_5_6_2((Float) source.getParameters()[7]);
			in.setInputName_5_6_3((Integer) source.getParameters()[8]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_5_1")) {
			InputDataClassName_5_1 in = new InputDataClassName_5_1();

			in.setInputName_5_1_1((Integer) source.getParameters()[0]);
			in.setInputName_5_1_2((Float) source.getParameters()[1]);
			in.setInputName_5_1_5((Integer) source.getParameters()[2]);
			in.setInputName_5_1_6((String) source.getParameters()[3]);
			in.setInputName_5_1_3((String) source.getParameters()[4]);
			in.setInputName_5_1_4((String) source.getParameters()[5]);
			in.setInputName_5_1_7((Integer) source.getParameters()[6]);
			in.setInputName_5_1_8((String) source.getParameters()[7]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_5_2")) {
			InputDataClassName_5_2 in = new InputDataClassName_5_2();

			in.setInputName_5_2_1((Float) source.getParameters()[0]);
			in.setInputName_5_2_2((Float) source.getParameters()[1]);
			in.setInputName_5_2_3((Integer) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_5_3")) {
			InputDataClassName_5_3 in = new InputDataClassName_5_3();

			in.setInputName_5_3_1((Float) source.getParameters()[0]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_5_CapabilityName_5_5 = (State_ServiceName_5_CapabilityName_5_5) ctx
				.lookup("java:global/SP_command/State_ServiceName_5_CapabilityName_5_5");

		if (opName.equals("CapabilityName_5_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_5_CapabilityName_5_5.getState()
							.toString());

		instanceState_ServiceName_5_CapabilityName_5_6 = (State_ServiceName_5_CapabilityName_5_6) ctx
				.lookup("java:global/SP_command/State_ServiceName_5_CapabilityName_5_6");

		if (opName.equals("CapabilityName_5_6"))
			target.addHeader("state_header",
					instanceState_ServiceName_5_CapabilityName_5_6.getState()
							.toString());

		instanceState_ServiceName_5_CapabilityName_5_1 = (State_ServiceName_5_CapabilityName_5_1) ctx
				.lookup("java:global/SP_command/State_ServiceName_5_CapabilityName_5_1");

		if (opName.equals("CapabilityName_5_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_5_CapabilityName_5_1.getState()
							.toString());

		instanceState_ServiceName_5_CapabilityName_5_3 = (State_ServiceName_5_CapabilityName_5_3) ctx
				.lookup("java:global/SP_command/State_ServiceName_5_CapabilityName_5_3");

		if (opName.equals("CapabilityName_5_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_5_CapabilityName_5_3.getState()
							.toString());

		instanceState_ServiceName_5_CapabilityName_5_4 = (State_ServiceName_5_CapabilityName_5_4) ctx
				.lookup("java:global/SP_command/State_ServiceName_5_CapabilityName_5_4");

		if (opName.equals("CapabilityName_5_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_5_CapabilityName_5_4.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
