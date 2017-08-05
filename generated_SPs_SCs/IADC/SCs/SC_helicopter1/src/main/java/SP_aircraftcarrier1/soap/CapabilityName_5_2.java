package SP_aircraftcarrier1.soap;

import SP_aircraftcarrier1.output.*;
import SP_aircraftcarrier1.input.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CapabilityName_5_2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityName_5_2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0}inputDataClassName_5_2" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityName_5_2", propOrder = { "arg0" })
public class CapabilityName_5_2 {

	@XmlElement(namespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0")
	protected InputDataClassName_5_2 arg0;

	/**
	 * Gets the value of the arg0 property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link InputDataClassName_5_2 }
	 *     
	 */
	public InputDataClassName_5_2 getArg0() {
		return arg0;
	}

	/**
	 * Sets the value of the arg0 property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link InputDataClassName_5_2 }
	 *     
	 */
	public void setArg0(InputDataClassName_5_2 value) {
		this.arg0 = value;
	}

}
