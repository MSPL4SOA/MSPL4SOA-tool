package SP_drone1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_drone1.state.State_ServiceName_4_CapabilityName_4_2;
import SP_drone1.state.State_ServiceName_4_CapabilityName_4_1;

public class Composers_soap_ServiceName_4 extends SOAPMessageComposer {

	State_ServiceName_4_CapabilityName_4_2 instanceState_ServiceName_4_CapabilityName_4_2;
	State_ServiceName_4_CapabilityName_4_1 instanceState_ServiceName_4_CapabilityName_4_1;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_4_2")) {
			instanceState_ServiceName_4_CapabilityName_4_2 = (State_ServiceName_4_CapabilityName_4_2) ctx
					.lookup("java:global/SP_drone1/State_ServiceName_4_CapabilityName_4_2");
			context.setProperty("state_header",
					instanceState_ServiceName_4_CapabilityName_4_2.getState());

		}

		if (opName.equals("CapabilityName_4_1")) {
			instanceState_ServiceName_4_CapabilityName_4_1 = (State_ServiceName_4_CapabilityName_4_1) ctx
					.lookup("java:global/SP_drone1/State_ServiceName_4_CapabilityName_4_1");
			context.setProperty("state_header",
					instanceState_ServiceName_4_CapabilityName_4_1.getState());

		}

		return super.decompose(exchange, target);
	}
}
