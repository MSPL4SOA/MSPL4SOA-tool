package large3.soap;

import large3.output.*;
import large3.input.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CapabilityName_5_1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityName_5_1Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{urn:large3:large3:1.0}outputDataClassName_5_1" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityName_5_1Response", propOrder = { "_return" })
public class CapabilityName_5_1Response {

	@XmlElement(name = "return", namespace = "urn:large3:large3:1.0")
	protected OutputDataClassName_5_1 _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link OutputDataClassName_5_1 }
	 *     
	 */
	public OutputDataClassName_5_1 getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link OutputDataClassName_5_1 }
	 *     
	 */
	public void setReturn(OutputDataClassName_5_1 value) {
		this._return = value;
	}

}
