package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_7_3;
import SP_command.input.InputDataClassName_7_4;
import SP_command.input.InputDataClassName_7_2;

import SP_command.output.OutputDataClassName_7_3;
import SP_command.output.OutputDataClassName_7_4;
import SP_command.output.OutputDataClassName_7_1;

public final class TransformersServiceName_7 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_7_3Response")
	public Element transformOutputDataClassName_7_3ToCapabilityName_7_3Response(
			OutputDataClassName_7_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_3:CapabilityName_7_3Response xmlns:OutputDataClassName_7_3=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_7_3_1>" + from.getOutputName_7_3_1()
						+ "</OutputName_7_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_7_3:CapabilityName_7_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_7_3")
	public InputDataClassName_7_3 transformCapabilityName_7_3ToInputDataClassName_7_3(
			Element from) {

		InputDataClassName_7_3 in = new InputDataClassName_7_3();

		in.setInputName_7_3_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_5")));
		in.setInputName_7_3_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_6")));
		in.setInputName_7_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_3")));
		in.setInputName_7_3_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_4")));
		in.setInputName_7_3_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_1")));
		in.setInputName_7_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_2")));
		in.setInputName_7_3_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_7")));
		in.setInputName_7_3_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_8")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_7_4Response")
	public Element transformOutputDataClassName_7_4ToCapabilityName_7_4Response(
			OutputDataClassName_7_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_4:CapabilityName_7_4Response xmlns:OutputDataClassName_7_4=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_7_4_2>" + from.getOutputName_7_4_2()
						+ "</OutputName_7_4_2>")
				.append("<OutputName_7_4_1>" + from.getOutputName_7_4_1()
						+ "</OutputName_7_4_1>")
				.append("<OutputName_7_4_4>" + from.getOutputName_7_4_4()
						+ "</OutputName_7_4_4>")
				.append("<OutputName_7_4_3>" + from.getOutputName_7_4_3()
						+ "</OutputName_7_4_3>")
				.append("</return>")
				.append("</OutputDataClassName_7_4:CapabilityName_7_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_7_4")
	public InputDataClassName_7_4 transformCapabilityName_7_4ToInputDataClassName_7_4(
			Element from) {

		InputDataClassName_7_4 in = new InputDataClassName_7_4();

		in.setInputName_7_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_4")));
		in.setInputName_7_4_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_5")));
		in.setInputName_7_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_2")));
		in.setInputName_7_4_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_3")));
		in.setInputName_7_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_7_1Response")
	public Element transformOutputDataClassName_7_1ToCapabilityName_7_1Response(
			OutputDataClassName_7_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_1:CapabilityName_7_1Response xmlns:OutputDataClassName_7_1=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_7_1_1>" + from.getOutputName_7_1_1()
						+ "</OutputName_7_1_1>")
				.append("<OutputName_7_1_5>" + from.getOutputName_7_1_5()
						+ "</OutputName_7_1_5>")
				.append("<OutputName_7_1_4>" + from.getOutputName_7_1_4()
						+ "</OutputName_7_1_4>")
				.append("<OutputName_7_1_3>" + from.getOutputName_7_1_3()
						+ "</OutputName_7_1_3>")
				.append("<OutputName_7_1_2>" + from.getOutputName_7_1_2()
						+ "</OutputName_7_1_2>")
				.append("<OutputName_7_1_9>" + from.getOutputName_7_1_9()
						+ "</OutputName_7_1_9>")
				.append("<OutputName_7_1_8>" + from.getOutputName_7_1_8()
						+ "</OutputName_7_1_8>")
				.append("<OutputName_7_1_7>" + from.getOutputName_7_1_7()
						+ "</OutputName_7_1_7>")
				.append("<OutputName_7_1_6>" + from.getOutputName_7_1_6()
						+ "</OutputName_7_1_6>")
				.append("</return>")
				.append("</OutputDataClassName_7_1:CapabilityName_7_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_7_2")
	public InputDataClassName_7_2 transformCapabilityName_7_2ToInputDataClassName_7_2(
			Element from) {

		InputDataClassName_7_2 in = new InputDataClassName_7_2();

		in.setInputName_7_2_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_6")));
		in.setInputName_7_2_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_7")));
		in.setInputName_7_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_4")));
		in.setInputName_7_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_5")));
		in.setInputName_7_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_2")));
		in.setInputName_7_2_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_3")));
		in.setInputName_7_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_1")));
		in.setInputName_7_2_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_8")));
		in.setInputName_7_2_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_9")));

		return in;

	}
}
