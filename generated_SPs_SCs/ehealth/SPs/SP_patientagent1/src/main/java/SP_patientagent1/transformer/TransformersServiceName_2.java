package SP_aircraftcarrier1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_aircraftcarrier1.util.XMLSOAPTransformers;

import SP_aircraftcarrier1.input.InputDataClassName_2_4;
import SP_aircraftcarrier1.input.InputDataClassName_2_5;
import SP_aircraftcarrier1.input.InputDataClassName_2_1;
import SP_aircraftcarrier1.input.InputDataClassName_2_2;

import SP_aircraftcarrier1.output.OutputDataClassName_2_4;
import SP_aircraftcarrier1.output.OutputDataClassName_2_5;
import SP_aircraftcarrier1.output.OutputDataClassName_2_1;
import SP_aircraftcarrier1.output.OutputDataClassName_2_3;

public final class TransformersServiceName_2 {

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_4Response")
	public Element transformOutputDataClassName_2_4ToCapabilityName_2_4Response(
			OutputDataClassName_2_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_4:CapabilityName_2_4Response xmlns:OutputDataClassName_2_4=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_4_4>" + from.getOutputName_2_4_4()
						+ "</OutputName_2_4_4>")
				.append("<OutputName_2_4_5>" + from.getOutputName_2_4_5()
						+ "</OutputName_2_4_5>")
				.append("<OutputName_2_4_6>" + from.getOutputName_2_4_6()
						+ "</OutputName_2_4_6>")
				.append("<OutputName_2_4_1>" + from.getOutputName_2_4_1()
						+ "</OutputName_2_4_1>")
				.append("<OutputName_2_4_2>" + from.getOutputName_2_4_2()
						+ "</OutputName_2_4_2>")
				.append("<OutputName_2_4_3>" + from.getOutputName_2_4_3()
						+ "</OutputName_2_4_3>")
				.append("</return>")
				.append("</OutputDataClassName_2_4:CapabilityName_2_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_4")
	public InputDataClassName_2_4 transformCapabilityName_2_4ToInputDataClassName_2_4(
			Element from) {

		InputDataClassName_2_4 in = new InputDataClassName_2_4();

		in.setInputName_2_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_1")));
		in.setInputName_2_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_2")));
		in.setInputName_2_4_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_3")));
		in.setInputName_2_4_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_4_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_5Response")
	public Element transformOutputDataClassName_2_5ToCapabilityName_2_5Response(
			OutputDataClassName_2_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_5:CapabilityName_2_5Response xmlns:OutputDataClassName_2_5=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_5_1>" + from.getOutputName_2_5_1()
						+ "</OutputName_2_5_1>")
				.append("<OutputName_2_5_2>" + from.getOutputName_2_5_2()
						+ "</OutputName_2_5_2>")
				.append("</return>")
				.append("</OutputDataClassName_2_5:CapabilityName_2_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_5")
	public InputDataClassName_2_5 transformCapabilityName_2_5ToInputDataClassName_2_5(
			Element from) {

		InputDataClassName_2_5 in = new InputDataClassName_2_5();

		in.setInputName_2_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_5_1")));
		in.setInputName_2_5_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_5_2")));
		in.setInputName_2_5_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_5_3")));
		in.setInputName_2_5_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_5_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_1Response")
	public Element transformOutputDataClassName_2_1ToCapabilityName_2_1Response(
			OutputDataClassName_2_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_1:CapabilityName_2_1Response xmlns:OutputDataClassName_2_1=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_1_7>" + from.getOutputName_2_1_7()
						+ "</OutputName_2_1_7>")
				.append("<OutputName_2_1_8>" + from.getOutputName_2_1_8()
						+ "</OutputName_2_1_8>")
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

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_1")
	public InputDataClassName_2_1 transformCapabilityName_2_1ToInputDataClassName_2_1(
			Element from) {

		InputDataClassName_2_1 in = new InputDataClassName_2_1();

		in.setInputName_2_1_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_1")));
		in.setInputName_2_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_2")));
		in.setInputName_2_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_1_3")));

		return in;

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_2")
	public InputDataClassName_2_2 transformCapabilityName_2_2ToInputDataClassName_2_2(
			Element from) {

		InputDataClassName_2_2 in = new InputDataClassName_2_2();

		in.setInputName_2_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_1")));
		in.setInputName_2_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_2_2_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_2_3Response")
	public Element transformOutputDataClassName_2_3ToCapabilityName_2_3Response(
			OutputDataClassName_2_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_2_3:CapabilityName_2_3Response xmlns:OutputDataClassName_2_3=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_2_3_1>" + from.getOutputName_2_3_1()
						+ "</OutputName_2_3_1>")
				.append("</return>")
				.append("</OutputDataClassName_2_3:CapabilityName_2_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

}
