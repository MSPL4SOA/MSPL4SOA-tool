package SP_drone1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_drone1.util.XMLSOAPTransformers;

import SP_drone1.input.InputDataClassName_3_1;
import SP_drone1.input.InputDataClassName_3_2;

public final class TransformersServiceName_3 {

	@Transformer(from = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_7")));
		in.setInputName_3_1_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_8")));
		in.setInputName_3_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));
		in.setInputName_3_1_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_6")));

		return in;

	}

	@Transformer(from = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_3_2")
	public InputDataClassName_3_2 transformCapabilityName_3_2ToInputDataClassName_3_2(
			Element from) {

		InputDataClassName_3_2 in = new InputDataClassName_3_2();

		in.setInputName_3_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_2")));
		in.setInputName_3_2_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_3")));
		in.setInputName_3_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_1")));
		in.setInputName_3_2_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_6")));
		in.setInputName_3_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_4")));
		in.setInputName_3_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_5")));

		return in;

	}
}
