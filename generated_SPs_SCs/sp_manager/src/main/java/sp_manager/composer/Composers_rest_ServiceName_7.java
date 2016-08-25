package sp_manager.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import sp_manager.state.State_ServiceName_7_CapabilityName_7_1;
import sp_manager.state.State_ServiceName_7_CapabilityName_7_2;
import sp_manager.state.State_ServiceName_7_CapabilityName_7_3;
import sp_manager.state.State_ServiceName_7_CapabilityName_7_4;
import sp_manager.state.State_ServiceName_7_CapabilityName_7_5;
import sp_manager.state.State_ServiceName_7_CapabilityName_7_6;

import sp_manager.input.InputDataClassName_7_1;
import sp_manager.input.InputDataClassName_7_2;
import sp_manager.input.InputDataClassName_7_3;
import sp_manager.input.InputDataClassName_7_4;
import sp_manager.input.InputDataClassName_7_5;
import sp_manager.input.InputDataClassName_7_6;

public class Composers_rest_ServiceName_7 extends RESTEasyMessageComposer {

	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;
	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_7_1")) {
			InputDataClassName_7_1 in = new InputDataClassName_7_1();

			in.setInputName_7_1_1((Float) source.getParameters()[0]);
			in.setInputName_7_1_2((Integer) source.getParameters()[1]);
			in.setInputName_7_1_3((String) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_2")) {
			InputDataClassName_7_2 in = new InputDataClassName_7_2();

			in.setInputName_7_2_1((Float) source.getParameters()[0]);
			in.setInputName_7_2_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_3")) {
			InputDataClassName_7_3 in = new InputDataClassName_7_3();

			in.setInputName_7_3_1((Float) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_4")) {
			InputDataClassName_7_4 in = new InputDataClassName_7_4();

			in.setInputName_7_4_1((Float) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_5")) {
			InputDataClassName_7_5 in = new InputDataClassName_7_5();

			in.setInputName_7_5_1((Float) source.getParameters()[0]);
			in.setInputName_7_5_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_6")) {
			InputDataClassName_7_6 in = new InputDataClassName_7_6();

			in.setInputName_7_6_1((Float) source.getParameters()[0]);
			in.setInputName_7_6_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_7_CapabilityName_7_1 = (State_ServiceName_7_CapabilityName_7_1) ctx
				.lookup("java:global/sp_manager/State_ServiceName_7_CapabilityName_7_1");

		if (opName.equals("CapabilityName_7_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_1.getState()
							.toString());

		instanceState_ServiceName_7_CapabilityName_7_2 = (State_ServiceName_7_CapabilityName_7_2) ctx
				.lookup("java:global/sp_manager/State_ServiceName_7_CapabilityName_7_2");

		if (opName.equals("CapabilityName_7_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_2.getState()
							.toString());

		instanceState_ServiceName_7_CapabilityName_7_3 = (State_ServiceName_7_CapabilityName_7_3) ctx
				.lookup("java:global/sp_manager/State_ServiceName_7_CapabilityName_7_3");

		if (opName.equals("CapabilityName_7_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_3.getState()
							.toString());

		instanceState_ServiceName_7_CapabilityName_7_4 = (State_ServiceName_7_CapabilityName_7_4) ctx
				.lookup("java:global/sp_manager/State_ServiceName_7_CapabilityName_7_4");

		if (opName.equals("CapabilityName_7_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_4.getState()
							.toString());

		instanceState_ServiceName_7_CapabilityName_7_5 = (State_ServiceName_7_CapabilityName_7_5) ctx
				.lookup("java:global/sp_manager/State_ServiceName_7_CapabilityName_7_5");

		if (opName.equals("CapabilityName_7_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_5.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
