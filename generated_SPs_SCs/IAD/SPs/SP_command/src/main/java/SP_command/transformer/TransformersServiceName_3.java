package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_3_3;
import SP_command.input.InputDataClassName_3_4;
import SP_command.input.InputDataClassName_3_5;
import SP_command.input.InputDataClassName_3_6;
import SP_command.input.InputDataClassName_3_1;

import SP_command.output.OutputDataClassName_3_3;
import SP_command.output.OutputDataClassName_3_4;
import SP_command.output.OutputDataClassName_3_6;
import SP_command.output.OutputDataClassName_3_1;
import SP_command.output.OutputDataClassName_3_2;

public final class TransformersServiceName_3 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_3_3Response")
	public Element transformOutputDataClassName_3_3ToCapabilityName_3_3Response(
			OutputDataClassName_3_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_3:CapabilityName_3_3Response xmlns:OutputDataClassName_3_3=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_3_3_6>" + from.getOutputName_3_3_6()
						+ "</OutputName_3_3_6>")
				.append("<OutputName_3_3_7>" + from.getOutputName_3_3_7()
						+ "</OutputName_3_3_7>")
				.append("<OutputName_3_3_4>" + from.getOutputName_3_3_4()
						+ "</OutputName_3_3_4>")
				.append("<OutputName_3_3_5>" + from.getOutputName_3_3_5()
						+ "</OutputName_3_3_5>")
				.append("<OutputName_3_3_8>" + from.getOutputName_3_3_8()
						+ "</OutputName_3_3_8>")
				.append("<OutputName_3_3_9>" + from.getOutputName_3_3_9()
						+ "</OutputName_3_3_9>")
				.append("<OutputName_3_3_2>" + from.getOutputName_3_3_2()
						+ "</OutputName_3_3_2>")
				.append("<OutputName_3_3_3>" + from.getOutputName_3_3_3()
						+ "</OutputName_3_3_3>")
				.append("<OutputName_3_3_1>" + from.getOutputName_3_3_1()
						+ "</OutputName_3_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_3:CapabilityName_3_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_3_3")
	public InputDataClassName_3_3 transformCapabilityName_3_3ToInputDataClassName_3_3(
			Element from) {

		InputDataClassName_3_3 in = new InputDataClassName_3_3();

		in.setInputName_3_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_1")));
		in.setInputName_3_3_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_2")));
		in.setInputName_3_3_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_3")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_3_4Response")
	public Element transformOutputDataClassName_3_4ToCapabilityName_3_4Response(
			OutputDataClassName_3_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_4:CapabilityName_3_4Response xmlns:OutputDataClassName_3_4=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_3_4_1>" + from.getOutputName_3_4_1()
						+ "</OutputName_3_4_1>")
				.append("<OutputName_3_4_2>" + from.getOutputName_3_4_2()
						+ "</OutputName_3_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_3_4:CapabilityName_3_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_3_4")
	public InputDataClassName_3_4 transformCapabilityName_3_4ToInputDataClassName_3_4(
			Element from) {

		InputDataClassName_3_4 in = new InputDataClassName_3_4();

		in.setInputName_3_4_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_1")));
		in.setInputName_3_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_2")));
		in.setInputName_3_4_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_3")));

		return in;

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_3_5")
	public InputDataClassName_3_5 transformCapabilityName_3_5ToInputDataClassName_3_5(
			Element from) {

		InputDataClassName_3_5 in = new InputDataClassName_3_5();

		in.setInputName_3_5_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_3")));
		in.setInputName_3_5_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_1")));
		in.setInputName_3_5_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_3_6Response")
	public Element transformOutputDataClassName_3_6ToCapabilityName_3_6Response(
			OutputDataClassName_3_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_6:CapabilityName_3_6Response xmlns:OutputDataClassName_3_6=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_3_6_3>" + from.getOutputName_3_6_3()
						+ "</OutputName_3_6_3>")
				.append("<OutputName_3_6_4>" + from.getOutputName_3_6_4()
						+ "</OutputName_3_6_4>")
				.append("<OutputName_3_6_1>" + from.getOutputName_3_6_1()
						+ "</OutputName_3_6_1>")
				.append("<OutputName_3_6_2>" + from.getOutputName_3_6_2()
						+ "</OutputName_3_6_2>")
				.append("<OutputName_3_6_7>" + from.getOutputName_3_6_7()
						+ "</OutputName_3_6_7>")
				.append("<OutputName_3_6_5>" + from.getOutputName_3_6_5()
						+ "</OutputName_3_6_5>")
				.append("<OutputName_3_6_6>" + from.getOutputName_3_6_6()
						+ "</OutputName_3_6_6>")
				.append("</return>")
				.append("</OutputDataClassName_3_6:CapabilityName_3_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_3_6")
	public InputDataClassName_3_6 transformCapabilityName_3_6ToInputDataClassName_3_6(
			Element from) {

		InputDataClassName_3_6 in = new InputDataClassName_3_6();

		in.setInputName_3_6_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_6")));
		in.setInputName_3_6_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_7")));
		in.setInputName_3_6_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_4")));
		in.setInputName_3_6_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_5")));
		in.setInputName_3_6_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_2")));
		in.setInputName_3_6_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_3")));
		in.setInputName_3_6_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_3_1Response")
	public Element transformOutputDataClassName_3_1ToCapabilityName_3_1Response(
			OutputDataClassName_3_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_1:CapabilityName_3_1Response xmlns:OutputDataClassName_3_1=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_3_1_6>" + from.getOutputName_3_1_6()
						+ "</OutputName_3_1_6>")
				.append("<OutputName_3_1_1>" + from.getOutputName_3_1_1()
						+ "</OutputName_3_1_1>")
				.append("<OutputName_3_1_4>" + from.getOutputName_3_1_4()
						+ "</OutputName_3_1_4>")
				.append("<OutputName_3_1_5>" + from.getOutputName_3_1_5()
						+ "</OutputName_3_1_5>")
				.append("<OutputName_3_1_2>" + from.getOutputName_3_1_2()
						+ "</OutputName_3_1_2>")
				.append("<OutputName_3_1_3>" + from.getOutputName_3_1_3()
						+ "</OutputName_3_1_3>")
				.append("</return>")
				.append("</OutputDataClassName_3_1:CapabilityName_3_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_3_2Response")
	public Element transformOutputDataClassName_3_2ToCapabilityName_3_2Response(
			OutputDataClassName_3_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_2:CapabilityName_3_2Response xmlns:OutputDataClassName_3_2=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_3_2_7>" + from.getOutputName_3_2_7()
						+ "</OutputName_3_2_7>")
				.append("<OutputName_3_2_8>" + from.getOutputName_3_2_8()
						+ "</OutputName_3_2_8>")
				.append("<OutputName_3_2_5>" + from.getOutputName_3_2_5()
						+ "</OutputName_3_2_5>")
				.append("<OutputName_3_2_6>" + from.getOutputName_3_2_6()
						+ "</OutputName_3_2_6>")
				.append("<OutputName_3_2_9>" + from.getOutputName_3_2_9()
						+ "</OutputName_3_2_9>")
				.append("<OutputName_3_2_3>" + from.getOutputName_3_2_3()
						+ "</OutputName_3_2_3>")
				.append("<OutputName_3_2_4>" + from.getOutputName_3_2_4()
						+ "</OutputName_3_2_4>")
				.append("<OutputName_3_2_1>" + from.getOutputName_3_2_1()
						+ "</OutputName_3_2_1>")
				.append("<OutputName_3_2_2>" + from.getOutputName_3_2_2()
						+ "</OutputName_3_2_2>")
				.append("</return>")
				.append("</OutputDataClassName_3_2:CapabilityName_3_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

}
