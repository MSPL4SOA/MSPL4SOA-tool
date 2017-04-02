package SP_submarine2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_submarine2.util.XMLSOAPTransformers;

import SP_submarine2.input.InputDataClassName_4_2;
import SP_submarine2.input.InputDataClassName_4_1;

import SP_submarine2.output.OutputDataClassName_4_2;
import SP_submarine2.output.OutputDataClassName_4_3;
import SP_submarine2.output.OutputDataClassName_4_1;

public final class TransformersServiceName_4 {

	@Transformer(to = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_4_2Response")
	public Element transformOutputDataClassName_4_2ToCapabilityName_4_2Response(
			OutputDataClassName_4_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_2:CapabilityName_4_2Response xmlns:OutputDataClassName_4_2=\"urn:SP_submarine2:SP_submarine2:1.0\">")
				.append("<return>")
				.append("<OutputName_4_2_4>" + from.getOutputName_4_2_4()
						+ "</OutputName_4_2_4>")
				.append("<OutputName_4_2_5>" + from.getOutputName_4_2_5()
						+ "</OutputName_4_2_5>")
				.append("<OutputName_4_2_1>" + from.getOutputName_4_2_1()
						+ "</OutputName_4_2_1>")
				.append("<OutputName_4_2_2>" + from.getOutputName_4_2_2()
						+ "</OutputName_4_2_2>")
				.append("<OutputName_4_2_3>" + from.getOutputName_4_2_3()
						+ "</OutputName_4_2_3>")
				.append("</return>")
				.append("</OutputDataClassName_4_2:CapabilityName_4_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_4_2")
	public InputDataClassName_4_2 transformCapabilityName_4_2ToInputDataClassName_4_2(
			Element from) {

		InputDataClassName_4_2 in = new InputDataClassName_4_2();

		in.setInputName_4_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_3")));
		in.setInputName_4_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_4")));
		in.setInputName_4_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_1")));
		in.setInputName_4_2_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_4_3Response")
	public Element transformOutputDataClassName_4_3ToCapabilityName_4_3Response(
			OutputDataClassName_4_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_3:CapabilityName_4_3Response xmlns:OutputDataClassName_4_3=\"urn:SP_submarine2:SP_submarine2:1.0\">")
				.append("<return>")
				.append("<OutputName_4_3_3>" + from.getOutputName_4_3_3()
						+ "</OutputName_4_3_3>")
				.append("<OutputName_4_3_4>" + from.getOutputName_4_3_4()
						+ "</OutputName_4_3_4>")
				.append("<OutputName_4_3_5>" + from.getOutputName_4_3_5()
						+ "</OutputName_4_3_5>")
				.append("<OutputName_4_3_6>" + from.getOutputName_4_3_6()
						+ "</OutputName_4_3_6>")
				.append("<OutputName_4_3_7>" + from.getOutputName_4_3_7()
						+ "</OutputName_4_3_7>")
				.append("<OutputName_4_3_8>" + from.getOutputName_4_3_8()
						+ "</OutputName_4_3_8>")
				.append("<OutputName_4_3_9>" + from.getOutputName_4_3_9()
						+ "</OutputName_4_3_9>")
				.append("<OutputName_4_3_1>" + from.getOutputName_4_3_1()
						+ "</OutputName_4_3_1>")
				.append("<OutputName_4_3_2>" + from.getOutputName_4_3_2()
						+ "</OutputName_4_3_2>")
				.append("</return>")
				.append("</OutputDataClassName_4_3:CapabilityName_4_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_4_1Response")
	public Element transformOutputDataClassName_4_1ToCapabilityName_4_1Response(
			OutputDataClassName_4_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_1:CapabilityName_4_1Response xmlns:OutputDataClassName_4_1=\"urn:SP_submarine2:SP_submarine2:1.0\">")
				.append("<return>")
				.append("<OutputName_4_1_1>" + from.getOutputName_4_1_1()
						+ "</OutputName_4_1_1>")
				.append("<OutputName_4_1_2>" + from.getOutputName_4_1_2()
						+ "</OutputName_4_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_4_1:CapabilityName_4_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_4_1")
	public InputDataClassName_4_1 transformCapabilityName_4_1ToInputDataClassName_4_1(
			Element from) {

		InputDataClassName_4_1 in = new InputDataClassName_4_1();

		in.setInputName_4_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_4")));
		in.setInputName_4_1_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_5")));
		in.setInputName_4_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_1")));
		in.setInputName_4_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_2")));
		in.setInputName_4_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_3")));

		return in;

	}
}
