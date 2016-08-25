package commerce.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import commerce.state.State_Client_updateProfile;

import commerce.input.InformationToUpdate;

public class Composers_rest_Client extends RESTEasyMessageComposer {

	State_Client_updateProfile instanceState_Client_updateProfile;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("updateProfile")) {
			InformationToUpdate in = new InformationToUpdate();

			in.setAge((Integer) source.getParameters()[0]);
			in.setAddress((String) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_Client_updateProfile = (State_Client_updateProfile) ctx
				.lookup("java:global/commerce/State_Client_updateProfile");

		if (opName.equals("updateProfile"))
			target.addHeader("state_header", instanceState_Client_updateProfile
					.getState().toString());

		return super.decompose(exchange, target);
	}
}
