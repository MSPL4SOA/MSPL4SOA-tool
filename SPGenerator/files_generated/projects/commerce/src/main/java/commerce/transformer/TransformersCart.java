package commerce.transformer;

import org.switchyard.annotations.Transformer;
import org.w3c.dom.Element;

import commerce.util.XMLSOAPTransformers;

import commerce.input.InputProduct;
import commerce.input.Order;

import commerce.output.RequiredProduct;

public final class TransformersCart {

	@Transformer(from = "{urn:commerce:commerce:1.0}addProduct")
	public InputProduct transformaddProductToInputProduct(Element from) {

		InputProduct in = new InputProduct();

		in.setId(String.valueOf(XMLSOAPTransformers.getElementValue(from, "id")));
		in.setName(String.valueOf(XMLSOAPTransformers.getElementValue(from,
				"name")));
		in.setQte(Integer.valueOf(XMLSOAPTransformers.getElementValue(from,
				"qte")));

		return in;

	}

	@Transformer(to = "{urn:commerce:commerce:1.0}getProductResponse")
	public Element transformRequiredProductTogetProductResponse(
			RequiredProduct from) {

		StringBuffer resultXml = new StringBuffer()
				.append("<RequiredProduct:getProductResponse xmlns:RequiredProduct=\"urn:commerce:commerce:1.0\">")
				.append("<return>").append("<id>" + from.getId() + "</id>")
				.append("<name>" + from.getName() + "</name>")
				.append("</return>")
				.append("</RequiredProduct:getProductResponse>");

		return XMLSOAPTransformers.toElement(resultXml.toString());

	}

	@Transformer(from = "{urn:commerce:commerce:1.0}getProduct")
	public Order transformgetProductToOrder(Element from) {

		Order in = new Order();

		in.setId(String.valueOf(XMLSOAPTransformers.getElementValue(from, "id")));

		return in;

	}
}
