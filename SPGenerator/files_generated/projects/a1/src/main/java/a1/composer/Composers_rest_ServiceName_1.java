package a1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import a1.state.State_ServiceName_1_CapabilityName_1_1;
import a1.state.State_ServiceName_1_CapabilityName_1_2;

import a1.input.InputDataClassName_1_1;

public class Composers_rest_ServiceName_1 extends RESTEasyMessageComposer {

	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			InputDataClassName_1_1 in = new InputDataClassName_1_1();

			in.setInputName_1_1_1((String) source.getParameters()[0]);
			in.setInputName_1_1_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_1_CapabilityName_1_2 = (State_ServiceName_1_CapabilityName_1_2) ctx
				.lookup("java:global/a1/State_ServiceName_1_CapabilityName_1_2");

		if (opName.equals("CapabilityName_1_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_1_CapabilityName_1_2.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
