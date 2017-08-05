package sync3.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import sync3.util.XMLSOAPTransformers;

import sync3.input.InputDataClassName_1_1;
import sync3.input.InputDataClassName_1_2;

import sync3.output.OutputDataClassName_1_1;
import sync3.output.OutputDataClassName_1_2;

public final class TransformersServiceName_1 {

	@Transformer(to = "{urn:sync3:sync3:1.0}CapabilityName_1_1Response")
	public Element transformOutputDataClassName_1_1ToCapabilityName_1_1Response(
			OutputDataClassName_1_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_1:CapabilityName_1_1Response xmlns:OutputDataClassName_1_1=\"urn:sync3:sync3:1.0\">")
				.append("<return>")
				.append("<OutputName_1_1_2>" + from.getOutputName_1_1_2()
						+ "</OutputName_1_1_2>")
				.append("<OutputName_1_1_1>" + from.getOutputName_1_1_1()
						+ "</OutputName_1_1_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_1:CapabilityName_1_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sync3:sync3:1.0}CapabilityName_1_1")
	public InputDataClassName_1_1 transformCapabilityName_1_1ToInputDataClassName_1_1(
			Element from) {

		InputDataClassName_1_1 in = new InputDataClassName_1_1();

		in.setInputName_1_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_1")));

		return in;

	}

	@Transformer(to = "{urn:sync3:sync3:1.0}CapabilityName_1_2Response")
	public Element transformOutputDataClassName_1_2ToCapabilityName_1_2Response(
			OutputDataClassName_1_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_2:CapabilityName_1_2Response xmlns:OutputDataClassName_1_2=\"urn:sync3:sync3:1.0\">")
				.append("<return>")
				.append("<OutputName_1_2_1>" + from.getOutputName_1_2_1()
						+ "</OutputName_1_2_1>")
				.append("<OutputName_1_2_2>" + from.getOutputName_1_2_2()
						+ "</OutputName_1_2_2>")
				.append("</return>")
				.append("</OutputDataClassName_1_2:CapabilityName_1_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sync3:sync3:1.0}CapabilityName_1_2")
	public InputDataClassName_1_2 transformCapabilityName_1_2ToInputDataClassName_1_2(
			Element from) {

		InputDataClassName_1_2 in = new InputDataClassName_1_2();

		in.setInputName_1_2_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_1")));
		in.setInputName_1_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_2")));
		in.setInputName_1_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_3")));

		return in;

	}
}
