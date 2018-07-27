package SP_command.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_command.util.XMLSOAPTransformers;

import SP_command.input.InputDataClassName_5_5;
import SP_command.input.InputDataClassName_5_1;
import SP_command.input.InputDataClassName_5_2;
import SP_command.input.InputDataClassName_5_3;
import SP_command.input.InputDataClassName_5_4;

import SP_command.output.OutputDataClassName_5_5;
import SP_command.output.OutputDataClassName_5_1;
import SP_command.output.OutputDataClassName_5_2;
import SP_command.output.OutputDataClassName_5_3;

public final class TransformersServiceName_5 {

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_5_5Response")
	public Element transformOutputDataClassName_5_5ToCapabilityName_5_5Response(
			OutputDataClassName_5_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_5:CapabilityName_5_5Response xmlns:OutputDataClassName_5_5=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_5_5_2>" + from.getOutputName_5_5_2()
						+ "</OutputName_5_5_2>")
				.append("<OutputName_5_5_1>" + from.getOutputName_5_5_1()
						+ "</OutputName_5_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_5_5:CapabilityName_5_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_5_5")
	public InputDataClassName_5_5 transformCapabilityName_5_5ToInputDataClassName_5_5(
			Element from) {

		InputDataClassName_5_5 in = new InputDataClassName_5_5();

		in.setInputName_5_5_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_7")));
		in.setInputName_5_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_1")));
		in.setInputName_5_5_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_2")));
		in.setInputName_5_5_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_5")));
		in.setInputName_5_5_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_6")));
		in.setInputName_5_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_3")));
		in.setInputName_5_5_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_5_1Response")
	public Element transformOutputDataClassName_5_1ToCapabilityName_5_1Response(
			OutputDataClassName_5_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_1:CapabilityName_5_1Response xmlns:OutputDataClassName_5_1=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_5_1_2>" + from.getOutputName_5_1_2()
						+ "</OutputName_5_1_2>")
				.append("<OutputName_5_1_3>" + from.getOutputName_5_1_3()
						+ "</OutputName_5_1_3>")
				.append("<OutputName_5_1_1>" + from.getOutputName_5_1_1()
						+ "</OutputName_5_1_1>")
				.append("<OutputName_5_1_4>" + from.getOutputName_5_1_4()
						+ "</OutputName_5_1_4>")
				.append("</return>")
				.append("</OutputDataClassName_5_1:CapabilityName_5_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_5_1")
	public InputDataClassName_5_1 transformCapabilityName_5_1ToInputDataClassName_5_1(
			Element from) {

		InputDataClassName_5_1 in = new InputDataClassName_5_1();

		in.setInputName_5_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_5_2Response")
	public Element transformOutputDataClassName_5_2ToCapabilityName_5_2Response(
			OutputDataClassName_5_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_2:CapabilityName_5_2Response xmlns:OutputDataClassName_5_2=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_5_2_1>" + from.getOutputName_5_2_1()
						+ "</OutputName_5_2_1>")
				.append("<OutputName_5_2_2>" + from.getOutputName_5_2_2()
						+ "</OutputName_5_2_2>")
				.append("<OutputName_5_2_9>" + from.getOutputName_5_2_9()
						+ "</OutputName_5_2_9>")
				.append("<OutputName_5_2_7>" + from.getOutputName_5_2_7()
						+ "</OutputName_5_2_7>")
				.append("<OutputName_5_2_8>" + from.getOutputName_5_2_8()
						+ "</OutputName_5_2_8>")
				.append("<OutputName_5_2_5>" + from.getOutputName_5_2_5()
						+ "</OutputName_5_2_5>")
				.append("<OutputName_5_2_6>" + from.getOutputName_5_2_6()
						+ "</OutputName_5_2_6>")
				.append("<OutputName_5_2_3>" + from.getOutputName_5_2_3()
						+ "</OutputName_5_2_3>")
				.append("<OutputName_5_2_4>" + from.getOutputName_5_2_4()
						+ "</OutputName_5_2_4>")
				.append("</return>")
				.append("</OutputDataClassName_5_2:CapabilityName_5_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_5_2")
	public InputDataClassName_5_2 transformCapabilityName_5_2ToInputDataClassName_5_2(
			Element from) {

		InputDataClassName_5_2 in = new InputDataClassName_5_2();

		in.setInputName_5_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_1")));
		in.setInputName_5_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_4")));
		in.setInputName_5_2_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_5")));
		in.setInputName_5_2_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_2")));
		in.setInputName_5_2_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_3")));
		in.setInputName_5_2_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_8")));
		in.setInputName_5_2_9(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_9")));
		in.setInputName_5_2_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_6")));
		in.setInputName_5_2_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_7")));

		return in;

	}

	@Transformer(to = "{urn:SP_command:SP_command:1.0}CapabilityName_5_3Response")
	public Element transformOutputDataClassName_5_3ToCapabilityName_5_3Response(
			OutputDataClassName_5_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_3:CapabilityName_5_3Response xmlns:OutputDataClassName_5_3=\"urn:SP_command:SP_command:1.0\">")
				.append("<return>")
				.append("<OutputName_5_3_1>" + from.getOutputName_5_3_1()
						+ "</OutputName_5_3_1>")
				.append("<OutputName_5_3_2>" + from.getOutputName_5_3_2()
						+ "</OutputName_5_3_2>")
				.append("</return>")
				.append("</OutputDataClassName_5_3:CapabilityName_5_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_5_3")
	public InputDataClassName_5_3 transformCapabilityName_5_3ToInputDataClassName_5_3(
			Element from) {

		InputDataClassName_5_3 in = new InputDataClassName_5_3();

		in.setInputName_5_3_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_9")));
		in.setInputName_5_3_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_3")));
		in.setInputName_5_3_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_4")));
		in.setInputName_5_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_1")));
		in.setInputName_5_3_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_2")));
		in.setInputName_5_3_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_7")));
		in.setInputName_5_3_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_8")));
		in.setInputName_5_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_5")));
		in.setInputName_5_3_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_6")));

		return in;

	}

	@Transformer(from = "{urn:SP_command:SP_command:1.0}CapabilityName_5_4")
	public InputDataClassName_5_4 transformCapabilityName_5_4ToInputDataClassName_5_4(
			Element from) {

		InputDataClassName_5_4 in = new InputDataClassName_5_4();

		in.setInputName_5_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_1")));

		return in;

	}
}
