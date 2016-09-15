package large2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import large2.util.XMLSOAPTransformers;

import large2.input.InputDataClassName_3_3;
import large2.input.InputDataClassName_3_6;
import large2.input.InputDataClassName_3_1;
import large2.input.InputDataClassName_3_2;

import large2.output.OutputDataClassName_3_3;
import large2.output.OutputDataClassName_3_5;
import large2.output.OutputDataClassName_3_1;
import large2.output.OutputDataClassName_3_2;

public final class TransformersServiceName_3 {

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_3_3Response")
	public Element transformOutputDataClassName_3_3ToCapabilityName_3_3Response(
			OutputDataClassName_3_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_3:CapabilityName_3_3Response xmlns:OutputDataClassName_3_3=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_3_6>" + from.getOutputName_3_3_6()
						+ "</OutputName_3_3_6>")
				.append("<OutputName_3_3_4>" + from.getOutputName_3_3_4()
						+ "</OutputName_3_3_4>")
				.append("<OutputName_3_3_5>" + from.getOutputName_3_3_5()
						+ "</OutputName_3_3_5>")
				.append("<OutputName_3_3_2>" + from.getOutputName_3_3_2()
						+ "</OutputName_3_3_2>")
				.append("<OutputName_3_3_3>" + from.getOutputName_3_3_3()
						+ "</OutputName_3_3_3>")
				.append("<OutputName_3_3_1>" + from.getOutputName_3_3_1()
						+ "</OutputName_3_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_3_3:CapabilityName_3_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_3_3")
	public InputDataClassName_3_3 transformCapabilityName_3_3ToInputDataClassName_3_3(
			Element from) {

		InputDataClassName_3_3 in = new InputDataClassName_3_3();

		in.setInputName_3_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_1")));
		in.setInputName_3_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_2")));
		in.setInputName_3_3_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_9")));
		in.setInputName_3_3_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_7")));
		in.setInputName_3_3_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_8")));
		in.setInputName_3_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_5")));
		in.setInputName_3_3_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_6")));
		in.setInputName_3_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_3")));
		in.setInputName_3_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_4")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_3_5Response")
	public Element transformOutputDataClassName_3_5ToCapabilityName_3_5Response(
			OutputDataClassName_3_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_5:CapabilityName_3_5Response xmlns:OutputDataClassName_3_5=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_5_4>" + from.getOutputName_3_5_4()
						+ "</OutputName_3_5_4>")
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

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_3_6")
	public InputDataClassName_3_6 transformCapabilityName_3_6ToInputDataClassName_3_6(
			Element from) {

		InputDataClassName_3_6 in = new InputDataClassName_3_6();

		in.setInputName_3_6_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_4")));
		in.setInputName_3_6_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_2")));
		in.setInputName_3_6_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_3")));
		in.setInputName_3_6_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_1")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_3_1Response")
	public Element transformOutputDataClassName_3_1ToCapabilityName_3_1Response(
			OutputDataClassName_3_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_1:CapabilityName_3_1Response xmlns:OutputDataClassName_3_1=\"urn:large2:large2:1.0\">")
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

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));

		return in;

	}

	@Transformer(to = "{urn:large2:large2:1.0}CapabilityName_3_2Response")
	public Element transformOutputDataClassName_3_2ToCapabilityName_3_2Response(
			OutputDataClassName_3_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_2:CapabilityName_3_2Response xmlns:OutputDataClassName_3_2=\"urn:large2:large2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_2_7>" + from.getOutputName_3_2_7()
						+ "</OutputName_3_2_7>")
				.append("<OutputName_3_2_8>" + from.getOutputName_3_2_8()
						+ "</OutputName_3_2_8>")
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

	@Transformer(from = "{urn:large2:large2:1.0}CapabilityName_3_2")
	public InputDataClassName_3_2 transformCapabilityName_3_2ToInputDataClassName_3_2(
			Element from) {

		InputDataClassName_3_2 in = new InputDataClassName_3_2();

		in.setInputName_3_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_2")));
		in.setInputName_3_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_3")));
		in.setInputName_3_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_1")));
		in.setInputName_3_2_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_6")));
		in.setInputName_3_2_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_7")));
		in.setInputName_3_2_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_4")));
		in.setInputName_3_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_5")));

		return in;

	}
}
