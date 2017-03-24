package SP_helicopter1.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_helicopter1.state.State_ServiceName_2_CapabilityName_2_1;
import SP_helicopter1.state.State_ServiceName_2_CapabilityName_2_2;
import SP_helicopter1.state.State_ServiceName_2_CapabilityName_2_3;

import SP_helicopter1.input.InputDataClassName_2_2;
import SP_helicopter1.input.InputDataClassName_2_3;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_2")) {
			InputDataClassName_2_2 in = new InputDataClassName_2_2();

			in.setInputName_2_2_1((Float) source.getParameters()[0]);
			in.setInputName_2_2_2((Integer) source.getParameters()[1]);
			in.setInputName_2_2_3((Integer) source.getParameters()[2]);
			in.setInputName_2_2_4((Float) source.getParameters()[3]);
			in.setInputName_2_2_5((Float) source.getParameters()[4]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_3")) {
			InputDataClassName_2_3 in = new InputDataClassName_2_3();

			in.setInputName_2_3_1((String) source.getParameters()[0]);
			in.setInputName_2_3_2((Float) source.getParameters()[1]);
			in.setInputName_2_3_3((Float) source.getParameters()[2]);
			in.setInputName_2_3_4((Integer) source.getParameters()[3]);
			in.setInputName_2_3_5((Integer) source.getParameters()[4]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_2_CapabilityName_2_3 = (State_ServiceName_2_CapabilityName_2_3) ctx
				.lookup("java:global/SP_helicopter1/State_ServiceName_2_CapabilityName_2_3");

		if (opName.equals("CapabilityName_2_3"))
			target.addHeader("state_header",
					instanceState_ServiceName_2_CapabilityName_2_3.getState()
							.toString());

		return super.decompose(exchange, target);
	}
}
