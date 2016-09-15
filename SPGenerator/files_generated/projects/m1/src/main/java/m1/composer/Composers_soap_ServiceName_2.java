package m1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import m1.state.State_ServiceName_2_CapabilityName_2_1;
import m1.state.State_ServiceName_2_CapabilityName_2_2;

public class Composers_soap_ServiceName_2 extends SOAPMessageComposer {

	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_2_1")) {
			instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
					.lookup("java:global/m1/State_ServiceName_2_CapabilityName_2_1");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState());

		}

		return super.decompose(exchange, target);
	}
}
