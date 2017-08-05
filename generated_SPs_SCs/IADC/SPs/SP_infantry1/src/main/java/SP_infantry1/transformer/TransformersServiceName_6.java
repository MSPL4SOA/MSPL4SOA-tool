package SP_infantry1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_infantry1.util.XMLSOAPTransformers;

import SP_infantry1.input.InputDataClassName_6_4;
import SP_infantry1.input.InputDataClassName_6_5;
import SP_infantry1.input.InputDataClassName_6_1;
import SP_infantry1.input.InputDataClassName_6_2;
import SP_infantry1.input.InputDataClassName_6_3;

import SP_infantry1.output.OutputDataClassName_6_4;
import SP_infantry1.output.OutputDataClassName_6_5;
import SP_infantry1.output.OutputDataClassName_6_2;
import SP_infantry1.output.OutputDataClassName_6_3;

public final class TransformersServiceName_6 {

	@Transformer(to = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_4Response")
	public Element transformOutputDataClassName_6_4ToCapabilityName_6_4Response(
			OutputDataClassName_6_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_4:CapabilityName_6_4Response xmlns:OutputDataClassName_6_4=\"urn:SP_infantry1:SP_infantry1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_4_4>" + from.getOutputName_6_4_4()
						+ "</OutputName_6_4_4>")
				.append("<OutputName_6_4_1>" + from.getOutputName_6_4_1()
						+ "</OutputName_6_4_1>")
				.append("<OutputName_6_4_3>" + from.getOutputName_6_4_3()
						+ "</OutputName_6_4_3>")
				.append("<OutputName_6_4_2>" + from.getOutputName_6_4_2()
						+ "</OutputName_6_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_6_4:CapabilityName_6_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_4")
	public InputDataClassName_6_4 transformCapabilityName_6_4ToInputDataClassName_6_4(
			Element from) {

		InputDataClassName_6_4 in = new InputDataClassName_6_4();

		in.setInputName_6_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_1")));
		in.setInputName_6_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_2")));
		in.setInputName_6_4_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_3")));
		in.setInputName_6_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_5Response")
	public Element transformOutputDataClassName_6_5ToCapabilityName_6_5Response(
			OutputDataClassName_6_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_5:CapabilityName_6_5Response xmlns:OutputDataClassName_6_5=\"urn:SP_infantry1:SP_infantry1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_5_1>" + from.getOutputName_6_5_1()
						+ "</OutputName_6_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_5:CapabilityName_6_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_5")
	public InputDataClassName_6_5 transformCapabilityName_6_5ToInputDataClassName_6_5(
			Element from) {

		InputDataClassName_6_5 in = new InputDataClassName_6_5();

		in.setInputName_6_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_1")));
		in.setInputName_6_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_2")));
		in.setInputName_6_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_3")));
		in.setInputName_6_5_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_4")));

		return in;

	}

	@Transformer(from = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_1")
	public InputDataClassName_6_1 transformCapabilityName_6_1ToInputDataClassName_6_1(
			Element from) {

		InputDataClassName_6_1 in = new InputDataClassName_6_1();

		in.setInputName_6_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_2")));
		in.setInputName_6_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_2Response")
	public Element transformOutputDataClassName_6_2ToCapabilityName_6_2Response(
			OutputDataClassName_6_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_2:CapabilityName_6_2Response xmlns:OutputDataClassName_6_2=\"urn:SP_infantry1:SP_infantry1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_2_1>" + from.getOutputName_6_2_1()
						+ "</OutputName_6_2_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_2:CapabilityName_6_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_2")
	public InputDataClassName_6_2 transformCapabilityName_6_2ToInputDataClassName_6_2(
			Element from) {

		InputDataClassName_6_2 in = new InputDataClassName_6_2();

		in.setInputName_6_2_9(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_9")));
		in.setInputName_6_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_1")));
		in.setInputName_6_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_2")));
		in.setInputName_6_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_3")));
		in.setInputName_6_2_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_4")));
		in.setInputName_6_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_5")));
		in.setInputName_6_2_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_6")));
		in.setInputName_6_2_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_7")));
		in.setInputName_6_2_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_8")));

		return in;

	}

	@Transformer(to = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_3Response")
	public Element transformOutputDataClassName_6_3ToCapabilityName_6_3Response(
			OutputDataClassName_6_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_3:CapabilityName_6_3Response xmlns:OutputDataClassName_6_3=\"urn:SP_infantry1:SP_infantry1:1.0\">")
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
				.append("</return>")
				.append("</OutputDataClassName_6_3:CapabilityName_6_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_infantry1:SP_infantry1:1.0}CapabilityName_6_3")
	public InputDataClassName_6_3 transformCapabilityName_6_3ToInputDataClassName_6_3(
			Element from) {

		InputDataClassName_6_3 in = new InputDataClassName_6_3();

		in.setInputName_6_3_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_8")));
		in.setInputName_6_3_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_9")));
		in.setInputName_6_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_1")));
		in.setInputName_6_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_2")));
		in.setInputName_6_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_3")));
		in.setInputName_6_3_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_4")));
		in.setInputName_6_3_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_5")));
		in.setInputName_6_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_6")));
		in.setInputName_6_3_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_7")));

		return in;

	}
}
