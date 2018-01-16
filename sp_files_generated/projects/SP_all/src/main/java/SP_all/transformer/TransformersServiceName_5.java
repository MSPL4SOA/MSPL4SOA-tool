package SP_all.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_all.util.XMLSOAPTransformers;

import SP_all.input.InputDataClassName_5_5;
import SP_all.input.InputDataClassName_5_1;
import SP_all.input.InputDataClassName_5_2;
import SP_all.input.InputDataClassName_5_3;

import SP_all.output.OutputDataClassName_5_5;
import SP_all.output.OutputDataClassName_5_1;
import SP_all.output.OutputDataClassName_5_4;

public final class TransformersServiceName_5 {

	@Transformer(to = "{urn:SP_all:SP_all:1.0}CapabilityName_5_5Response")
	public Element transformOutputDataClassName_5_5ToCapabilityName_5_5Response(
			OutputDataClassName_5_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_5:CapabilityName_5_5Response xmlns:OutputDataClassName_5_5=\"urn:SP_all:SP_all:1.0\">")
				.append("<return>")
				.append("<OutputName_5_5_2>" + from.getOutputName_5_5_2()
						+ "</OutputName_5_5_2>")
				.append("<OutputName_5_5_1>" + from.getOutputName_5_5_1()
						+ "</OutputName_5_5_1>")
				.append("</return>")
				.append("</OutputDataClassName_5_5:CapabilityName_5_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_5_5")
	public InputDataClassName_5_5 transformCapabilityName_5_5ToInputDataClassName_5_5(
			Element from) {

		InputDataClassName_5_5 in = new InputDataClassName_5_5();

		in.setInputName_5_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_all:SP_all:1.0}CapabilityName_5_1Response")
	public Element transformOutputDataClassName_5_1ToCapabilityName_5_1Response(
			OutputDataClassName_5_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_1:CapabilityName_5_1Response xmlns:OutputDataClassName_5_1=\"urn:SP_all:SP_all:1.0\">")
				.append("<return>")
				.append("<OutputName_5_1_2>" + from.getOutputName_5_1_2()
						+ "</OutputName_5_1_2>")
				.append("<OutputName_5_1_3>" + from.getOutputName_5_1_3()
						+ "</OutputName_5_1_3>")
				.append("<OutputName_5_1_1>" + from.getOutputName_5_1_1()
						+ "</OutputName_5_1_1>")
				.append("</return>")
				.append("</OutputDataClassName_5_1:CapabilityName_5_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_5_1")
	public InputDataClassName_5_1 transformCapabilityName_5_1ToInputDataClassName_5_1(
			Element from) {

		InputDataClassName_5_1 in = new InputDataClassName_5_1();

		in.setInputName_5_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_1")));
		in.setInputName_5_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_2")));
		in.setInputName_5_1_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_5")));
		in.setInputName_5_1_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_6")));
		in.setInputName_5_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_3")));
		in.setInputName_5_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_4")));
		in.setInputName_5_1_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_9")));
		in.setInputName_5_1_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_7")));
		in.setInputName_5_1_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_1_8")));

		return in;

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_5_2")
	public InputDataClassName_5_2 transformCapabilityName_5_2ToInputDataClassName_5_2(
			Element from) {

		InputDataClassName_5_2 in = new InputDataClassName_5_2();

		in.setInputName_5_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_1")));
		in.setInputName_5_2_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_4")));
		in.setInputName_5_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_2")));
		in.setInputName_5_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_3")));

		return in;

	}

	@Transformer(from = "{urn:SP_all:SP_all:1.0}CapabilityName_5_3")
	public InputDataClassName_5_3 transformCapabilityName_5_3ToInputDataClassName_5_3(
			Element from) {

		InputDataClassName_5_3 in = new InputDataClassName_5_3();

		in.setInputName_5_3_9(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_9")));
		in.setInputName_5_3_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_3")));
		in.setInputName_5_3_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_4")));
		in.setInputName_5_3_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_1")));
		in.setInputName_5_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_2")));
		in.setInputName_5_3_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_7")));
		in.setInputName_5_3_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_8")));
		in.setInputName_5_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_5")));
		in.setInputName_5_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_6")));

		return in;

	}

	@Transformer(to = "{urn:SP_all:SP_all:1.0}CapabilityName_5_4Response")
	public Element transformOutputDataClassName_5_4ToCapabilityName_5_4Response(
			OutputDataClassName_5_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_4:CapabilityName_5_4Response xmlns:OutputDataClassName_5_4=\"urn:SP_all:SP_all:1.0\">")
				.append("<return>")
				.append("<OutputName_5_4_3>" + from.getOutputName_5_4_3()
						+ "</OutputName_5_4_3>")
				.append("<OutputName_5_4_1>" + from.getOutputName_5_4_1()
						+ "</OutputName_5_4_1>")
				.append("<OutputName_5_4_2>" + from.getOutputName_5_4_2()
						+ "</OutputName_5_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_5_4:CapabilityName_5_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

}
