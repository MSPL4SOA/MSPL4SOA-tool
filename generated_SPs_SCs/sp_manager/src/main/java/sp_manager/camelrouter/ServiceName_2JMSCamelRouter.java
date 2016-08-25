package sp_manager.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class ServiceName_2JMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://ServiceName_2JMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))

		;
	}

}
