package large2.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_4JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_4JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_4_6'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_4_CapabilityName_4_6?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_4_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_4_CapabilityName_4_2?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_4_3'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_4_CapabilityName_4_3?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_4_4'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_4_CapabilityName_4_4?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_4_5'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_4_CapabilityName_4_5?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_4_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_4_CapabilityName_4_1?method=getState"))
				.end();
	}

}
