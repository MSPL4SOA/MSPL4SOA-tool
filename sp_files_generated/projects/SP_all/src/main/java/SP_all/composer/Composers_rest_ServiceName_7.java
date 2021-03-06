package SP_all.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_all.state.State_ServiceName_7_CapabilityName_7_3;
import SP_all.state.State_ServiceName_7_CapabilityName_7_4;
import SP_all.state.State_ServiceName_7_CapabilityName_7_5;
import SP_all.state.State_ServiceName_7_CapabilityName_7_1;
import SP_all.state.State_ServiceName_7_CapabilityName_7_2;

import SP_all.input.InputDataClassName_7_4;
import SP_all.input.InputDataClassName_7_5;
import SP_all.input.InputDataClassName_7_1;
import SP_all.input.InputDataClassName_7_2;

public class Composers_rest_ServiceName_7 extends RESTEasyMessageComposer {

	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_7_4")) {
			InputDataClassName_7_4 in = new InputDataClassName_7_4();

			in.setInputName_7_4_4((Float) source.getParameters()[0]);
			in.setInputName_7_4_5((Float) source.getParameters()[1]);
			in.setInputName_7_4_2((Float) source.getParameters()[2]);
			in.setInputName_7_4_3((Float) source.getParameters()[3]);
			in.setInputName_7_4_1((Float) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_5")) {
			InputDataClassName_7_5 in = new InputDataClassName_7_5();

			in.setInputName_7_5_3((Float) source.getParameters()[0]);
			in.setInputName_7_5_4((String) source.getParameters()[1]);
			in.setInputName_7_5_1((Float) source.getParameters()[2]);
			in.setInputName_7_5_2((Float) source.getParameters()[3]);
			in.setInputName_7_5_5((String) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_1")) {
			InputDataClassName_7_1 in = new InputDataClassName_7_1();

			in.setInputName_7_1_1((String) source.getParameters()[0]);
			in.setInputName_7_1_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_7_2")) {
			InputDataClassName_7_2 in = new InputDataClassName_7_2();

			in.setInputName_7_2_6((Float) source.getParameters()[0]);
			in.setInputName_7_2_7((String) source.getParameters()[1]);
			in.setInputName_7_2_4((String) source.getParameters()[2]);
			in.setInputName_7_2_5((String) source.getParameters()[3]);
			in.setInputName_7_2_2((String) source.getParameters()[4]);
			in.setInputName_7_2_3((Integer) source.getParameters()[5]);
			in.setInputName_7_2_1((Float) source.getParameters()[6]);
			in.setInputName_7_2_8((Integer) source.getParameters()[7]);
			in.setInputName_7_2_9((Float) source.getParameters()[8]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_7_CapabilityName_7_3 = (State_ServiceName_7_CapabilityName_7_3) ctx
				.lookup("java:global/SP_all/State_ServiceName_7_CapabilityName_7_3");

		if (opName.equals("CapabilityName_7_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_3.getState()
							.toString());

		instanceState_ServiceName_7_CapabilityName_7_4 = (State_ServiceName_7_CapabilityName_7_4) ctx
				.lookup("java:global/SP_all/State_ServiceName_7_CapabilityName_7_4");

		if (opName.equals("CapabilityName_7_4"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_4.getState()
							.toString());

		instanceState_ServiceName_7_CapabilityName_7_5 = (State_ServiceName_7_CapabilityName_7_5) ctx
				.lookup("java:global/SP_all/State_ServiceName_7_CapabilityName_7_5");

		if (opName.equals("CapabilityName_7_5"))
			target.addHeader("state_header",
					instanceState_ServiceName_7_CapabilityName_7_5.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
