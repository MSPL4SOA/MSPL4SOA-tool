package SP_submarine2.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_submarine2.state.State_ServiceName_3_CapabilityName_3_1;
import SP_submarine2.state.State_ServiceName_3_CapabilityName_3_2;

import SP_submarine2.input.InputDataClassName_3_1;

public class Composers_rest_ServiceName_3 extends RESTEasyMessageComposer {

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_3_1")) {
			InputDataClassName_3_1 in = new InputDataClassName_3_1();

			in.setInputName_3_1_3((Integer) source.getParameters()[0]);
			in.setInputName_3_1_4((String) source.getParameters()[1]);
			in.setInputName_3_1_1((Integer) source.getParameters()[2]);
			in.setInputName_3_1_2((Float) source.getParameters()[3]);
			in.setInputName_3_1_7((String) source.getParameters()[4]);
			in.setInputName_3_1_8((Integer) source.getParameters()[5]);
			in.setInputName_3_1_5((String) source.getParameters()[6]);
			in.setInputName_3_1_6((Integer) source.getParameters()[7]);
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
