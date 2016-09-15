package a1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import a1.util.XMLSOAPTransformers;

import a1.input.InputDataClassName_2_1;

import a1.output.OutputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:a1:a1:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:a1:a1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_1>" + from.getOutputName_2_1_1()
						+ "</OutputName_2_1_1>")
				.append("<OutputName_2_1_2>" + from.getOutputName_2_1_2()
						+ "</OutputName_2_1_2>")
				.append("<OutputName_2_1_3>" + from.getOutputName_2_1_3()
						+ "</OutputName_2_1_3>")
				.append("</return>")
				.append("</OutputDataClassName_2_1:CapabilityName_2_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:a1:a1:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));

		return in;

	}

}
