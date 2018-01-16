package SP_all.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_all.util.XMLSOAPTransformers;

import SP_all.input.InputDataClassName_7_4;
import SP_all.input.InputDataClassName_7_5;
import SP_all.input.InputDataClassName_7_1;
import SP_all.input.InputDataClassName_7_2;

import SP_all.output.OutputDataClassName_7_3;
import SP_all.output.OutputDataClassName_7_4;
import SP_all.output.OutputDataClassName_7_5;

public final class TransformersServiceName_7 {

	@Transformer(to = "{urn:SP_all:SP_all:1.0}CapabilityName_7_3Response")
	public Element transformOutputDataClassName_7_3ToCapabilityName_7_3Response(
			OutputDataClassName_7_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_3:CapabilityName_7_3Response xmlns:OutputDataClassName_7_3=\"urn:SP_all:SP_all:1.0\">")
				.append("<return>")
				.append("<OutputName_7_3_9>" + from.getOutputName_7_3_9()
						+ "</OutputName_7_3_9>")
				.append("<OutputName_7_3_8>" + from.getOutputName_7_3_8()
						+ "</OutputName_7_3_8>")
				.append("<OutputName_7_3_3>" + from.getOutputName_7_3_3()
						+ "</OutputName_7_3_3>")
				.append("<OutputName_7_3_2>" + from.getOutputName_7_3_2()
						+ "</OutputName_7_3_2>")
				.append("<OutputName_7_3_1>" + from.getOutputName_7_3_1()
						+ "</OutputName_7_3_1>")
				.append("<OutputName_7_3_7>" + from.getOutputName_7_3_7()
						+ "</OutputName_7_3_7>")
				.append("<OutputName_7_3_6>" + from.getOutputName_7_3_6()
						+ "</OutputName_7_3_6>")
				.append("<OutputName_7_3_5>" + from.getOutputName_7_3_5()
						+ "</OutputName_7_3_5>")
				.append("<OutputName_7_3_4>" + from.getOutputName_7_3_4()
						+ "</OutputName_7_3_4>")
				.append("</return>")
				.append("</OutputDataClassName_7_3:CapabilityName_7_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:SP_all:SP_all:1.0}CapabilityName_7_4Response")
	public Element transformOutputDataClassName_7_4ToCapabilityName_7_4Response(
			OutputDataClassName_7_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_4:CapabilityName_7_4Response xmlns:OutputDataClassName_7_4=\"urn:SP_all:SP_all:1.0\">")
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

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_7_4")
	public InputDataClassName_7_4 transformCapabilityName_7_4ToInputDataClassName_7_4(
			Element from) {

		InputDataClassName_7_4 in = new InputDataClassName_7_4();

		in.setInputName_7_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_4")));
		in.setInputName_7_4_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_5")));
		in.setInputName_7_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_2")));
		in.setInputName_7_4_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_3")));
		in.setInputName_7_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_4_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_all:SP_all:1.0}CapabilityName_7_5Response")
	public Element transformOutputDataClassName_7_5ToCapabilityName_7_5Response(
			OutputDataClassName_7_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_7_5:CapabilityName_7_5Response xmlns:OutputDataClassName_7_5=\"urn:SP_all:SP_all:1.0\">")
				.append("<return>")
				.append("<OutputName_7_5_1>" + from.getOutputName_7_5_1()
						+ "</OutputName_7_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_7_5:CapabilityName_7_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_7_5")
	public InputDataClassName_7_5 transformCapabilityName_7_5ToInputDataClassName_7_5(
			Element from) {

		InputDataClassName_7_5 in = new InputDataClassName_7_5();

		in.setInputName_7_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_3")));
		in.setInputName_7_5_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_4")));
		in.setInputName_7_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_1")));
		in.setInputName_7_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_2")));
		in.setInputName_7_5_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_5_5")));

		return in;

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_7_1")
	public InputDataClassName_7_1 transformCapabilityName_7_1ToInputDataClassName_7_1(
			Element from) {

		InputDataClassName_7_1 in = new InputDataClassName_7_1();

		in.setInputName_7_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_1")));
		in.setInputName_7_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_1_2")));

		return in;

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_7_2")
	public InputDataClassName_7_2 transformCapabilityName_7_2ToInputDataClassName_7_2(
			Element from) {

		InputDataClassName_7_2 in = new InputDataClassName_7_2();

		in.setInputName_7_2_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_6")));
		in.setInputName_7_2_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_7")));
		in.setInputName_7_2_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_4")));
		in.setInputName_7_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_5")));
		in.setInputName_7_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_2")));
		in.setInputName_7_2_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_3")));
		in.setInputName_7_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_1")));
		in.setInputName_7_2_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_8")));
		in.setInputName_7_2_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_7_2_9")));

		return in;

	}
}
