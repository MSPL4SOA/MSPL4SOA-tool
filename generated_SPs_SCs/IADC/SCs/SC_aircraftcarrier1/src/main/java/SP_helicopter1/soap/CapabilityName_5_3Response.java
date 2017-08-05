package SP_helicopter1.soap;

import SP_helicopter1.output.*;
import SP_helicopter1.input.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CapabilityName_5_3Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityName_5_3Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{urn:SP_helicopter1:SP_helicopter1:1.0}outputDataClassName_5_3" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityName_5_3Response", propOrder = { "_return" })
public class CapabilityName_5_3Response {

	@XmlElement(name = "return", namespace = "urn:SP_helicopter1:SP_helicopter1:1.0")
	protected OutputDataClassName_5_3 _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link OutputDataClassName_5_3 }
	 *     
	 */
	public OutputDataClassName_5_3 getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link OutputDataClassName_5_3 }
	 *     
	 */
	public void setReturn(OutputDataClassName_5_3 value) {
		this._return = value;
	}

}
