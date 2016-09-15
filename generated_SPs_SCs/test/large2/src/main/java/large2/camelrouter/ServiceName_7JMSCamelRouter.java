package large2.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_7JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_7JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_7_3'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_7_CapabilityName_7_3?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_7_4'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_7_CapabilityName_7_4?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_7_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_7_CapabilityName_7_1?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_7_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_7_CapabilityName_7_2?method=getState"))
				.end();
	}

}
