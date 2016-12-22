package SP.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP.state.State_Personel_login;

public class Composers_soap_Personel extends SOAPMessageComposer {

	State_Personel_login instanceState_Personel_login;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("login")) {
			instanceState_Personel_login = (State_Personel_login) ctx
					.lookup("java:global/SP/State_Personel_login");
			context.setProperty("state_header",
					instanceState_Personel_login.getState());

		}

		return super.decompose(exchange, target);
	}
}
