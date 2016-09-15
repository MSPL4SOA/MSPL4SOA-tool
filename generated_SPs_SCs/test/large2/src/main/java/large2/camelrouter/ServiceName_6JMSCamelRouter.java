package large2.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_6JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_6JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_6_4'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_6_CapabilityName_6_4?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_6_5'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_6_CapabilityName_6_5?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_6_6'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_6_CapabilityName_6_6?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_6_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_6_CapabilityName_6_1?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_6_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_6_CapabilityName_6_2?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_6_3'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_6_CapabilityName_6_3?method=getState"))
				.end();
	}

}
