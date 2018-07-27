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
 * 2017-03-24T23:20:15.133+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_command:SP_command:1.0", name = "ServiceName_7PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName7PortType {

	@WebMethod(operationName = "CapabilityName_7_3")
	@RequestWrapper(localName = "CapabilityName_7_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_3")
	@ResponseWrapper(localName = "CapabilityName_7_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_3Response")
	public Response<SP_command.soap.CapabilityName_7_3Response> capabilityName73Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_3 arg0);

	@WebMethod(operationName = "CapabilityName_7_3")
	@ResponseWrapper(localName = "CapabilityName_7_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_3Response")
	@RequestWrapper(localName = "CapabilityName_7_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_3")
	public Future<?> capabilityName73Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_7_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_7_3")
	@RequestWrapper(localName = "CapabilityName_7_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_3")
	@ResponseWrapper(localName = "CapabilityName_7_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_7_3 capabilityName73(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_3 arg0);

	@WebMethod(operationName = "CapabilityName_7_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_7_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_2")
	public void capabilityName72(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_2 arg0);

	@WebMethod(operationName = "CapabilityName_7_1")
	@RequestWrapper(localName = "CapabilityName_7_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_1")
	@ResponseWrapper(localName = "CapabilityName_7_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_1Response")
	public Response<SP_command.soap.CapabilityName_7_1Response> capabilityName71Async();

	@WebMethod(operationName = "CapabilityName_7_1")
	@ResponseWrapper(localName = "CapabilityName_7_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_1Response")
	@RequestWrapper(localName = "CapabilityName_7_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_1")
	public Future<?> capabilityName71Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_7_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_7_1")
	@RequestWrapper(localName = "CapabilityName_7_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_1")
	@ResponseWrapper(localName = "CapabilityName_7_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_7_1 capabilityName71();

	@WebMethod(operationName = "CapabilityName_7_4")
	@RequestWrapper(localName = "CapabilityName_7_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_4")
	@ResponseWrapper(localName = "CapabilityName_7_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_4Response")
	public Response<SP_command.soap.CapabilityName_7_4Response> capabilityName74Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_4 arg0);

	@WebMethod(operationName = "CapabilityName_7_4")
	@ResponseWrapper(localName = "CapabilityName_7_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_4Response")
	@RequestWrapper(localName = "CapabilityName_7_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_4")
	public Future<?> capabilityName74Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_4 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_7_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_7_4")
	@RequestWrapper(localName = "CapabilityName_7_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_4")
	@ResponseWrapper(localName = "CapabilityName_7_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_7_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_7_4 capabilityName74(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_7_4 arg0);
}
