package SP_aircraftcarrier2.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_aircraftcarrier2.state.State_ServiceName_3_CapabilityName_3_1;

import SP_aircraftcarrier2.input.InputDataClassName_3_1;

public class Composers_rest_ServiceName_3 extends RESTEasyMessageComposer {

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_3_1")) {
			InputDataClassName_3_1 in = new InputDataClassName_3_1();

			in.setInputName_3_1_3((String) source.getParameters()[0]);
			in.setInputName_3_1_4((Float) source.getParameters()[1]);
			in.setInputName_3_1_1((Integer) source.getParameters()[2]);
			in.setInputName_3_1_2((Integer) source.getParameters()[3]);
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
