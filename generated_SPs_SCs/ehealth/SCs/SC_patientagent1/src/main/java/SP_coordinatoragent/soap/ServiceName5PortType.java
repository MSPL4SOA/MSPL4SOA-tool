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
 * 2017-03-24T20:21:08.167+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_command:SP_command:1.0", name = "ServiceName_5PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName5PortType {

	@WebMethod(operationName = "CapabilityName_5_6")
	@RequestWrapper(localName = "CapabilityName_5_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_6")
	@ResponseWrapper(localName = "CapabilityName_5_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_6Response")
	public Response<SP_command.soap.CapabilityName_5_6Response> capabilityName56Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_6 arg0);

	@WebMethod(operationName = "CapabilityName_5_6")
	@ResponseWrapper(localName = "CapabilityName_5_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_6Response")
	@RequestWrapper(localName = "CapabilityName_5_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_6")
	public Future<?> capabilityName56Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_6 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_5_6Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_5_6")
	@RequestWrapper(localName = "CapabilityName_5_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_6")
	@ResponseWrapper(localName = "CapabilityName_5_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_6Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_5_6 capabilityName56(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_6 arg0);

	@WebMethod(operationName = "CapabilityName_5_5")
	@RequestWrapper(localName = "CapabilityName_5_5", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_5")
	@ResponseWrapper(localName = "CapabilityName_5_5Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_5Response")
	public Response<SP_command.soap.CapabilityName_5_5Response> capabilityName55Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_5 arg0);

	@WebMethod(operationName = "CapabilityName_5_5")
	@ResponseWrapper(localName = "CapabilityName_5_5Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_5Response")
	@RequestWrapper(localName = "CapabilityName_5_5", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_5")
	public Future<?> capabilityName55Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_5 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_5_5Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_5_5")
	@RequestWrapper(localName = "CapabilityName_5_5", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_5")
	@ResponseWrapper(localName = "CapabilityName_5_5Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_5Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_5_5 capabilityName55(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_5 arg0);

	@WebMethod(operationName = "CapabilityName_5_4")
	@RequestWrapper(localName = "CapabilityName_5_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_4")
	@ResponseWrapper(localName = "CapabilityName_5_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_4Response")
	public Response<SP_command.soap.CapabilityName_5_4Response> capabilityName54Async();

	@WebMethod(operationName = "CapabilityName_5_4")
	@ResponseWrapper(localName = "CapabilityName_5_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_4Response")
	@RequestWrapper(localName = "CapabilityName_5_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_4")
	public Future<?> capabilityName54Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_5_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_5_4")
	@RequestWrapper(localName = "CapabilityName_5_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_4")
	@ResponseWrapper(localName = "CapabilityName_5_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_5_4 capabilityName54();

	@WebMethod(operationName = "CapabilityName_5_3")
	@RequestWrapper(localName = "CapabilityName_5_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_3")
	@ResponseWrapper(localName = "CapabilityName_5_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_3Response")
	public Response<SP_command.soap.CapabilityName_5_3Response> capabilityName53Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_3 arg0);

	@WebMethod(operationName = "CapabilityName_5_3")
	@ResponseWrapper(localName = "CapabilityName_5_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_3Response")
	@RequestWrapper(localName = "CapabilityName_5_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_3")
	public Future<?> capabilityName53Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_5_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_5_3")
	@RequestWrapper(localName = "CapabilityName_5_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_3")
	@ResponseWrapper(localName = "CapabilityName_5_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_5_3 capabilityName53(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_3 arg0);

	@WebMethod(operationName = "CapabilityName_5_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_5_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_2")
	public void capabilityName52(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_2 arg0);

	@WebMethod(operationName = "CapabilityName_5_1")
	@RequestWrapper(localName = "CapabilityName_5_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_1")
	@ResponseWrapper(localName = "CapabilityName_5_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_1Response")
	public Response<SP_command.soap.CapabilityName_5_1Response> capabilityName51Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_1 arg0);

	@WebMethod(operationName = "CapabilityName_5_1")
	@ResponseWrapper(localName = "CapabilityName_5_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_1Response")
	@RequestWrapper(localName = "CapabilityName_5_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_1")
	public Future<?> capabilityName51Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_5_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_5_1")
	@RequestWrapper(localName = "CapabilityName_5_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_1")
	@ResponseWrapper(localName = "CapabilityName_5_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_5_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_5_1 capabilityName51(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_5_1 arg0);
}
