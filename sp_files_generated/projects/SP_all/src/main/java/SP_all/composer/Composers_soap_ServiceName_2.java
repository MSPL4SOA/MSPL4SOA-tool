package SP_all.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_all.state.State_ServiceName_2_CapabilityName_2_4;
import SP_all.state.State_ServiceName_2_CapabilityName_2_5;
import SP_all.state.State_ServiceName_2_CapabilityName_2_6;
import SP_all.state.State_ServiceName_2_CapabilityName_2_1;
import SP_all.state.State_ServiceName_2_CapabilityName_2_2;
import SP_all.state.State_ServiceName_2_CapabilityName_2_3;

public class Composers_soap_ServiceName_2 extends SOAPMessageComposer {

	State_ServiceName_2_CapabilityName_2_4 instanceState_ServiceName_2_CapabilityName_2_4;
	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;
	State_ServiceName_2_CapabilityName_2_6 instanceState_ServiceName_2_CapabilityName_2_6;
	State_ServiceName_2_CapabilityName_2_1 instanceState_ServiceName_2_CapabilityName_2_1;
	State_ServiceName_2_CapabilityName_2_2 instanceState_ServiceName_2_CapabilityName_2_2;
	State_ServiceName_2_CapabilityName_2_3 instanceState_ServiceName_2_CapabilityName_2_3;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_2_4")) {
			instanceState_ServiceName_2_CapabilityName_2_4 = (State_ServiceName_2_CapabilityName_2_4) ctx
					.lookup("java:global/SP_all/State_ServiceName_2_CapabilityName_2_4");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_4.getState());

		}

		if (opName.equals("CapabilityName_2_5")) {
			instanceState_ServiceName_2_CapabilityName_2_5 = (State_ServiceName_2_CapabilityName_2_5) ctx
					.lookup("java:global/SP_all/State_ServiceName_2_CapabilityName_2_5");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_5.getState());

		}

		if (opName.equals("CapabilityName_2_6")) {
			instanceState_ServiceName_2_CapabilityName_2_6 = (State_ServiceName_2_CapabilityName_2_6) ctx
					.lookup("java:global/SP_all/State_ServiceName_2_CapabilityName_2_6");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_6.getState());

		}

		if (opName.equals("CapabilityName_2_1")) {
			instanceState_ServiceName_2_CapabilityName_2_1 = (State_ServiceName_2_CapabilityName_2_1) ctx
					.lookup("java:global/SP_all/State_ServiceName_2_CapabilityName_2_1");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_1.getState());

		}

		if (opName.equals("CapabilityName_2_2")) {
			instanceState_ServiceName_2_CapabilityName_2_2 = (State_ServiceName_2_CapabilityName_2_2) ctx
					.lookup("java:global/SP_all/State_ServiceName_2_CapabilityName_2_2");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_2.getState());

		}

		if (opName.equals("CapabilityName_2_3")) {
			instanceState_ServiceName_2_CapabilityName_2_3 = (State_ServiceName_2_CapabilityName_2_3) ctx
					.lookup("java:global/SP_all/State_ServiceName_2_CapabilityName_2_3");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_3.getState());

		}

		return super.decompose(exchange, target);
	}
}
