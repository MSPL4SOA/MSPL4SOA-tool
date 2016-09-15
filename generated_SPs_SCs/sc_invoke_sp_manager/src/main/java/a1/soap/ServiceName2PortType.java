package a1.soap;

import a1.output.*;
import a1.input.*;

import java.util.concurrent.Future;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-08-25T23:11:11.844+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:a1:a1:1.0", name = "ServiceName_2PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName2PortType {

	@WebMethod(operationName = "CapabilityName_2_1")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_1Response")
	public Response<a1.soap.CapabilityName_2_1Response> capabilityName21Async(
			@WebParam(name = "arg0", targetNamespace = "urn:a1:a1:1.0") InputDataClassName_2_1 arg0);

	@WebMethod(operationName = "CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_1Response")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_1")
	public Future<?> capabilityName21Async(
			@WebParam(name = "arg0", targetNamespace = "urn:a1:a1:1.0") InputDataClassName_2_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<a1.soap.CapabilityName_2_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_1")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_1 capabilityName21(
			@WebParam(name = "arg0", targetNamespace = "urn:a1:a1:1.0") InputDataClassName_2_1 arg0);

	@WebMethod(operationName = "CapabilityName_2_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_2", targetNamespace = "urn:a1:a1:1.0", className = "a1.soap.CapabilityName_2_2")
	public void capabilityName22();
}