package SP_submarine2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_submarine2.util.XMLSOAPTransformers;

import SP_submarine2.input.InputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(from = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));
		in.setInputName_2_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_3")));
		in.setInputName_2_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_4")));
		in.setInputName_2_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_5")));
		in.setInputName_2_1_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_6")));

		return in;

	}

}
