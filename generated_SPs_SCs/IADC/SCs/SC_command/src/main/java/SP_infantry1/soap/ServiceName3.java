package SP_infantry1.soap;

import SP_infantry1.output.*;
import SP_infantry1.input.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2017-06-11T03:09:31.442+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "ServiceName_3", wsdlLocation = "http://localhost:8080/SP_infantry1/ServiceName_3/ServiceName_3?wsdl", targetNamespace = "urn:SP_infantry1:SP_infantry1:1.0")
public class ServiceName3 extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName(
			"urn:SP_infantry1:SP_infantry1:1.0", "ServiceName_3");
	public final static QName ServiceName3Port = new QName(
			"urn:SP_infantry1:SP_infantry1:1.0", "ServiceName_3Port");
	static {
		URL url = null;
		try {
			url = new URL(
					"http://localhost:8080/SP_infantry1/ServiceName_3/ServiceName_3?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ServiceName3.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"http://localhost:8080/SP_infantry1/ServiceName_3/ServiceName_3?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ServiceName3(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ServiceName3(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServiceName3() {
		super(WSDL_LOCATION, SERVICE);
	}

	public ServiceName3(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public ServiceName3(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public ServiceName3(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return
	 *     returns ServiceName3PortType
	 */
	@WebEndpoint(name = "ServiceName_3Port")
	public ServiceName3PortType getServiceName3Port() {
		return super.getPort(ServiceName3Port, ServiceName3PortType.class);
	}

	/**
	 * 
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns ServiceName3PortType
	 */
	@WebEndpoint(name = "ServiceName_3Port")
	public ServiceName3PortType getServiceName3Port(
			WebServiceFeature... features) {
		return super.getPort(ServiceName3Port, ServiceName3PortType.class,
				features);
	}

}
