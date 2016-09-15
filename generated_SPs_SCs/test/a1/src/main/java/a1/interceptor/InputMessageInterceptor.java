package a1.interceptor;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.camel.CamelContext;
import org.switchyard.Exchange;
import org.switchyard.ExchangeInterceptor;
import org.switchyard.HandlerException;

@Named("InputMessageInterceptor")
public class InputMessageInterceptor implements ExchangeInterceptor {

	
//	@Inject
//	Message message;
	
//	@Inject
//	private CamelContext context;

	@Override
	public void after(String target, Exchange exchange) throws HandlerException {
		// TODO Auto-generated method stub

		// System.out.println("after");
		// System.out.println(exchange.getMessage());
		
		 System.out.println("Interceptor after");

	}

	@Override
	public void before(String target, Exchange exchange) throws HandlerException {
		 System.out.println("Interceptor before");
		
		 
//		Map<String, Object> headers = message.getHeaders();

//		System.out.println(headers);


		// System.out.println(exchange.getContext());

//		 System.out.println(exchange.getMessage());
//		 
//		 
//		 String opName = exchange.getContract().getConsumerOperation().getName();
//		 System.out.println(opName);
//		 
//		 
//		 
//		
//		 Set<Property> properties = context.getProperties();
////		
//		 
//		 
//		 for (Iterator iterator = properties.iterator(); iterator.hasNext();)
//		 {
//		 Property property = (Property) iterator.next();
//		
//		 System.out.println(property.getName() + " : " + property.getValue());
//		
//		 }

//		System.out.println("before1");
//
////		checkInputMessageFeatures.verify(exchange);
//		
//		// load up the knowledge base
//        KieServices ks = KieServices.Factory.get();
////	    KieContainer kContainer = ks.getKieClasspathContainer();
////    	KieSession kSession = kContainer.newKieSession("ksession-rules");
//
//		System.out.println("before2");

	}

	@Override
	public List<String> getTargets() {
		return Arrays.asList(CONSUMER);
	}

}
