package large2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import large2.util.XMLSOAPTransformers;

import large2.input.InputDataClassName_6_4;
import large2.input.InputDataClassName_6_5;
import large2.input.InputDataClassName_6_6;
import large2.input.InputDataClassName_6_1;
import large2.input.InputDataClassName_6_2;
import large2.input.InputDataClassName_6_3;

import large2.output.OutputDataClassName_6_4;
import large2.output.OutputDataClassName_6_5;
import large2.output.OutputDataClassName_6_6;
import large2.output.OutputDataClassName_6_1;
import large2.output.OutputDataClassName_6_2;
import large2.output.OutputDataClassName_6_3;

public final class TransformersServiceName_6 {

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_6_4Response")
	public Element transformOutputDataClassName_6_4ToCapabilityName_6_4Response(
			OutputDataClassName_6_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_4:CapabilityName_6_4Response xmlns:OutputDataClassName_6_4=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_6_4_5>" + from.getOutputName_6_4_5()
						+ "</OutputName_6_4_5>")
				.append("<OutputName_6_4_4>" + from.getOutputName_6_4_4()
						+ "</OutputName_6_4_4>")
				.append("<OutputName_6_4_7>" + from.getOutputName_6_4_7()
						+ "</OutputName_6_4_7>")
				.append("<OutputName_6_4_6>" + from.getOutputName_6_4_6()
						+ "</OutputName_6_4_6>")
				.append("<OutputName_6_4_1>" + from.getOutputName_6_4_1()
						+ "</OutputName_6_4_1>")
				.append("<OutputName_6_4_3>" + from.getOutputName_6_4_3()
						+ "</OutputName_6_4_3>")
				.append("<OutputName_6_4_2>" + from.getOutputName_6_4_2()
						+ "</OutputName_6_4_2>")
				.append("<OutputName_6_4_9>" + from.getOutputName_6_4_9()
						+ "</OutputName_6_4_9>")
				.append("<OutputName_6_4_8>" + from.getOutputName_6_4_8()
						+ "</OutputName_6_4_8>")
				.append("</return>")
				.append("</OutputDataClassName_6_4:CapabilityName_6_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_6_4")
	public InputDataClassName_6_4 transformCapabilityName_6_4ToInputDataClassName_6_4(
			Element from) {

		InputDataClassName_6_4 in = new InputDataClassName_6_4();

		in.setInputName_6_4_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_7")));
		in.setInputName_6_4_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_8")));
		in.setInputName_6_4_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_9")));
		in.setInputName_6_4_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_1")));
		in.setInputName_6_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_2")));
		in.setInputName_6_4_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_3")));
		in.setInputName_6_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_4")));
		in.setInputName_6_4_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_5")));
		in.setInputName_6_4_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_6")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_6_5Response")
	public Element transformOutputDataClassName_6_5ToCapabilityName_6_5Response(
			OutputDataClassName_6_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_5:CapabilityName_6_5Response xmlns:OutputDataClassName_6_5=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_6_5_4>" + from.getOutputName_6_5_4()
						+ "</OutputName_6_5_4>")
				.append("<OutputName_6_5_3>" + from.getOutputName_6_5_3()
						+ "</OutputName_6_5_3>")
				.append("<OutputName_6_5_6>" + from.getOutputName_6_5_6()
						+ "</OutputName_6_5_6>")
				.append("<OutputName_6_5_5>" + from.getOutputName_6_5_5()
						+ "</OutputName_6_5_5>")
				.append("<OutputName_6_5_2>" + from.getOutputName_6_5_2()
						+ "</OutputName_6_5_2>")
				.append("<OutputName_6_5_1>" + from.getOutputName_6_5_1()
						+ "</OutputName_6_5_1>")
				.append("<OutputName_6_5_8>" + from.getOutputName_6_5_8()
						+ "</OutputName_6_5_8>")
				.append("<OutputName_6_5_7>" + from.getOutputName_6_5_7()
						+ "</OutputName_6_5_7>")
				.append("<OutputName_6_5_9>" + from.getOutputName_6_5_9()
						+ "</OutputName_6_5_9>")
				.append("</return>")
				.append("</OutputDataClassName_6_5:CapabilityName_6_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_6_5")
	public InputDataClassName_6_5 transformCapabilityName_6_5ToInputDataClassName_6_5(
			Element from) {

		InputDataClassName_6_5 in = new InputDataClassName_6_5();

		in.setInputName_6_5_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_6")));
		in.setInputName_6_5_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_7")));
		in.setInputName_6_5_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_8")));
		in.setInputName_6_5_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_9")));
		in.setInputName_6_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_1")));
		in.setInputName_6_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_2")));
		in.setInputName_6_5_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_3")));
		in.setInputName_6_5_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_4")));
		in.setInputName_6_5_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_5")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_6_6Response")
	public Element transformOutputDataClassName_6_6ToCapabilityName_6_6Response(
			OutputDataClassName_6_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_6:CapabilityName_6_6Response xmlns:OutputDataClassName_6_6=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_6_6_3>" + from.getOutputName_6_6_3()
						+ "</OutputName_6_6_3>")
				.append("<OutputName_6_6_2>" + from.getOutputName_6_6_2()
						+ "</OutputName_6_6_2>")
				.append("<OutputName_6_6_5>" + from.getOutputName_6_6_5()
						+ "</OutputName_6_6_5>")
				.append("<OutputName_6_6_4>" + from.getOutputName_6_6_4()
						+ "</OutputName_6_6_4>")
				.append("<OutputName_6_6_1>" + from.getOutputName_6_6_1()
						+ "</OutputName_6_6_1>")
				.append("<OutputName_6_6_7>" + from.getOutputName_6_6_7()
						+ "</OutputName_6_6_7>")
				.append("<OutputName_6_6_6>" + from.getOutputName_6_6_6()
						+ "</OutputName_6_6_6>")
				.append("</return>")
				.append("</OutputDataClassName_6_6:CapabilityName_6_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_6_6")
	public InputDataClassName_6_6 transformCapabilityName_6_6ToInputDataClassName_6_6(
			Element from) {

		InputDataClassName_6_6 in = new InputDataClassName_6_6();

		in.setInputName_6_6_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_5")));
		in.setInputName_6_6_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_6")));
		in.setInputName_6_6_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_7")));
		in.setInputName_6_6_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_8")));
		in.setInputName_6_6_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_1")));
		in.setInputName_6_6_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_2")));
		in.setInputName_6_6_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_3")));
		in.setInputName_6_6_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_4")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_6_1Response")
	public Element transformOutputDataClassName_6_1ToCapabilityName_6_1Response(
			OutputDataClassName_6_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_1:CapabilityName_6_1Response xmlns:OutputDataClassName_6_1=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_6_1_1>" + from.getOutputName_6_1_1()
						+ "</OutputName_6_1_1>")
				.append("<OutputName_6_1_2>" + from.getOutputName_6_1_2()
						+ "</OutputName_6_1_2>")
				.append("<OutputName_6_1_7>" + from.getOutputName_6_1_7()
						+ "</OutputName_6_1_7>")
				.append("<OutputName_6_1_8>" + from.getOutputName_6_1_8()
						+ "</OutputName_6_1_8>")
				.append("<OutputName_6_1_3>" + from.getOutputName_6_1_3()
						+ "</OutputName_6_1_3>")
				.append("<OutputName_6_1_4>" + from.getOutputName_6_1_4()
						+ "</OutputName_6_1_4>")
				.append("<OutputName_6_1_5>" + from.getOutputName_6_1_5()
						+ "</OutputName_6_1_5>")
				.append("<OutputName_6_1_6>" + from.getOutputName_6_1_6()
						+ "</OutputName_6_1_6>")
				.append("</return>")
				.append("</OutputDataClassName_6_1:CapabilityName_6_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_6_1")
	public InputDataClassName_6_1 transformCapabilityName_6_1ToInputDataClassName_6_1(
			Element from) {

		InputDataClassName_6_1 in = new InputDataClassName_6_1();

		in.setInputName_6_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_2")));
		in.setInputName_6_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_3")));
		in.setInputName_6_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_4")));
		in.setInputName_6_1_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_5")));
		in.setInputName_6_1_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_6")));
		in.setInputName_6_1_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_7")));
		in.setInputName_6_1_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_8")));
		in.setInputName_6_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_1")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_6_2Response")
	public Element transformOutputDataClassName_6_2ToCapabilityName_6_2Response(
			OutputDataClassName_6_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_2:CapabilityName_6_2Response xmlns:OutputDataClassName_6_2=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_6_2_1>" + from.getOutputName_6_2_1()
						+ "</OutputName_6_2_1>")
				.append("<OutputName_6_2_7>" + from.getOutputName_6_2_7()
						+ "</OutputName_6_2_7>")
				.append("<OutputName_6_2_6>" + from.getOutputName_6_2_6()
						+ "</OutputName_6_2_6>")
				.append("<OutputName_6_2_8>" + from.getOutputName_6_2_8()
						+ "</OutputName_6_2_8>")
				.append("<OutputName_6_2_3>" + from.getOutputName_6_2_3()
						+ "</OutputName_6_2_3>")
				.append("<OutputName_6_2_2>" + from.getOutputName_6_2_2()
						+ "</OutputName_6_2_2>")
				.append("<OutputName_6_2_5>" + from.getOutputName_6_2_5()
						+ "</OutputName_6_2_5>")
				.append("<OutputName_6_2_4>" + from.getOutputName_6_2_4()
						+ "</OutputName_6_2_4>")
				.append("</return>")
				.append("</OutputDataClassName_6_2:CapabilityName_6_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_6_2")
	public InputDataClassName_6_2 transformCapabilityName_6_2ToInputDataClassName_6_2(
			Element from) {

		InputDataClassName_6_2 in = new InputDataClassName_6_2();

		in.setInputName_6_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_1")));
		in.setInputName_6_2_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_2")));
		in.setInputName_6_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_3")));
		in.setInputName_6_2_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_4")));
		in.setInputName_6_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_5")));
		in.setInputName_6_2_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_6")));
		in.setInputName_6_2_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_7")));
		in.setInputName_6_2_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_8")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_6_3Response")
	public Element transformOutputDataClassName_6_3ToCapabilityName_6_3Response(
			OutputDataClassName_6_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_3:CapabilityName_6_3Response xmlns:OutputDataClassName_6_3=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_6_3_6>" + from.getOutputName_6_3_6()
						+ "</OutputName_6_3_6>")
				.append("<OutputName_6_3_5>" + from.getOutputName_6_3_5()
						+ "</OutputName_6_3_5>")
				.append("<OutputName_6_3_8>" + from.getOutputName_6_3_8()
						+ "</OutputName_6_3_8>")
				.append("<OutputName_6_3_7>" + from.getOutputName_6_3_7()
						+ "</OutputName_6_3_7>")
				.append("<OutputName_6_3_2>" + from.getOutputName_6_3_2()
						+ "</OutputName_6_3_2>")
				.append("<OutputName_6_3_1>" + from.getOutputName_6_3_1()
						+ "</OutputName_6_3_1>")
				.append("<OutputName_6_3_4>" + from.getOutputName_6_3_4()
						+ "</OutputName_6_3_4>")
				.append("<OutputName_6_3_3>" + from.getOutputName_6_3_3()
						+ "</OutputName_6_3_3>")
				.append("<OutputName_6_3_9>" + from.getOutputName_6_3_9()
						+ "</OutputName_6_3_9>")
				.append("</return>")
				.append("</OutputDataClassName_6_3:CapabilityName_6_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_6_3")
	public InputDataClassName_6_3 transformCapabilityName_6_3ToInputDataClassName_6_3(
			Element from) {

		InputDataClassName_6_3 in = new InputDataClassName_6_3();

		in.setInputName_6_3_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_8")));
		in.setInputName_6_3_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_9")));
		in.setInputName_6_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_1")));
		in.setInputName_6_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_2")));
		in.setInputName_6_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_3")));
		in.setInputName_6_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_4")));
		in.setInputName_6_3_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_5")));
		in.setInputName_6_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_6")));
		in.setInputName_6_3_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_7")));

		return in;

	}
}
