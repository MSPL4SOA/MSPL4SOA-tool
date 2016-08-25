package large11.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import large11.state.State_ServiceName_2_CapabilityName_2_1;
import large11.state.State_ServiceName_2_CapabilityName_2_2;
import large11.state.State_ServiceName_2_CapabilityName_2_3;
import large11.state.State_ServiceName_2_CapabilityName_2_4;
import large11.state.State_ServiceName_2_CapabilityName_2_6;

import large11.input.InputDataClassName_2_1;
import large11.input.InputDataClassName_2_3;
import large11.input.InputDataClassName_2_4;
import large11.input.InputDataClassName_2_6;

public class Composers_rest_ServiceName_2 extends RESTEasyMessageComposer {

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_2_1")) {
			InputDataClassName_2_1 in = new InputDataClassName_2_1();

			in.setInputName_2_1_1((Float) source.getParameters()[0]);
			in.setInputName_2_1_2((String) source.getParameters()[1]);
			in.setInputName_2_1_3((String) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_3")) {
			InputDataClassName_2_3 in = new InputDataClassName_2_3();

			in.setInputName_2_3_1((Integer) source.getParameters()[0]);
			in.setInputName_2_3_2((Integer) source.getParameters()[1]);
			in.setInputName_2_3_3((Float) source.getParameters()[2]);
			in.setInputName_2_3_4((Float) source.getParameters()[3]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_4")) {
			InputDataClassName_2_4 in = new InputDataClassName_2_4();

			in.setInputName_2_4_1((Integer) source.getParameters()[0]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_2_6")) {
			InputDataClassName_2_6 in = new InputDataClassName_2_6();

			in.setInputName_2_6_1((Float) source.getParameters()[0]);
			in.setInputName_2_6_2((Integer) source.getParameters()[1]);
			message.setContent(in);
		}

		return message;
	}

	@Override
	public RESTEasyBindingData decompose(Exchange exchange,
			RESTEasyBindingData target) throws Exception {

		InitialContext ctx = new InitialContext();
		String opName = exchange.getContract().getProviderOperation().getName();

		return super.decompose(exchange, target);
	}
}
