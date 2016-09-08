package a1.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_1JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_1JMSInterface")
		.log("method      = ${header.http_request_info.method}")  
		   .log("pathInfo    = ${header.http_request_info.pathInfo}")  
		   .log("queryString = ${header.http_request_info.queryString}")  
		   .log("body        = ${body}")  
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_1_2'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_1_CapabilityName_1_2?method=getState"))
				.end();
	}

}
