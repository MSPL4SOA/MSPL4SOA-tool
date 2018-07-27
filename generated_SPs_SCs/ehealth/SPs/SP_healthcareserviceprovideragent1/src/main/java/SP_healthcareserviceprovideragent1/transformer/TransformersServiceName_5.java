package SP_helicopter1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_helicopter1.util.XMLSOAPTransformers;

import SP_helicopter1.input.InputDataClassName_5_1;
import SP_helicopter1.input.InputDataClassName_5_2;
import SP_helicopter1.input.InputDataClassName_5_3;
import SP_helicopter1.input.InputDataClassName_5_4;

import SP_helicopter1.output.OutputDataClassName_5_1;
import SP_helicopter1.output.OutputDataClassName_5_3;
import SP_helicopter1.output.OutputDataClassName_5_4;

public final class TransformersServiceName_5 {

	@Transformer(to = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_1Response")
	public Element transformOutputDataClassName_5_1ToCapabilityName_5_1Response(
			OutputDataClassName_5_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_1:CapabilityName_5_1Response xmlns:OutputDataClassName_5_1=\"urn:SP_helicopter1:SP_helicopter1:1.0\">")
				.append("<return>")
				.append("<OutputName_5_1_2>" + from.getOutputName_5_1_2()
						+ "</OutputName_5_1_2>")
				.append("<OutputName_5_1_3>" + from.getOutputName_5_1_3()
						+ "</OutputName_5_1_3>")
				.append("<OutputName_5_1_1>" + from.getOutputName_5_1_1()
						+ "</OutputName_5_1_1>")
				.append("<OutputName_5_1_6>" + from.getOutputName_5_1_6()
						+ "</OutputName_5_1_6>")
				.append("<OutputName_5_1_7>" + from.getOutputName_5_1_7()
						+ "</OutputName_5_1_7>")
				.append("<OutputName_5_1_4>" + from.getOutputName_5_1_4()
						+ "</OutputName_5_1_4>")
				.append("<OutputName_5_1_5>" + from.getOutputName_5_1_5()
						+ "</OutputName_5_1_5>")
				.append("</return>")
				.append("</OutputDataClassName_5_1:CapabilityName_5_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_1")
	public InputDataClassName_5_1 transformCapabilityName_5_1ToInputDataClassName_5_1(
			Element from) {

		InputDataClassName_5_1 in = new InputDataClassName_5_1();

		in.setInputName_5_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_1")));
		in.setInputName_5_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_2")));
		in.setInputName_5_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_3")));
		in.setInputName_5_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_4")));

		return in;

	}

	@Transformer(from = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_2")
	public InputDataClassName_5_2 transformCapabilityName_5_2ToInputDataClassName_5_2(
			Element from) {

		InputDataClassName_5_2 in = new InputDataClassName_5_2();

		in.setInputName_5_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_1")));
		in.setInputName_5_2_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_4")));
		in.setInputName_5_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_5")));
		in.setInputName_5_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_2")));
		in.setInputName_5_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_3")));
		in.setInputName_5_2_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_8")));
		in.setInputName_5_2_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_9")));
		in.setInputName_5_2_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_6")));
		in.setInputName_5_2_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_7")));

		return in;

	}

	@Transformer(to = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_3Response")
	public Element transformOutputDataClassName_5_3ToCapabilityName_5_3Response(
			OutputDataClassName_5_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_3:CapabilityName_5_3Response xmlns:OutputDataClassName_5_3=\"urn:SP_helicopter1:SP_helicopter1:1.0\">")
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

	@Transformer(from = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_3")
	public InputDataClassName_5_3 transformCapabilityName_5_3ToInputDataClassName_5_3(
			Element from) {

		InputDataClassName_5_3 in = new InputDataClassName_5_3();

		in.setInputName_5_3_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_9")));
		in.setInputName_5_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_3")));
		in.setInputName_5_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_4")));
		in.setInputName_5_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_1")));
		in.setInputName_5_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_2")));
		in.setInputName_5_3_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_7")));
		in.setInputName_5_3_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_8")));
		in.setInputName_5_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_5")));
		in.setInputName_5_3_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_6")));

		return in;

	}

	@Transformer(to = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_4Response")
	public Element transformOutputDataClassName_5_4ToCapabilityName_5_4Response(
			OutputDataClassName_5_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_4:CapabilityName_5_4Response xmlns:OutputDataClassName_5_4=\"urn:SP_helicopter1:SP_helicopter1:1.0\">")
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

	@Transformer(from = "{urn:SP_helicopter1:SP_helicopter1:1.0}CapabilityName_5_4")
	public InputDataClassName_5_4 transformCapabilityName_5_4ToInputDataClassName_5_4(
			Element from) {

		InputDataClassName_5_4 in = new InputDataClassName_5_4();

		in.setInputName_5_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_2")));
		in.setInputName_5_4_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_3")));
		in.setInputName_5_4_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_1")));
		in.setInputName_5_4_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_4")));

		return in;

	}
}
