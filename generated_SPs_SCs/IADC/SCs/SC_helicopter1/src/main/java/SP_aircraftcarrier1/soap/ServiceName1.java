package SP_aircraftcarrier1.soap;

import SP_aircraftcarrier1.output.*;
import SP_aircraftcarrier1.input.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2017-06-11T03:38:52.296+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "ServiceName_1", wsdlLocation = "http://localhost:8080/SP_aircraftcarrier1/ServiceName_1/ServiceName_1?wsdl", targetNamespace = "urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0")
public class ServiceName1 extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName(
			"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0", "ServiceName_1");
	public final static QName ServiceName1Port = new QName(
			"urn:SP_aircraftcarrier1:SP_aircraftcarrier1:1.0",
			"ServiceName_1Port");
	static {
		URL url = null;
		try {
			url = new URL(
					"http://localhost:8080/SP_aircraftcarrier1/ServiceName_1/ServiceName_1?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ServiceName1.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"http://localhost:8080/SP_aircraftcarrier1/ServiceName_1/ServiceName_1?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ServiceName1(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ServiceName1(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServiceName1() {
		super(WSDL_LOCATION, SERVICE);
	}

	public ServiceName1(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public ServiceName1(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public ServiceName1(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return
	 *     returns ServiceName1PortType
	 */
	@WebEndpoint(name = "ServiceName_1Port")
	public ServiceName1PortType getServiceName1Port() {
		return super.getPort(ServiceName1Port, ServiceName1PortType.class);
	}

	/**
	 * 
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns ServiceName1PortType
	 */
	@WebEndpoint(name = "ServiceName_1Port")
	public ServiceName1PortType getServiceName1Port(
			WebServiceFeature... features) {
		return super.getPort(ServiceName1Port, ServiceName1PortType.class,
				features);
	}

}
