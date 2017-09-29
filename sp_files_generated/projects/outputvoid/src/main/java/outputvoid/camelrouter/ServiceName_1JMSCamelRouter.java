package outputvoid.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_1JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_1JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))

		;
	}

}
