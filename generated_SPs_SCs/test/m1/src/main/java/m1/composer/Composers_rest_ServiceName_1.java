package m1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import m1.state.State_ServiceName_1_CapabilityName_1_1;
import m1.state.State_ServiceName_1_CapabilityName_1_2;

import m1.input.InputDataClassName_1_1;
import m1.input.InputDataClassName_1_2;

public class Composers_rest_ServiceName_1 extends RESTEasyMessageComposer {

	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			InputDataClassName_1_1 in = new InputDataClassName_1_1();

			in.setInputName_1_1_1((Float) source.getParameters()[0]);
			in.setInputName_1_1_2((String) source.getParameters()[1]);
			in.setInputName_1_1_5((Float) source.getParameters()[2]);
			in.setInputName_1_1_3((Integer) source.getParameters()[3]);
			in.setInputName_1_1_4((Integer) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_1_2")) {
			InputDataClassName_1_2 in = new InputDataClassName_1_2();

			in.setInputName_1_2_1((Float) source.getParameters()[0]);
			in.setInputName_1_2_2((Float) source.getParameters()[1]);
			in.setInputName_1_2_3((Integer) source.getParameters()[2]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_1_CapabilityName_1_1 = (State_ServiceName_1_CapabilityName_1_1) ctx
				.lookup("java:global/m1/State_ServiceName_1_CapabilityName_1_1");

		if (opName.equals("CapabilityName_1_1"))
			target.addHeader("state_header",
					instanceState_ServiceName_1_CapabilityName_1_1.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
