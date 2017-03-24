package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_2_4;
import SP_command.input.InputDataClassName_2_6;
import SP_command.input.InputDataClassName_2_1;

import SP_command.output.OutputDataClassName_2_4;
import SP_command.output.OutputDataClassName_2_6;
import SP_command.output.OutputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_2_4Response")
	public Element transformOutputDataClassName_2_4ToCapabilityName_2_4Response(
			OutputDataClassName_2_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_4:CapabilityName_2_4Response xmlns:OutputDataClassName_2_4=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_2_4_1>" + from.getOutputName_2_4_1()
						+ "</OutputName_2_4_1>")
				.append("</return>")
				.append("</OutputDataClassName_2_4:CapabilityName_2_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_2_4")
	public InputDataClassName_2_4 transformCapabilityName_2_4ToInputDataClassName_2_4(
			Element from) {

		InputDataClassName_2_4 in = new InputDataClassName_2_4();

		in.setInputName_2_4_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_1")));
		in.setInputName_2_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_2")));
		in.setInputName_2_4_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_3")));
		in.setInputName_2_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_4")));
		in.setInputName_2_4_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_5")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_2_6Response")
	public Element transformOutputDataClassName_2_6ToCapabilityName_2_6Response(
			OutputDataClassName_2_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_6:CapabilityName_2_6Response xmlns:OutputDataClassName_2_6=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_2_6_6>" + from.getOutputName_2_6_6()
						+ "</OutputName_2_6_6>")
				.append("<OutputName_2_6_2>" + from.getOutputName_2_6_2()
						+ "</OutputName_2_6_2>")
				.append("<OutputName_2_6_3>" + from.getOutputName_2_6_3()
						+ "</OutputName_2_6_3>")
				.append("<OutputName_2_6_4>" + from.getOutputName_2_6_4()
						+ "</OutputName_2_6_4>")
				.append("<OutputName_2_6_5>" + from.getOutputName_2_6_5()
						+ "</OutputName_2_6_5>")
				.append("<OutputName_2_6_1>" + from.getOutputName_2_6_1()
						+ "</OutputName_2_6_1>")
				.append("</return>")
				.append("</OutputDataClassName_2_6:CapabilityName_2_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_2_6")
	public InputDataClassName_2_6 transformCapabilityName_2_6ToInputDataClassName_2_6(
			Element from) {

		InputDataClassName_2_6 in = new InputDataClassName_2_6();

		in.setInputName_2_6_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_1")));
		in.setInputName_2_6_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_2")));
		in.setInputName_2_6_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_3")));
		in.setInputName_2_6_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_4")));
		in.setInputName_2_6_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_5")));
		in.setInputName_2_6_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_6")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_3>" + from.getOutputName_2_1_3()
						+ "</OutputName_2_1_3>")
				.append("<OutputName_2_1_4>" + from.getOutputName_2_1_4()
						+ "</OutputName_2_1_4>")
				.append("<OutputName_2_1_5>" + from.getOutputName_2_1_5()
						+ "</OutputName_2_1_5>")
				.append("<OutputName_2_1_1>" + from.getOutputName_2_1_1()
						+ "</OutputName_2_1_1>")
				.append("<OutputName_2_1_2>" + from.getOutputName_2_1_2()
						+ "</OutputName_2_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_1:CapabilityName_2_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));

		return in;

	}

}
