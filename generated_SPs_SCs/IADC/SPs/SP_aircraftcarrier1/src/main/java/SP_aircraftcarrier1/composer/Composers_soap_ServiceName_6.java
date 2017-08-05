package SP_aircraftcarrier1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_4;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_5;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_6;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_7;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_1;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_2;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_3;
import SP_aircraftcarrier1.state.State_ServiceName_6_CapabilityName_6_8;

public class Composers_soap_ServiceName_6 extends SOAPMessageComposer {

	State_ServiceName_6_CapabilityName_6_4 instanceState_ServiceName_6_CapabilityName_6_4;
	State_ServiceName_6_CapabilityName_6_5 instanceState_ServiceName_6_CapabilityName_6_5;
	State_ServiceName_6_CapabilityName_6_6 instanceState_ServiceName_6_CapabilityName_6_6;
	State_ServiceName_6_CapabilityName_6_7 instanceState_ServiceName_6_CapabilityName_6_7;
	State_ServiceName_6_CapabilityName_6_2 instanceState_ServiceName_6_CapabilityName_6_2;
	State_ServiceName_6_CapabilityName_6_3 instanceState_ServiceName_6_CapabilityName_6_3;
	State_ServiceName_6_CapabilityName_6_8 instanceState_ServiceName_6_CapabilityName_6_8;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_6_4")) {
			instanceState_ServiceName_6_CapabilityName_6_4 = (State_ServiceName_6_CapabilityName_6_4) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_4");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_4.getState());

		}

		if (opName.equals("CapabilityName_6_5")) {
			instanceState_ServiceName_6_CapabilityName_6_5 = (State_ServiceName_6_CapabilityName_6_5) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_5");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_5.getState());

		}

		if (opName.equals("CapabilityName_6_6")) {
			instanceState_ServiceName_6_CapabilityName_6_6 = (State_ServiceName_6_CapabilityName_6_6) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_6");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_6.getState());

		}

		if (opName.equals("CapabilityName_6_7")) {
			instanceState_ServiceName_6_CapabilityName_6_7 = (State_ServiceName_6_CapabilityName_6_7) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_7");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_7.getState());

		}

		if (opName.equals("CapabilityName_6_2")) {
			instanceState_ServiceName_6_CapabilityName_6_2 = (State_ServiceName_6_CapabilityName_6_2) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_2");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_2.getState());

		}

		if (opName.equals("CapabilityName_6_3")) {
			instanceState_ServiceName_6_CapabilityName_6_3 = (State_ServiceName_6_CapabilityName_6_3) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_3");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_3.getState());

		}

		if (opName.equals("CapabilityName_6_8")) {
			instanceState_ServiceName_6_CapabilityName_6_8 = (State_ServiceName_6_CapabilityName_6_8) ctx
					.lookup("java:global/SP_aircraftcarrier1/State_ServiceName_6_CapabilityName_6_8");
			context.setProperty("state_header",
					instanceState_ServiceName_6_CapabilityName_6_8.getState());

		}

		return super.decompose(exchange, target);
	}
}
