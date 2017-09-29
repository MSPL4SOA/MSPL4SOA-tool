package large3.soap;

import large3.output.*;
import large3.input.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CapabilityName_6_6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityName_6_6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{urn:large3:large3:1.0}inputDataClassName_6_6" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityName_6_6", propOrder = { "arg0" })
public class CapabilityName_6_6 {

	@XmlElement(namespace = "urn:large3:large3:1.0")
	protected InputDataClassName_6_6 arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link InputDataClassName_6_6 }
	 *     
	 */
	public InputDataClassName_6_6 getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link InputDataClassName_6_6 }
	 *     
	 */
	public void setArg0(InputDataClassName_6_6 value) {
		this.arg0 = value;
	}

}
