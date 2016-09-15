package sp_manager.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import sp_manager.util.XMLSOAPTransformers;

import sp_manager.input.InputDataClassName_7_1;
import sp_manager.input.InputDataClassName_7_2;
import sp_manager.input.InputDataClassName_7_3;
import sp_manager.input.InputDataClassName_7_4;
import sp_manager.input.InputDataClassName_7_5;
import sp_manager.input.InputDataClassName_7_6;

import sp_manager.output.OutputDataClassName_7_1;
import sp_manager.output.OutputDataClassName_7_2;
import sp_manager.output.OutputDataClassName_7_3;
import sp_manager.output.OutputDataClassName_7_4;
import sp_manager.output.OutputDataClassName_7_5;

public final class TransformersServiceName_7 {

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_1Response")
	public Element transformOutputDataClassName_7_1ToCapabilityName_7_1Response(
			OutputDataClassName_7_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_1:CapabilityName_7_1Response xmlns:OutputDataClassName_7_1=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_7_1_1>" + from.getOutputName_7_1_1()
						+ "</OutputName_7_1_1>")
				.append("<OutputName_7_1_2>" + from.getOutputName_7_1_2()
						+ "</OutputName_7_1_2>")
				.append("<OutputName_7_1_3>" + from.getOutputName_7_1_3()
						+ "</OutputName_7_1_3>")
				.append("</return>")
				.append("</OutputDataClassName_7_1:CapabilityName_7_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_1")
	public InputDataClassName_7_1 transformCapabilityName_7_1ToInputDataClassName_7_1(
			Element from) {

		InputDataClassName_7_1 in = new InputDataClassName_7_1();

		in.setInputName_7_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_1")));
		in.setInputName_7_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_2")));
		in.setInputName_7_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_3")));

		return in;

	}

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_2Response")
	public Element transformOutputDataClassName_7_2ToCapabilityName_7_2Response(
			OutputDataClassName_7_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_2:CapabilityName_7_2Response xmlns:OutputDataClassName_7_2=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_7_2_1>" + from.getOutputName_7_2_1()
						+ "</OutputName_7_2_1>")
				.append("</return>")
				.append("</OutputDataClassName_7_2:CapabilityName_7_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_2")
	public InputDataClassName_7_2 transformCapabilityName_7_2ToInputDataClassName_7_2(
			Element from) {

		InputDataClassName_7_2 in = new InputDataClassName_7_2();

		in.setInputName_7_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_1")));
		in.setInputName_7_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_2")));

		return in;

	}

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_3Response")
	public Element transformOutputDataClassName_7_3ToCapabilityName_7_3Response(
			OutputDataClassName_7_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_3:CapabilityName_7_3Response xmlns:OutputDataClassName_7_3=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_7_3_1>" + from.getOutputName_7_3_1()
						+ "</OutputName_7_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_7_3:CapabilityName_7_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_3")
	public InputDataClassName_7_3 transformCapabilityName_7_3ToInputDataClassName_7_3(
			Element from) {

		InputDataClassName_7_3 in = new InputDataClassName_7_3();

		in.setInputName_7_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_1")));

		return in;

	}

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_4Response")
	public Element transformOutputDataClassName_7_4ToCapabilityName_7_4Response(
			OutputDataClassName_7_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_4:CapabilityName_7_4Response xmlns:OutputDataClassName_7_4=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_7_4_1>" + from.getOutputName_7_4_1()
						+ "</OutputName_7_4_1>")
				.append("<OutputName_7_4_2>" + from.getOutputName_7_4_2()
						+ "</OutputName_7_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_7_4:CapabilityName_7_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_4")
	public InputDataClassName_7_4 transformCapabilityName_7_4ToInputDataClassName_7_4(
			Element from) {

		InputDataClassName_7_4 in = new InputDataClassName_7_4();

		in.setInputName_7_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_1")));

		return in;

	}

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_5Response")
	public Element transformOutputDataClassName_7_5ToCapabilityName_7_5Response(
			OutputDataClassName_7_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_5:CapabilityName_7_5Response xmlns:OutputDataClassName_7_5=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_7_5_1>" + from.getOutputName_7_5_1()
						+ "</OutputName_7_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_7_5:CapabilityName_7_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_5")
	public InputDataClassName_7_5 transformCapabilityName_7_5ToInputDataClassName_7_5(
			Element from) {

		InputDataClassName_7_5 in = new InputDataClassName_7_5();

		in.setInputName_7_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_1")));
		in.setInputName_7_5_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_2")));

		return in;

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_7_6")
	public InputDataClassName_7_6 transformCapabilityName_7_6ToInputDataClassName_7_6(
			Element from) {

		InputDataClassName_7_6 in = new InputDataClassName_7_6();

		in.setInputName_7_6_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_6_1")));
		in.setInputName_7_6_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_6_2")));

		return in;

	}
}
