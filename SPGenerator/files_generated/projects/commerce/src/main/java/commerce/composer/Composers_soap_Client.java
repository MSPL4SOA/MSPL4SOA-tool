package commerce.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import commerce.state.State_Client_connectProfile;
import commerce.state.State_Client_updateProfile;

public class Composers_soap_Client extends SOAPMessageComposer {

	State_Client_updateProfile instanceState_Client_updateProfile;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("updateProfile")) {
			instanceState_Client_updateProfile = (State_Client_updateProfile) ctx
					.lookup("java:global/commerce/State_Client_updateProfile");
			context.setProperty("state_header",
					instanceState_Client_updateProfile.getState());

		}

		return super.decompose(exchange, target);
	}
}
