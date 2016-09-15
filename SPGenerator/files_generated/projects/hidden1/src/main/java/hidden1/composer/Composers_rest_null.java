package hidden1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import hidden1.state.State_null_CapabilityName_1_1;
import hidden1.state.State_null_CapabilityName_1_2;

import hidden1.input.InputDataClassName_1_1;
import hidden1.input.InputDataClassName_1_2;

public class Composers_rest_null extends RESTEasyMessageComposer {

	State_null_CapabilityName_1_1 instanceState_null_CapabilityName_1_1;
	State_null_CapabilityName_1_2 instanceState_null_CapabilityName_1_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			InputDataClassName_1_1 in = new InputDataClassName_1_1();

			in.setInputName_1_1_1((Float) source.getParameters()[0]);
			in.setInputName_1_1_2((Float) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_1_2")) {
			InputDataClassName_1_2 in = new InputDataClassName_1_2();

			in.setInputName_1_2_1((Float) source.getParameters()[0]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_null_CapabilityName_1_1 = (State_null_CapabilityName_1_1) ctx
				.lookup("java:global/hidden1/State_null_CapabilityName_1_1");

		if (opName.equals("CapabilityName_1_1"))
			target.addHeader("state_header",
					instanceState_null_CapabilityName_1_1.getState().toString());

		instanceState_null_CapabilityName_1_2 = (State_null_CapabilityName_1_2) ctx
				.lookup("java:global/hidden1/State_null_CapabilityName_1_2");

		if (opName.equals("CapabilityName_1_2"))
			target.addHeader("state_header",
					instanceState_null_CapabilityName_1_2.getState().toString());

		return super.decompose(exchange, target);
	}
}
