package SP_infantry2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_infantry2.util.XMLSOAPTransformers;

import SP_infantry2.input.InputDataClassName_3_3;
import SP_infantry2.input.InputDataClassName_3_4;
import SP_infantry2.input.InputDataClassName_3_6;
import SP_infantry2.input.InputDataClassName_3_1;

import SP_infantry2.output.OutputDataClassName_3_6;
import SP_infantry2.output.OutputDataClassName_3_1;

public final class TransformersServiceName_3 {

	@Transformer(from = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_3_3")
	public InputDataClassName_3_3 transformCapabilityName_3_3ToInputDataClassName_3_3(
			Element from) {

		InputDataClassName_3_3 in = new InputDataClassName_3_3();

		in.setInputName_3_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_1")));
		in.setInputName_3_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_2")));
		in.setInputName_3_3_9(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_9")));
		in.setInputName_3_3_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_7")));
		in.setInputName_3_3_8(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_8")));
		in.setInputName_3_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_5")));
		in.setInputName_3_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_6")));
		in.setInputName_3_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_3")));
		in.setInputName_3_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_3_4")));

		return in;

	}

	@Transformer(from = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_3_4")
	public InputDataClassName_3_4 transformCapabilityName_3_4ToInputDataClassName_3_4(
			Element from) {

		InputDataClassName_3_4 in = new InputDataClassName_3_4();

		in.setInputName_3_4_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_1")));
		in.setInputName_3_4_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_6")));
		in.setInputName_3_4_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_4")));
		in.setInputName_3_4_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_5")));
		in.setInputName_3_4_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_2")));
		in.setInputName_3_4_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_4_3")));

		return in;

	}

	@Transformer(to = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_3_6Response")
	public Element transformOutputDataClassName_3_6ToCapabilityName_3_6Response(
			OutputDataClassName_3_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_6:CapabilityName_3_6Response xmlns:OutputDataClassName_3_6=\"urn:SP_infantry2:SP_infantry2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_6_3>" + from.getOutputName_3_6_3()
						+ "</OutputName_3_6_3>")
				.append("<OutputName_3_6_4>" + from.getOutputName_3_6_4()
						+ "</OutputName_3_6_4>")
				.append("<OutputName_3_6_1>" + from.getOutputName_3_6_1()
						+ "</OutputName_3_6_1>")
				.append("<OutputName_3_6_2>" + from.getOutputName_3_6_2()
						+ "</OutputName_3_6_2>")
				.append("<OutputName_3_6_5>" + from.getOutputName_3_6_5()
						+ "</OutputName_3_6_5>")
				.append("<OutputName_3_6_6>" + from.getOutputName_3_6_6()
						+ "</OutputName_3_6_6>")
				.append("</return>")
				.append("</OutputDataClassName_3_6:CapabilityName_3_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_3_6")
	public InputDataClassName_3_6 transformCapabilityName_3_6ToInputDataClassName_3_6(
			Element from) {

		InputDataClassName_3_6 in = new InputDataClassName_3_6();

		in.setInputName_3_6_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_6")));
		in.setInputName_3_6_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_4")));
		in.setInputName_3_6_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_5")));
		in.setInputName_3_6_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_2")));
		in.setInputName_3_6_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_3")));
		in.setInputName_3_6_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_6_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_3_1Response")
	public Element transformOutputDataClassName_3_1ToCapabilityName_3_1Response(
			OutputDataClassName_3_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_3_1:CapabilityName_3_1Response xmlns:OutputDataClassName_3_1=\"urn:SP_infantry2:SP_infantry2:1.0\">")
				.append("<return>")
				.append("<OutputName_3_1_8>" + from.getOutputName_3_1_8()
						+ "</OutputName_3_1_8>")
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

	@Transformer(from = "{urn:SP_infantry2:SP_infantry2:1.0}CapabilityName_3_1")
	public InputDataClassName_3_1 transformCapabilityName_3_1ToInputDataClassName_3_1(
			Element from) {

		InputDataClassName_3_1 in = new InputDataClassName_3_1();

		in.setInputName_3_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_1")));
		in.setInputName_3_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_3_1_2")));

		return in;

	}

}
