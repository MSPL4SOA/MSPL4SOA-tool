package sp_manager.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import sp_manager.state.State_ServiceName_2_CapabilityName_2_1;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_2;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_3;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_4;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_5;
import sp_manager.state.State_ServiceName_2_CapabilityName_2_6;

public class Composers_soap_ServiceName_2 extends SOAPMessageComposer {

	State_ServiceName_2_CapabilityName_2_5 instanceState_ServiceName_2_CapabilityName_2_5;

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_2_5")) {
			instanceState_ServiceName_2_CapabilityName_2_5 = (State_ServiceName_2_CapabilityName_2_5) ctx
					.lookup("java:global/sp_manager/State_ServiceName_2_CapabilityName_2_5");
			context.setProperty("state_header",
					instanceState_ServiceName_2_CapabilityName_2_5.getState());

		}

		return super.decompose(exchange, target);
	}
}
