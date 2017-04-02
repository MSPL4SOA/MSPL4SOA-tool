package SP_infantry2.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_infantry2.state.State_ServiceName_1_CapabilityName_1_1;
import SP_infantry2.state.State_ServiceName_1_CapabilityName_1_2;
import SP_infantry2.state.State_ServiceName_1_CapabilityName_1_3;
import SP_infantry2.state.State_ServiceName_1_CapabilityName_1_4;

public class Composers_soap_ServiceName_1 extends SOAPMessageComposer {

	State_ServiceName_1_CapabilityName_1_1 instanceState_ServiceName_1_CapabilityName_1_1;
	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;
	State_ServiceName_1_CapabilityName_1_3 instanceState_ServiceName_1_CapabilityName_1_3;
	State_ServiceName_1_CapabilityName_1_4 instanceState_ServiceName_1_CapabilityName_1_4;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			instanceState_ServiceName_1_CapabilityName_1_1 = (State_ServiceName_1_CapabilityName_1_1) ctx
					.lookup("java:global/SP_infantry2/State_ServiceName_1_CapabilityName_1_1");
			context.setProperty("state_header",
					instanceState_ServiceName_1_CapabilityName_1_1.getState());

		}

		if (opName.equals("CapabilityName_1_2")) {
			instanceState_ServiceName_1_CapabilityName_1_2 = (State_ServiceName_1_CapabilityName_1_2) ctx
					.lookup("java:global/SP_infantry2/State_ServiceName_1_CapabilityName_1_2");
			context.setProperty("state_header",
					instanceState_ServiceName_1_CapabilityName_1_2.getState());

		}

		if (opName.equals("CapabilityName_1_3")) {
			instanceState_ServiceName_1_CapabilityName_1_3 = (State_ServiceName_1_CapabilityName_1_3) ctx
					.lookup("java:global/SP_infantry2/State_ServiceName_1_CapabilityName_1_3");
			context.setProperty("state_header",
					instanceState_ServiceName_1_CapabilityName_1_3.getState());

		}

		if (opName.equals("CapabilityName_1_4")) {
			instanceState_ServiceName_1_CapabilityName_1_4 = (State_ServiceName_1_CapabilityName_1_4) ctx
					.lookup("java:global/SP_infantry2/State_ServiceName_1_CapabilityName_1_4");
			context.setProperty("state_header",
					instanceState_ServiceName_1_CapabilityName_1_4.getState());

		}

		return super.decompose(exchange, target);
	}
}
