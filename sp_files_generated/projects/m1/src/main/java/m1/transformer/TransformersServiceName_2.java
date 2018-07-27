package m1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import m1.util.XMLSOAPTransformers;

import m1.input.InputDataClassName_2_1;

import m1.output.OutputDataClassName_2_2;

public final class TransformersServiceName_2 {

	@Transformer(from = "{urn:m1:m1:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));

		return in;

	}

	@Transformer(to = "{urn:m1:m1:1.0}CapabilityName_2_2Response")
	public Element transformOutputDataClassName_2_2ToCapabilityName_2_2Response(
			OutputDataClassName_2_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_2:CapabilityName_2_2Response xmlns:OutputDataClassName_2_2=\"urn:m1:m1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_2_1>" + from.getOutputName_2_2_1()
						+ "</OutputName_2_2_1>")
				.append("</return>")
				.append("</OutputDataClassName_2_2:CapabilityName_2_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

}
