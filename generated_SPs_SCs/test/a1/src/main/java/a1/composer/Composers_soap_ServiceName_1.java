package a1.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import a1.state.State_ServiceName_1_CapabilityName_1_1;
import a1.state.State_ServiceName_1_CapabilityName_1_2;

public class Composers_soap_ServiceName_1 extends SOAPMessageComposer {

	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;

	@Override
	public Message compose(SOAPBindingData target, Exchange exchange) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("composer");
		return super.compose(target, exchange);
	}

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target) throws Exception {

		System.out.println("decomposer");

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		if (opName.equals("CapabilityName_1_2")) {
			instanceState_ServiceName_1_CapabilityName_1_2 = (State_ServiceName_1_CapabilityName_1_2) ctx
					.lookup("java:global/a1/State_ServiceName_1_CapabilityName_1_2");
			context.setProperty("state_header", instanceState_ServiceName_1_CapabilityName_1_2.getState());

		}

		return super.decompose(exchange, target);
	}
}
