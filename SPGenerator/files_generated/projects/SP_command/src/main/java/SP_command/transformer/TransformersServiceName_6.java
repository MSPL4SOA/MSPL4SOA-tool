package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_6_4;
import SP_command.input.InputDataClassName_6_5;
import SP_command.input.InputDataClassName_6_6;

import SP_command.output.OutputDataClassName_6_4;
import SP_command.output.OutputDataClassName_6_5;
import SP_command.output.OutputDataClassName_6_6;
import SP_command.output.OutputDataClassName_6_1;
import SP_command.output.OutputDataClassName_6_2;

public final class TransformersServiceName_6 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_6_4Response")
	public Element transformOutputDataClassName_6_4ToCapabilityName_6_4Response(
			OutputDataClassName_6_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_4:CapabilityName_6_4Response xmlns:OutputDataClassName_6_4=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_6_4_1>" + from.getOutputName_6_4_1()
						+ "</OutputName_6_4_1>")
				.append("<OutputName_6_4_2>" + from.getOutputName_6_4_2()
						+ "</OutputName_6_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_6_4:CapabilityName_6_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_6_4")
	public InputDataClassName_6_4 transformCapabilityName_6_4ToInputDataClassName_6_4(
			Element from) {

		InputDataClassName_6_4 in = new InputDataClassName_6_4();

		in.setInputName_6_4_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_1")));
		in.setInputName_6_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_6_5Response")
	public Element transformOutputDataClassName_6_5ToCapabilityName_6_5Response(
			OutputDataClassName_6_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_5:CapabilityName_6_5Response xmlns:OutputDataClassName_6_5=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_6_5_4>" + from.getOutputName_6_5_4()
						+ "</OutputName_6_5_4>")
				.append("<OutputName_6_5_3>" + from.getOutputName_6_5_3()
						+ "</OutputName_6_5_3>")
				.append("<OutputName_6_5_5>" + from.getOutputName_6_5_5()
						+ "</OutputName_6_5_5>")
				.append("<OutputName_6_5_2>" + from.getOutputName_6_5_2()
						+ "</OutputName_6_5_2>")
				.append("<OutputName_6_5_1>" + from.getOutputName_6_5_1()
						+ "</OutputName_6_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_5:CapabilityName_6_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_6_5")
	public InputDataClassName_6_5 transformCapabilityName_6_5ToInputDataClassName_6_5(
			Element from) {

		InputDataClassName_6_5 in = new InputDataClassName_6_5();

		in.setInputName_6_5_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_6")));
		in.setInputName_6_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_1")));
		in.setInputName_6_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_2")));
		in.setInputName_6_5_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_3")));
		in.setInputName_6_5_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_4")));
		in.setInputName_6_5_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_5")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_6_6Response")
	public Element transformOutputDataClassName_6_6ToCapabilityName_6_6Response(
			OutputDataClassName_6_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_6:CapabilityName_6_6Response xmlns:OutputDataClassName_6_6=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_6_6_1>" + from.getOutputName_6_6_1()
						+ "</OutputName_6_6_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_6:CapabilityName_6_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_6_6")
	public InputDataClassName_6_6 transformCapabilityName_6_6ToInputDataClassName_6_6(
			Element from) {

		InputDataClassName_6_6 in = new InputDataClassName_6_6();

		in.setInputName_6_6_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_1")));
		in.setInputName_6_6_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_2")));
		in.setInputName_6_6_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_3")));
		in.setInputName_6_6_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_6_1Response")
	public Element transformOutputDataClassName_6_1ToCapabilityName_6_1Response(
			OutputDataClassName_6_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_1:CapabilityName_6_1Response xmlns:OutputDataClassName_6_1=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_6_1_1>" + from.getOutputName_6_1_1()
						+ "</OutputName_6_1_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_1:CapabilityName_6_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_6_2Response")
	public Element transformOutputDataClassName_6_2ToCapabilityName_6_2Response(
			OutputDataClassName_6_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_2:CapabilityName_6_2Response xmlns:OutputDataClassName_6_2=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_6_2_1>" + from.getOutputName_6_2_1()
						+ "</OutputName_6_2_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_2:CapabilityName_6_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

}
