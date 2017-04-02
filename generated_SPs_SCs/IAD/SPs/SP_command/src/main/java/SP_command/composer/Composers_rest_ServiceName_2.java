package SP_command.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_command.state.State_ServiceName_2_CapabilityName_2_4;
import SP_command.state.State_ServiceName_2_CapabilityName_2_5;
import SP_command.state.State_ServiceName_2_CapabilityName_2_6;
import SP_command.state.State_ServiceName_2_CapabilityName_2_1;
import SP_command.state.State_ServiceName_2_CapabilityName_2_2;
import SP_command.state.State_ServiceName_2_CapabilityName_2_3;

import SP_command.input.InputDataClassName_2_4;
import SP_command.input.InputDataClassName_2_6;
import SP_command.input.InputDataClassName_2_1;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	State_ServiceName_2_CapabilityName_2_6 instanceState_ServiceName_2_CapabilityName_2_6;
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_4")) {
			InputDataClassName_2_4 in = new InputDataClassName_2_4();

			in.setInputName_2_4_1((String) source.getParameters()[0]);
			in.setInputName_2_4_2((Integer) source.getParameters()[1]);
			in.setInputName_2_4_3((String) source.getParameters()[2]);
			in.setInputName_2_4_4((Float) source.getParameters()[3]);
			in.setInputName_2_4_5((Integer) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_6")) {
			InputDataClassName_2_6 in = new InputDataClassName_2_6();

			in.setInputName_2_6_1((String) source.getParameters()[0]);
			in.setInputName_2_6_2((String) source.getParameters()[1]);
			in.setInputName_2_6_3((Float) source.getParameters()[2]);
			in.setInputName_2_6_4((String) source.getParameters()[3]);
			in.setInputName_2_6_5((String) source.getParameters()[4]);
			in.setInputName_2_6_6((Integer) source.getParameters()[5]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((String) source.getParameters()[0]);
			in.setInputName_2_1_2((Integer) source.getParameters()[1]);
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
				.lookup("java:global/SP_command/State_ServiceName_2_CapabilityName_2_4");

		if (opName.equals("CapabilityName_2_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_4.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_6 = (State_ServiceName_2_CapabilityName_2_6) ctx
				.lookup("java:global/SP_command/State_ServiceName_2_CapabilityName_2_6");

		if (opName.equals("CapabilityName_2_6"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_6.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
				.lookup("java:global/SP_command/State_ServiceName_2_CapabilityName_2_1");

		if (opName.equals("CapabilityName_2_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
