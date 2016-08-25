package util;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CustomDOMParser {

	private Document document;
	private String xmlPath;

	public CustomDOMParser(String xmlPath) {
		this.xmlPath = xmlPath;

	}

	public void setDocumentBuilder() {
		try {
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			this.document = documentBuilder.parse(this.xmlPath);
		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (SAXException sae) {
			sae.printStackTrace();
		}
	}

	public Node addNode(Node parent, String key) {
		return addNode(parent, key, "");
	}

	public Node addNode(Node parent, String key, String value) {
		Element element = (Element) document.createElement(key);
		element.appendChild(document.createTextNode(value));
		return parent.appendChild(element);
	}

	public void writeXML() {
		// write the DOM object to the file
		try {
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(this.xmlPath));

			// System.out.println(streamResult.getOutputStream());

			// System.exit(-1);

			transformer.transform(domSource, streamResult);

			System.out.println(this.xmlPath + " was updated");

		} catch (TransformerException tfe) {
			tfe.printStackTrace();
		}
	}

	public void showPOM(String tagName) {
		Element racine = document.getDocumentElement();
		NodeList nodeList = racine.getElementsByTagName(tagName);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Element e = (Element) nodeList.item(i);
			System.out.println(e.getTextContent());
		}

	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getXmlPath() {
		return xmlPath;
	}

	public void setXmlPath(String xmlPath) {
		this.xmlPath = xmlPath;
	}

}
