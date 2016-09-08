package a1.auditors;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Named;

import org.apache.camel.Exchange;
import org.switchyard.bus.camel.audit.Audit;
import org.switchyard.bus.camel.audit.Auditor;
import org.switchyard.bus.camel.processors.Processors;

@Audit({Processors.ADDRESSING, Processors.CONSUMER_INTERCEPT, Processors.ERROR_HANDLING,
	Processors.SECURITY_PROCESS,Processors.TRANSACTION_HANDLER})
//@Named("custom auditor")
public class SimpleAuditor implements Auditor {
	@Override
	public void beforeCall(Processors processor, Exchange exchange) {
		
		
		Map<String, Object> map =exchange.getIn().getHeaders();
		
		for (Entry<String, Object> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
//		System.out.println("Before " + processor.name());
	}

	@Override
	public void afterCall(Processors processor, Exchange exchange) {
		System.out.println("After " + processor.name());
	}
}