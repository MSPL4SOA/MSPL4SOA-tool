package sp_manager.soap;

import sp_manager.output.*;
import sp_manager.input.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CapabilityName_7_4Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapabilityName_7_4Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{urn:sp_manager:sp_manager:1.0}outputDataClassName_7_4" minOccurs="0" form="qualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilityName_7_4Response", propOrder = { "_return" })
public class CapabilityName_7_4Response {

	@XmlElement(name = "return", namespace = "urn:sp_manager:sp_manager:1.0")
	protected OutputDataClassName_7_4 _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link OutputDataClassName_7_4 }
	 *     
	 */
	public OutputDataClassName_7_4 getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *     allowed object is
	 *     {@link OutputDataClassName_7_4 }
	 *     
	 */
	public void setReturn(OutputDataClassName_7_4 value) {
		this._return = value;
	}

}
