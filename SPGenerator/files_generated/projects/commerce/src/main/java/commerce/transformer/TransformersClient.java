package commerce.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import commerce.util.XMLSOAPTransformers;

import commerce.input.InformationToUpdate;

import commerce.output.ConnectionStatus;
import commerce.output.UpdateStatus;

public final class TransformersClient {

	@Transformer(to = "{urn:commerce:commerce:1.0}connectProfileResponse")
	public Element transformConnectionStatusToconnectProfileResponse(
			ConnectionStatus from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<ConnectionStatus:connectProfileResponse xmlns:ConnectionStatus=\"urn:commerce:commerce:1.0\">")
				.append("<return>")
				.append("<status>" + from.getStatus() + "</status>")
				.append("</return>")
				.append("</ConnectionStatus:connectProfileResponse>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(to = "{urn:commerce:commerce:1.0}updateProfileResponse")
	public Element transformUpdateStatusToupdateProfileResponse(
			UpdateStatus from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<UpdateStatus:updateProfileResponse xmlns:UpdateStatus=\"urn:commerce:commerce:1.0\">")
				.append("<return>")
				.append("<status>" + from.getStatus() + "</status>")
				.append("</return>")
				.append("</UpdateStatus:updateProfileResponse>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:commerce:commerce:1.0}updateProfile")
	public InformationToUpdate transformupdateProfileToInformationToUpdate(
			Element from) {

		InformationToUpdate in = new InformationToUpdate();

		in.setAge(Integer.valueOf(XMLSOAPTransformers.getElementValue(from,
				"age")));
		in.setAddress(String.valueOf(XMLSOAPTransformers.getElementValue(from,
				"address")));

		return in;

	}
}
