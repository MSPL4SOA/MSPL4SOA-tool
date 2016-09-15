package v2.soap;

import v2.output.*;
import v2.input.*;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-08-16T23:27:55.022+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:v2:v2:1.0", name = "ServiceName_2PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName2PortType {

	@WebMethod(operationName = "CapabilityName_2_1")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_2_1")
	public void capabilityName21(
			@WebParam(name = "arg0", targetNamespace = "urn:v2:v2:1.0") InputDataClassName_2_1 arg0);

	@WebMethod(operationName = "CapabilityName_2_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_2", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_2_2")
	public void capabilityName22();
}