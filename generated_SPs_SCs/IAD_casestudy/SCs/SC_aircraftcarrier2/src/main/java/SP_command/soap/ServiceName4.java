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
 * 2017-03-24T20:49:55.715+01:00
 * Generated source version: 3.1.4
 * 
 */
@WebServiceClient(name = "ServiceName_4", wsdlLocation = "http://localhost:8080/SP_command/ServiceName_4/ServiceName_4?wsdl", targetNamespace = "urn:SP_command:SP_command:1.0")
public class ServiceName4 extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName(
			"urn:SP_command:SP_command:1.0", "ServiceName_4");
	public final static QName ServiceName4Port = new QName(
			"urn:SP_command:SP_command:1.0", "ServiceName_4Port");
	static {
		URL url = null;
		try {
			url = new URL(
					"http://localhost:8080/SP_command/ServiceName_4/ServiceName_4?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ServiceName4.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							"http://localhost:8080/SP_command/ServiceName_4/ServiceName_4?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ServiceName4(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ServiceName4(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ServiceName4() {
		super(WSDL_LOCATION, SERVICE);
	}

	public ServiceName4(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	public ServiceName4(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	public ServiceName4(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 *
	 * @return
	 *     returns ServiceName4PortType
	 */
	@WebEndpoint(name = "ServiceName_4Port")
	public ServiceName4PortType getServiceName4Port() {
		return super.getPort(ServiceName4Port, ServiceName4PortType.class);
	}

	/**
	 * 
	 * @param features
	 *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
	 * @return
	 *     returns ServiceName4PortType
	 */
	@WebEndpoint(name = "ServiceName_4Port")
	public ServiceName4PortType getServiceName4Port(
			WebServiceFeature... features) {
		return super.getPort(ServiceName4Port, ServiceName4PortType.class,
				features);
	}

}
