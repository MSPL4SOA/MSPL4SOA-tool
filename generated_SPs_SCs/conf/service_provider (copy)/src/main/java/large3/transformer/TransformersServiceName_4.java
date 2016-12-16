package large3.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import large3.util.XMLSOAPTransformers;

import large3.input.InputDataClassName_4_6;
import large3.input.InputDataClassName_4_2;
import large3.input.InputDataClassName_4_3;
import large3.input.InputDataClassName_4_5;
import large3.input.InputDataClassName_4_1;

import large3.output.OutputDataClassName_4_6;
import large3.output.OutputDataClassName_4_2;
import large3.output.OutputDataClassName_4_5;
import large3.output.OutputDataClassName_4_1;

public final class TransformersServiceName_4 {

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_4_6Response")
	public Element transformOutputDataClassName_4_6ToCapabilityName_4_6Response(
			OutputDataClassName_4_6 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_6:CapabilityName_4_6Response xmlns:OutputDataClassName_4_6=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_4_6_1>" + from.getOutputName_4_6_1()
						+ "</OutputName_4_6_1>")
				.append("<OutputName_4_6_2>" + from.getOutputName_4_6_2()
						+ "</OutputName_4_6_2>")
				.append("<OutputName_4_6_3>" + from.getOutputName_4_6_3()
						+ "</OutputName_4_6_3>")
				.append("<OutputName_4_6_4>" + from.getOutputName_4_6_4()
						+ "</OutputName_4_6_4>")
				.append("<OutputName_4_6_5>" + from.getOutputName_4_6_5()
						+ "</OutputName_4_6_5>")
				.append("</return>")
				.append("</OutputDataClassName_4_6:CapabilityName_4_6Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_4_6")
	public InputDataClassName_4_6 transformCapabilityName_4_6ToInputDataClassName_4_6(
			Element from) {

		InputDataClassName_4_6 in = new InputDataClassName_4_6();

		in.setInputName_4_6_3(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_3")));
		in.setInputName_4_6_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_4")));
		in.setInputName_4_6_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_1")));
		in.setInputName_4_6_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_6_2")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_4_2Response")
	public Element transformOutputDataClassName_4_2ToCapabilityName_4_2Response(
			OutputDataClassName_4_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_2:CapabilityName_4_2Response xmlns:OutputDataClassName_4_2=\"urn:large3:large3:1.0\">")
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

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_4_2")
	public InputDataClassName_4_2 transformCapabilityName_4_2ToInputDataClassName_4_2(
			Element from) {

		InputDataClassName_4_2 in = new InputDataClassName_4_2();

		in.setInputName_4_2_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_3")));
		in.setInputName_4_2_4(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_4")));
		in.setInputName_4_2_5(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_5")));
		in.setInputName_4_2_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_6")));
		in.setInputName_4_2_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_1")));
		in.setInputName_4_2_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_2_2")));

		return in;

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_4_3")
	public InputDataClassName_4_3 transformCapabilityName_4_3ToInputDataClassName_4_3(
			Element from) {

		InputDataClassName_4_3 in = new InputDataClassName_4_3();

		in.setInputName_4_3_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_2")));
		in.setInputName_4_3_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_3")));
		in.setInputName_4_3_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_4")));
		in.setInputName_4_3_1(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_3_1")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_4_5Response")
	public Element transformOutputDataClassName_4_5ToCapabilityName_4_5Response(
			OutputDataClassName_4_5 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_5:CapabilityName_4_5Response xmlns:OutputDataClassName_4_5=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_4_5_1>" + from.getOutputName_4_5_1()
						+ "</OutputName_4_5_1>")
				.append("<OutputName_4_5_2>" + from.getOutputName_4_5_2()
						+ "</OutputName_4_5_2>")
				.append("<OutputName_4_5_3>" + from.getOutputName_4_5_3()
						+ "</OutputName_4_5_3>")
				.append("<OutputName_4_5_4>" + from.getOutputName_4_5_4()
						+ "</OutputName_4_5_4>")
				.append("<OutputName_4_5_5>" + from.getOutputName_4_5_5()
						+ "</OutputName_4_5_5>")
				.append("</return>")
				.append("</OutputDataClassName_4_5:CapabilityName_4_5Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_4_5")
	public InputDataClassName_4_5 transformCapabilityName_4_5ToInputDataClassName_4_5(
			Element from) {

		InputDataClassName_4_5 in = new InputDataClassName_4_5();

		in.setInputName_4_5_4(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_4")));
		in.setInputName_4_5_5(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_5")));
		in.setInputName_4_5_6(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_6")));
		in.setInputName_4_5_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_1")));
		in.setInputName_4_5_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_2")));
		in.setInputName_4_5_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_5_3")));

		return in;

	}

	@Transformer(to = "{urn:large3:large3:1.0}CapabilityName_4_1Response")
	public Element transformOutputDataClassName_4_1ToCapabilityName_4_1Response(
			OutputDataClassName_4_1 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_4_1:CapabilityName_4_1Response xmlns:OutputDataClassName_4_1=\"urn:large3:large3:1.0\">")
				.append("<return>")
				.append("<OutputName_4_1_5>" + from.getOutputName_4_1_5()
						+ "</OutputName_4_1_5>")
				.append("<OutputName_4_1_6>" + from.getOutputName_4_1_6()
						+ "</OutputName_4_1_6>")
				.append("<OutputName_4_1_7>" + from.getOutputName_4_1_7()
						+ "</OutputName_4_1_7>")
				.append("<OutputName_4_1_1>" + from.getOutputName_4_1_1()
						+ "</OutputName_4_1_1>")
				.append("<OutputName_4_1_2>" + from.getOutputName_4_1_2()
						+ "</OutputName_4_1_2>")
				.append("<OutputName_4_1_3>" + from.getOutputName_4_1_3()
						+ "</OutputName_4_1_3>")
				.append("<OutputName_4_1_4>" + from.getOutputName_4_1_4()
						+ "</OutputName_4_1_4>")
				.append("</return>")
				.append("</OutputDataClassName_4_1:CapabilityName_4_1Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:large3:large3:1.0}CapabilityName_4_1")
	public InputDataClassName_4_1 transformCapabilityName_4_1ToInputDataClassName_4_1(
			Element from) {

		InputDataClassName_4_1 in = new InputDataClassName_4_1();

		in.setInputName_4_1_8(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_8")));
		in.setInputName_4_1_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_4")));
		in.setInputName_4_1_5(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_5")));
		in.setInputName_4_1_6(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_6")));
		in.setInputName_4_1_7(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_7")));
		in.setInputName_4_1_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_1")));
		in.setInputName_4_1_2(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_2")));
		in.setInputName_4_1_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_4_1_3")));

		return in;

	}
}
