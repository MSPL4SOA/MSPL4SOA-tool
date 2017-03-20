package the1.soap;

import the1.output.*;
import the1.input.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the the1.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _InputDataClassName_1_1_QNAME = new QName(
			"urn:the1:the1:1.0", "InputDataClassName_1_1");
	private final static QName _InputDataClassName_1_2_QNAME = new QName(
			"urn:the1:the1:1.0", "InputDataClassName_1_2");
	private final static QName _OutputDataClassName_1_1_QNAME = new QName(
			"urn:the1:the1:1.0", "OutputDataClassName_1_1");
	private final static QName _CapabilityName_1_1_QNAME = new QName(
			"urn:the1:the1:1.0", "CapabilityName_1_1");
	private final static QName _CapabilityName_1_1Response_QNAME = new QName(
			"urn:the1:the1:1.0", "CapabilityName_1_1Response");
	private final static QName _CapabilityName_1_2_QNAME = new QName(
			"urn:the1:the1:1.0", "CapabilityName_1_2");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: the1.soap
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link InputDataClassName_1_1 }
	 * 
	 */
	public InputDataClassName_1_1 createInputDataClassName_1_1() {
		return new InputDataClassName_1_1();
	}

	/**
	 * Create an instance of {@link InputDataClassName_1_2 }
	 * 
	 */
	public InputDataClassName_1_2 createInputDataClassName_1_2() {
		return new InputDataClassName_1_2();
	}

	/**
	 * Create an instance of {@link OutputDataClassName_1_1 }
	 * 
	 */
	public OutputDataClassName_1_1 createOutputDataClassName_1_1() {
		return new OutputDataClassName_1_1();
	}

	/**
	 * Create an instance of {@link CapabilityName_1_1 }
	 * 
	 */
	public CapabilityName_1_1 createCapabilityName_1_1() {
		return new CapabilityName_1_1();
	}

	/**
	 * Create an instance of {@link CapabilityName_1_1Response }
	 * 
	 */
	public CapabilityName_1_1Response createCapabilityName_1_1Response() {
		return new CapabilityName_1_1Response();
	}

	/**
	 * Create an instance of {@link CapabilityName_1_2 }
	 * 
	 */
	public CapabilityName_1_2 createCapabilityName_1_2() {
		return new CapabilityName_1_2();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InputDataClassName_1_1 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:the1:the1:1.0", name = "InputDataClassName_1_1")
	public JAXBElement<InputDataClassName_1_1> createInputDataClassName_1_1(
			InputDataClassName_1_1 value) {
		return new JAXBElement<InputDataClassName_1_1>(
				_InputDataClassName_1_1_QNAME, InputDataClassName_1_1.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InputDataClassName_1_2 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:the1:the1:1.0", name = "InputDataClassName_1_2")
	public JAXBElement<InputDataClassName_1_2> createInputDataClassName_1_2(
			InputDataClassName_1_2 value) {
		return new JAXBElement<InputDataClassName_1_2>(
				_InputDataClassName_1_2_QNAME, InputDataClassName_1_2.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OutputDataClassName_1_1 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:the1:the1:1.0", name = "OutputDataClassName_1_1")
	public JAXBElement<OutputDataClassName_1_1> createOutputDataClassName_1_1(
			OutputDataClassName_1_1 value) {
		return new JAXBElement<OutputDataClassName_1_1>(
				_OutputDataClassName_1_1_QNAME, OutputDataClassName_1_1.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityName_1_1 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:the1:the1:1.0", name = "CapabilityName_1_1")
	public JAXBElement<CapabilityName_1_1> createCapabilityName_1_1(
			CapabilityName_1_1 value) {
		return new JAXBElement<CapabilityName_1_1>(_CapabilityName_1_1_QNAME,
				CapabilityName_1_1.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityName_1_1Response }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:the1:the1:1.0", name = "CapabilityName_1_1Response")
	public JAXBElement<CapabilityName_1_1Response> createCapabilityName_1_1Response(
			CapabilityName_1_1Response value) {
		return new JAXBElement<CapabilityName_1_1Response>(
				_CapabilityName_1_1Response_QNAME,
				CapabilityName_1_1Response.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityName_1_2 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:the1:the1:1.0", name = "CapabilityName_1_2")
	public JAXBElement<CapabilityName_1_2> createCapabilityName_1_2(
			CapabilityName_1_2 value) {
		return new JAXBElement<CapabilityName_1_2>(_CapabilityName_1_2_QNAME,
				CapabilityName_1_2.class, null, value);
	}

}
