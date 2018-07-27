package SP_infantry1.soap;

import SP_infantry1.output.*;
import SP_infantry1.input.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CapabilityName_1_4Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityName_1_4Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{urn:SP_infantry1:SP_infantry1:1.0}outputDataClassName_1_4" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityName_1_4Response", propOrder = { "_return" })
public class CapabilityName_1_4Response {

	@XmlElement(name = "return", namespace = "urn:SP_infantry1:SP_infantry1:1.0")
	protected OutputDataClassName_1_4 _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link OutputDataClassName_1_4 }
	 *     
	 */
	public OutputDataClassName_1_4 getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link OutputDataClassName_1_4 }
	 *     
	 */
	public void setReturn(OutputDataClassName_1_4 value) {
		this._return = value;
	}

}
