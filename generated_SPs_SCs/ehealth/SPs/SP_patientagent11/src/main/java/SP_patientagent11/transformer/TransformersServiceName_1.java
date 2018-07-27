package SP_jetaircraft1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_jetaircraft1.util.XMLSOAPTransformers;

import SP_jetaircraft1.input.InputDataClassName_1_1;
import SP_jetaircraft1.input.InputDataClassName_1_3;

import SP_jetaircraft1.output.OutputDataClassName_1_3;

public final class TransformersServiceName_1 {

	@Transformer(from = "{urn:SP_jetaircraft1:SP_jetaircraft1:1.0}CapabilityName_1_1")
	public InputDataClassName_1_1 transformCapabilityName_1_1ToInputDataClassName_1_1(
			Element from) {

		InputDataClassName_1_1 in = new InputDataClassName_1_1();

		in.setInputName_1_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_1")));
		in.setInputName_1_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_jetaircraft1:SP_jetaircraft1:1.0}CapabilityName_1_3Response")
	public Element transformOutputDataClassName_1_3ToCapabilityName_1_3Response(
			OutputDataClassName_1_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_3:CapabilityName_1_3Response xmlns:OutputDataClassName_1_3=\"urn:SP_jetaircraft1:SP_jetaircraft1:1.0\">")
				.append("<return>")
				.append("<OutputName_1_3_6>" + from.getOutputName_1_3_6()
						+ "</OutputName_1_3_6>")
				.append("<OutputName_1_3_4>" + from.getOutputName_1_3_4()
						+ "</OutputName_1_3_4>")
				.append("<OutputName_1_3_5>" + from.getOutputName_1_3_5()
						+ "</OutputName_1_3_5>")
				.append("<OutputName_1_3_2>" + from.getOutputName_1_3_2()
						+ "</OutputName_1_3_2>")
				.append("<OutputName_1_3_3>" + from.getOutputName_1_3_3()
						+ "</OutputName_1_3_3>")
				.append("<OutputName_1_3_1>" + from.getOutputName_1_3_1()
						+ "</OutputName_1_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_3:CapabilityName_1_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_jetaircraft1:SP_jetaircraft1:1.0}CapabilityName_1_3")
	public InputDataClassName_1_3 transformCapabilityName_1_3ToInputDataClassName_1_3(
			Element from) {

		InputDataClassName_1_3 in = new InputDataClassName_1_3();

		in.setInputName_1_3_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_5")));
		in.setInputName_1_3_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_6")));
		in.setInputName_1_3_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_3")));
		in.setInputName_1_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_4")));
		in.setInputName_1_3_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_1")));
		in.setInputName_1_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_3_2")));

		return in;

	}
}
