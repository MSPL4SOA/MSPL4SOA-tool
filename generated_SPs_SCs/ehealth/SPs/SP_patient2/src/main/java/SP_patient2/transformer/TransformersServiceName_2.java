package SP_anticraft2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_anticraft2.util.XMLSOAPTransformers;

import SP_anticraft2.input.InputDataClassName_2_1;
import SP_anticraft2.input.InputDataClassName_2_2;

import SP_anticraft2.output.OutputDataClassName_2_1;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:SP_anticraft2:SP_anticraft2:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_3>" + from.getOutputName_2_1_3()
						+ "</OutputName_2_1_3>")
				.append("<OutputName_2_1_4>" + from.getOutputName_2_1_4()
						+ "</OutputName_2_1_4>")
				.append("<OutputName_2_1_5>" + from.getOutputName_2_1_5()
						+ "</OutputName_2_1_5>")
				.append("<OutputName_2_1_6>" + from.getOutputName_2_1_6()
						+ "</OutputName_2_1_6>")
				.append("<OutputName_2_1_1>" + from.getOutputName_2_1_1()
						+ "</OutputName_2_1_1>")
				.append("<OutputName_2_1_2>" + from.getOutputName_2_1_2()
						+ "</OutputName_2_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_1:CapabilityName_2_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));
		in.setInputName_2_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_3")));

		return in;

	}

	@Transformer(from = "{urn:SP_anticraft2:SP_anticraft2:1.0}CapabilityName_2_2")
	public InputDataClassName_2_2 transformCapabilityName_2_2ToInputDataClassName_2_2(
			Element from) {

		InputDataClassName_2_2 in = new InputDataClassName_2_2();

		in.setInputName_2_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_1")));
		in.setInputName_2_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_2")));
		in.setInputName_2_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_3")));
		in.setInputName_2_2_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_4")));
		in.setInputName_2_2_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_5")));
		in.setInputName_2_2_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_6")));

		return in;

	}
}
