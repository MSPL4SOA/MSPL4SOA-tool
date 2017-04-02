package SP_aircraftcarrier2.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_aircraftcarrier2.util.XMLSOAPTransformers;

import SP_aircraftcarrier2.input.InputDataClassName_1_1;
import SP_aircraftcarrier2.input.InputDataClassName_1_2;

import SP_aircraftcarrier2.output.OutputDataClassName_1_1;
import SP_aircraftcarrier2.output.OutputDataClassName_1_4;

public final class TransformersServiceName_1 {

	@Transformer(to = "{urn:SP_aircraftcarrier2:SP_aircraftcarrier2:1.0}CapabilityName_1_1Response")
	public Element transformOutputDataClassName_1_1ToCapabilityName_1_1Response(
			OutputDataClassName_1_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_1:CapabilityName_1_1Response xmlns:OutputDataClassName_1_1=\"urn:SP_aircraftcarrier2:SP_aircraftcarrier2:1.0\">")
				.append("<return>")
				.append("<OutputName_1_1_8>" + from.getOutputName_1_1_8()
						+ "</OutputName_1_1_8>")
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

	@Transformer(from = "{urn:SP_aircraftcarrier2:SP_aircraftcarrier2:1.0}CapabilityName_1_1")
	public InputDataClassName_1_1 transformCapabilityName_1_1ToInputDataClassName_1_1(
			Element from) {

		InputDataClassName_1_1 in = new InputDataClassName_1_1();

		in.setInputName_1_1_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_1")));
		in.setInputName_1_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_2")));
		in.setInputName_1_1_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_1_3")));

		return in;

	}

	@Transformer(from = "{urn:SP_aircraftcarrier2:SP_aircraftcarrier2:1.0}CapabilityName_1_2")
	public InputDataClassName_1_2 transformCapabilityName_1_2ToInputDataClassName_1_2(
			Element from) {

		InputDataClassName_1_2 in = new InputDataClassName_1_2();

		in.setInputName_1_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_1")));
		in.setInputName_1_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_1_2_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier2:SP_aircraftcarrier2:1.0}CapabilityName_1_4Response")
	public Element transformOutputDataClassName_1_4ToCapabilityName_1_4Response(
			OutputDataClassName_1_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_1_4:CapabilityName_1_4Response xmlns:OutputDataClassName_1_4=\"urn:SP_aircraftcarrier2:SP_aircraftcarrier2:1.0\">")
				.append("<return>")
				.append("<OutputName_1_4_5>" + from.getOutputName_1_4_5()
						+ "</OutputName_1_4_5>")
				.append("<OutputName_1_4_3>" + from.getOutputName_1_4_3()
						+ "</OutputName_1_4_3>")
				.append("<OutputName_1_4_4>" + from.getOutputName_1_4_4()
						+ "</OutputName_1_4_4>")
				.append("<OutputName_1_4_1>" + from.getOutputName_1_4_1()
						+ "</OutputName_1_4_1>")
				.append("<OutputName_1_4_2>" + from.getOutputName_1_4_2()
						+ "</OutputName_1_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_1_4:CapabilityName_1_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

}
