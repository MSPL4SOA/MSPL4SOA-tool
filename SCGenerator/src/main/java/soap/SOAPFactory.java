package soap;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;

import org.apache.cxf.headers.Header;
import org.apache.cxf.jaxb.JAXBDataBinding;

import com.sun.xml.ws.developer.WSBindingProvider;

import scfactory.SCGenerator;
import scfactory.InputFactory;
import state.StateMessagingDP;
import util.Functions;

public final class SOAPFactory {

	// Mondatory
	private static final Logger log = Logger.getLogger(SOAPFactory.class.getName());


	SCGenerator amGenerator;

	public String genWSDLPKG;

	public Object servicePortTypeObject;
	public WSBindingProvider bindingProvider;

	public Object serviceObject;

	// private String httpWSDL;

	public Response<?> asynchronousResponse;

	public SOAPFactory(SCGenerator amGenerator) {

		// System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
		// "true");
		// System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump",
		// "true");
		// System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump",
		// "true");
		// System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump",
		// "true");

		this.amGenerator = amGenerator;

		// this.genWSDLPKG = "gen.wsdl." + serviceName.toLowerCase();

		// this.genWSDLPKG = "message." + serviceName.toLowerCase();

//		this.genWSDLPKG = "gen.soap";
		
		this.genWSDLPKG = amGenerator.contract.projectName + ".soap"; 

		// this.httpWSDL = this.configurationGenerating.getHostName() + "/"
		// + serviceName + "/" + serviceName + "?wsdl";

		// this.httpWSDL = "http://localhost:8080/" + serviceName + "/"
		// + serviceName + "?wsdl";
	}

	public void initConf() throws GeneratingSOAPException {

		try {

			String inputClassName = amGenerator.contract.dataInputPkg + "."
					+ amGenerator.capability.dataInputClassName;

			String serviceName = amGenerator.capability.serviceName.replaceAll("_", "").trim();

			// ServiceName1 serviceName1 = new ServiceName1();
			Class<?> serviceClass = Class.forName(this.genWSDLPKG + "." + serviceName);
			serviceObject = serviceClass.newInstance();
			//
			// serviceName1.getServiceName1Port();
			Method getPort = serviceClass.getMethod("get" + serviceName + "Port");
			servicePortTypeObject = getPort.invoke(serviceObject);

			// set header to producer
			List<Header> headers = new ArrayList<Header>();
			if (amGenerator.capability.twoWayState == true) {
				Header stateHeader = new Header(new QName(StateMessagingDP.HeaderName),
						amGenerator.stateMessagingDP.getState(), new JAXBDataBinding(String.class));
				headers.add(stateHeader);
			}

			if (amGenerator.capability.authentification == true) {


				Header usernameHeader = new Header(new QName("username"), amGenerator.capability.usernameValue,
						new JAXBDataBinding(String.class));
				headers.add(usernameHeader);

				Header passwordHeader = new Header(new QName("password"), amGenerator.capability.passwordValue,
						new JAXBDataBinding(String.class));
				headers.add(passwordHeader);
			}
			//
			//
			BindingProvider binding = ((BindingProvider) servicePortTypeObject);

			//
			// add headers
			binding.getRequestContext().put(Header.HEADER_LIST, headers);
			/////////////////

			String methodLowerCase = amGenerator.capability.name.replaceAll("_", "").trim();
			methodLowerCase = methodLowerCase.substring(0, 1).toLowerCase() + methodLowerCase.substring(1);

			Object[] objectToInsert;
			Class<?>[] parametersToInsert;

			if (amGenerator.capability.getInputs() == null
					|| amGenerator.capability.getInputs().size() == 0) {

				objectToInsert = new Object[0];
				parametersToInsert = new Class<?>[0];
			} else {

				objectToInsert = new Object[1];
				objectToInsert[0] = InputFactory.getInstance(amGenerator);

				parametersToInsert = new Class<?>[1];
				parametersToInsert[0] = Class.forName(inputClassName.trim());
			}

			// serviceName1PortType.capabilityName11(...)

			if (amGenerator.capability.asynchronous == true
					&& amGenerator.capability.getOutputs().size() != 0) {
				// System.out.println("Async");
				methodLowerCase += "Async";
			}

			Method callCapability = servicePortTypeObject.getClass().getMethod(methodLowerCase, parametersToInsert);
			Object result = callCapability.invoke(servicePortTypeObject, objectToInsert);

			if (amGenerator.capability.getOutputs().size() != 0) {

				if (amGenerator.capability.synchronous == true) {
					amGenerator.getReponseList().add(result);

					if (amGenerator.capability.stateMessaging == true) {
						String state = "";

						Map<String, List<String>> headersMap = (Map<String, List<String>>) binding.getResponseContext()
								.get("javax.xml.ws.http.response.headers");
						for (Entry<String, List<String>> headermap : headersMap.entrySet()) {
							if (headermap.getKey().equals(StateMessagingDP.HeaderName)) {

								state = headermap.getValue().get(0);
								break;
							}
						}
						//

						if (amGenerator.capability.stateRepository == true)
							amGenerator.stateMessagingDP.setStateInDisk(state);

						if (amGenerator.capability.temporaryMemory == true)
							amGenerator.stateMessagingDP.setStateInMemory(state);

					}
				}

				if (amGenerator.capability.asynchronous == true) {
					asynchronousResponse = (Response<?>) result;

				}

				// BindingProvider bindingProvider = ((BindingProvider)
				// servicePortTypeObject);
				// Map<String, Object> o = bindingProvider.getResponseContext();
				// ArrayList<SoapHeader> d = (ArrayList<SoapHeader>)
				// o.get("org.apache.cxf.headers.Header.list");
				// System.out.println(d.get(0).getObject().toString());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));

			throw new GeneratingSOAPException(errors.toString());
		}
	}

	public void getAsynchrounousResponse() throws GeneratingSOAPException {

		if (amGenerator.capability.getOutputs().size() != 0) {
			try {

				// gen.soap.CapabilityName_1_3Response.getReturn();
				
				String className = this.genWSDLPKG + "." + Functions.toUpperFirstLetter(amGenerator.capability.name) + "Response";
				
				Class<?> responseClass = Class.forName(className);

				Method methodResponseClass = responseClass.getMethod("getReturn");

				Object result = methodResponseClass.invoke(asynchronousResponse.get());

				amGenerator.getReponseList().add(result);

			} catch (Exception e) {
//				e.printStackTrace();
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				throw new GeneratingSOAPException(errors.toString());
			}
		}
	}

}
