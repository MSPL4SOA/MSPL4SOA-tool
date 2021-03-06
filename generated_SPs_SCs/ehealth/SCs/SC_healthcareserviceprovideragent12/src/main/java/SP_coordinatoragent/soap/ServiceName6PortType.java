package SP_command.soap;

import SP_command.output.*;
import SP_command.input.*;

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
 * 2017-03-24T23:26:07.877+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_command:SP_command:1.0", name = "ServiceName_6PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName6PortType {

	@WebMethod(operationName = "CapabilityName_6_4")
	@RequestWrapper(localName = "CapabilityName_6_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_4")
	@ResponseWrapper(localName = "CapabilityName_6_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_4Response")
	public Response<SP_command.soap.CapabilityName_6_4Response> capabilityName64Async();

	@WebMethod(operationName = "CapabilityName_6_4")
	@ResponseWrapper(localName = "CapabilityName_6_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_4Response")
	@RequestWrapper(localName = "CapabilityName_6_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_4")
	public Future<?> capabilityName64Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_6_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_6_4")
	@RequestWrapper(localName = "CapabilityName_6_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_4")
	@ResponseWrapper(localName = "CapabilityName_6_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_6_4 capabilityName64();

	@WebMethod(operationName = "CapabilityName_6_3")
	@RequestWrapper(localName = "CapabilityName_6_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_3")
	@ResponseWrapper(localName = "CapabilityName_6_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_3Response")
	public Response<SP_command.soap.CapabilityName_6_3Response> capabilityName63Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_3 arg0);

	@WebMethod(operationName = "CapabilityName_6_3")
	@ResponseWrapper(localName = "CapabilityName_6_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_3Response")
	@RequestWrapper(localName = "CapabilityName_6_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_3")
	public Future<?> capabilityName63Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_6_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_6_3")
	@RequestWrapper(localName = "CapabilityName_6_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_3")
	@ResponseWrapper(localName = "CapabilityName_6_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_6_3 capabilityName63(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_3 arg0);

	@WebMethod(operationName = "CapabilityName_6_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_6_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_2")
	public void capabilityName62(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_2 arg0);

	@WebMethod(operationName = "CapabilityName_6_1")
	@RequestWrapper(localName = "CapabilityName_6_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_1")
	@ResponseWrapper(localName = "CapabilityName_6_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_1Response")
	public Response<SP_command.soap.CapabilityName_6_1Response> capabilityName61Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_1 arg0);

	@WebMethod(operationName = "CapabilityName_6_1")
	@ResponseWrapper(localName = "CapabilityName_6_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_1Response")
	@RequestWrapper(localName = "CapabilityName_6_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_1")
	public Future<?> capabilityName61Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_6_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_6_1")
	@RequestWrapper(localName = "CapabilityName_6_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_1")
	@ResponseWrapper(localName = "CapabilityName_6_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_6_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_6_1 capabilityName61(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_6_1 arg0);
}
