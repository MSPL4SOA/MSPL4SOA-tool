package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_7_5;
import SP_command.input.InputDataClassName_7_1;
import SP_command.input.InputDataClassName_7_2;

import SP_command.output.OutputDataClassName_7_3;
import SP_command.output.OutputDataClassName_7_4;
import SP_command.output.OutputDataClassName_7_5;
import SP_command.output.OutputDataClassName_7_1;
import SP_command.output.OutputDataClassName_7_2;

public final class TransformersServiceName_7 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_7_3Response")
	public Element transformOutputDataClassName_7_3ToCapabilityName_7_3Response(
			OutputDataClassName_7_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_3:CapabilityName_7_3Response xmlns:OutputDataClassName_7_3=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_7_3_3>" + from.getOutputName_7_3_3()
						+ "</OutputName_7_3_3>")
				.append("<OutputName_7_3_2>" + from.getOutputName_7_3_2()
						+ "</OutputName_7_3_2>")
				.append("<OutputName_7_3_1>" + from.getOutputName_7_3_1()
						+ "</OutputName_7_3_1>")
				.append("<OutputName_7_3_4>" + from.getOutputName_7_3_4()
						+ "</OutputName_7_3_4>")
				.append("</return>")
				.append("</OutputDataClassName_7_3:CapabilityName_7_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

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
				.append("<OutputName_7_4_6>" + from.getOutputName_7_4_6()
						+ "</OutputName_7_4_6>")
				.append("<OutputName_7_4_5>" + from.getOutputName_7_4_5()
						+ "</OutputName_7_4_5>")
				.append("<OutputName_7_4_4>" + from.getOutputName_7_4_4()
						+ "</OutputName_7_4_4>")
				.append("<OutputName_7_4_3>" + from.getOutputName_7_4_3()
						+ "</OutputName_7_4_3>")
				.append("</return>")
				.append("</OutputDataClassName_7_4:CapabilityName_7_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_7_5Response")
	public Element transformOutputDataClassName_7_5ToCapabilityName_7_5Response(
			OutputDataClassName_7_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_5:CapabilityName_7_5Response xmlns:OutputDataClassName_7_5=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_7_5_1>" + from.getOutputName_7_5_1()
						+ "</OutputName_7_5_1>")
				.append("<OutputName_7_5_5>" + from.getOutputName_7_5_5()
						+ "</OutputName_7_5_5>")
				.append("<OutputName_7_5_4>" + from.getOutputName_7_5_4()
						+ "</OutputName_7_5_4>")
				.append("<OutputName_7_5_3>" + from.getOutputName_7_5_3()
						+ "</OutputName_7_5_3>")
				.append("<OutputName_7_5_2>" + from.getOutputName_7_5_2()
						+ "</OutputName_7_5_2>")
				.append("</return>")
				.append("</OutputDataClassName_7_5:CapabilityName_7_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_7_5")
	public InputDataClassName_7_5 transformCapabilityName_7_5ToInputDataClassName_7_5(
			Element from) {

		InputDataClassName_7_5 in = new InputDataClassName_7_5();

		in.setInputName_7_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_3")));
		in.setInputName_7_5_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_4")));
		in.setInputName_7_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_1")));
		in.setInputName_7_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_2")));
		in.setInputName_7_5_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_7")));
		in.setInputName_7_5_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_5")));
		in.setInputName_7_5_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_6")));

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
				.append("<OutputName_7_1_4>" + from.getOutputName_7_1_4()
						+ "</OutputName_7_1_4>")
				.append("<OutputName_7_1_3>" + from.getOutputName_7_1_3()
						+ "</OutputName_7_1_3>")
				.append("<OutputName_7_1_2>" + from.getOutputName_7_1_2()
						+ "</OutputName_7_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_7_1:CapabilityName_7_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_7_1")
	public InputDataClassName_7_1 transformCapabilityName_7_1ToInputDataClassName_7_1(
			Element from) {

		InputDataClassName_7_1 in = new InputDataClassName_7_1();

		in.setInputName_7_1_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_5")));
		in.setInputName_7_1_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_6")));
		in.setInputName_7_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_3")));
		in.setInputName_7_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_4")));
		in.setInputName_7_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_1")));
		in.setInputName_7_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_7_2Response")
	public Element transformOutputDataClassName_7_2ToCapabilityName_7_2Response(
			OutputDataClassName_7_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_2:CapabilityName_7_2Response xmlns:OutputDataClassName_7_2=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_7_2_4>" + from.getOutputName_7_2_4()
						+ "</OutputName_7_2_4>")
				.append("<OutputName_7_2_3>" + from.getOutputName_7_2_3()
						+ "</OutputName_7_2_3>")
				.append("<OutputName_7_2_2>" + from.getOutputName_7_2_2()
						+ "</OutputName_7_2_2>")
				.append("<OutputName_7_2_1>" + from.getOutputName_7_2_1()
						+ "</OutputName_7_2_1>")
				.append("<OutputName_7_2_6>" + from.getOutputName_7_2_6()
						+ "</OutputName_7_2_6>")
				.append("<OutputName_7_2_5>" + from.getOutputName_7_2_5()
						+ "</OutputName_7_2_5>")
				.append("</return>")
				.append("</OutputDataClassName_7_2:CapabilityName_7_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_7_2")
	public InputDataClassName_7_2 transformCapabilityName_7_2ToInputDataClassName_7_2(
			Element from) {

		InputDataClassName_7_2 in = new InputDataClassName_7_2();

		in.setInputName_7_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_1")));

		return in;

	}
}
