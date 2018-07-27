package SP_drone1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_drone1.util.XMLSOAPTransformers;

import SP_drone1.input.InputDataClassName_4_1;

import SP_drone1.output.OutputDataClassName_4_2;
import SP_drone1.output.OutputDataClassName_4_1;

public final class TransformersServiceName_4 {

	@Transformer(to = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_4_2Response")
	public Element transformOutputDataClassName_4_2ToCapabilityName_4_2Response(
			OutputDataClassName_4_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_2:CapabilityName_4_2Response xmlns:OutputDataClassName_4_2=\"urn:SP_drone1:SP_drone1:1.0\">")
				.append("<return>")
				.append("<OutputName_4_2_4>" + from.getOutputName_4_2_4()
						+ "</OutputName_4_2_4>")
				.append("<OutputName_4_2_5>" + from.getOutputName_4_2_5()
						+ "</OutputName_4_2_5>")
				.append("<OutputName_4_2_1>" + from.getOutputName_4_2_1()
						+ "</OutputName_4_2_1>")
				.append("<OutputName_4_2_2>" + from.getOutputName_4_2_2()
						+ "</OutputName_4_2_2>")
				.append("<OutputName_4_2_3>" + from.getOutputName_4_2_3()
						+ "</OutputName_4_2_3>")
				.append("</return>")
				.append("</OutputDataClassName_4_2:CapabilityName_4_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_4_1Response")
	public Element transformOutputDataClassName_4_1ToCapabilityName_4_1Response(
			OutputDataClassName_4_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_1:CapabilityName_4_1Response xmlns:OutputDataClassName_4_1=\"urn:SP_drone1:SP_drone1:1.0\">")
				.append("<return>")
				.append("<OutputName_4_1_1>" + from.getOutputName_4_1_1()
						+ "</OutputName_4_1_1>")
				.append("<OutputName_4_1_2>" + from.getOutputName_4_1_2()
						+ "</OutputName_4_1_2>")
				.append("</return>")
				.append("</OutputDataClassName_4_1:CapabilityName_4_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_drone1:SP_drone1:1.0}CapabilityName_4_1")
	public InputDataClassName_4_1 transformCapabilityName_4_1ToInputDataClassName_4_1(
			Element from) {

		InputDataClassName_4_1 in = new InputDataClassName_4_1();

		in.setInputName_4_1_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_4")));
		in.setInputName_4_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_1")));
		in.setInputName_4_1_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_2")));
		in.setInputName_4_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_3")));

		return in;

	}
}
