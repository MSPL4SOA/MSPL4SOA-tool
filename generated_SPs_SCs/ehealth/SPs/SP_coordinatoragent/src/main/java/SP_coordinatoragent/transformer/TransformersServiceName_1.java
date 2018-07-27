package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_1_5;
import SP_command.input.InputDataClassName_1_6;
import SP_command.input.InputDataClassName_1_2;
import SP_command.input.InputDataClassName_1_3;
import SP_command.input.InputDataClassName_1_4;

import SP_command.output.OutputDataClassName_1_5;
import SP_command.output.OutputDataClassName_1_6;
import SP_command.output.OutputDataClassName_1_1;
import SP_command.output.OutputDataClassName_1_2;
import SP_command.output.OutputDataClassName_1_3;
import SP_command.output.OutputDataClassName_1_4;

public final class TransformersServiceName_1 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_1_5Response")
	public Element transformOutputDataClassName_1_5ToCapabilityName_1_5Response(
			OutputDataClassName_1_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_5:CapabilityName_1_5Response xmlns:OutputDataClassName_1_5=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_1_5_8>" + from.getOutputName_1_5_8()
						+ "</OutputName_1_5_8>")
				.append("<OutputName_1_5_6>" + from.getOutputName_1_5_6()
						+ "</OutputName_1_5_6>")
				.append("<OutputName_1_5_7>" + from.getOutputName_1_5_7()
						+ "</OutputName_1_5_7>")
				.append("<OutputName_1_5_4>" + from.getOutputName_1_5_4()
						+ "</OutputName_1_5_4>")
				.append("<OutputName_1_5_5>" + from.getOutputName_1_5_5()
						+ "</OutputName_1_5_5>")
				.append("<OutputName_1_5_2>" + from.getOutputName_1_5_2()
						+ "</OutputName_1_5_2>")
				.append("<OutputName_1_5_3>" + from.getOutputName_1_5_3()
						+ "</OutputName_1_5_3>")
				.append("<OutputName_1_5_1>" + from.getOutputName_1_5_1()
						+ "</OutputName_1_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_5:CapabilityName_1_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_1_5")
	public InputDataClassName_1_5 transformCapabilityName_1_5ToInputDataClassName_1_5(
			Element from) {

		InputDataClassName_1_5 in = new InputDataClassName_1_5();

		in.setInputName_1_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_5_1")));
		in.setInputName_1_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_5_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_1_6Response")
	public Element transformOutputDataClassName_1_6ToCapabilityName_1_6Response(
			OutputDataClassName_1_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_6:CapabilityName_1_6Response xmlns:OutputDataClassName_1_6=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_1_6_3>" + from.getOutputName_1_6_3()
						+ "</OutputName_1_6_3>")
				.append("<OutputName_1_6_1>" + from.getOutputName_1_6_1()
						+ "</OutputName_1_6_1>")
				.append("<OutputName_1_6_2>" + from.getOutputName_1_6_2()
						+ "</OutputName_1_6_2>")
				.append("</return>")
				.append("</OutputDataClassName_1_6:CapabilityName_1_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_1_6")
	public InputDataClassName_1_6 transformCapabilityName_1_6ToInputDataClassName_1_6(
			Element from) {

		InputDataClassName_1_6 in = new InputDataClassName_1_6();

		in.setInputName_1_6_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_4")));
		in.setInputName_1_6_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_5")));
		in.setInputName_1_6_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_2")));
		in.setInputName_1_6_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_3")));
		in.setInputName_1_6_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_6")));
		in.setInputName_1_6_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_7")));
		in.setInputName_1_6_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_6_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_1_1Response")
	public Element transformOutputDataClassName_1_1ToCapabilityName_1_1Response(
			OutputDataClassName_1_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_1:CapabilityName_1_1Response xmlns:OutputDataClassName_1_1=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_1_1_2>" + from.getOutputName_1_1_2()
						+ "</OutputName_1_1_2>")
				.append("<OutputName_1_1_1>" + from.getOutputName_1_1_1()
						+ "</OutputName_1_1_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_1:CapabilityName_1_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_1_2Response")
	public Element transformOutputDataClassName_1_2ToCapabilityName_1_2Response(
			OutputDataClassName_1_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_2:CapabilityName_1_2Response xmlns:OutputDataClassName_1_2=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_1_2_1>" + from.getOutputName_1_2_1()
						+ "</OutputName_1_2_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_2:CapabilityName_1_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_1_2")
	public InputDataClassName_1_2 transformCapabilityName_1_2ToInputDataClassName_1_2(
			Element from) {

		InputDataClassName_1_2 in = new InputDataClassName_1_2();

		in.setInputName_1_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_1")));
		in.setInputName_1_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_4")));
		in.setInputName_1_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_5")));
		in.setInputName_1_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_2")));
		in.setInputName_1_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_3")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_1_3Response")
	public Element transformOutputDataClassName_1_3ToCapabilityName_1_3Response(
			OutputDataClassName_1_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_3:CapabilityName_1_3Response xmlns:OutputDataClassName_1_3=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_1_3_4>" + from.getOutputName_1_3_4()
						+ "</OutputName_1_3_4>")
				.append("<OutputName_1_3_5>" + from.getOutputName_1_3_5()
						+ "</OutputName_1_3_5>")
				.append("<OutputName_1_3_2>" + from.getOutputName_1_3_2()
						+ "</OutputName_1_3_2>")
				.append("<OutputName_1_3_3>" + from.getOutputName_1_3_3()
						+ "</OutputName_1_3_3>")
				.append("<OutputName_1_3_1>" + from.getOutputName_1_3_1()
						+ "</OutputName_1_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_3:CapabilityName_1_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_1_3")
	public InputDataClassName_1_3 transformCapabilityName_1_3ToInputDataClassName_1_3(
			Element from) {

		InputDataClassName_1_3 in = new InputDataClassName_1_3();

		in.setInputName_1_3_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_7")));
		in.setInputName_1_3_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_8")));
		in.setInputName_1_3_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_5")));
		in.setInputName_1_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_6")));
		in.setInputName_1_3_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_3")));
		in.setInputName_1_3_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_4")));
		in.setInputName_1_3_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_1")));
		in.setInputName_1_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_1_4Response")
	public Element transformOutputDataClassName_1_4ToCapabilityName_1_4Response(
			OutputDataClassName_1_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_4:CapabilityName_1_4Response xmlns:OutputDataClassName_1_4=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_1_4_5>" + from.getOutputName_1_4_5()
						+ "</OutputName_1_4_5>")
				.append("<OutputName_1_4_6>" + from.getOutputName_1_4_6()
						+ "</OutputName_1_4_6>")
				.append("<OutputName_1_4_3>" + from.getOutputName_1_4_3()
						+ "</OutputName_1_4_3>")
				.append("<OutputName_1_4_4>" + from.getOutputName_1_4_4()
						+ "</OutputName_1_4_4>")
				.append("<OutputName_1_4_1>" + from.getOutputName_1_4_1()
						+ "</OutputName_1_4_1>")
				.append("<OutputName_1_4_2>" + from.getOutputName_1_4_2()
						+ "</OutputName_1_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_1_4:CapabilityName_1_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_1_4")
	public InputDataClassName_1_4 transformCapabilityName_1_4ToInputDataClassName_1_4(
			Element from) {

		InputDataClassName_1_4 in = new InputDataClassName_1_4();

		in.setInputName_1_4_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_4_4")));
		in.setInputName_1_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_4_2")));
		in.setInputName_1_4_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_4_3")));
		in.setInputName_1_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_4_1")));

		return in;

	}
}
