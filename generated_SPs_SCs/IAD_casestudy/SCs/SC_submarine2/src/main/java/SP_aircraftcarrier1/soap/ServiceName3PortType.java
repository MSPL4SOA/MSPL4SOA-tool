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
 * 2017-03-24T23:28:21.286+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", name = "ServiceName_3PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName3PortType {

	@WebMethod(operationName = "CapabilityName_3_6")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_6", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_6")
	public void capabilityName36();

	@WebMethod(operationName = "CapabilityName_3_5")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_5", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_5")
	public void capabilityName35(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_5 arg0);

	@WebMethod(operationName = "CapabilityName_3_4")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_4Response")
	public Response<SP_aircraftcarrier1.soap.CapabilityName_3_4Response> capabilityName34Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_4 arg0);

	@WebMethod(operationName = "CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_4Response")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_4")
	public Future<?> capabilityName34Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_4 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_aircraftcarrier1.soap.CapabilityName_3_4Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_4")
	@RequestWrapper(localName = "CapabilityName_3_4", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_4")
	@ResponseWrapper(localName = "CapabilityName_3_4Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_4Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_4 capabilityName34(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_4 arg0);

	@WebMethod(operationName = "CapabilityName_3_3")
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_3")
	@ResponseWrapper(localName = "CapabilityName_3_3Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_3Response")
	public Response<SP_aircraftcarrier1.soap.CapabilityName_3_3Response> capabilityName33Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_3 arg0);

	@WebMethod(operationName = "CapabilityName_3_3")
	@ResponseWrapper(localName = "CapabilityName_3_3Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_3Response")
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_3")
	public Future<?> capabilityName33Async(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_3 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<SP_aircraftcarrier1.soap.CapabilityName_3_3Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_3_3")
	@RequestWrapper(localName = "CapabilityName_3_3", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_3")
	@ResponseWrapper(localName = "CapabilityName_3_3Response", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_3Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_3_3 capabilityName33(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_3 arg0);

	@WebMethod(operationName = "CapabilityName_3_2")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_2", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_2")
	public void capabilityName32(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_2 arg0);

	@WebMethod(operationName = "CapabilityName_3_1")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_3_1", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", className = "SP_aircraftcarrier1.soap.CapabilityName_3_1")
	public void capabilityName31(
			@WebParam(name = "arg0", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0") InputDataClassName_3_1 arg0);
}
