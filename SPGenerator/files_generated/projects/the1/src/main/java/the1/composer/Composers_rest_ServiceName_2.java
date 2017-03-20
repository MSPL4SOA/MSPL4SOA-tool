package the1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import the1.state.State_ServiceName_2_CapabilityName_2_1;
import the1.state.State_ServiceName_2_CapabilityName_2_2;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
				.lookup("java:global/the1/State_ServiceName_2_CapabilityName_2_1");

		if (opName.equals("CapabilityName_2_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
