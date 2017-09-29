package outputvoid.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import outputvoid.state.State_ServiceName_1_CapabilityName_1_1;
import outputvoid.state.State_ServiceName_1_CapabilityName_1_2;

import outputvoid.input.InputDataClassName_1_2;

public class Composers_rest_ServiceName_1 extends RESTEasyMessageComposer {

	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_1_2")) {
			InputDataClassName_1_2 in = new InputDataClassName_1_2();

			in.setInputName_1_2_1((String) source.getParameters()[0]);
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
				.lookup("java:global/outputvoid/State_ServiceName_1_CapabilityName_1_2");

		if (opName.equals("CapabilityName_1_2"))
			target.addHeader("state_header",
					instanceState_ServiceName_1_CapabilityName_1_2.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
