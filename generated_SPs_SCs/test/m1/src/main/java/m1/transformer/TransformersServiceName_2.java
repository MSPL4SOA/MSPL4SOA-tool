package m1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import m1.util.XMLSOAPTransformers;

import m1.input.InputDataClassName_2_2;

import m1.output.OutputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:m1:m1:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:m1:m1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_1>" + from.getOutputName_2_1_1()
						+ "</OutputName_2_1_1>")
				.append("<OutputName_2_1_2>" + from.getOutputName_2_1_2()
						+ "</OutputName_2_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_1:CapabilityName_2_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:m1:m1:1.0}CapabilityName_2_2")
	public InputDataClassName_2_2 transformCapabilityName_2_2ToInputDataClassName_2_2(
			Element from) {

		InputDataClassName_2_2 in = new InputDataClassName_2_2();

		in.setInputName_2_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_1")));

		return in;

	}
}
