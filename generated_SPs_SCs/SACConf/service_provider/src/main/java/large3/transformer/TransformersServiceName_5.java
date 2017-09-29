package large3.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import large3.util.XMLSOAPTransformers;

import large3.input.InputDataClassName_5_5;
import large3.input.InputDataClassName_5_6;
import large3.input.InputDataClassName_5_1;
import large3.input.InputDataClassName_5_2;
import large3.input.InputDataClassName_5_3;
import large3.input.InputDataClassName_5_4;

import large3.output.OutputDataClassName_5_5;
import large3.output.OutputDataClassName_5_6;
import large3.output.OutputDataClassName_5_1;
import large3.output.OutputDataClassName_5_2;
import large3.output.OutputDataClassName_5_3;
import large3.output.OutputDataClassName_5_4;

public final class TransformersServiceName_5 {

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_5_5Response")
	public Element transformOutputDataClassName_5_5ToCapabilityName_5_5Response(
			OutputDataClassName_5_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_5:CapabilityName_5_5Response xmlns:OutputDataClassName_5_5=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_5_5_6>" + from.getOutputName_5_5_6()
						+ "</OutputName_5_5_6>")
				.append("<OutputName_5_5_4>" + from.getOutputName_5_5_4()
						+ "</OutputName_5_5_4>")
				.append("<OutputName_5_5_5>" + from.getOutputName_5_5_5()
						+ "</OutputName_5_5_5>")
				.append("<OutputName_5_5_2>" + from.getOutputName_5_5_2()
						+ "</OutputName_5_5_2>")
				.append("<OutputName_5_5_3>" + from.getOutputName_5_5_3()
						+ "</OutputName_5_5_3>")
				.append("<OutputName_5_5_1>" + from.getOutputName_5_5_1()
						+ "</OutputName_5_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_5_5:CapabilityName_5_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_5_5")
	public InputDataClassName_5_5 transformCapabilityName_5_5ToInputDataClassName_5_5(
			Element from) {

		InputDataClassName_5_5 in = new InputDataClassName_5_5();

		in.setInputName_5_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_1")));
		in.setInputName_5_5_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_2")));
		in.setInputName_5_5_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_5")));
		in.setInputName_5_5_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_6")));
		in.setInputName_5_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_3")));
		in.setInputName_5_5_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_4")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_5_6Response")
	public Element transformOutputDataClassName_5_6ToCapabilityName_5_6Response(
			OutputDataClassName_5_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_6:CapabilityName_5_6Response xmlns:OutputDataClassName_5_6=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_5_6_5>" + from.getOutputName_5_6_5()
						+ "</OutputName_5_6_5>")
				.append("<OutputName_5_6_3>" + from.getOutputName_5_6_3()
						+ "</OutputName_5_6_3>")
				.append("<OutputName_5_6_4>" + from.getOutputName_5_6_4()
						+ "</OutputName_5_6_4>")
				.append("<OutputName_5_6_1>" + from.getOutputName_5_6_1()
						+ "</OutputName_5_6_1>")
				.append("<OutputName_5_6_2>" + from.getOutputName_5_6_2()
						+ "</OutputName_5_6_2>")
				.append("</return>")
				.append("</OutputDataClassName_5_6:CapabilityName_5_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_5_6")
	public InputDataClassName_5_6 transformCapabilityName_5_6ToInputDataClassName_5_6(
			Element from) {

		InputDataClassName_5_6 in = new InputDataClassName_5_6();

		in.setInputName_5_6_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_6_1")));
		in.setInputName_5_6_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_6_4")));
		in.setInputName_5_6_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_6_5")));
		in.setInputName_5_6_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_6_2")));
		in.setInputName_5_6_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_6_3")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_5_1Response")
	public Element transformOutputDataClassName_5_1ToCapabilityName_5_1Response(
			OutputDataClassName_5_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_1:CapabilityName_5_1Response xmlns:OutputDataClassName_5_1=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_5_1_2>" + from.getOutputName_5_1_2()
						+ "</OutputName_5_1_2>")
				.append("<OutputName_5_1_3>" + from.getOutputName_5_1_3()
						+ "</OutputName_5_1_3>")
				.append("<OutputName_5_1_1>" + from.getOutputName_5_1_1()
						+ "</OutputName_5_1_1>")
				.append("<OutputName_5_1_6>" + from.getOutputName_5_1_6()
						+ "</OutputName_5_1_6>")
				.append("<OutputName_5_1_4>" + from.getOutputName_5_1_4()
						+ "</OutputName_5_1_4>")
				.append("<OutputName_5_1_5>" + from.getOutputName_5_1_5()
						+ "</OutputName_5_1_5>")
				.append("</return>")
				.append("</OutputDataClassName_5_1:CapabilityName_5_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_5_1")
	public InputDataClassName_5_1 transformCapabilityName_5_1ToInputDataClassName_5_1(
			Element from) {

		InputDataClassName_5_1 in = new InputDataClassName_5_1();

		in.setInputName_5_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_1")));
		in.setInputName_5_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_2")));
		in.setInputName_5_1_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_5")));
		in.setInputName_5_1_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_6")));
		in.setInputName_5_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_3")));
		in.setInputName_5_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_4")));
		in.setInputName_5_1_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_9")));
		in.setInputName_5_1_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_7")));
		in.setInputName_5_1_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_8")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_5_2Response")
	public Element transformOutputDataClassName_5_2ToCapabilityName_5_2Response(
			OutputDataClassName_5_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_2:CapabilityName_5_2Response xmlns:OutputDataClassName_5_2=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_5_2_1>" + from.getOutputName_5_2_1()
						+ "</OutputName_5_2_1>")
				.append("<OutputName_5_2_2>" + from.getOutputName_5_2_2()
						+ "</OutputName_5_2_2>")
				.append("<OutputName_5_2_7>" + from.getOutputName_5_2_7()
						+ "</OutputName_5_2_7>")
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

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_5_2")
	public InputDataClassName_5_2 transformCapabilityName_5_2ToInputDataClassName_5_2(
			Element from) {

		InputDataClassName_5_2 in = new InputDataClassName_5_2();

		in.setInputName_5_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_1")));
		in.setInputName_5_2_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_4")));
		in.setInputName_5_2_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_5")));
		in.setInputName_5_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_2")));
		in.setInputName_5_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_3")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_5_3Response")
	public Element transformOutputDataClassName_5_3ToCapabilityName_5_3Response(
			OutputDataClassName_5_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_3:CapabilityName_5_3Response xmlns:OutputDataClassName_5_3=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_5_3_1>" + from.getOutputName_5_3_1()
						+ "</OutputName_5_3_1>")
				.append("<OutputName_5_3_8>" + from.getOutputName_5_3_8()
						+ "</OutputName_5_3_8>")
				.append("<OutputName_5_3_6>" + from.getOutputName_5_3_6()
						+ "</OutputName_5_3_6>")
				.append("<OutputName_5_3_7>" + from.getOutputName_5_3_7()
						+ "</OutputName_5_3_7>")
				.append("<OutputName_5_3_4>" + from.getOutputName_5_3_4()
						+ "</OutputName_5_3_4>")
				.append("<OutputName_5_3_5>" + from.getOutputName_5_3_5()
						+ "</OutputName_5_3_5>")
				.append("<OutputName_5_3_2>" + from.getOutputName_5_3_2()
						+ "</OutputName_5_3_2>")
				.append("<OutputName_5_3_3>" + from.getOutputName_5_3_3()
						+ "</OutputName_5_3_3>")
				.append("</return>")
				.append("</OutputDataClassName_5_3:CapabilityName_5_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_5_3")
	public InputDataClassName_5_3 transformCapabilityName_5_3ToInputDataClassName_5_3(
			Element from) {

		InputDataClassName_5_3 in = new InputDataClassName_5_3();

		in.setInputName_5_3_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_3")));
		in.setInputName_5_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_4")));
		in.setInputName_5_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_1")));
		in.setInputName_5_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_2")));
		in.setInputName_5_3_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_7")));
		in.setInputName_5_3_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_8")));
		in.setInputName_5_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_5")));
		in.setInputName_5_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_6")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_5_4Response")
	public Element transformOutputDataClassName_5_4ToCapabilityName_5_4Response(
			OutputDataClassName_5_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_4:CapabilityName_5_4Response xmlns:OutputDataClassName_5_4=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_5_4_9>" + from.getOutputName_5_4_9()
						+ "</OutputName_5_4_9>")
				.append("<OutputName_5_4_7>" + from.getOutputName_5_4_7()
						+ "</OutputName_5_4_7>")
				.append("<OutputName_5_4_8>" + from.getOutputName_5_4_8()
						+ "</OutputName_5_4_8>")
				.append("<OutputName_5_4_5>" + from.getOutputName_5_4_5()
						+ "</OutputName_5_4_5>")
				.append("<OutputName_5_4_6>" + from.getOutputName_5_4_6()
						+ "</OutputName_5_4_6>")
				.append("<OutputName_5_4_3>" + from.getOutputName_5_4_3()
						+ "</OutputName_5_4_3>")
				.append("<OutputName_5_4_4>" + from.getOutputName_5_4_4()
						+ "</OutputName_5_4_4>")
				.append("<OutputName_5_4_1>" + from.getOutputName_5_4_1()
						+ "</OutputName_5_4_1>")
				.append("<OutputName_5_4_2>" + from.getOutputName_5_4_2()
						+ "</OutputName_5_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_5_4:CapabilityName_5_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_5_4")
	public InputDataClassName_5_4 transformCapabilityName_5_4ToInputDataClassName_5_4(
			Element from) {

		InputDataClassName_5_4 in = new InputDataClassName_5_4();

		in.setInputName_5_4_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_8")));
		in.setInputName_5_4_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_9")));
		in.setInputName_5_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_2")));
		in.setInputName_5_4_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_3")));
		in.setInputName_5_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_1")));
		in.setInputName_5_4_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_6")));
		in.setInputName_5_4_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_7")));
		in.setInputName_5_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_4")));
		in.setInputName_5_4_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_5")));

		return in;

	}
}
