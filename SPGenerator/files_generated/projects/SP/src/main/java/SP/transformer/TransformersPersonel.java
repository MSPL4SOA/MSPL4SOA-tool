package SP.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import SP.util.XMLSOAPTransformers;

import SP.input.Session;

import SP.output.SessionResponse;

public final class TransformersPersonel {

	@Transformer(to = "{urn:SP:SP:1.0}loginResponse")
	public Element transformSessionResponseTologinResponse(SessionResponse from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<SessionResponse:loginResponse xmlns:SessionResponse=\"urn:SP:SP:1.0\">")
				.append("<return>").append("<ok>" + from.getOk() + "</ok>")
				.append("</return>").append("</SessionResponse:loginResponse>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:SP:SP:1.0}login")
	public Session transformloginToSession(Element from) {

		Session in = new Session();

		in.setId(String.valueOf(XMLSOAPTransformers.getElementValue(from, "id")));

		return in;

	}
}
