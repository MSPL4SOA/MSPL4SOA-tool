package SP_helicopter1.soap;

import SP_helicopter1.output.*;
import SP_helicopter1.input.*;

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
 * 2017-06-11T03:42:35.472+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", name = "ServiceName_1PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName1PortType {

	@WebMethod(operationName = "CapabilityName_1_1")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_1Response")
	public Response<SP_helicopter1.soap.CapabilityName_1_1Response> capabilityName11Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_1 arg0);

	@WebMethod(operationName = "CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_1Response")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_1")
	public Future<?> capabilityName11Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_1_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_1")
	@RequestWrapper(localName = "CapabilityName_1_1", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_1")
	@ResponseWrapper(localName = "CapabilityName_1_1Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_1 capabilityName11(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_1 arg0);

	@WebMethod(operationName = "CapabilityName_1_4")
	@RequestWrapper(localName = "CapabilityName_1_4", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_4")
	@ResponseWrapper(localName = "CapabilityName_1_4Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_4Response")
	public Response<SP_helicopter1.soap.CapabilityName_1_4Response> capabilityName14Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_4 arg0);

	@WebMethod(operationName = "CapabilityName_1_4")
	@ResponseWrapper(localName = "CapabilityName_1_4Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_4Response")
	@RequestWrapper(localName = "CapabilityName_1_4", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_4")
	public Future<?> capabilityName14Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_4 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_1_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_4")
	@RequestWrapper(localName = "CapabilityName_1_4", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_4")
	@ResponseWrapper(localName = "CapabilityName_1_4Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_4 capabilityName14(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_4 arg0);

	@WebMethod(operationName = "CapabilityName_1_5")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_1_5", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_5")
	public void capabilityName15(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_5 arg0);

	@WebMethod(operationName = "CapabilityName_1_2")
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_2")
	@ResponseWrapper(localName = "CapabilityName_1_2Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_2Response")
	public Response<SP_helicopter1.soap.CapabilityName_1_2Response> capabilityName12Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_2 arg0);

	@WebMethod(operationName = "CapabilityName_1_2")
	@ResponseWrapper(localName = "CapabilityName_1_2Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_2Response")
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_2")
	public Future<?> capabilityName12Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_2 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_1_2Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_2")
	@RequestWrapper(localName = "CapabilityName_1_2", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_2")
	@ResponseWrapper(localName = "CapabilityName_1_2Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_2Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_2 capabilityName12(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_2 arg0);

	@WebMethod(operationName = "CapabilityName_1_3")
	@RequestWrapper(localName = "CapabilityName_1_3", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_3")
	@ResponseWrapper(localName = "CapabilityName_1_3Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_3Response")
	public Response<SP_helicopter1.soap.CapabilityName_1_3Response> capabilityName13Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_3 arg0);

	@WebMethod(operationName = "CapabilityName_1_3")
	@ResponseWrapper(localName = "CapabilityName_1_3Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_3Response")
	@RequestWrapper(localName = "CapabilityName_1_3", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_3")
	public Future<?> capabilityName13Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_1_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_1_3")
	@RequestWrapper(localName = "CapabilityName_1_3", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_3")
	@ResponseWrapper(localName = "CapabilityName_1_3Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_1_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_1_3 capabilityName13(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_1_3 arg0);
}
