package SP_aircraftcarrier1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_aircraftcarrier1.util.XMLSOAPTransformers;

import SP_aircraftcarrier1.input.InputDataClassName_3_3;
import SP_aircraftcarrier1.input.InputDataClassName_3_4;
import SP_aircraftcarrier1.input.InputDataClassName_3_5;
import SP_aircraftcarrier1.input.InputDataClassName_3_1;
import SP_aircraftcarrier1.input.InputDataClassName_3_2;

import SP_aircraftcarrier1.output.OutputDataClassName_3_3;
import SP_aircraftcarrier1.output.OutputDataClassName_3_4;

public final class TransformersServiceName_3 {

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_3Response")
	public Element transformOutputDataClassName_3_3ToCapabilityName_3_3Response(
			OutputDataClassName_3_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_3:CapabilityName_3_3Response xmlns:OutputDataClassName_3_3=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_3_3_2>" + from.getOutputName_3_3_2()
						+ "</OutputName_3_3_2>")
				.append("<OutputName_3_3_1>" + from.getOutputName_3_3_1()
						+ "</OutputName_3_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_3:CapabilityName_3_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_3")
	public InputDataClassName_3_3 transformCapabilityName_3_3ToInputDataClassName_3_3(
			Element from) {

		InputDataClassName_3_3 in = new InputDataClassName_3_3();

		in.setInputName_3_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_1")));
		in.setInputName_3_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_2")));
		in.setInputName_3_3_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_5")));
		in.setInputName_3_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_6")));
		in.setInputName_3_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_3")));
		in.setInputName_3_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_4Response")
	public Element transformOutputDataClassName_3_4ToCapabilityName_3_4Response(
			OutputDataClassName_3_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_4:CapabilityName_3_4Response xmlns:OutputDataClassName_3_4=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_3_4_1>" + from.getOutputName_3_4_1()
						+ "</OutputName_3_4_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_4:CapabilityName_3_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_4")
	public InputDataClassName_3_4 transformCapabilityName_3_4ToInputDataClassName_3_4(
			Element from) {

		InputDataClassName_3_4 in = new InputDataClassName_3_4();

		in.setInputName_3_4_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_1")));
		in.setInputName_3_4_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_8")));
		in.setInputName_3_4_9(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_9")));
		in.setInputName_3_4_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_6")));
		in.setInputName_3_4_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_7")));
		in.setInputName_3_4_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_4")));
		in.setInputName_3_4_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_5")));
		in.setInputName_3_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_2")));
		in.setInputName_3_4_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_3")));

		return in;

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_5")
	public InputDataClassName_3_5 transformCapabilityName_3_5ToInputDataClassName_3_5(
			Element from) {

		InputDataClassName_3_5 in = new InputDataClassName_3_5();

		in.setInputName_3_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_1")));
		in.setInputName_3_5_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_2")));

		return in;

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));

		return in;

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_3_2")
	public InputDataClassName_3_2 transformCapabilityName_3_2ToInputDataClassName_3_2(
			Element from) {

		InputDataClassName_3_2 in = new InputDataClassName_3_2();

		in.setInputName_3_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_2")));
		in.setInputName_3_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_3")));
		in.setInputName_3_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_1")));
		in.setInputName_3_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_4")));
		in.setInputName_3_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_5")));

		return in;

	}
}
