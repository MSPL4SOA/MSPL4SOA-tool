package a1.composer;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.Property;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import a1.state.State_ServiceName_1_CapabilityName_1_1;
import a1.state.State_ServiceName_1_CapabilityName_1_2;

import a1.input.InputDataClassName_1_1;

public class Composers_rest_ServiceName_1 extends RESTEasyMessageComposer {

	State_ServiceName_1_CapabilityName_1_2 instanceState_ServiceName_1_CapabilityName_1_2;

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange) throws Exception {

		System.out.println("composer rest");

//		System.out.println(source.getServletRequest().getLocalName());
//		System.out.println(source.getServletRequest().getContentType());
//		System.out.println(source.getServletRequest().getLocalAddr());
//		System.out.println(source.getServletRequest().getLocalPort());
//		System.out.println(source.getServletRequest().getRemoteAddr());
//		System.out.println(source.getServletRequest().getRemoteHost());
//		System.out.println(source.getServletRequest().getRemotePort());
//		System.out.println(source.getServletRequest().getScheme());
//		System.out.println(source.getServletRequest().getServerName());
//		System.out.println(source.getServletRequest().getServerPort());
		
		//0
//		Enumeration<?> en = source.getServletRequest().getParameterNames();
//		
//		while (en.hasMoreElements()) {
//			String name = (String) en.nextElement();
//			
//			System.out.println(name + " : " + source.getServletRequest().getParameterValues(name));
//			
//		}
		
		
		//headers
//		Iterator<String> it = source.getHeaders().keySet().iterator();
//
//		while (it.hasNext()) {
//			String theKey = (String) it.next();
//			System.out.println(theKey + " : " + source.getHeaders().getFirst(theKey));
////			parameters.put(theKey, queryParameters.getFirst(theKey));
//		}

		// Set<Property> properties = exchange.getContext().getProperties();
		//
		// for (Iterator iterator = properties.iterator(); iterator.hasNext();)
		// {
		// Property property = (Property) iterator.next();
		//
		// System.out.println(property.getName() + " : " + property.getValue());
		//
		// }

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_1_1")) {
			InputDataClassName_1_1 in = new InputDataClassName_1_1();

			in.setInputName_1_1_1((String) source.getParameters()[0]);
			in.setInputName_1_1_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange, RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		instanceState_ServiceName_1_CapabilityName_1_2 = (State_ServiceName_1_CapabilityName_1_2) ctx
				.lookup("java:global/a1/State_ServiceName_1_CapabilityName_1_2");

		if (opName.equals("CapabilityName_1_2"))
			target.addHeader("state_header", instanceState_ServiceName_1_CapabilityName_1_2.getState().toString());

		return super.decompose(exchange, target);
	}
}
