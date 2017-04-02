package SP_radar2.composer;

import javax.naming.InitialContext;

import org.switchyard.Exchange;
import org.switchyard.Message;
import org.switchyard.component.resteasy.composer.RESTEasyBindingData;
import org.switchyard.component.resteasy.composer.RESTEasyMessageComposer;

import SP_radar2.state.State_ServiceName_4_CapabilityName_4_2;
import SP_radar2.state.State_ServiceName_4_CapabilityName_4_3;
import SP_radar2.state.State_ServiceName_4_CapabilityName_4_1;

import SP_radar2.input.InputDataClassName_4_2;
import SP_radar2.input.InputDataClassName_4_3;
import SP_radar2.input.InputDataClassName_4_1;

public class Composers_rest_ServiceName_4 extends RESTEasyMessageComposer {

	@Override
	public Message compose(RESTEasyBindingData source, Exchange exchange)
			throws Exception {

		final Message message = super.compose(source, exchange);
		String opName = exchange.getContract().getConsumerOperation().getName();

		if (opName.equals("CapabilityName_4_2")) {
			InputDataClassName_4_2 in = new InputDataClassName_4_2();

			in.setInputName_4_2_1((String) source.getParameters()[0]);
			in.setInputName_4_2_2((String) source.getParameters()[1]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_3")) {
			InputDataClassName_4_3 in = new InputDataClassName_4_3();

			in.setInputName_4_3_2((String) source.getParameters()[0]);
			in.setInputName_4_3_3((Integer) source.getParameters()[1]);
			in.setInputName_4_3_1((String) source.getParameters()[2]);
			message.setContent(in);
		}

		if (opName.equals("CapabilityName_4_1")) {
			InputDataClassName_4_1 in = new InputDataClassName_4_1();

			in.setInputName_4_1_4((String) source.getParameters()[0]);
			in.setInputName_4_1_5((Float) source.getParameters()[1]);
			in.setInputName_4_1_6((Float) source.getParameters()[2]);
			in.setInputName_4_1_7((Float) source.getParameters()[3]);
			in.setInputName_4_1_1((String) source.getParameters()[4]);
			in.setInputName_4_1_2((String) source.getParameters()[5]);
			in.setInputName_4_1_3((String) source.getParameters()[6]);
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
