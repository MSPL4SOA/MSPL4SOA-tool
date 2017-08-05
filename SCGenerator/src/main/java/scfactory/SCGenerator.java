package scfactory;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import familiar.FMBDD;
import familiar.FMFactory;
import features.bean.Capability;
import features.bean.Contract;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import jms.JMSFactory;
import rest.RESTFactory;
import scgenerator.TextEditor;
import soap.SOAPFactory;
import state.StateMessagingDP;
import util.Functions;

public class SCGenerator {

	// JMS Communication ResponseMode Broker Message
	// private String soaFMPath;
	private String amFilePath;
	// String serviceName;
	// String capabilityName;
	// String features;
	// Object data;
	// ArrayList<String> featuresList;

	Object response;
	Object errorResponse;
	JMSFactory jmsBasic;
	public SOAPFactory soapBasic;
	RESTFactory restBasic;

	ArrayList<Object> reponseList;
	ArrayList<Object> errorResponseList;

	public StateMessagingDP stateMessagingDP;

//	public String host;

	public Contract contractFM;
	// public Service service;
	// public Capability capability;
	public Contract contractCapability;

	public String capabilityXMLPath;

	// public ArrayList<String> extractedData;

	public FeatureModelVariable fmvAM;

	public String capabilityId;

	public String projectPath;
	public String fmFilePath;

	// public SCGenerator() {
	//
	// }

	public SCGenerator(String fmFilePath) {
		this.fmFilePath = fmFilePath;
	}

	public Capability extractCapabilityFromContract() {
		return contractCapability.services.get(0).capabilities.get(0);
	}

	public static String extractFeatureValue(String feature) {
		String featureValue = feature.split("_eq_")[1];

		if (featureValue.substring(0, 1).equals("\""))
			featureValue = featureValue.substring(1, featureValue.length() - 1);

		return featureValue;
	}

	public static String extractFeatureName(String feature) {
		String featureValue = feature.split("_eq_")[0];

		return featureValue;
	}

	public static String searchFeature(String featureIn, ArrayList<String> featuresList) {
		String result = "";
		for (String feature : featuresList) {
			if (feature.contains(featureIn + "_")) {
				result = feature;
				break;
			}
		}

		return result;
	}

	public static boolean existFeature(String featureIn, ArrayList<String> featuresList) {
		boolean result = false;
		for (String feature : featuresList) {
			if (feature.contains(featureIn + "_")) {
				return true;
			}
		}

		return result;
	}

	public void start() throws SCGeneratorException {

		// this.data = data;
		try {
			if (extractCapabilityFromContract().jms == true) {
				jmsBasic = new JMSFactory(this);
				jmsBasic.initConf();
			} else if (extractCapabilityFromContract().soap == true) {
				soapBasic = new SOAPFactory(this);

				soapBasic.initConf();
			} else if (extractCapabilityFromContract().rest == true) {
				restBasic = new RESTFactory(this);

				restBasic.initConf();
			}

		} catch (Exception e) {
			// e.printStackTrace();

			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			throw new SCGeneratorException(errors.toString());
		}
	}

	public void stop() throws SCGeneratorException {
		try {

			if (extractCapabilityFromContract().jms == true)
				jmsBasic.closeJMS();

			if (extractCapabilityFromContract().soap == true && extractCapabilityFromContract().asynchronous == true) {
				soapBasic.getAsynchrounousResponse();
			}
			if (extractCapabilityFromContract().rest == true && extractCapabilityFromContract().asynchronous == true) {
				restBasic.getRestAsynchronousResponse();
			}

		} catch (Exception e) {
			// e.printStackTrace();
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			throw new SCGeneratorException(errors.toString());
		}
	}

	public String getState() {
		return stateMessagingDP.getState();
	}
	// public String getServiceName() {
	// return serviceName;
	// }
	//
	// public String getMethodName() {
	// return capabilityName;
	// }
	//
	// public String getFeatures() {
	// return features;
	// }
	//
	// public Object getData() {
	// return data;
	// }

	public Object getResponse() {

		if (this.reponseList.size() == 0)
			return null;
		// if (this.reponseList.size() == 1)
		// return this.reponseList.get(0);
		else
			return this.reponseList.get(this.reponseList.size() - 1);
	}

	public Object getErrorResponse() {
		return errorResponse;
	}

	// public void setServiceName(String serviceName) {
	// this.serviceName = serviceName;
	// }
	//
	// public void setMethodName(String methodName) {
	// this.capabilityName = methodName;
	// }
	//
	// public void setData(Object data) {
	// this.data = data;
	// }

	// public void setResponse(Object response) {
	// this.response = response;
	// }

	public void setErrorResponse(Object errorResponse) {
		this.errorResponse = errorResponse;
	}

