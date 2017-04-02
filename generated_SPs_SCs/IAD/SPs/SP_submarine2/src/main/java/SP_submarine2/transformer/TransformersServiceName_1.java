package SP_submarine2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_submarine2.util.XMLSOAPTransformers;

import SP_submarine2.input.InputDataClassName_1_1;

import SP_submarine2.output.OutputDataClassName_1_1;

public final class TransformersServiceName_1 {

	@Transformer(to = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_1_1Response")
	public Element transformOutputDataClassName_1_1ToCapabilityName_1_1Response(
			OutputDataClassName_1_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_1:CapabilityName_1_1Response xmlns:OutputDataClassName_1_1=\"urn:SP_submarine2:SP_submarine2:1.0\">")
				.append("<return>")
				.append("<OutputName_1_1_1>" + from.getOutputName_1_1_1()
						+ "</OutputName_1_1_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_1:CapabilityName_1_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_submarine2:SP_submarine2:1.0}CapabilityName_1_1")
	public InputDataClassName_1_1 transformCapabilityName_1_1ToInputDataClassName_1_1(
			Element from) {

		InputDataClassName_1_1 in = new InputDataClassName_1_1();

		in.setInputName_1_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_1")));
		in.setInputName_1_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_2")));
		in.setInputName_1_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_3")));

		return in;

	}
}
