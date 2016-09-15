package large11.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import large11.state.State_ServiceName_5_CapabilityName_5_1;
import large11.state.State_ServiceName_5_CapabilityName_5_2;
import large11.state.State_ServiceName_5_CapabilityName_5_3;
import large11.state.State_ServiceName_5_CapabilityName_5_4;
import large11.state.State_ServiceName_5_CapabilityName_5_5;
import large11.state.State_ServiceName_5_CapabilityName_5_6;

public class Composers_soap_ServiceName_5 extends SOAPMessageComposer {

	State_ServiceName_5_CapabilityName_5_2 instanceState_ServiceName_5_CapabilityName_5_2;
	State_ServiceName_5_CapabilityName_5_4 instanceState_ServiceName_5_CapabilityName_5_4;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_5_2")) {
			instanceState_ServiceName_5_CapabilityName_5_2 = (State_ServiceName_5_CapabilityName_5_2) ctx
					.lookup("java:global/large11/State_ServiceName_5_CapabilityName_5_2");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_2.getState());

		}

		if (opName.equals("CapabilityName_5_4")) {
			instanceState_ServiceName_5_CapabilityName_5_4 = (State_ServiceName_5_CapabilityName_5_4) ctx
					.lookup("java:global/large11/State_ServiceName_5_CapabilityName_5_4");
			context.setProperty("state_header",
					instanceState_ServiceName_5_CapabilityName_5_4.getState());

		}

		return super.decompose(exchange, target);
	}
}
