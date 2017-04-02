package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_4_6;
import SP_command.input.InputDataClassName_4_2;
import SP_command.input.InputDataClassName_4_3;
import SP_command.input.InputDataClassName_4_5;
import SP_command.input.InputDataClassName_4_1;

import SP_command.output.OutputDataClassName_4_6;
import SP_command.output.OutputDataClassName_4_2;
import SP_command.output.OutputDataClassName_4_3;
import SP_command.output.OutputDataClassName_4_4;

public final class TransformersServiceName_4 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_4_6Response")
	public Element transformOutputDataClassName_4_6ToCapabilityName_4_6Response(
			OutputDataClassName_4_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_6:CapabilityName_4_6Response xmlns:OutputDataClassName_4_6=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_4_6_1>" + from.getOutputName_4_6_1()
						+ "</OutputName_4_6_1>")
				.append("<OutputName_4_6_2>" + from.getOutputName_4_6_2()
						+ "</OutputName_4_6_2>")
				.append("<OutputName_4_6_3>" + from.getOutputName_4_6_3()
						+ "</OutputName_4_6_3>")
				.append("<OutputName_4_6_4>" + from.getOutputName_4_6_4()
						+ "</OutputName_4_6_4>")
				.append("</return>")
				.append("</OutputDataClassName_4_6:CapabilityName_4_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_4_6")
	public InputDataClassName_4_6 transformCapabilityName_4_6ToInputDataClassName_4_6(
			Element from) {

		InputDataClassName_4_6 in = new InputDataClassName_4_6();

		in.setInputName_4_6_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_7")));
		in.setInputName_4_6_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_3")));
		in.setInputName_4_6_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_4")));
		in.setInputName_4_6_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_5")));
		in.setInputName_4_6_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_6")));
		in.setInputName_4_6_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_1")));
		in.setInputName_4_6_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_4_2Response")
	public Element transformOutputDataClassName_4_2ToCapabilityName_4_2Response(
			OutputDataClassName_4_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_2:CapabilityName_4_2Response xmlns:OutputDataClassName_4_2=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_4_2_1>" + from.getOutputName_4_2_1()
						+ "</OutputName_4_2_1>")
				.append("<OutputName_4_2_2>" + from.getOutputName_4_2_2()
						+ "</OutputName_4_2_2>")
				.append("<OutputName_4_2_3>" + from.getOutputName_4_2_3()
						+ "</OutputName_4_2_3>")
				.append("</return>")
				.append("</OutputDataClassName_4_2:CapabilityName_4_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_4_2")
	public InputDataClassName_4_2 transformCapabilityName_4_2ToInputDataClassName_4_2(
			Element from) {

		InputDataClassName_4_2 in = new InputDataClassName_4_2();

		in.setInputName_4_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_4_3Response")
	public Element transformOutputDataClassName_4_3ToCapabilityName_4_3Response(
			OutputDataClassName_4_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_3:CapabilityName_4_3Response xmlns:OutputDataClassName_4_3=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_4_3_1>" + from.getOutputName_4_3_1()
						+ "</OutputName_4_3_1>")
				.append("<OutputName_4_3_2>" + from.getOutputName_4_3_2()
						+ "</OutputName_4_3_2>")
				.append("</return>")
				.append("</OutputDataClassName_4_3:CapabilityName_4_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_4_3")
	public InputDataClassName_4_3 transformCapabilityName_4_3ToInputDataClassName_4_3(
			Element from) {

		InputDataClassName_4_3 in = new InputDataClassName_4_3();

		in.setInputName_4_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_2")));
		in.setInputName_4_3_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_3")));
		in.setInputName_4_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_4")));
		in.setInputName_4_3_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_5")));
		in.setInputName_4_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_4_4Response")
	public Element transformOutputDataClassName_4_4ToCapabilityName_4_4Response(
			OutputDataClassName_4_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_4:CapabilityName_4_4Response xmlns:OutputDataClassName_4_4=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_4_4_2>" + from.getOutputName_4_4_2()
						+ "</OutputName_4_4_2>")
				.append("<OutputName_4_4_3>" + from.getOutputName_4_4_3()
						+ "</OutputName_4_4_3>")
				.append("<OutputName_4_4_4>" + from.getOutputName_4_4_4()
						+ "</OutputName_4_4_4>")
				.append("<OutputName_4_4_5>" + from.getOutputName_4_4_5()
						+ "</OutputName_4_4_5>")
				.append("<OutputName_4_4_6>" + from.getOutputName_4_4_6()
						+ "</OutputName_4_4_6>")
				.append("<OutputName_4_4_7>" + from.getOutputName_4_4_7()
						+ "</OutputName_4_4_7>")
				.append("<OutputName_4_4_8>" + from.getOutputName_4_4_8()
						+ "</OutputName_4_4_8>")
				.append("<OutputName_4_4_9>" + from.getOutputName_4_4_9()
						+ "</OutputName_4_4_9>")
				.append("<OutputName_4_4_1>" + from.getOutputName_4_4_1()
						+ "</OutputName_4_4_1>")
				.append("</return>")
				.append("</OutputDataClassName_4_4:CapabilityName_4_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_4_5")
	public InputDataClassName_4_5 transformCapabilityName_4_5ToInputDataClassName_4_5(
			Element from) {

		InputDataClassName_4_5 in = new InputDataClassName_4_5();

		in.setInputName_4_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_1")));
		in.setInputName_4_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_2")));

		return in;

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_4_1")
	public InputDataClassName_4_1 transformCapabilityName_4_1ToInputDataClassName_4_1(
			Element from) {

		InputDataClassName_4_1 in = new InputDataClassName_4_1();

		in.setInputName_4_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_4")));
		in.setInputName_4_1_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_5")));
		in.setInputName_4_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_1")));
		in.setInputName_4_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_2")));
		in.setInputName_4_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_3")));

		return in;

	}
}
