package SP_command.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_3JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_3JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_3_3'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_3_CapabilityName_3_3?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_3_4'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_3_CapabilityName_3_4?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_3_6'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_3_CapabilityName_3_6?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_3_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_3_CapabilityName_3_1?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_3_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_3_CapabilityName_3_2?method=getState"))
				.end();
	}

}
