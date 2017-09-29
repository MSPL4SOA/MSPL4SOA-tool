package outputvoid.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import outputvoid.util.XMLSOAPTransformers;

import outputvoid.input.InputDataClassName_1_2;

import outputvoid.output.OutputDataClassName_1_2;

public final class TransformersServiceName_1 {

	@Transformer(to = "{urn:outputvoid:outputvoid:1.0}CapabilityName_1_2Response")
	public Element transformOutputDataClassName_1_2ToCapabilityName_1_2Response(
			OutputDataClassName_1_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_2:CapabilityName_1_2Response xmlns:OutputDataClassName_1_2=\"urn:outputvoid:outputvoid:1.0\">")
				.append("<return>")
				.append("<OutputName_1_2_1>" + from.getOutputName_1_2_1()
						+ "</OutputName_1_2_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_2:CapabilityName_1_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:outputvoid:outputvoid:1.0}CapabilityName_1_2")
	public InputDataClassName_1_2 transformCapabilityName_1_2ToInputDataClassName_1_2(
			Element from) {

		InputDataClassName_1_2 in = new InputDataClassName_1_2();

		in.setInputName_1_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_1")));

		return in;

	}
}
