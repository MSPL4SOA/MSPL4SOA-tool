package SP_aircraftcarrier1.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP_aircraftcarrier1.util.XMLSOAPTransformers;

import SP_aircraftcarrier1.input.InputDataClassName_6_4;
import SP_aircraftcarrier1.input.InputDataClassName_6_5;
import SP_aircraftcarrier1.input.InputDataClassName_6_6;
import SP_aircraftcarrier1.input.InputDataClassName_6_1;
import SP_aircraftcarrier1.input.InputDataClassName_6_2;
import SP_aircraftcarrier1.input.InputDataClassName_6_3;
import SP_aircraftcarrier1.input.InputDataClassName_6_8;

import SP_aircraftcarrier1.output.OutputDataClassName_6_4;
import SP_aircraftcarrier1.output.OutputDataClassName_6_5;
import SP_aircraftcarrier1.output.OutputDataClassName_6_6;
import SP_aircraftcarrier1.output.OutputDataClassName_6_7;
import SP_aircraftcarrier1.output.OutputDataClassName_6_2;
import SP_aircraftcarrier1.output.OutputDataClassName_6_3;
import SP_aircraftcarrier1.output.OutputDataClassName_6_8;

public final class TransformersServiceName_6 {

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_4Response")
	public Element transformOutputDataClassName_6_4ToCapabilityName_6_4Response(
			OutputDataClassName_6_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_4:CapabilityName_6_4Response xmlns:OutputDataClassName_6_4=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_4_5>" + from.getOutputName_6_4_5()
						+ "</OutputName_6_4_5>")
				.append("<OutputName_6_4_4>" + from.getOutputName_6_4_4()
						+ "</OutputName_6_4_4>")
				.append("<OutputName_6_4_6>" + from.getOutputName_6_4_6()
						+ "</OutputName_6_4_6>")
				.append("<OutputName_6_4_1>" + from.getOutputName_6_4_1()
						+ "</OutputName_6_4_1>")
				.append("<OutputName_6_4_3>" + from.getOutputName_6_4_3()
						+ "</OutputName_6_4_3>")
				.append("<OutputName_6_4_2>" + from.getOutputName_6_4_2()
						+ "</OutputName_6_4_2>")
				.append("</return>")
				.append("</OutputDataClassName_6_4:CapabilityName_6_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_4")
	public InputDataClassName_6_4 transformCapabilityName_6_4ToInputDataClassName_6_4(
			Element from) {

		InputDataClassName_6_4 in = new InputDataClassName_6_4();

		in.setInputName_6_4_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_1")));
		in.setInputName_6_4_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_4_2")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_5Response")
	public Element transformOutputDataClassName_6_5ToCapabilityName_6_5Response(
			OutputDataClassName_6_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_5:CapabilityName_6_5Response xmlns:OutputDataClassName_6_5=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_5_4>" + from.getOutputName_6_5_4()
						+ "</OutputName_6_5_4>")
				.append("<OutputName_6_5_3>" + from.getOutputName_6_5_3()
						+ "</OutputName_6_5_3>")
				.append("<OutputName_6_5_6>" + from.getOutputName_6_5_6()
						+ "</OutputName_6_5_6>")
				.append("<OutputName_6_5_5>" + from.getOutputName_6_5_5()
						+ "</OutputName_6_5_5>")
				.append("<OutputName_6_5_2>" + from.getOutputName_6_5_2()
						+ "</OutputName_6_5_2>")
				.append("<OutputName_6_5_1>" + from.getOutputName_6_5_1()
						+ "</OutputName_6_5_1>")
				.append("<OutputName_6_5_7>" + from.getOutputName_6_5_7()
						+ "</OutputName_6_5_7>")
				.append("</return>")
				.append("</OutputDataClassName_6_5:CapabilityName_6_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_5")
	public InputDataClassName_6_5 transformCapabilityName_6_5ToInputDataClassName_6_5(
			Element from) {

		InputDataClassName_6_5 in = new InputDataClassName_6_5();

		in.setInputName_6_5_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_5_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_6Response")
	public Element transformOutputDataClassName_6_6ToCapabilityName_6_6Response(
			OutputDataClassName_6_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_6:CapabilityName_6_6Response xmlns:OutputDataClassName_6_6=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_6_3>" + from.getOutputName_6_6_3()
						+ "</OutputName_6_6_3>")
				.append("<OutputName_6_6_2>" + from.getOutputName_6_6_2()
						+ "</OutputName_6_6_2>")
				.append("<OutputName_6_6_5>" + from.getOutputName_6_6_5()
						+ "</OutputName_6_6_5>")
				.append("<OutputName_6_6_4>" + from.getOutputName_6_6_4()
						+ "</OutputName_6_6_4>")
				.append("<OutputName_6_6_1>" + from.getOutputName_6_6_1()
						+ "</OutputName_6_6_1>")
				.append("</return>")
				.append("</OutputDataClassName_6_6:CapabilityName_6_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_6")
	public InputDataClassName_6_6 transformCapabilityName_6_6ToInputDataClassName_6_6(
			Element from) {

		InputDataClassName_6_6 in = new InputDataClassName_6_6();

		in.setInputName_6_6_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_1")));
		in.setInputName_6_6_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_2")));
		in.setInputName_6_6_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_3")));
		in.setInputName_6_6_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_6_4")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_7Response")
	public Element transformOutputDataClassName_6_7ToCapabilityName_6_7Response(
			OutputDataClassName_6_7 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_7:CapabilityName_6_7Response xmlns:OutputDataClassName_6_7=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_7_2>" + from.getOutputName_6_7_2()
						+ "</OutputName_6_7_2>")
				.append("<OutputName_6_7_1>" + from.getOutputName_6_7_1()
						+ "</OutputName_6_7_1>")
				.append("<OutputName_6_7_4>" + from.getOutputName_6_7_4()
						+ "</OutputName_6_7_4>")
				.append("<OutputName_6_7_3>" + from.getOutputName_6_7_3()
						+ "</OutputName_6_7_3>")
				.append("<OutputName_6_7_6>" + from.getOutputName_6_7_6()
						+ "</OutputName_6_7_6>")
				.append("<OutputName_6_7_5>" + from.getOutputName_6_7_5()
						+ "</OutputName_6_7_5>")
				.append("<OutputName_6_7_8>" + from.getOutputName_6_7_8()
						+ "</OutputName_6_7_8>")
				.append("<OutputName_6_7_7>" + from.getOutputName_6_7_7()
						+ "</OutputName_6_7_7>")
				.append("</return>")
				.append("</OutputDataClassName_6_7:CapabilityName_6_7Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_1")
	public InputDataClassName_6_1 transformCapabilityName_6_1ToInputDataClassName_6_1(
			Element from) {

		InputDataClassName_6_1 in = new InputDataClassName_6_1();

		in.setInputName_6_1_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_2")));
		in.setInputName_6_1_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_3")));
		in.setInputName_6_1_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_4")));
		in.setInputName_6_1_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_5")));
		in.setInputName_6_1_6(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_6")));
		in.setInputName_6_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_1_1")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_2Response")
	public Element transformOutputDataClassName_6_2ToCapabilityName_6_2Response(
			OutputDataClassName_6_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_2:CapabilityName_6_2Response xmlns:OutputDataClassName_6_2=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_2_1>" + from.getOutputName_6_2_1()
						+ "</OutputName_6_2_1>")
				.append("<OutputName_6_2_7>" + from.getOutputName_6_2_7()
						+ "</OutputName_6_2_7>")
				.append("<OutputName_6_2_6>" + from.getOutputName_6_2_6()
						+ "</OutputName_6_2_6>")
				.append("<OutputName_6_2_3>" + from.getOutputName_6_2_3()
						+ "</OutputName_6_2_3>")
				.append("<OutputName_6_2_2>" + from.getOutputName_6_2_2()
						+ "</OutputName_6_2_2>")
				.append("<OutputName_6_2_5>" + from.getOutputName_6_2_5()
						+ "</OutputName_6_2_5>")
				.append("<OutputName_6_2_4>" + from.getOutputName_6_2_4()
						+ "</OutputName_6_2_4>")
				.append("</return>")
				.append("</OutputDataClassName_6_2:CapabilityName_6_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_2")
	public InputDataClassName_6_2 transformCapabilityName_6_2ToInputDataClassName_6_2(
			Element from) {

		InputDataClassName_6_2 in = new InputDataClassName_6_2();

		in.setInputName_6_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_1")));
		in.setInputName_6_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_2")));
		in.setInputName_6_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_3")));
		in.setInputName_6_2_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_4")));
		in.setInputName_6_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_5")));
		in.setInputName_6_2_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_2_6")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_3Response")
	public Element transformOutputDataClassName_6_3ToCapabilityName_6_3Response(
			OutputDataClassName_6_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_3:CapabilityName_6_3Response xmlns:OutputDataClassName_6_3=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_3_2>" + from.getOutputName_6_3_2()
						+ "</OutputName_6_3_2>")
				.append("<OutputName_6_3_1>" + from.getOutputName_6_3_1()
						+ "</OutputName_6_3_1>")
				.append("<OutputName_6_3_3>" + from.getOutputName_6_3_3()
						+ "</OutputName_6_3_3>")
				.append("</return>")
				.append("</OutputDataClassName_6_3:CapabilityName_6_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_3")
	public InputDataClassName_6_3 transformCapabilityName_6_3ToInputDataClassName_6_3(
			Element from) {

		InputDataClassName_6_3 in = new InputDataClassName_6_3();

		in.setInputName_6_3_8(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_8")));
		in.setInputName_6_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_1")));
		in.setInputName_6_3_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_2")));
		in.setInputName_6_3_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_3")));
		in.setInputName_6_3_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_4")));
		in.setInputName_6_3_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_5")));
		in.setInputName_6_3_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_6")));
		in.setInputName_6_3_7(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_3_7")));

		return in;

	}

	@Transformer(to = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_8Response")
	public Element transformOutputDataClassName_6_8ToCapabilityName_6_8Response(
			OutputDataClassName_6_8 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_6_8:CapabilityName_6_8Response xmlns:OutputDataClassName_6_8=\"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0\">")
				.append("<return>")
				.append("<OutputName_6_8_1>" + from.getOutputName_6_8_1()
						+ "</OutputName_6_8_1>")
				.append("<OutputName_6_8_3>" + from.getOutputName_6_8_3()
						+ "</OutputName_6_8_3>")
				.append("<OutputName_6_8_2>" + from.getOutputName_6_8_2()
						+ "</OutputName_6_8_2>")
				.append("<OutputName_6_8_5>" + from.getOutputName_6_8_5()
						+ "</OutputName_6_8_5>")
				.append("<OutputName_6_8_4>" + from.getOutputName_6_8_4()
						+ "</OutputName_6_8_4>")
				.append("</return>")
				.append("</OutputDataClassName_6_8:CapabilityName_6_8Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}CapabilityName_6_8")
	public InputDataClassName_6_8 transformCapabilityName_6_8ToInputDataClassName_6_8(
			Element from) {

		InputDataClassName_6_8 in = new InputDataClassName_6_8();

		in.setInputName_6_8_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_3")));
		in.setInputName_6_8_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_4")));
		in.setInputName_6_8_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_5")));
		in.setInputName_6_8_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_6")));
		in.setInputName_6_8_7(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_7")));
		in.setInputName_6_8_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_1")));
		in.setInputName_6_8_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_6_8_2")));

		return in;

	}
}
