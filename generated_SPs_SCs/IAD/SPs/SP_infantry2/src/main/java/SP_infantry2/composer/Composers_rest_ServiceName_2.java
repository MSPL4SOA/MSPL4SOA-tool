package SP_infantry2.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_infantry2.state.State_ServiceName_2_CapabilityName_2_1;
import SP_infantry2.state.State_ServiceName_2_CapabilityName_2_2;

import SP_infantry2.input.InputDataClassName_2_1;
import SP_infantry2.input.InputDataClassName_2_2;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((String) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_2")) {
			InputDataClassName_2_2 in = new InputDataClassName_2_2();

			in.setInputName_2_2_1((Integer) source.getParameters()[0]);
			in.setInputName_2_2_2((Float) source.getParameters()[1]);
			in.setInputName_2_2_3((Integer) source.getParameters()[2]);
			in.setInputName_2_2_4((Integer) source.getParameters()[3]);
			in.setInputName_2_2_5((Integer) source.getParameters()[4]);
			in.setInputName_2_2_6((Float) source.getParameters()[5]);
			in.setInputName_2_2_7((Float) source.getParameters()[6]);
			in.setInputName_2_2_8((String) source.getParameters()[7]);
			in.setInputName_2_2_9((String) source.getParameters()[8]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
				.lookup("java:global/SP_infantry2/State_ServiceName_2_CapabilityName_2_1");

		if (opName.equals("CapabilityName_2_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState()
							.toString());

		instanceState_ServiceName_2_CapabilityName_2_2 = (State_ServiceName_2_CapabilityName_2_2) ctx
				.lookup("java:global/SP_infantry2/State_ServiceName_2_CapabilityName_2_2");

		if (opName.equals("CapabilityName_2_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_2.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}