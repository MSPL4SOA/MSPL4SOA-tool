package SP_submarine2.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_submarine2.state.State_ServiceName_2_CapabilityName_2_1;
import SP_submarine2.state.State_ServiceName_2_CapabilityName_2_2;

import SP_submarine2.input.InputDataClassName_2_1;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((Float) source.getParameters()[0]);
			in.setInputName_2_1_2((String) source.getParameters()[1]);
			in.setInputName_2_1_3((Float) source.getParameters()[2]);
			in.setInputName_2_1_4((String) source.getParameters()[3]);
			in.setInputName_2_1_5((Float) source.getParameters()[4]);
			in.setInputName_2_1_6((Float) source.getParameters()[5]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		return super.decompose(exchange, target);
	}
}
