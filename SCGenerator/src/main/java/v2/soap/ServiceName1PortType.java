package v2.soap;

import v2.output.*;
import v2.input.*;

import java.util.concurrent.Future;
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
 * 2016-08-19T15:34:24.130+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:v2:v2:1.0", name = "ServiceName_1PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName1PortType {

	@WebMethod(operationName = "CapabilityName_1_2")
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_2")
	@ResponseWrapper(localName = "CapabilityName_1_2Response", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_2Response")
	public Response<v2.soap.CapabilityName_1_2Response> capabilityName12Async();

	@WebMethod(operationName = "CapabilityName_1_2")
	@ResponseWrapper(localName = "CapabilityName_1_2Response", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_2Response")
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_2")
	public Future<?> capabilityName12Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<v2.soap.CapabilityName_1_2Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_2")
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_2")
	@ResponseWrapper(localName = "CapabilityName_1_2Response", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_2Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_2 capabilityName12();

	@WebMethod(operationName = "CapabilityName_1_1")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_1Response")
	public Response<v2.soap.CapabilityName_1_1Response> capabilityName11Async(
			@WebParam(name = "arg0", targetNamespace = "urn:v2:v2:1.0") InputDataClassName_1_1 arg0);

	@WebMethod(operationName = "CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_1Response")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_1")
	public Future<?> capabilityName11Async(
			@WebParam(name = "arg0", targetNamespace = "urn:v2:v2:1.0") InputDataClassName_1_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<v2.soap.CapabilityName_1_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_1")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:v2:v2:1.0", className = "v2.soap.CapabilityName_1_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_1 capabilityName11(
			@WebParam(name = "arg0", targetNamespace = "urn:v2:v2:1.0") InputDataClassName_1_1 arg0);
}
