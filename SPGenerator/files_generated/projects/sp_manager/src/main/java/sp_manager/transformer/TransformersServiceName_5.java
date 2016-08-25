package sp_manager.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import sp_manager.util.XMLSOAPTransformers;

import sp_manager.input.InputDataClassName_5_2;
import sp_manager.input.InputDataClassName_5_3;
import sp_manager.input.InputDataClassName_5_4;
import sp_manager.input.InputDataClassName_5_5;

import sp_manager.output.OutputDataClassName_5_2;
import sp_manager.output.OutputDataClassName_5_3;
import sp_manager.output.OutputDataClassName_5_4;

public final class TransformersServiceName_5 {

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_2Response")
	public Element transformOutputDataClassName_5_2ToCapabilityName_5_2Response(
			OutputDataClassName_5_2 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_2:CapabilityName_5_2Response xmlns:OutputDataClassName_5_2=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_5_2_1>" + from.getOutputName_5_2_1()
						+ "</OutputName_5_2_1>")
				.append("<OutputName_5_2_2>" + from.getOutputName_5_2_2()
						+ "</OutputName_5_2_2>")
				.append("</return>")
				.append("</OutputDataClassName_5_2:CapabilityName_5_2Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_2")
	public InputDataClassName_5_2 transformCapabilityName_5_2ToInputDataClassName_5_2(
			Element from) {

		InputDataClassName_5_2 in = new InputDataClassName_5_2();

		in.setInputName_5_2_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_1")));
		in.setInputName_5_2_2(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_2")));
		in.setInputName_5_2_3(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_3")));
		in.setInputName_5_2_4(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_2_4")));

		return in;

	}

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_3Response")
	public Element transformOutputDataClassName_5_3ToCapabilityName_5_3Response(
			OutputDataClassName_5_3 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_3:CapabilityName_5_3Response xmlns:OutputDataClassName_5_3=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_5_3_1>" + from.getOutputName_5_3_1()
						+ "</OutputName_5_3_1>")
				.append("<OutputName_5_3_2>" + from.getOutputName_5_3_2()
						+ "</OutputName_5_3_2>")
				.append("</return>")
				.append("</OutputDataClassName_5_3:CapabilityName_5_3Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_3")
	public InputDataClassName_5_3 transformCapabilityName_5_3ToInputDataClassName_5_3(
			Element from) {

		InputDataClassName_5_3 in = new InputDataClassName_5_3();

		in.setInputName_5_3_1(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_3_1")));

		return in;

	}

	@Transformer(to = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_4Response")
	public Element transformOutputDataClassName_5_4ToCapabilityName_5_4Response(
			OutputDataClassName_5_4 from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<OutputDataClassName_5_4:CapabilityName_5_4Response xmlns:OutputDataClassName_5_4=\"urn:sp_manager:sp_manager:1.0\">")
				.append("<return>")
				.append("<OutputName_5_4_1>" + from.getOutputName_5_4_1()
						+ "</OutputName_5_4_1>")
				.append("</return>")
				.append("</OutputDataClassName_5_4:CapabilityName_5_4Response>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_4")
	public InputDataClassName_5_4 transformCapabilityName_5_4ToInputDataClassName_5_4(
			Element from) {

		InputDataClassName_5_4 in = new InputDataClassName_5_4();

		in.setInputName_5_4_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_1")));
		in.setInputName_5_4_2(Integer.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_2")));
		in.setInputName_5_4_3(String.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_4_3")));

		return in;

	}

	@Transformer(from = "{urn:sp_manager:sp_manager:1.0}CapabilityName_5_5")
	public InputDataClassName_5_5 transformCapabilityName_5_5ToInputDataClassName_5_5(
			Element from) {

		InputDataClassName_5_5 in = new InputDataClassName_5_5();

		in.setInputName_5_5_1(Float.valueOf(XMLSOAPTransformers
				.getElementValue(from, "InputName_5_5_1")));

		return in;

	}

}
