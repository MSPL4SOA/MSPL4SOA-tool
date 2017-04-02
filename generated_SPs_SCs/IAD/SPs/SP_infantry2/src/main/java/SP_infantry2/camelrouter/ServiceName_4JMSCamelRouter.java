package SP_infantry2.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_4JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_4JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))

		;
	}

}
