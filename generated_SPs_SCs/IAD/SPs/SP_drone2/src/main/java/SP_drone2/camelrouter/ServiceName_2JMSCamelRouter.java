package SP_drone2.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_2JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_2JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_2_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_2_CapabilityName_2_1?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_2_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_2_CapabilityName_2_2?method=getState"))
				.end();
	}

}
