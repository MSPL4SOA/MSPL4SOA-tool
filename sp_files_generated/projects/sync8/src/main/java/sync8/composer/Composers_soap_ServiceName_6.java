package sync8.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import sync8.state.State_ServiceName_6_CapabilityName_6_4;
import sync8.state.State_ServiceName_6_CapabilityName_6_5;
import sync8.state.State_ServiceName_6_CapabilityName_6_6;
import sync8.state.State_ServiceName_6_CapabilityName_6_1;
import sync8.state.State_ServiceName_6_CapabilityName_6_2;
import sync8.state.State_ServiceName_6_CapabilityName_6_3;

public class Composers_soap_ServiceName_6 extends SOAPMessageComposer {

	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	State_ServiceName_6_CapabilityName_6_1 instanceState_ServiceName_6_CapabilityName_6_1;
	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_6_4")) {
			instanceState_ServiceName_6_CapabilityName_6_4 = (State_ServiceName_6_CapabilityName_6_4) ctx
					.lookup("java:global/sync8/State_ServiceName_6_CapabilityName_6_4");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_4.getState());

		}

		if (opName.equals("CapabilityName_6_1")) {
			instanceState_ServiceName_6_CapabilityName_6_1 = (State_ServiceName_6_CapabilityName_6_1) ctx
					.lookup("java:global/sync8/State_ServiceName_6_CapabilityName_6_1");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_1.getState());

		}

		if (opName.equals("CapabilityName_6_2")) {
			instanceState_ServiceName_6_CapabilityName_6_2 = (State_ServiceName_6_CapabilityName_6_2) ctx
					.lookup("java:global/sync8/State_ServiceName_6_CapabilityName_6_2");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_2.getState());

		}

		return super.decompose(exchange, target);
	}
}
