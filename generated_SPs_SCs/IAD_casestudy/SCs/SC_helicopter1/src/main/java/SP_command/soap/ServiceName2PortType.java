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
 * 2017-03-24T01:40:12.235+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_command:SP_command:1.0", name = "ServiceName_2PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName2PortType {

	@WebMethod(operationName = "CapabilityName_2_6")
	@RequestWrapper(localName = "CapabilityName_2_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_6")
	@ResponseWrapper(localName = "CapabilityName_2_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_6Response")
	public Response<SP_command.soap.CapabilityName_2_6Response> capabilityName26Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_6 arg0);

	@WebMethod(operationName = "CapabilityName_2_6")
	@ResponseWrapper(localName = "CapabilityName_2_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_6Response")
	@RequestWrapper(localName = "CapabilityName_2_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_6")
	public Future<?> capabilityName26Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_6 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_2_6Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_6")
	@RequestWrapper(localName = "CapabilityName_2_6", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_6")
	@ResponseWrapper(localName = "CapabilityName_2_6Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_6Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_6 capabilityName26(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_6 arg0);

	@WebMethod(operationName = "CapabilityName_2_5")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_5", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_5")
	public void capabilityName25();

	@WebMethod(operationName = "CapabilityName_2_4")
	@RequestWrapper(localName = "CapabilityName_2_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_4")
	@ResponseWrapper(localName = "CapabilityName_2_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_4Response")
	public Response<SP_command.soap.CapabilityName_2_4Response> capabilityName24Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_4 arg0);

	@WebMethod(operationName = "CapabilityName_2_4")
	@ResponseWrapper(localName = "CapabilityName_2_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_4Response")
	@RequestWrapper(localName = "CapabilityName_2_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_4")
	public Future<?> capabilityName24Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_4 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_2_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_4")
	@RequestWrapper(localName = "CapabilityName_2_4", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_4")
	@ResponseWrapper(localName = "CapabilityName_2_4Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_4 capabilityName24(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_4 arg0);

	@WebMethod(operationName = "CapabilityName_2_3")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_3", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_3")
	public void capabilityName23();

	@WebMethod(operationName = "CapabilityName_2_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_2", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_2")
	public void capabilityName22();

	@WebMethod(operationName = "CapabilityName_2_1")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_1Response")
	public Response<SP_command.soap.CapabilityName_2_1Response> capabilityName21Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_1 arg0);

	@WebMethod(operationName = "CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_1Response")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_1")
	public Future<?> capabilityName21Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_command.soap.CapabilityName_2_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_1")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:SP_command:SP_command:1.0", className = "SP_command.soap.CapabilityName_2_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_1 capabilityName21(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_command:SP_command:1.0") InputDataClassName_2_1 arg0);
}
