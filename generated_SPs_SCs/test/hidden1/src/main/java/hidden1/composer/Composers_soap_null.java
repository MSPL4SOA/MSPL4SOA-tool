package hidden1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import hidden1.state.State_null_CapabilityName_1_1;
import hidden1.state.State_null_CapabilityName_1_2;

public class Composers_soap_null extends SOAPMessageComposer {

	State_null_CapabilityName_1_1 instanceState_null_CapabilityName_1_1;
	State_null_CapabilityName_1_2 instanceState_null_CapabilityName_1_2;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			instanceState_null_CapabilityName_1_1 = (State_null_CapabilityName_1_1) ctx
					.lookup("java:global/hidden1/State_null_CapabilityName_1_1");
			context.setProperty("state_header",
					instanceState_null_CapabilityName_1_1.getState());

		}

		if (opName.equals("CapabilityName_1_2")) {
			instanceState_null_CapabilityName_1_2 = (State_null_CapabilityName_1_2) ctx
					.lookup("java:global/hidden1/State_null_CapabilityName_1_2");
			context.setProperty("state_header",
					instanceState_null_CapabilityName_1_2.getState());

		}

		return super.decompose(exchange, target);
	}
}
