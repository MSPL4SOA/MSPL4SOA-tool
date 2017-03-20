package the1.soap;

import the1.output.*;
import the1.input.*;

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
 * 2017-03-20T16:37:08.422+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:the1:the1:1.0", name = "ServiceName_1PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName1PortType {

	@WebMethod(operationName = "CapabilityName_1_1")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_1Response")
	public Response<the1.soap.CapabilityName_1_1Response> capabilityName11Async(
			@WebParam(name = "arg0", targetNamespace = "urn:the1:the1:1.0") InputDataClassName_1_1 arg0);

	@WebMethod(operationName = "CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_1Response")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_1")
	public Future<?> capabilityName11Async(
			@WebParam(name = "arg0", targetNamespace = "urn:the1:the1:1.0") InputDataClassName_1_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<the1.soap.CapabilityName_1_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_1")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_1 capabilityName11(
			@WebParam(name = "arg0", targetNamespace = "urn:the1:the1:1.0") InputDataClassName_1_1 arg0);

	@WebMethod(operationName = "CapabilityName_1_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:the1:the1:1.0", className = "the1.soap.CapabilityName_1_2")
	public void capabilityName12(
			@WebParam(name = "arg0", targetNamespace = "urn:the1:the1:1.0") InputDataClassName_1_2 arg0);
}