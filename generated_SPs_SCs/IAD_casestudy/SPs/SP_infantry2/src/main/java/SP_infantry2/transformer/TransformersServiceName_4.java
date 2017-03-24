package SP_infantry2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_infantry2.util.XMLSOAPTransformers;

import SP_infantry2.input.InputDataClassName_4_1;

public final class TransformersServiceName_4 {

	@Transformer(from = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_4_1")
	public InputDataClassName_4_1 transformCapabilityName_4_1ToInputDataClassName_4_1(
			Element from) {

		InputDataClassName_4_1 in = new InputDataClassName_4_1();

		in.setInputName_4_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_4")));
		in.setInputName_4_1_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_5")));
		in.setInputName_4_1_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_6")));
		in.setInputName_4_1_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_7")));
		in.setInputName_4_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_1")));
		in.setInputName_4_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_2")));
		in.setInputName_4_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_3")));

		return in;

	}
}
