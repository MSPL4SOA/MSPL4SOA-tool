package SP_helicopter2.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_helicopter2.state.State_ServiceName_4_CapabilityName_4_2;
import SP_helicopter2.state.State_ServiceName_4_CapabilityName_4_3;
import SP_helicopter2.state.State_ServiceName_4_CapabilityName_4_1;

import SP_helicopter2.input.InputDataClassName_4_1;

public class Composers_rest_ServiceName_4 extends RESTEasyMessageComposer {

	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_4_1")) {
			InputDataClassName_4_1 in = new InputDataClassName_4_1();

			in.setInputName_4_1_4((String) source.getParameters()[0]);
			in.setInputName_4_1_1((Integer) source.getParameters()[1]);
			in.setInputName_4_1_2((Integer) source.getParameters()[2]);
			in.setInputName_4_1_3((Integer) source.getParameters()[3]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_4_CapabilityName_4_1 = (State_ServiceName_4_CapabilityName_4_1) ctx
				.lookup("java:global/SP_helicopter2/State_ServiceName_4_CapabilityName_4_1");

		if (opName.equals("CapabilityName_4_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_4_CapabilityName_4_1.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
