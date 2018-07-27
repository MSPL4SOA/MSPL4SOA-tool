package SP_command.soap;

import SP_command.output.*;
import SP_command.input.*;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.4
 * 2017-03-24T21:04:49.536+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "ServiceName_2", wsdlLocation = "http://localhost:8080/SP_command/ServiceName_2/ServiceName_2?wsdl", targetNamespace = "urn:SP_command:SP_command:1.0")
public class ServiceName2 extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName(
			"urn:SP_command:SP_command:1.0", "ServiceName_2");
	public final static QName ServiceName2Port = new QName(
			"urn:SP_command:SP_command:1.0", "ServiceName_2Port");
	static {
		URL url = null;
		try {
			url = new URL(
					"http://localhost:8080/SP_command/ServiceName_2/ServiceName_2?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ServiceName2.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"http://localhost:8080/SP_command/ServiceName_2/ServiceName_2?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ServiceName2(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ServiceName2(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServiceName2() {
		super(WSDL_LOCATION, SERVICE);
	}

	public ServiceName2(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public ServiceName2(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public ServiceName2(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return
	 *     returns ServiceName2PortType
	 */
	@WebEndpoint(name = "ServiceName_2Port")
	public ServiceName2PortType getServiceName2Port() {
		return super.getPort(ServiceName2Port, ServiceName2PortType.class);
	}

	/**
	 * 
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns ServiceName2PortType
	 */
	@WebEndpoint(name = "ServiceName_2Port")
	public ServiceName2PortType getServiceName2Port(
			WebServiceFeature... features) {
		return super.getPort(ServiceName2Port, ServiceName2PortType.class,
				features);
	}

}
