package commerce.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import commerce.state.State_Cart_addProduct;

import commerce.input.InputProduct;
import commerce.input.Order;

public class Composers_rest_Cart extends RESTEasyMessageComposer {

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("addProduct")) {
			InputProduct in = new InputProduct();

			in.setId((String) source.getParameters()[0]);
			in.setName((String) source.getParameters()[1]);
			in.setQte((Integer) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("getProduct")) {
			Order in = new Order();

			in.setId((String) source.getParameters()[0]);
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
