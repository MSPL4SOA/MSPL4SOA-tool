package v2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import v2.util.XMLSOAPTransformers;

import v2.input.InputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(from = "{urn:v2:v2:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));

		return in;

	}

}
