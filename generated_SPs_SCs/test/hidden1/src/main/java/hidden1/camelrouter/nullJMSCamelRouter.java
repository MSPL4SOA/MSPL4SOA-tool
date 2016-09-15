package hidden1.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class nullJMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://nullJMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_1_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_null_CapabilityName_1_1?method=getState"))
				.when(simple("${in.header.methodprop} == 'CapabilityName_1_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_null_CapabilityName_1_2?method=getState"))
				.end();
	}

}
