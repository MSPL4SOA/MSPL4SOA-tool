package ttee.util;

import java.io.StringReader;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLSOAPTransformers {

	/**
	 * Returns the text value of a child node of parent.
	 */
	public static String getElementValue(Element parent, String elementName) {
		String value = null;
		NodeList nodes = parent.getElementsByTagName(elementName);
		if (nodes.getLength() > 0) {
			value = nodes.item(0).getChildNodes().item(0).getNodeValue();
		}
		return value;
	}

	public static Element toElement(String xml) {
		DOMResult dom = new DOMResult();
		try {
			TransformerFactory.newInstance().newTransformer()
					.transform(new StreamSource(new StringReader(xml)), dom);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return ((Document) dom.getNode()).getDocumentElement();
	}
}
