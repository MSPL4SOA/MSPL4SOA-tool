package SP.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP.state.State_Personel_login;

import SP.input.Session;

public class Composers_rest_Personel extends RESTEasyMessageComposer {

	State_Personel_login instanceState_Personel_login;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("login")) {
			Session in = new Session();

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

		instanceState_Personel_login = (State_Personel_login) ctx
				.lookup("java:global/SP/State_Personel_login");

		if (opName.equals("login"))
			target.addHeader("state_header", instanceState_Personel_login
					.getState().toString());

		return super.decompose(exchange, target);
	}
}