	public ArrayList<Object> getReponseList() {
		return reponseList;
	}

	public ArrayList<Object> getErrorResponseList() {
		return errorResponseList;
	}

	// public ArrayList<String> getFeaturesList() {
	// return featuresList;
	// }

	// public void setReponseList(ArrayList<Object> reponseList) {
	// this.reponseList = reponseList;
	// }

	// public void setErrorResponseList(ArrayList<Object> errorResponseList) {
	// this.errorResponseList = errorResponseList;
	// }

	// public void fmlToObject(FeatureModelVariable fmvAM) throws Exception {
	//
	// String serviceName = getFeatureValue(fmvAM, "ServiceName");
	// String capabilityName = getFeatureValue(fmvAM, "CapabilityName");
	//
	// // String amID = getFeatureValue(fmvAM, "ServiceName") + "_" +
	// // getFeatureValue(fmvAM, "CapabilityName") + "_"
	// // + AMSC.amSCValidNumber++;
	//
	// // amsc.amFilePath = SCProject.AM_Dir + amID + ".fml";
	// // amsc.capabilityPath = SCProject.CAPABILITY_Dir + "capability_" + amID
	// // + ".xml";
	//
	// for (Service serviceTemp : contract.getServices()) {
	// if (serviceTemp.interfaceName.equals(serviceName)) {
	//
	// for (Capability capabilityTemp : serviceTemp.capabilities) {
	//
	// if (capabilityTemp.name.equals(capabilityName)) {
	// capability = capabilityTemp.clone();
	//
	// capabilityId = getFeatureID(getFeatureName(fmvAM, "CapabilityName"));
	//
	// // System.out.println(capabilityId);
	//
	// capability.serviceName = serviceName;
	// capability.dataInputClassName = getFeatureValue(fmvAM,
	// "InputDataClassName" + capabilityId);
	// capability.dataOutputClassName = getFeatureValue(fmvAM,
	// "OutputDataClassName" + capabilityId);
	//
	// capability.stateMessaging =
	// fmvAM.features().names().contains("StateMessaging" + capabilityId);
	// capability.twoWayState = fmvAM.features().names().contains("TwoWayState"
	// + capabilityId);
	// capability.stateRepository = fmvAM.features().names()
	// .contains("StateRepository" + capabilityId);
	// capability.temporaryMemory = fmvAM.features().names()
	// .contains("TemporaryMemory" + capabilityId);
	//
	// capability.soap = fmvAM.features().names().contains("SOAP" +
	// capabilityId);
	//
	// capability.rest = fmvAM.features().names().contains("REST" +
	// capabilityId);
	//
	// //
	// if (fmvAM.features().names().contains("Put" + capabilityId))
	// capability.restMethod = "Put";
	// else if (fmvAM.features().names().contains("Get" + capabilityId))
	// capability.restMethod = "Get";
	// else if (fmvAM.features().names().contains("Post" + capabilityId))
	// capability.restMethod = "Post";
	// else if (fmvAM.features().names().contains("Delete" + capabilityId))
	// capability.restMethod = "Delete";
	// //
	//
	// capability.jms = fmvAM.features().names().contains("MOM" + capabilityId);
	// //
	// if (capability.jms == true) {
	// //
	// capability.broker.acknowledgement = fmvAM.features().names()
	// .contains("Acknowledgement" + capabilityId);
	// capability.broker.transactional = fmvAM.features().names()
	// .contains("Transactional" + capabilityId);
	// capability.broker.persistentDelivery = fmvAM.features().names()
	// .contains("PersistentDelivery" + capabilityId);
	//
	// capability.broker.publishSubscribe = fmvAM.features().names()
	// .contains("PublishSubscribe" + capabilityId);
	// capability.broker.durable = fmvAM.features().names().contains("Durable" +
	// capabilityId);
	//
	// } else
	// capability.broker = null;
	//
	// capability.asynchronous = fmvAM.features().names()
	// .contains("Asynchronous" + capabilityId);
	//
	// if (capability.asynchronous == false)
	// capability.synchronous = true;
	// // amsc.capability.synchronousResponseHandlerExist =
	// // fmvAM.features().names()
	// // .contains("Synchronous" + capabilityId);
	//
	// capability.authentification = fmvAM.features().names()
	// .contains("Authentification" + capabilityId);
	// //
	// if (capability.authentification == true) {
	// capability.username = getFeatureValue(fmvAM, "Username" + capabilityId);
	// capability.password = getFeatureValue(fmvAM, "Password" + capabilityId);
	// }
	//
	// // input
	// for (Input input : capability.inputs) {
	//
	// String inputID = capabilityId + "_" + input.number;
	//
	// input.value = getFeatureValue(fmvAM, "InputValue" + inputID);
	//
	// }
	//
	// break;
	// }
	// }
	// break;
	// }
	// }
	// contractCapabilityXMLPath = projectPath + SCProject.CAPABILITY_DIR_NAME +
	// "capability_"
	// + amFilePath.substring(amFilePath.lastIndexOf("/") + 1,
	// amFilePath.lastIndexOf(".")) + ".xml";
	// util.JAXBUtil.marshall(capability, contractCapabilityXMLPath);
	//
	// }

