package r.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_1JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_1JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_1_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_1_CapabilityName_1_1?method=getState"))
				.end();
	}

}
