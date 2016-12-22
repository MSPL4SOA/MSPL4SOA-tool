package SP.camelrouter;

import org.apache.camel.builder.RouteBuilder;

public class PersonelJMSCamelRouter extends RouteBuilder {

	public void configure() {

		from("switchyard://PersonelJMSInterface")
				.setProperty("methodprop", simple("${in.header.method_name}"))
				.recipientList(
						simple("switchyard://${in.header.service_name}?operationName=${in.header.method_name}"))
				.choice()
				.when(simple("${in.header.methodprop} == 'login'"))
				.setHeader("state_header",
						simple("bean:State_Personel_login?method=getState"))
				.end();
	}

}
