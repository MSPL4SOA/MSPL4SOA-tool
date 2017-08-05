package SP_aircraftcarrier1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_aircraftcarrier1.state.State_ServiceName_5_CapabilityName_5_5;
import SP_aircraftcarrier1.state.State_ServiceName_5_CapabilityName_5_1;
import SP_aircraftcarrier1.state.State_ServiceName_5_CapabilityName_5_2;
import SP_aircraftcarrier1.state.State_ServiceName_5_CapabilityName_5_3;
import SP_aircraftcarrier1.state.State_ServiceName_5_CapabilityName_5_4;

public class Composers_soap_ServiceName_5 extends SOAPMessageComposer {

	State_ServiceName_5_CapabilityName_5_5 instanceState_ServiceName_5_CapabilityName_5_5;
	State_ServiceName_5_CapabilityName_5_1 instanceState_ServiceName_5_CapabilityName_5_1;
	State_ServiceName_5_CapabilityName_5_2 instanceState_ServiceName_5_CapabilityName_5_2;
	State_ServiceName_5_CapabilityName_5_3 instanceState_ServiceName_5_CapabilityName_5_3;
	State_ServiceName_5_CapabilityName_5_4 instanceState_ServiceName_5_CapabilityName_5_4;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_5_5")) {
			instanceState_ServiceName_5_CapabilityName_5_5 = (State_ServiceName_5_CapabilityName_5_5) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_5_CapabilityName_5_5");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_5.getState());

		}

		if (opName.equals("CapabilityName_5_1")) {
			instanceState_ServiceName_5_CapabilityName_5_1 = (State_ServiceName_5_CapabilityName_5_1) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_5_CapabilityName_5_1");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_1.getState());

		}

		if (opName.equals("CapabilityName_5_2")) {
			instanceState_ServiceName_5_CapabilityName_5_2 = (State_ServiceName_5_CapabilityName_5_2) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_5_CapabilityName_5_2");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_2.getState());

		}

		if (opName.equals("CapabilityName_5_3")) {
			instanceState_ServiceName_5_CapabilityName_5_3 = (State_ServiceName_5_CapabilityName_5_3) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_5_CapabilityName_5_3");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_3.getState());

		}

		if (opName.equals("CapabilityName_5_4")) {
			instanceState_ServiceName_5_CapabilityName_5_4 = (State_ServiceName_5_CapabilityName_5_4) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_5_CapabilityName_5_4");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_4.getState());

		}

		return super.decompose(exchange, target);
	}
}
