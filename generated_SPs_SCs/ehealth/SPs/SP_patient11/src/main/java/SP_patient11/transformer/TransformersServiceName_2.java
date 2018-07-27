package SP_drone1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_drone1.util.XMLSOAPTransformers;

import SP_drone1.input.InputDataClassName_2_1;
import SP_drone1.input.InputDataClassName_2_3;

import SP_drone1.output.OutputDataClassName_2_3;

public final class TransformersServiceName_2 {

	@Transformer(from = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));
		in.setInputName_2_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_3")));
		in.setInputName_2_1_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_4")));
		in.setInputName_2_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_5")));
		in.setInputName_2_1_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_6")));
		in.setInputName_2_1_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_7")));
		in.setInputName_2_1_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_8")));
		in.setInputName_2_1_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_9")));

		return in;

	}

	@Transformer(to = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_2_3Response")
	public Element transformOutputDataClassName_2_3ToCapabilityName_2_3Response(
			OutputDataClassName_2_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_3:CapabilityName_2_3Response xmlns:OutputDataClassName_2_3=\"urn:SP_drone1:SP_drone1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_3_9>" + from.getOutputName_2_3_9()
						+ "</OutputName_2_3_9>")
				.append("<OutputName_2_3_5>" + from.getOutputName_2_3_5()
						+ "</OutputName_2_3_5>")
				.append("<OutputName_2_3_6>" + from.getOutputName_2_3_6()
						+ "</OutputName_2_3_6>")
				.append("<OutputName_2_3_7>" + from.getOutputName_2_3_7()
						+ "</OutputName_2_3_7>")
				.append("<OutputName_2_3_8>" + from.getOutputName_2_3_8()
						+ "</OutputName_2_3_8>")
				.append("<OutputName_2_3_1>" + from.getOutputName_2_3_1()
						+ "</OutputName_2_3_1>")
				.append("<OutputName_2_3_2>" + from.getOutputName_2_3_2()
						+ "</OutputName_2_3_2>")
				.append("<OutputName_2_3_3>" + from.getOutputName_2_3_3()
						+ "</OutputName_2_3_3>")
				.append("<OutputName_2_3_4>" + from.getOutputName_2_3_4()
						+ "</OutputName_2_3_4>")
				.append("</return>")
				.append("</OutputDataClassName_2_3:CapabilityName_2_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_2_3")
	public InputDataClassName_2_3 transformCapabilityName_2_3ToInputDataClassName_2_3(
			Element from) {

		InputDataClassName_2_3 in = new InputDataClassName_2_3();

		in.setInputName_2_3_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_3_1")));
		in.setInputName_2_3_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_3_2")));

		return in;

	}
}
