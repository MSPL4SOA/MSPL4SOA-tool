package SP_aircraftcarrier1.soap;

import SP_aircraftcarrier1.output.*;
import SP_aircraftcarrier1.input.*;

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
 * 2017-06-11T03:38:52.026+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", name = "ServiceName_2PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName2PortType {

	@WebMethod(operationName = "CapabilityName_2_5")
	@RequestWrapper(localName = "CapabilityName_2_5", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_5")
	@ResponseWrapper(localName = "CapabilityName_2_5Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_5Response")
	public Response<SP_aircraftcarrier1.soap.CapabilityName_2_5Response> capabilityName25Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_5 arg0);

	@WebMethod(operationName = "CapabilityName_2_5")
	@ResponseWrapper(localName = "CapabilityName_2_5Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_5Response")
	@RequestWrapper(localName = "CapabilityName_2_5", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_5")
	public Future<?> capabilityName25Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_5 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_aircraftcarrier1.soap.CapabilityName_2_5Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_5")
	@RequestWrapper(localName = "CapabilityName_2_5", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_5")
	@ResponseWrapper(localName = "CapabilityName_2_5Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_5Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_5 capabilityName25(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_5 arg0);

	@WebMethod(operationName = "CapabilityName_2_4")
	@RequestWrapper(localName = "CapabilityName_2_4", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_4")
	@ResponseWrapper(localName = "CapabilityName_2_4Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_4Response")
	public Response<SP_aircraftcarrier1.soap.CapabilityName_2_4Response> capabilityName24Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_4 arg0);

	@WebMethod(operationName = "CapabilityName_2_4")
	@ResponseWrapper(localName = "CapabilityName_2_4Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_4Response")
	@RequestWrapper(localName = "CapabilityName_2_4", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_4")
	public Future<?> capabilityName24Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_4 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_aircraftcarrier1.soap.CapabilityName_2_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_4")
	@RequestWrapper(localName = "CapabilityName_2_4", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_4")
	@ResponseWrapper(localName = "CapabilityName_2_4Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_4 capabilityName24(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_4 arg0);

	@WebMethod(operationName = "CapabilityName_2_3")
	@RequestWrapper(localName = "CapabilityName_2_3", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_3")
	@ResponseWrapper(localName = "CapabilityName_2_3Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_3Response")
	public Response<SP_aircraftcarrier1.soap.CapabilityName_2_3Response> capabilityName23Async();

	@WebMethod(operationName = "CapabilityName_2_3")
	@ResponseWrapper(localName = "CapabilityName_2_3Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_3Response")
	@RequestWrapper(localName = "CapabilityName_2_3", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_3")
	public Future<?> capabilityName23Async(
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_aircraftcarrier1.soap.CapabilityName_2_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_3")
	@RequestWrapper(localName = "CapabilityName_2_3", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_3")
	@ResponseWrapper(localName = "CapabilityName_2_3Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_3 capabilityName23();

	@WebMethod(operationName = "CapabilityName_2_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_2_2", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_2")
	public void capabilityName22(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_2 arg0);

	@WebMethod(operationName = "CapabilityName_2_1")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_1Response")
	public Response<SP_aircraftcarrier1.soap.CapabilityName_2_1Response> capabilityName21Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_1 arg0);

	@WebMethod(operationName = "CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_1Response")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_1")
	public Future<?> capabilityName21Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_aircraftcarrier1.soap.CapabilityName_2_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_2_1")
	@RequestWrapper(localName = "CapabilityName_2_1", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_1")
	@ResponseWrapper(localName = "CapabilityName_2_1Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_2_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_2_1 capabilityName21(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_2_1 arg0);
}
