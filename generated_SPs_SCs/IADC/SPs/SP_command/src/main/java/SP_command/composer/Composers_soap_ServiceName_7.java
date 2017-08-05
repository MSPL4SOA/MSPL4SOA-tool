package SP_command.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_command.state.State_ServiceName_7_CapabilityName_7_3;
import SP_command.state.State_ServiceName_7_CapabilityName_7_4;
import SP_command.state.State_ServiceName_7_CapabilityName_7_5;
import SP_command.state.State_ServiceName_7_CapabilityName_7_1;
import SP_command.state.State_ServiceName_7_CapabilityName_7_2;

public class Composers_soap_ServiceName_7 extends SOAPMessageComposer {

	State_ServiceName_7_CapabilityName_7_3 instanceState_ServiceName_7_CapabilityName_7_3;
	State_ServiceName_7_CapabilityName_7_4 instanceState_ServiceName_7_CapabilityName_7_4;
	State_ServiceName_7_CapabilityName_7_5 instanceState_ServiceName_7_CapabilityName_7_5;
	State_ServiceName_7_CapabilityName_7_1 instanceState_ServiceName_7_CapabilityName_7_1;
	State_ServiceName_7_CapabilityName_7_2 instanceState_ServiceName_7_CapabilityName_7_2;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_7_3")) {
			instanceState_ServiceName_7_CapabilityName_7_3 = (State_ServiceName_7_CapabilityName_7_3) ctx
					.lookup("java:global/SP_command/State_ServiceName_7_CapabilityName_7_3");
			context.setProperty("state_header",
					instanceState_ServiceName_7_CapabilityName_7_3.getState());

		}

		if (opName.equals("CapabilityName_7_4")) {
			instanceState_ServiceName_7_CapabilityName_7_4 = (State_ServiceName_7_CapabilityName_7_4) ctx
					.lookup("java:global/SP_command/State_ServiceName_7_CapabilityName_7_4");
			context.setProperty("state_header",
					instanceState_ServiceName_7_CapabilityName_7_4.getState());

		}

		if (opName.equals("CapabilityName_7_5")) {
			instanceState_ServiceName_7_CapabilityName_7_5 = (State_ServiceName_7_CapabilityName_7_5) ctx
					.lookup("java:global/SP_command/State_ServiceName_7_CapabilityName_7_5");
			context.setProperty("state_header",
					instanceState_ServiceName_7_CapabilityName_7_5.getState());

		}

		if (opName.equals("CapabilityName_7_1")) {
			instanceState_ServiceName_7_CapabilityName_7_1 = (State_ServiceName_7_CapabilityName_7_1) ctx
					.lookup("java:global/SP_command/State_ServiceName_7_CapabilityName_7_1");
			context.setProperty("state_header",
					instanceState_ServiceName_7_CapabilityName_7_1.getState());

		}

		if (opName.equals("CapabilityName_7_2")) {
			instanceState_ServiceName_7_CapabilityName_7_2 = (State_ServiceName_7_CapabilityName_7_2) ctx
					.lookup("java:global/SP_command/State_ServiceName_7_CapabilityName_7_2");
			context.setProperty("state_header",
					instanceState_ServiceName_7_CapabilityName_7_2.getState());

		}

		return super.decompose(exchange, target);
	}
}