	public static String getFeatureValue(FeatureModelVariable fmv, String featureToSearch) {

		for (String feature : fmv.features().names()) {

			if (feature.matches(".*" + featureToSearch + ".*")) {
				return feature.split(FMFactory.EQ_ATTRIBUTE)[1];
			}
		}
		return "";

	}

	public static String getFeatureName(FeatureModelVariable fmv, String featureToSearch) {

		for (String feature : fmv.features().names()) {

			if (feature.matches(".*" + featureToSearch + ".*")) {

				return feature.split(FMFactory.EQ_ATTRIBUTE)[0];
			}
		}
		return "";
	}

	public static String getFeatureID(String feature) {
		return feature.substring(feature.indexOf("_"));
	}

	public Capability getCapability() {
		return extractCapabilityFromContract();
	}

	public String getCapabilityId() {
		return capabilityId;
	}

	public Contract getContractFM() {
		return contractFM;
	}

	public String getAmFilePath() {
		return this.amFilePath;
	}

	public void convertAMToContractXML(FeatureModelVariable fmvAM) {
		try {
			contractCapability = FMFactory.convertFMSCUpdateToContractXML(fmvAM.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		capabilityXMLPath = projectPath + SCProject.CAPABILITY_DIR_NAME + "capability_"
				+ amFilePath.substring(amFilePath.lastIndexOf("/") + 1, amFilePath.lastIndexOf(".")) + ".xml";
		util.JAXBUtil.marshall(contractCapability, capabilityXMLPath);
	}

	public void setAmFilePath(String amFilePath) throws SCGeneratorException {
		// this.soaFMPath = soaFMPath;

		// "./files_generated/commerce/am/Client_connectProfile_1.fml
		// => ./files_generated/commerce/
		projectPath = fmFilePath.substring(0,
				amFilePath.substring(0, amFilePath.lastIndexOf("/")).lastIndexOf("/") + 1);
		//
		// this.fmFilePath = projectPath + SCProject.FM_SC_UPDATE_FML_NAME;

		this.amFilePath = amFilePath;
		// this.serviceName = serviceName;
		// this.methodName = methodName;
		// this.features = Functions.fileToString(soaAMPath);
		// this.soaFama = new SOAFama(this.soaFMPath);


		// contractCapability = (Contract) util.JAXBUtil.unmarshall(projectPath
		// + SCProject.CONTRACT_NAME, Contract.class);
		// this.host = contract.hostName;

		try {
			fmvAM = FMBDD.getInstance().FM("am", Functions.fileToString(amFilePath));

			
			// load capability
			// fmlToObject(fmvAM);

		} catch (Exception e) {

			// e.printStackTrace();
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			throw new SCGeneratorException(errors.toString());
		}

		// this.featuresList = new ArrayList<String>();
		// this.featuresList.addAll(fmvAM.features().names());
		//
		//
		// this.serviceName = extractFeatureValue(searchFeature("ServiceName",
		// featuresList));
		// this.capabilityName =
		// extractFeatureValue(searchFeature("CapabilityName", featuresList));

		convertAMToContractXML(fmvAM);
		this.reponseList = new ArrayList<Object>();
		this.errorResponseList = new ArrayList<Object>();

		stateMessagingDP = new StateMessagingDP(this);

		// if (!existFeature("Asynchronous", featuresList))
		// featuresList.add("Synchronous_");
	}

	public String getFmFilePath() {
		return fmFilePath;
	}

	public void setFmFilePath(String fmFilePath) {
		this.fmFilePath = fmFilePath;
	}

	public void checkAMConsistency() {

		try {
			String error = "";

			FeatureModelVariable fmvFM = FMBDD.getInstance().FM("fm",
					Functions.fileToString(fmFilePath));

			FeatureModelVariable fmvAM = FMBDD.getInstance().FM("am",
					Functions.fileToString(amFilePath));

			error += TextEditor.checkAttributesValue(fmvAM);
			error += TextEditor.checkConformConfiguration(fmvAM, fmvFM);
			// boolean checkConform = true;

			if (!"".equals(error))
				throw new SCGeneratorException("The AM is not consistent to the FM as follows:\n" + error);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
