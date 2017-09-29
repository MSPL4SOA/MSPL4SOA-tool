package SP_helicopter1.soap;

import SP_helicopter1.output.*;
import SP_helicopter1.input.*;

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
 * 2017-06-11T03:12:05.009+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", name = "ServiceName_3PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName3PortType {

	@WebMethod(operationName = "CapabilityName_3_4")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_4Response")
	public Response<SP_helicopter1.soap.CapabilityName_3_4Response> capabilityName34Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_4 arg0);

	@WebMethod(operationName = "CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_4Response")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_4")
	public Future<?> capabilityName34Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_4 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_3_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_4")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_4 capabilityName34(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_4 arg0);

	@WebMethod(operationName = "CapabilityName_3_5")
	@RequestWrapper(localName = "CapabilityName_3_5", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_5")
	@ResponseWrapper(localName = "CapabilityName_3_5Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_5Response")
	public Response<SP_helicopter1.soap.CapabilityName_3_5Response> capabilityName35Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_5 arg0);

	@WebMethod(operationName = "CapabilityName_3_5")
	@ResponseWrapper(localName = "CapabilityName_3_5Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_5Response")
	@RequestWrapper(localName = "CapabilityName_3_5", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_5")
	public Future<?> capabilityName35Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_5 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_3_5Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_5")
	@RequestWrapper(localName = "CapabilityName_3_5", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_5")
	@ResponseWrapper(localName = "CapabilityName_3_5Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_5Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_5 capabilityName35(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_5 arg0);

	@WebMethod(operationName = "CapabilityName_3_2")
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_2")
	@ResponseWrapper(localName = "CapabilityName_3_2Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_2Response")
	public Response<SP_helicopter1.soap.CapabilityName_3_2Response> capabilityName32Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_2 arg0);

	@WebMethod(operationName = "CapabilityName_3_2")
	@ResponseWrapper(localName = "CapabilityName_3_2Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_2Response")
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_2")
	public Future<?> capabilityName32Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_2 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_3_2Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_2")
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_2")
	@ResponseWrapper(localName = "CapabilityName_3_2Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_2Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_2 capabilityName32(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_2 arg0);

	@WebMethod(operationName = "CapabilityName_3_3")
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_3")
	@ResponseWrapper(localName = "CapabilityName_3_3Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_3Response")
	public Response<SP_helicopter1.soap.CapabilityName_3_3Response> capabilityName33Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_3 arg0);

	@WebMethod(operationName = "CapabilityName_3_3")
	@ResponseWrapper(localName = "CapabilityName_3_3Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_3Response")
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_3")
	public Future<?> capabilityName33Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_3_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_3")
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_3")
	@ResponseWrapper(localName = "CapabilityName_3_3Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_3 capabilityName33(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_3 arg0);

	@WebMethod(operationName = "CapabilityName_3_1")
	@RequestWrapper(localName = "CapabilityName_3_1", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_1")
	@ResponseWrapper(localName = "CapabilityName_3_1Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_1Response")
	public Response<SP_helicopter1.soap.CapabilityName_3_1Response> capabilityName31Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_1 arg0);

	@WebMethod(operationName = "CapabilityName_3_1")
	@ResponseWrapper(localName = "CapabilityName_3_1Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_1Response")
	@RequestWrapper(localName = "CapabilityName_3_1", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_1")
	public Future<?> capabilityName31Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_helicopter1.soap.CapabilityName_3_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_1")
	@RequestWrapper(localName = "CapabilityName_3_1", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_1")
	@ResponseWrapper(localName = "CapabilityName_3_1Response", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0", className = "SP_helicopter1.soap.CapabilityName_3_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_1 capabilityName31(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_helicopter1:SP_helicopter1:1.0") InputDataClassName_3_1 arg0);
}