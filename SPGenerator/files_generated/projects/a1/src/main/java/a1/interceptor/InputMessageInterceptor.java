package a1.interceptor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.inject.Named;

import org.switchyard.Exchange;
import org.switchyard.ExchangeInterceptor;
import org.switchyard.HandlerException;
import org.switchyard.Property;

@Named("InputMessageInterceptor")
public class InputMessageInterceptor implements ExchangeInterceptor {

	@Override
	public void after(String target, Exchange exchange) throws HandlerException {
		// TODO Auto-generated method stub

		// System.out.println("after");
		// System.out.println(exchange.getMessage());

	}

	@Override
	public void before(String target, Exchange exchange) throws HandlerException {
//		System.out.println("before");

		// System.out.println(exchange.getContext());

		 System.out.println(exchange.getMessage());

		 Set<Property> properties = exchange.getContext().getProperties();
		
		 for (Iterator iterator = properties.iterator(); iterator.hasNext();)
		 {
		 Property property = (Property) iterator.next();
		
		 System.out.println(property.getName() + " : " + property.getValue());
		
		 }

	}

	@Override
	public List<String> getTargets() {
		return Arrays.asList(CONSUMER);
	}

}
