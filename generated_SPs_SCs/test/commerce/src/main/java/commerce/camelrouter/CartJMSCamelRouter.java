package commerce.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class CartJMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://CartJMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))

		;
	}

}
