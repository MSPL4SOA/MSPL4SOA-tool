package SP_aircraftcarrier1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_3;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_4;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_5;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_6;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_1;
import SP_aircraftcarrier1.state.State_ServiceName_3_CapabilityName_3_2;

public class Composers_soap_ServiceName_3 extends SOAPMessageComposer {

	State_ServiceName_3_CapabilityName_3_3 instanceState_ServiceName_3_CapabilityName_3_3;
	State_ServiceName_3_CapabilityName_3_4 instanceState_ServiceName_3_CapabilityName_3_4;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_3_3")) {
			instanceState_ServiceName_3_CapabilityName_3_3 = (State_ServiceName_3_CapabilityName_3_3) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_3_CapabilityName_3_3");
			context.setProperty("state_header",
					instanceState_ServiceName_3_CapabilityName_3_3.getState());

		}

		if (opName.equals("CapabilityName_3_4")) {
			instanceState_ServiceName_3_CapabilityName_3_4 = (State_ServiceName_3_CapabilityName_3_4) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_3_CapabilityName_3_4");
			context.setProperty("state_header",
					instanceState_ServiceName_3_CapabilityName_3_4.getState());

		}

		return super.decompose(exchange, target);
	}
}
