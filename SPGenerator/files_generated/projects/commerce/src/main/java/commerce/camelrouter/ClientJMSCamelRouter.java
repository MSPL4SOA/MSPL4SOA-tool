package commerce.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ClientJMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ClientJMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'updateProfile'"))
				.setHeader(
						"state_header",
						simple("bean:State_Client_updateProfile?method=getState"))
				.end();
	}

}
