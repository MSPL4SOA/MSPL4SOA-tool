package SP_anticraft2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_anticraft2.util.XMLSOAPTransformers;

import SP_anticraft2.input.InputDataClassName_3_4;
import SP_anticraft2.input.InputDataClassName_3_1;
import SP_anticraft2.input.InputDataClassName_3_2;

import SP_anticraft2.output.OutputDataClassName_3_4;
import SP_anticraft2.output.OutputDataClassName_3_1;

public final class TransformersServiceName_3 {

	@Transformer(to = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_3_4Response")
	public Element transformOutputDataClassName_3_4ToCapabilityName_3_4Response(
			OutputDataClassName_3_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_4:CapabilityName_3_4Response xmlns:OutputDataClassName_3_4=\"urn:SP_anticraft2:SP_anticraft2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_4_5>" + from.getOutputName_3_4_5()
						+ "</OutputName_3_4_5>")
				.append("<OutputName_3_4_6>" + from.getOutputName_3_4_6()
						+ "</OutputName_3_4_6>")
				.append("<OutputName_3_4_3>" + from.getOutputName_3_4_3()
						+ "</OutputName_3_4_3>")
				.append("<OutputName_3_4_4>" + from.getOutputName_3_4_4()
						+ "</OutputName_3_4_4>")
				.append("<OutputName_3_4_9>" + from.getOutputName_3_4_9()
						+ "</OutputName_3_4_9>")
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

	@Transformer(from = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_3_4")
	public InputDataClassName_3_4 transformCapabilityName_3_4ToInputDataClassName_3_4(
			Element from) {

		InputDataClassName_3_4 in = new InputDataClassName_3_4();

		in.setInputName_3_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_1")));
		in.setInputName_3_4_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_6")));
		in.setInputName_3_4_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_4")));
		in.setInputName_3_4_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_5")));
		in.setInputName_3_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_2")));
		in.setInputName_3_4_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_3")));

		return in;

	}

	@Transformer(to = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_3_1Response")
	public Element transformOutputDataClassName_3_1ToCapabilityName_3_1Response(
			OutputDataClassName_3_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_1:CapabilityName_3_1Response xmlns:OutputDataClassName_3_1=\"urn:SP_anticraft2:SP_anticraft2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_1_8>" + from.getOutputName_3_1_8()
						+ "</OutputName_3_1_8>")
				.append("<OutputName_3_1_9>" + from.getOutputName_3_1_9()
						+ "</OutputName_3_1_9>")
				.append("<OutputName_3_1_6>" + from.getOutputName_3_1_6()
						+ "</OutputName_3_1_6>")
				.append("<OutputName_3_1_7>" + from.getOutputName_3_1_7()
						+ "</OutputName_3_1_7>")
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

	@Transformer(from = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_3")));
		in.setInputName_3_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_4")));
		in.setInputName_3_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));
		in.setInputName_3_1_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_5")));

		return in;

	}

	@Transformer(from = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_3_2")
	public InputDataClassName_3_2 transformCapabilityName_3_2ToInputDataClassName_3_2(
			Element from) {

		InputDataClassName_3_2 in = new InputDataClassName_3_2();

		in.setInputName_3_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_2")));
		in.setInputName_3_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_3")));
		in.setInputName_3_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_1")));
		in.setInputName_3_2_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_4")));
		in.setInputName_3_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_2_5")));

		return in;

	}
}
