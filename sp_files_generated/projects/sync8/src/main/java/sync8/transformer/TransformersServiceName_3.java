package sync8.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import sync8.util.XMLSOAPTransformers;

import sync8.input.InputDataClassName_3_4;
import sync8.input.InputDataClassName_3_5;
import sync8.input.InputDataClassName_3_6;
import sync8.input.InputDataClassName_3_1;
import sync8.input.InputDataClassName_3_2;

import sync8.output.OutputDataClassName_3_3;
import sync8.output.OutputDataClassName_3_4;
import sync8.output.OutputDataClassName_3_5;
import sync8.output.OutputDataClassName_3_6;
import sync8.output.OutputDataClassName_3_1;

public final class TransformersServiceName_3 {

	@Transformer(to = "{urn:sync8:sync8:1.0}CapabilityName_3_3Response")
	public Element transformOutputDataClassName_3_3ToCapabilityName_3_3Response(
			OutputDataClassName_3_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_3:CapabilityName_3_3Response xmlns:OutputDataClassName_3_3=\"urn:sync8:sync8:1.0\">")
				.append("<return>")
				.append("<OutputName_3_3_2>" + from.getOutputName_3_3_2()
						+ "</OutputName_3_3_2>")
				.append("<OutputName_3_3_1>" + from.getOutputName_3_3_1()
						+ "</OutputName_3_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_3:CapabilityName_3_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:sync8:sync8:1.0}CapabilityName_3_4Response")
	public Element transformOutputDataClassName_3_4ToCapabilityName_3_4Response(
			OutputDataClassName_3_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_4:CapabilityName_3_4Response xmlns:OutputDataClassName_3_4=\"urn:sync8:sync8:1.0\">")
				.append("<return>")
				.append("<OutputName_3_4_3>" + from.getOutputName_3_4_3()
						+ "</OutputName_3_4_3>")
				.append("<OutputName_3_4_4>" + from.getOutputName_3_4_4()
						+ "</OutputName_3_4_4>")
				.append("<OutputName_3_4_1>" + from.getOutputName_3_4_1()
						+ "</OutputName_3_4_1>")
				.append("<OutputName_3_4_2>" + from.getOutputName_3_4_2()
						+ "</OutputName_3_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_3_4:CapabilityName_3_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sync8:sync8:1.0}CapabilityName_3_4")
	public InputDataClassName_3_4 transformCapabilityName_3_4ToInputDataClassName_3_4(
			Element from) {

		InputDataClassName_3_4 in = new InputDataClassName_3_4();

		in.setInputName_3_4_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_1")));
		in.setInputName_3_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_2")));

		return in;

	}

	@Transformer(to = "{urn:sync8:sync8:1.0}CapabilityName_3_5Response")
	public Element transformOutputDataClassName_3_5ToCapabilityName_3_5Response(
			OutputDataClassName_3_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_5:CapabilityName_3_5Response xmlns:OutputDataClassName_3_5=\"urn:sync8:sync8:1.0\">")
				.append("<return>")
				.append("<OutputName_3_5_2>" + from.getOutputName_3_5_2()
						+ "</OutputName_3_5_2>")
				.append("<OutputName_3_5_3>" + from.getOutputName_3_5_3()
						+ "</OutputName_3_5_3>")
				.append("<OutputName_3_5_1>" + from.getOutputName_3_5_1()
						+ "</OutputName_3_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_5:CapabilityName_3_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sync8:sync8:1.0}CapabilityName_3_5")
	public InputDataClassName_3_5 transformCapabilityName_3_5ToInputDataClassName_3_5(
			Element from) {

		InputDataClassName_3_5 in = new InputDataClassName_3_5();

		in.setInputName_3_5_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_1")));

		return in;

	}

	@Transformer(to = "{urn:sync8:sync8:1.0}CapabilityName_3_6Response")
	public Element transformOutputDataClassName_3_6ToCapabilityName_3_6Response(
			OutputDataClassName_3_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_6:CapabilityName_3_6Response xmlns:OutputDataClassName_3_6=\"urn:sync8:sync8:1.0\">")
				.append("<return>")
				.append("<OutputName_3_6_1>" + from.getOutputName_3_6_1()
						+ "</OutputName_3_6_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_6:CapabilityName_3_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sync8:sync8:1.0}CapabilityName_3_6")
	public InputDataClassName_3_6 transformCapabilityName_3_6ToInputDataClassName_3_6(
			Element from) {

		InputDataClassName_3_6 in = new InputDataClassName_3_6();

		in.setInputName_3_6_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_2")));
		in.setInputName_3_6_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_1")));

		return in;

	}

	@Transformer(to = "{urn:sync8:sync8:1.0}CapabilityName_3_1Response")
	public Element transformOutputDataClassName_3_1ToCapabilityName_3_1Response(
			OutputDataClassName_3_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_1:CapabilityName_3_1Response xmlns:OutputDataClassName_3_1=\"urn:sync8:sync8:1.0\">")
				.append("<return>")
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

	@Transformer(from = "{urn:sync8:sync8:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));

		return in;

	}

	@Transformer(from = "{urn:sync8:sync8:1.0}CapabilityName_3_2")
	public InputDataClassName_3_2 transformCapabilityName_3_2ToInputDataClassName_3_2(
			Element from) {

		InputDataClassName_3_2 in = new InputDataClassName_3_2();

		in.setInputName_3_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_2")));
		in.setInputName_3_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_1")));

		return in;

	}
}
