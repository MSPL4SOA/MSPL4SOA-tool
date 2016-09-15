package large11.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import large11.util.XMLSOAPTransformers;

import large11.input.InputDataClassName_2_1;
import large11.input.InputDataClassName_2_3;
import large11.input.InputDataClassName_2_4;
import large11.input.InputDataClassName_2_6;

import large11.output.OutputDataClassName_2_1;
import large11.output.OutputDataClassName_2_3;
import large11.output.OutputDataClassName_2_4;
import large11.output.OutputDataClassName_2_5;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:large11:large11:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:large11:large11:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_1>" + from.getOutputName_2_1_1()
						+ "</OutputName_2_1_1>")
				.append("<OutputName_2_1_2>" + from.getOutputName_2_1_2()
						+ "</OutputName_2_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_1:CapabilityName_2_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large11:large11:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));
		in.setInputName_2_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_3")));

		return in;

	}

	@Transformer(to = "{urn:large11:large11:1.0}CapabilityName_2_3Response")
	public Element transformOutputDataClassName_2_3ToCapabilityName_2_3Response(
			OutputDataClassName_2_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_3:CapabilityName_2_3Response xmlns:OutputDataClassName_2_3=\"urn:large11:large11:1.0\">")
				.append("<return>")
				.append("<OutputName_2_3_1>" + from.getOutputName_2_3_1()
						+ "</OutputName_2_3_1>")
				.append("<OutputName_2_3_2>" + from.getOutputName_2_3_2()
						+ "</OutputName_2_3_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_3:CapabilityName_2_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large11:large11:1.0}CapabilityName_2_3")
	public InputDataClassName_2_3 transformCapabilityName_2_3ToInputDataClassName_2_3(
			Element from) {

		InputDataClassName_2_3 in = new InputDataClassName_2_3();

		in.setInputName_2_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_3_1")));
		in.setInputName_2_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_3_2")));
		in.setInputName_2_3_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_3_3")));
		in.setInputName_2_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_3_4")));

		return in;

	}

	@Transformer(to = "{urn:large11:large11:1.0}CapabilityName_2_4Response")
	public Element transformOutputDataClassName_2_4ToCapabilityName_2_4Response(
			OutputDataClassName_2_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_4:CapabilityName_2_4Response xmlns:OutputDataClassName_2_4=\"urn:large11:large11:1.0\">")
				.append("<return>")
				.append("<OutputName_2_4_1>" + from.getOutputName_2_4_1()
						+ "</OutputName_2_4_1>")
				.append("<OutputName_2_4_2>" + from.getOutputName_2_4_2()
						+ "</OutputName_2_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_4:CapabilityName_2_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large11:large11:1.0}CapabilityName_2_4")
	public InputDataClassName_2_4 transformCapabilityName_2_4ToInputDataClassName_2_4(
			Element from) {

		InputDataClassName_2_4 in = new InputDataClassName_2_4();

		in.setInputName_2_4_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_1")));

		return in;

	}

	@Transformer(to = "{urn:large11:large11:1.0}CapabilityName_2_5Response")
	public Element transformOutputDataClassName_2_5ToCapabilityName_2_5Response(
			OutputDataClassName_2_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_5:CapabilityName_2_5Response xmlns:OutputDataClassName_2_5=\"urn:large11:large11:1.0\">")
				.append("<return>")
				.append("<OutputName_2_5_1>" + from.getOutputName_2_5_1()
						+ "</OutputName_2_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_2_5:CapabilityName_2_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large11:large11:1.0}CapabilityName_2_6")
	public InputDataClassName_2_6 transformCapabilityName_2_6ToInputDataClassName_2_6(
			Element from) {

		InputDataClassName_2_6 in = new InputDataClassName_2_6();

		in.setInputName_2_6_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_1")));
		in.setInputName_2_6_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_6_2")));

		return in;

	}
}
