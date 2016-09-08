package a1.soap;

import a1.output.*;
import a1.input.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the a1.soap package. 
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

	private final static QName _InputDataClassName_2_1_QNAME = new QName(
			"urn:a1:a1:1.0", "InputDataClassName_2_1");
	private final static QName _OutputDataClassName_2_1_QNAME = new QName(
			"urn:a1:a1:1.0", "OutputDataClassName_2_1");
	private final static QName _CapabilityName_2_1_QNAME = new QName(
			"urn:a1:a1:1.0", "CapabilityName_2_1");
	private final static QName _CapabilityName_2_1Response_QNAME = new QName(
			"urn:a1:a1:1.0", "CapabilityName_2_1Response");
	private final static QName _CapabilityName_2_2_QNAME = new QName(
			"urn:a1:a1:1.0", "CapabilityName_2_2");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: a1.soap
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link InputDataClassName_2_1 }
	 * 
	 */
	public InputDataClassName_2_1 createInputDataClassName_2_1() {
		return new InputDataClassName_2_1();
	}

	/**
	 * Create an instance of {@link OutputDataClassName_2_1 }
	 * 
	 */
	public OutputDataClassName_2_1 createOutputDataClassName_2_1() {
		return new OutputDataClassName_2_1();
	}

	/**
	 * Create an instance of {@link CapabilityName_2_1 }
	 * 
	 */
	public CapabilityName_2_1 createCapabilityName_2_1() {
		return new CapabilityName_2_1();
	}

	/**
	 * Create an instance of {@link CapabilityName_2_1Response }
	 * 
	 */
	public CapabilityName_2_1Response createCapabilityName_2_1Response() {
		return new CapabilityName_2_1Response();
	}

	/**
	 * Create an instance of {@link CapabilityName_2_2 }
	 * 
	 */
	public CapabilityName_2_2 createCapabilityName_2_2() {
		return new CapabilityName_2_2();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InputDataClassName_2_1 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:a1:a1:1.0", name = "InputDataClassName_2_1")
	public JAXBElement<InputDataClassName_2_1> createInputDataClassName_2_1(
			InputDataClassName_2_1 value) {
		return new JAXBElement<InputDataClassName_2_1>(
				_InputDataClassName_2_1_QNAME, InputDataClassName_2_1.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link OutputDataClassName_2_1 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:a1:a1:1.0", name = "OutputDataClassName_2_1")
	public JAXBElement<OutputDataClassName_2_1> createOutputDataClassName_2_1(
			OutputDataClassName_2_1 value) {
		return new JAXBElement<OutputDataClassName_2_1>(
				_OutputDataClassName_2_1_QNAME, OutputDataClassName_2_1.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityName_2_1 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:a1:a1:1.0", name = "CapabilityName_2_1")
	public JAXBElement<CapabilityName_2_1> createCapabilityName_2_1(
			CapabilityName_2_1 value) {
		return new JAXBElement<CapabilityName_2_1>(_CapabilityName_2_1_QNAME,
				CapabilityName_2_1.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityName_2_1Response }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:a1:a1:1.0", name = "CapabilityName_2_1Response")
	public JAXBElement<CapabilityName_2_1Response> createCapabilityName_2_1Response(
			CapabilityName_2_1Response value) {
		return new JAXBElement<CapabilityName_2_1Response>(
				_CapabilityName_2_1Response_QNAME,
				CapabilityName_2_1Response.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CapabilityName_2_2 }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "urn:a1:a1:1.0", name = "CapabilityName_2_2")
	public JAXBElement<CapabilityName_2_2> createCapabilityName_2_2(
			CapabilityName_2_2 value) {
		return new JAXBElement<CapabilityName_2_2>(_CapabilityName_2_2_QNAME,
				CapabilityName_2_2.class, null, value);
	}

}
