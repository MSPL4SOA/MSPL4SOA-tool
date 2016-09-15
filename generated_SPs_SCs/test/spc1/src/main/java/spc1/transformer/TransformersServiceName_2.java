package spc1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import spc1.util.XMLSOAPTransformers;

import spc1.input.InputDataClassName_2_2;

import spc1.output.OutputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:spc1:spc1:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:spc1:spc1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_1>" + from.getOutputName_2_1_1()
						+ "</OutputName_2_1_1>")
				.append("<OutputName_2_1_2>" + from.getOutputName_2_1_2()
						+ "</OutputName_2_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_1:CapabilityName_2_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:spc1:spc1:1.0}CapabilityName_2_2")
	public InputDataClassName_2_2 transformCapabilityName_2_2ToInputDataClassName_2_2(
			Element from) {

		InputDataClassName_2_2 in = new InputDataClassName_2_2();

		in.setInputName_2_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_1")));
		in.setInputName_2_2_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_2")));
		in.setInputName_2_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_3")));
		in.setInputName_2_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_4")));

		return in;

	}
}
