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
 * 2017-03-24T21:04:48.649+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_command:SP_command:1.0", name = "ServiceName_3PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName3PortType {

	@WebMethod(operationName = "CapabilityName_3_6")
	@RequestWrapper(localName = "CapabilityName_3_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_6")
	@ResponseWrapper(localName = "CapabilityName_3_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_6Response")
	public Response<SP_command.soap.CapabilityName_3_6Response> capabilityName36Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_6 arg0);

	@WebMethod(operationName = "CapabilityName_3_6")
	@ResponseWrapper(localName = "CapabilityName_3_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_6Response")
	@RequestWrapper(localName = "CapabilityName_3_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_6")
	public Future<?> capabilityName36Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_6 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_3_6Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_6")
	@RequestWrapper(localName = "CapabilityName_3_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_6")
	@ResponseWrapper(localName = "CapabilityName_3_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_6Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_6 capabilityName36(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_6 arg0);

	@WebMethod(operationName = "CapabilityName_3_5")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_5", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_5")
	public void capabilityName35();

	@WebMethod(operationName = "CapabilityName_3_4")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_4Response")
	public Response<SP_command.soap.CapabilityName_3_4Response> capabilityName34Async();

	@WebMethod(operationName = "CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_4Response")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_4")
	public Future<?> capabilityName34Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_3_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_4")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_4 capabilityName34();

	@WebMethod(operationName = "CapabilityName_3_3")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_3")
	public void capabilityName33(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_3 arg0);

	@WebMethod(operationName = "CapabilityName_3_2")
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_2")
	@ResponseWrapper(localName = "CapabilityName_3_2Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_2Response")
	public Response<SP_command.soap.CapabilityName_3_2Response> capabilityName32Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_2 arg0);

	@WebMethod(operationName = "CapabilityName_3_2")
	@ResponseWrapper(localName = "CapabilityName_3_2Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_2Response")
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_2")
	public Future<?> capabilityName32Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_2 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_3_2Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_2")
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_2")
	@ResponseWrapper(localName = "CapabilityName_3_2Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_2Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_2 capabilityName32(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_2 arg0);

	@WebMethod(operationName = "CapabilityName_3_1")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_3_1")
	public void capabilityName31(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_3_1 arg0);
}
