package SP_anticraft2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_anticraft2.util.XMLSOAPTransformers;

import SP_anticraft2.input.InputDataClassName_1_1;

import SP_anticraft2.output.OutputDataClassName_1_1;

public final class TransformersServiceName_1 {

	@Transformer(to = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_1_1Response")
	public Element transformOutputDataClassName_1_1ToCapabilityName_1_1Response(
			OutputDataClassName_1_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_1:CapabilityName_1_1Response xmlns:OutputDataClassName_1_1=\"urn:SP_anticraft2:SP_anticraft2:1.0\">")
				.append("<return>")
				.append("<OutputName_1_1_6>" + from.getOutputName_1_1_6()
						+ "</OutputName_1_1_6>")
				.append("<OutputName_1_1_7>" + from.getOutputName_1_1_7()
						+ "</OutputName_1_1_7>")
				.append("<OutputName_1_1_4>" + from.getOutputName_1_1_4()
						+ "</OutputName_1_1_4>")
				.append("<OutputName_1_1_5>" + from.getOutputName_1_1_5()
						+ "</OutputName_1_1_5>")
				.append("<OutputName_1_1_2>" + from.getOutputName_1_1_2()
						+ "</OutputName_1_1_2>")
				.append("<OutputName_1_1_3>" + from.getOutputName_1_1_3()
						+ "</OutputName_1_1_3>")
				.append("<OutputName_1_1_1>" + from.getOutputName_1_1_1()
						+ "</OutputName_1_1_1>")
				.append("</return>")
				.append("</OutputDataClassName_1_1:CapabilityName_1_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_1_1")
	public InputDataClassName_1_1 transformCapabilityName_1_1ToInputDataClassName_1_1(
			Element from) {

		InputDataClassName_1_1 in = new InputDataClassName_1_1();

		in.setInputName_1_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_1")));
		in.setInputName_1_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_2")));

		return in;

	}
}
