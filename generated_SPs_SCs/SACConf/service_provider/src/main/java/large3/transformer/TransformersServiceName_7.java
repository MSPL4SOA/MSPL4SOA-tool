package large3.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import large3.util.XMLSOAPTransformers;

import large3.input.InputDataClassName_7_3;
import large3.input.InputDataClassName_7_4;
import large3.input.InputDataClassName_7_5;
import large3.input.InputDataClassName_7_1;
import large3.input.InputDataClassName_7_2;

import large3.output.OutputDataClassName_7_3;
import large3.output.OutputDataClassName_7_4;
import large3.output.OutputDataClassName_7_1;
import large3.output.OutputDataClassName_7_2;

public final class TransformersServiceName_7 {

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_7_3Response")
	public Element transformOutputDataClassName_7_3ToCapabilityName_7_3Response(
			OutputDataClassName_7_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_3:CapabilityName_7_3Response xmlns:OutputDataClassName_7_3=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_7_3_3>" + from.getOutputName_7_3_3()
						+ "</OutputName_7_3_3>")
				.append("<OutputName_7_3_2>" + from.getOutputName_7_3_2()
						+ "</OutputName_7_3_2>")
				.append("<OutputName_7_3_1>" + from.getOutputName_7_3_1()
						+ "</OutputName_7_3_1>")
				.append("<OutputName_7_3_5>" + from.getOutputName_7_3_5()
						+ "</OutputName_7_3_5>")
				.append("<OutputName_7_3_4>" + from.getOutputName_7_3_4()
						+ "</OutputName_7_3_4>")
				.append("</return>")
				.append("</OutputDataClassName_7_3:CapabilityName_7_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_7_3")
	public InputDataClassName_7_3 transformCapabilityName_7_3ToInputDataClassName_7_3(
			Element from) {

		InputDataClassName_7_3 in = new InputDataClassName_7_3();

		in.setInputName_7_3_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_3")));
		in.setInputName_7_3_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_4")));
		in.setInputName_7_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_1")));
		in.setInputName_7_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_3_2")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_7_4Response")
	public Element transformOutputDataClassName_7_4ToCapabilityName_7_4Response(
			OutputDataClassName_7_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_4:CapabilityName_7_4Response xmlns:OutputDataClassName_7_4=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_7_4_2>" + from.getOutputName_7_4_2()
						+ "</OutputName_7_4_2>")
				.append("<OutputName_7_4_1>" + from.getOutputName_7_4_1()
						+ "</OutputName_7_4_1>")
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

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_7_4")
	public InputDataClassName_7_4 transformCapabilityName_7_4ToInputDataClassName_7_4(
			Element from) {

		InputDataClassName_7_4 in = new InputDataClassName_7_4();

		in.setInputName_7_4_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_4")));
		in.setInputName_7_4_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_5")));
		in.setInputName_7_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_2")));
		in.setInputName_7_4_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_3")));
		in.setInputName_7_4_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_1")));
		in.setInputName_7_4_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_6")));

		return in;

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_7_5")
	public InputDataClassName_7_5 transformCapabilityName_7_5ToInputDataClassName_7_5(
			Element from) {

		InputDataClassName_7_5 in = new InputDataClassName_7_5();

		in.setInputName_7_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_3")));
		in.setInputName_7_5_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_4")));
		in.setInputName_7_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_1")));
		in.setInputName_7_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_2")));
		in.setInputName_7_5_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_7")));
		in.setInputName_7_5_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_5")));
		in.setInputName_7_5_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_6")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_7_1Response")
	public Element transformOutputDataClassName_7_1ToCapabilityName_7_1Response(
			OutputDataClassName_7_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_1:CapabilityName_7_1Response xmlns:OutputDataClassName_7_1=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_7_1_1>" + from.getOutputName_7_1_1()
						+ "</OutputName_7_1_1>")
				.append("<OutputName_7_1_5>" + from.getOutputName_7_1_5()
						+ "</OutputName_7_1_5>")
				.append("<OutputName_7_1_4>" + from.getOutputName_7_1_4()
						+ "</OutputName_7_1_4>")
				.append("<OutputName_7_1_3>" + from.getOutputName_7_1_3()
						+ "</OutputName_7_1_3>")
				.append("<OutputName_7_1_2>" + from.getOutputName_7_1_2()
						+ "</OutputName_7_1_2>")
				.append("<OutputName_7_1_8>" + from.getOutputName_7_1_8()
						+ "</OutputName_7_1_8>")
				.append("<OutputName_7_1_7>" + from.getOutputName_7_1_7()
						+ "</OutputName_7_1_7>")
				.append("<OutputName_7_1_6>" + from.getOutputName_7_1_6()
						+ "</OutputName_7_1_6>")
				.append("</return>")
				.append("</OutputDataClassName_7_1:CapabilityName_7_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_7_1")
	public InputDataClassName_7_1 transformCapabilityName_7_1ToInputDataClassName_7_1(
			Element from) {

		InputDataClassName_7_1 in = new InputDataClassName_7_1();

		in.setInputName_7_1_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_7")));
		in.setInputName_7_1_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_8")));
		in.setInputName_7_1_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_5")));
		in.setInputName_7_1_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_6")));
		in.setInputName_7_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_3")));
		in.setInputName_7_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_4")));
		in.setInputName_7_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_1")));
		in.setInputName_7_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_2")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_7_2Response")
	public Element transformOutputDataClassName_7_2ToCapabilityName_7_2Response(
			OutputDataClassName_7_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_2:CapabilityName_7_2Response xmlns:OutputDataClassName_7_2=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_7_2_4>" + from.getOutputName_7_2_4()
						+ "</OutputName_7_2_4>")
				.append("<OutputName_7_2_3>" + from.getOutputName_7_2_3()
						+ "</OutputName_7_2_3>")
				.append("<OutputName_7_2_2>" + from.getOutputName_7_2_2()
						+ "</OutputName_7_2_2>")
				.append("<OutputName_7_2_1>" + from.getOutputName_7_2_1()
						+ "</OutputName_7_2_1>")
				.append("<OutputName_7_2_7>" + from.getOutputName_7_2_7()
						+ "</OutputName_7_2_7>")
				.append("<OutputName_7_2_6>" + from.getOutputName_7_2_6()
						+ "</OutputName_7_2_6>")
				.append("<OutputName_7_2_5>" + from.getOutputName_7_2_5()
						+ "</OutputName_7_2_5>")
				.append("</return>")
				.append("</OutputDataClassName_7_2:CapabilityName_7_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_7_2")
	public InputDataClassName_7_2 transformCapabilityName_7_2ToInputDataClassName_7_2(
			Element from) {

		InputDataClassName_7_2 in = new InputDataClassName_7_2();

		in.setInputName_7_2_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_6")));
		in.setInputName_7_2_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_7")));
		in.setInputName_7_2_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_4")));
		in.setInputName_7_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_5")));
		in.setInputName_7_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_2")));
		in.setInputName_7_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_3")));
		in.setInputName_7_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_1")));
		in.setInputName_7_2_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_8")));
		in.setInputName_7_2_9(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_9")));

		return in;

	}
}
