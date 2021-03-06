package SP_submarine2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_submarine2.util.XMLSOAPTransformers;

import SP_submarine2.input.InputDataClassName_3_1;

public final class TransformersServiceName_3 {

	@Transformer(from = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_7")));
		in.setInputName_3_1_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_8")));
		in.setInputName_3_1_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));
		in.setInputName_3_1_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_6")));

		return in;

	}

}
