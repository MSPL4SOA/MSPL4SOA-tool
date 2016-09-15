package large3.soap;

import large3.output.*;
import large3.input.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2016-09-15T23:29:45.196+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "ServiceName_7", wsdlLocation = "http://localhost:8080/large3/ServiceName_7/ServiceName_7?wsdl", targetNamespace = "urn:large3:large3:1.0")
public class ServiceName7 extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("urn:large3:large3:1.0",
			"ServiceName_7");
	public final static QName ServiceName7Port = new QName(
			"urn:large3:large3:1.0", "ServiceName_7Port");
	static {
		URL url = null;
		try {
			url = new URL(
					"http://localhost:8080/large3/ServiceName_7/ServiceName_7?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ServiceName7.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"http://localhost:8080/large3/ServiceName_7/ServiceName_7?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ServiceName7(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ServiceName7(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServiceName7() {
		super(WSDL_LOCATION, SERVICE);
	}

	public ServiceName7(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public ServiceName7(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public ServiceName7(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return
	 *     returns ServiceName7PortType
	 */
	@WebEndpoint(name = "ServiceName_7Port")
	public ServiceName7PortType getServiceName7Port() {
		return super.getPort(ServiceName7Port, ServiceName7PortType.class);
	}

	/**
	 * 
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns ServiceName7PortType
	 */
	@WebEndpoint(name = "ServiceName_7Port")
	public ServiceName7PortType getServiceName7Port(
			WebServiceFeature... features) {
		return super.getPort(ServiceName7Port, ServiceName7PortType.class,
				features);
	}

}
