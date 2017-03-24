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
 * 2017-03-24T01:40:11.213+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_command:SP_command:1.0", name = "ServiceName_4PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName4PortType {

	@WebMethod(operationName = "CapabilityName_4_6")
	@RequestWrapper(localName = "CapabilityName_4_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_6")
	@ResponseWrapper(localName = "CapabilityName_4_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_6Response")
	public Response<SP_command.soap.CapabilityName_4_6Response> capabilityName46Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_6 arg0);

	@WebMethod(operationName = "CapabilityName_4_6")
	@ResponseWrapper(localName = "CapabilityName_4_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_6Response")
	@RequestWrapper(localName = "CapabilityName_4_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_6")
	public Future<?> capabilityName46Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_6 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_4_6Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_6")
	@RequestWrapper(localName = "CapabilityName_4_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_6")
	@ResponseWrapper(localName = "CapabilityName_4_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_6Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_6 capabilityName46(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_6 arg0);

	@WebMethod(operationName = "CapabilityName_4_5")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_4_5", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_5")
	public void capabilityName45(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_5 arg0);

	@WebMethod(operationName = "CapabilityName_4_4")
	@RequestWrapper(localName = "CapabilityName_4_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_4")
	@ResponseWrapper(localName = "CapabilityName_4_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_4Response")
	public Response<SP_command.soap.CapabilityName_4_4Response> capabilityName44Async();

	@WebMethod(operationName = "CapabilityName_4_4")
	@ResponseWrapper(localName = "CapabilityName_4_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_4Response")
	@RequestWrapper(localName = "CapabilityName_4_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_4")
	public Future<?> capabilityName44Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_4_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_4")
	@RequestWrapper(localName = "CapabilityName_4_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_4")
	@ResponseWrapper(localName = "CapabilityName_4_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_4 capabilityName44();

	@WebMethod(operationName = "CapabilityName_4_3")
	@RequestWrapper(localName = "CapabilityName_4_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_3")
	@ResponseWrapper(localName = "CapabilityName_4_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_3Response")
	public Response<SP_command.soap.CapabilityName_4_3Response> capabilityName43Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_3 arg0);

	@WebMethod(operationName = "CapabilityName_4_3")
	@ResponseWrapper(localName = "CapabilityName_4_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_3Response")
	@RequestWrapper(localName = "CapabilityName_4_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_3")
	public Future<?> capabilityName43Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_4_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_3")
	@RequestWrapper(localName = "CapabilityName_4_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_3")
	@ResponseWrapper(localName = "CapabilityName_4_3Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_3 capabilityName43(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_3 arg0);

	@WebMethod(operationName = "CapabilityName_4_2")
	@RequestWrapper(localName = "CapabilityName_4_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_2")
	@ResponseWrapper(localName = "CapabilityName_4_2Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_2Response")
	public Response<SP_command.soap.CapabilityName_4_2Response> capabilityName42Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_2 arg0);

	@WebMethod(operationName = "CapabilityName_4_2")
	@ResponseWrapper(localName = "CapabilityName_4_2Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_2Response")
	@RequestWrapper(localName = "CapabilityName_4_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_2")
	public Future<?> capabilityName42Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_2 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_4_2Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_2")
	@RequestWrapper(localName = "CapabilityName_4_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_2")
	@ResponseWrapper(localName = "CapabilityName_4_2Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_2Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_2 capabilityName42(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_2 arg0);

	@WebMethod(operationName = "CapabilityName_4_1")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_4_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_4_1")
	public void capabilityName41(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_4_1 arg0);
}
