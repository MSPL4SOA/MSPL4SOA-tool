package large3.soap;

import large3.output.*;
import large3.input.*;

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
 * 2016-09-15T23:31:48.945+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebService(targetNamespace = "urn:large3:large3:1.0", name = "ServiceName_4PortType")
@XmlSeeAlso({ ObjectFactory.class })
public interface ServiceName4PortType {

	@WebMethod(operationName = "CapabilityName_4_2")
	@RequestWrapper(localName = "CapabilityName_4_2", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_2")
	@ResponseWrapper(localName = "CapabilityName_4_2Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_2Response")
	public Response<large3.soap.CapabilityName_4_2Response> capabilityName42Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_2 arg0);

	@WebMethod(operationName = "CapabilityName_4_2")
	@ResponseWrapper(localName = "CapabilityName_4_2Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_2Response")
	@RequestWrapper(localName = "CapabilityName_4_2", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_2")
	public Future<?> capabilityName42Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_2 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<large3.soap.CapabilityName_4_2Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_2")
	@RequestWrapper(localName = "CapabilityName_4_2", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_2")
	@ResponseWrapper(localName = "CapabilityName_4_2Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_2Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_2 capabilityName42(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_2 arg0);

	@WebMethod(operationName = "CapabilityName_4_1")
	@RequestWrapper(localName = "CapabilityName_4_1", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_1")
	@ResponseWrapper(localName = "CapabilityName_4_1Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_1Response")
	public Response<large3.soap.CapabilityName_4_1Response> capabilityName41Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_1 arg0);

	@WebMethod(operationName = "CapabilityName_4_1")
	@ResponseWrapper(localName = "CapabilityName_4_1Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_1Response")
	@RequestWrapper(localName = "CapabilityName_4_1", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_1")
	public Future<?> capabilityName41Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_1 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<large3.soap.CapabilityName_4_1Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_1")
	@RequestWrapper(localName = "CapabilityName_4_1", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_1")
	@ResponseWrapper(localName = "CapabilityName_4_1Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_1Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_1 capabilityName41(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_1 arg0);

	@WebMethod(operationName = "CapabilityName_4_6")
	@RequestWrapper(localName = "CapabilityName_4_6", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_6")
	@ResponseWrapper(localName = "CapabilityName_4_6Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_6Response")
	public Response<large3.soap.CapabilityName_4_6Response> capabilityName46Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_6 arg0);

	@WebMethod(operationName = "CapabilityName_4_6")
	@ResponseWrapper(localName = "CapabilityName_4_6Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_6Response")
	@RequestWrapper(localName = "CapabilityName_4_6", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_6")
	public Future<?> capabilityName46Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_6 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<large3.soap.CapabilityName_4_6Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_6")
	@RequestWrapper(localName = "CapabilityName_4_6", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_6")
	@ResponseWrapper(localName = "CapabilityName_4_6Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_6Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_6 capabilityName46(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_6 arg0);

	@WebMethod(operationName = "CapabilityName_4_5")
	@RequestWrapper(localName = "CapabilityName_4_5", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_5")
	@ResponseWrapper(localName = "CapabilityName_4_5Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_5Response")
	public Response<large3.soap.CapabilityName_4_5Response> capabilityName45Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_5 arg0);

	@WebMethod(operationName = "CapabilityName_4_5")
	@ResponseWrapper(localName = "CapabilityName_4_5Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_5Response")
	@RequestWrapper(localName = "CapabilityName_4_5", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_5")
	public Future<?> capabilityName45Async(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_5 arg0,
			@WebParam(name = "asyncHandler", targetNamespace = "") AsyncHandler<large3.soap.CapabilityName_4_5Response> asyncHandler);

	@WebMethod(operationName = "CapabilityName_4_5")
	@RequestWrapper(localName = "CapabilityName_4_5", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_5")
	@ResponseWrapper(localName = "CapabilityName_4_5Response", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_5Response")
	@WebResult(name = "return", targetNamespace = "")
	public OutputDataClassName_4_5 capabilityName45(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_5 arg0);

	@WebMethod(operationName = "CapabilityName_4_4")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_4_4", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_4")
	public void capabilityName44();

	@WebMethod(operationName = "CapabilityName_4_3")
	@Oneway
	@RequestWrapper(localName = "CapabilityName_4_3", targetNamespace = "urn:large3:large3:1.0", className = "large3.soap.CapabilityName_4_3")
	public void capabilityName43(
			@WebParam(name = "arg0", targetNamespace = "urn:large3:large3:1.0") InputDataClassName_4_3 arg0);
}
