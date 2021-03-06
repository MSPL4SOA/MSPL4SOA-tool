package test.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import test.util.XMLSOAPTransformers;

import test.input.InputDataClassName_3_3;
import test.input.InputDataClassName_3_5;
import test.input.InputDataClassName_3_6;
import test.input.InputDataClassName_3_1;
import test.input.InputDataClassName_3_2;

import test.output.OutputDataClassName_3_4;
import test.output.OutputDataClassName_3_5;
import test.output.OutputDataClassName_3_6;
import test.output.OutputDataClassName_3_1;
import test.output.OutputDataClassName_3_2;

public final class TransformersServiceName_3 {

	@Transformer(from = "{urn:test:test:1.0}CapabilityName_3_3")
	public InputDataClassName_3_3 transformCapabilityName_3_3ToInputDataClassName_3_3(
			Element from) {

		InputDataClassName_3_3 in = new InputDataClassName_3_3();

		in.setInputName_3_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_1")));
		in.setInputName_3_3_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_2")));
		in.setInputName_3_3_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_5")));
		in.setInputName_3_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_6")));
		in.setInputName_3_3_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_3")));
		in.setInputName_3_3_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_4")));

		return in;

	}

	@Transformer(to = "{urn:test:test:1.0}CapabilityName_3_4Response")
	public Element transformOutputDataClassName_3_4ToCapabilityName_3_4Response(
			OutputDataClassName_3_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_4:CapabilityName_3_4Response xmlns:OutputDataClassName_3_4=\"urn:test:test:1.0\">")
				.append("<return>")
				.append("<OutputName_3_4_5>" + from.getOutputName_3_4_5()
						+ "</OutputName_3_4_5>")
				.append("<OutputName_3_4_6>" + from.getOutputName_3_4_6()
						+ "</OutputName_3_4_6>")
				.append("<OutputName_3_4_3>" + from.getOutputName_3_4_3()
						+ "</OutputName_3_4_3>")
				.append("<OutputName_3_4_4>" + from.getOutputName_3_4_4()
						+ "</OutputName_3_4_4>")
				.append("<OutputName_3_4_7>" + from.getOutputName_3_4_7()
						+ "</OutputName_3_4_7>")
				.append("<OutputName_3_4_8>" + from.getOutputName_3_4_8()
						+ "</OutputName_3_4_8>")
				.append("<OutputName_3_4_1>" + from.getOutputName_3_4_1()
						+ "</OutputName_3_4_1>")
				.append("<OutputName_3_4_2>" + from.getOutputName_3_4_2()
						+ "</OutputName_3_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_3_4:CapabilityName_3_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:test:test:1.0}CapabilityName_3_5Response")
	public Element transformOutputDataClassName_3_5ToCapabilityName_3_5Response(
			OutputDataClassName_3_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_5:CapabilityName_3_5Response xmlns:OutputDataClassName_3_5=\"urn:test:test:1.0\">")
				.append("<return>")
				.append("<OutputName_3_5_4>" + from.getOutputName_3_5_4()
						+ "</OutputName_3_5_4>")
				.append("<OutputName_3_5_5>" + from.getOutputName_3_5_5()
						+ "</OutputName_3_5_5>")
				.append("<OutputName_3_5_2>" + from.getOutputName_3_5_2()
						+ "</OutputName_3_5_2>")
				.append("<OutputName_3_5_3>" + from.getOutputName_3_5_3()
						+ "</OutputName_3_5_3>")
				.append("<OutputName_3_5_6>" + from.getOutputName_3_5_6()
						+ "</OutputName_3_5_6>")
				.append("<OutputName_3_5_1>" + from.getOutputName_3_5_1()
						+ "</OutputName_3_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_5:CapabilityName_3_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:test:test:1.0}CapabilityName_3_5")
	public InputDataClassName_3_5 transformCapabilityName_3_5ToInputDataClassName_3_5(
			Element from) {

		InputDataClassName_3_5 in = new InputDataClassName_3_5();

		in.setInputName_3_5_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_9")));
		in.setInputName_3_5_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_7")));
		in.setInputName_3_5_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_8")));
		in.setInputName_3_5_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_5")));
		in.setInputName_3_5_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_6")));
		in.setInputName_3_5_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_3")));
		in.setInputName_3_5_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_4")));
		in.setInputName_3_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_1")));
		in.setInputName_3_5_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_5_2")));

		return in;

	}

	@Transformer(to = "{urn:test:test:1.0}CapabilityName_3_6Response")
	public Element transformOutputDataClassName_3_6ToCapabilityName_3_6Response(
			OutputDataClassName_3_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_6:CapabilityName_3_6Response xmlns:OutputDataClassName_3_6=\"urn:test:test:1.0\">")
				.append("<return>")
				.append("<OutputName_3_6_1>" + from.getOutputName_3_6_1()
						+ "</OutputName_3_6_1>")
				.append("<OutputName_3_6_2>" + from.getOutputName_3_6_2()
						+ "</OutputName_3_6_2>")
				.append("</return>")
				.append("</OutputDataClassName_3_6:CapabilityName_3_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:test:test:1.0}CapabilityName_3_6")
	public InputDataClassName_3_6 transformCapabilityName_3_6ToInputDataClassName_3_6(
			Element from) {

		InputDataClassName_3_6 in = new InputDataClassName_3_6();

		in.setInputName_3_6_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_6")));
		in.setInputName_3_6_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_7")));
		in.setInputName_3_6_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_4")));
		in.setInputName_3_6_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_5")));
		in.setInputName_3_6_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_2")));
		in.setInputName_3_6_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_3")));
		in.setInputName_3_6_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_1")));

		return in;

	}

	@Transformer(to = "{urn:test:test:1.0}CapabilityName_3_1Response")
	public Element transformOutputDataClassName_3_1ToCapabilityName_3_1Response(
			OutputDataClassName_3_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_1:CapabilityName_3_1Response xmlns:OutputDataClassName_3_1=\"urn:test:test:1.0\">")
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

	@Transformer(from = "{urn:test:test:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));

		return in;

	}

	@Transformer(to = "{urn:test:test:1.0}CapabilityName_3_2Response")
	public Element transformOutputDataClassName_3_2ToCapabilityName_3_2Response(
			OutputDataClassName_3_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_2:CapabilityName_3_2Response xmlns:OutputDataClassName_3_2=\"urn:test:test:1.0\">")
				.append("<return>")
				.append("<OutputName_3_2_7>" + from.getOutputName_3_2_7()
						+ "</OutputName_3_2_7>")
				.append("<OutputName_3_2_5>" + from.getOutputName_3_2_5()
						+ "</OutputName_3_2_5>")
				.append("<OutputName_3_2_6>" + from.getOutputName_3_2_6()
						+ "</OutputName_3_2_6>")
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

	@Transformer(from = "{urn:test:test:1.0}CapabilityName_3_2")
	public InputDataClassName_3_2 transformCapabilityName_3_2ToInputDataClassName_3_2(
			Element from) {

		InputDataClassName_3_2 in = new InputDataClassName_3_2();

		in.setInputName_3_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_2")));
		in.setInputName_3_2_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_3")));
		in.setInputName_3_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_1")));
		in.setInputName_3_2_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_8")));
		in.setInputName_3_2_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_9")));
		in.setInputName_3_2_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_6")));
		in.setInputName_3_2_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_7")));
		in.setInputName_3_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_4")));
		in.setInputName_3_2_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_5")));

		return in;

	}
}
