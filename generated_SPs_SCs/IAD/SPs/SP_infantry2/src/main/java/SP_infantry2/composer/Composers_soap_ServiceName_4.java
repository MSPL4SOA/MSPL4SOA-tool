package SP_infantry2.composer;

import javax.naming.InitialContext;

import org.switchyard.Context;
import org.switchyard.Exchange;
import org.switchyard.component.soap.composer.SOAPBindingData;
import org.switchyard.component.soap.composer.SOAPMessageComposer;

import SP_infantry2.state.State_ServiceName_4_CapabilityName_4_2;
import SP_infantry2.state.State_ServiceName_4_CapabilityName_4_1;

public class Composers_soap_ServiceName_4 extends SOAPMessageComposer {

	@Override
	public SOAPBindingData decompose(Exchange exchange, SOAPBindingData target)
			throws Exception {

		Context context = exchange.getContext();
		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		return super.decompose(exchange, target);
	}
}
