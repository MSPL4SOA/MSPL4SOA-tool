package m1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import m1.state.State_ServiceName_2_CapabilityName_2_1;
import m1.state.State_ServiceName_2_CapabilityName_2_2;

import m1.input.InputDataClassName_2_1;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((Float) source.getParameters()[0]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_2_CapabilityName_2_2 = (State_ServiceName_2_CapabilityName_2_2) ctx
				.lookup("java:global/m1/State_ServiceName_2_CapabilityName_2_2");

		if (opName.equals("CapabilityName_2_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_2.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
