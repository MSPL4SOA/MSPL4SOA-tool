package rest;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.logging.Logger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import jms.GeneratingJMSException;
import scfactory.SCGenerator;
import scfactory.InputFactory;
import state.StateMessagingDP;

public class RESTFactory {

	// Mondatory
	private static final Logger log = Logger.getLogger(RESTFactory.class.getName());

	SCGenerator amGenerator;

	public HashMap<String, String> headerHashMap = new HashMap<String, String>();

	Future<Response> futrureResponse;

	public RESTFactory(SCGenerator amGenerator) {
		this.amGenerator = amGenerator;

		//
		// this.fieldNameInList = restParameter.getParameterList();

		// this.genWSDLPKG = "gen.wsdl." + serviceName.toLowerCase();
		// pkgName = "gen.rest";

		// wadlName = "Localhost_Rest";
		// wadlName = Functions.fileToList(new
		// File("etc/rest/name_file")).get(0);

		// wadlName = "Rest";

		// addHeaders();
		// RESTHeader.headerHashMap = headerHashMap;

		// RESTHeader.features = Functions.listToString(features, " ");
		// RESTHeader.serviceName = serviceName;
		// RESTHeader.methodName = methodName;

	}

	public void initConf() throws GeneratingRESTException {

		ClientBuilder.newBuilder();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(amGenerator.host + "/rest");

		// get Values

		// String restData = "/";
		//
		// for (String value : configurationGenerating.extractedData) {
		// restData += value + "/";
		// }

		// System.out.println(InputFactory.getDataRest(configurationGenerating));

		target = target.path(amGenerator.capability.serviceName + "/" + amGenerator.capability.name
				+ InputFactory.getDataRest(amGenerator));

		String methodRest = amGenerator.capability.restMethod.toUpperCase();
		//
		// if (featuresList.contains("Post"))
		// methodRest = "POST";
		// else if (featuresList.contains("Get"))
		// methodRest = "GET";
		// else if (featuresList.contains("Put"))
		// methodRest = "PUT";
		// else if (featuresList.contains("Delete"))
		// methodRest = "DELETE";
		// else
		// throw new GenRESTException("Rest method is not found");

		// System.out.println(configurationGenerating.capability.restMethod);

		Invocation.Builder builder = target.request();

		if (amGenerator.capability.authentification == true) {

			builder.header("username", amGenerator.capability.usernameValue);
			builder.header("password", amGenerator.capability.passwordValue);
		}

		if (amGenerator.capability.twoWayState == true)
			builder.header(StateMessagingDP.HeaderName, amGenerator.stateMessagingDP.getState());

		if (amGenerator.capability.synchronous == true) {
			Response response = builder.method(methodRest);
			try {
				getResponse(response);
			} catch (Exception e) {

//				e.printStackTrace();
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				throw new GeneratingRESTException(errors.toString());
			}

			// System.out.println("sync1");

		}

		if (amGenerator.capability.asynchronous == true) {
			futrureResponse = builder.async().method(methodRest);

			// System.out.println("async1");

		}

	}

	public void getRestAsynchronousResponse() throws GeneratingRESTException {

		try {
			getResponse(futrureResponse.get());
		} catch (Exception e) {

//			e.printStackTrace();
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			throw new GeneratingRESTException(errors.toString());
		}
	}

	private void getResponse(Response response) throws GeneratingRESTException {
		Object resp = null;
		String state;

		if (amGenerator.capability.stateMessaging == true) {
			state = response.getHeaderString(StateMessagingDP.HeaderName) + "\n";
			//
			// System.out.println("StateHeader: " + state);

			if (amGenerator.capability.stateRepository == true)
				amGenerator.stateMessagingDP.setStateInDisk(state);

			if (amGenerator.capability.temporaryMemory == true)
				amGenerator.stateMessagingDP.setStateInMemory(state);
		}

		if (amGenerator.capability.getOutputs().size() != 0) {

			String className = amGenerator.contract.dataOutputPkg + "." + amGenerator.capability.dataOutputClassName;

			className = className.trim();
			Class<?> typeout;
			try {
				typeout = Class.forName(className);
			} catch (Exception e) {

//				e.printStackTrace();
				StringWriter errors = new StringWriter();
				e.printStackTrace(new PrintWriter(errors));
				throw new GeneratingRESTException(errors.toString());
			}

			resp = response.readEntity(typeout);
			this.amGenerator.getReponseList().add(resp);
		}
	}

}
