package a1.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_2JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_2JMSInterface")
				.log("${in.headers}")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'CapabilityName_2_1'"))
				.setHeader(
						"state_header",
						simple("bean:State_ServiceName_2_CapabilityName_2_1?method=getState"))
				.end();
		
//		.log("method      = ${header.http_request_info.method}")  
//		   .log("pathInfo    = ${header.http_request_info.pathInfo}")  
//		   .log("queryString = ${header.http_request_info.queryString}")  
//		   .log("body        = ${body}")  
	}

}
