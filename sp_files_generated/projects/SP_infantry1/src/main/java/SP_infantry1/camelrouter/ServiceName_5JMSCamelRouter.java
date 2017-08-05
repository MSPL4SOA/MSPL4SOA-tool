package SP_infantry1.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_5JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_5JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_5_5'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_5_CapabilityName_5_5?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_5_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_5_CapabilityName_5_1?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_5_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_5_CapabilityName_5_2?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_5_3'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_5_CapabilityName_5_3?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_5_4'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_5_CapabilityName_5_4?method=getState"))
				.end();
	}

}
