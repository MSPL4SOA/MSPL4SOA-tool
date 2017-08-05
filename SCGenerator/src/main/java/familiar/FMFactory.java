package familiar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;
import org.xtext.example.mydsl.fML.SliceMode;

import features.bean.Capability;
import features.bean.Contract;
import features.bean.Input;
import features.bean.Output;
import features.bean.Service;
import fr.unice.polytech.modalis.familiar.fm.converter.S2T2Converter;
import fr.unice.polytech.modalis.familiar.parser.MyExpressionParser;
import fr.unice.polytech.modalis.familiar.variable.Comparison;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.FeatureVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import generating.SwitchyardProject;
import gsd.synthesis.Expression;
import gsd.synthesis.FeatureModel;
import gsd.synthesis.Formula;

public class FMFactory {

	public String cstSP = "";
	public String cstSC = "";
	//
	public String _fmSP = "";
	public String _fmSC = "";

	// public String fmSPReduceComplexity = "";

	public ContractFG contractFG;

	// public FMUpdateBDD fmUpdateBDD;
	// FMDeleteBDD fmDeleteBDD;

	// public String error = "";

	public static final String EQ_ATTRIBUTE = "=";

	// SP
	// we avoid a different name (ServiceProvider) to accelarate the reasoning
	// process
	public static final String SP_ROOT = "\"ServiceContract\"";
	public static final String SC_ROOT = SP_ROOT;

	public String specializedFMSP;

	public String specializedAttributedFMSP;

	public String updatedFMSC;
	public String updatedAttributedFMSC;

	public String fmSPSpecSync;

	public String mockSPSpec = "";

	// public Contract contract;

	/// MockSPSpec

	public static String mockMOMWithOutput() {
		if (Math.random() > 0.3) {
			return "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);" + "REST@@: Get@@;"
					+ "MOM@@: AsynchronousQueue@@ [PublishSubscribe@@] Reliability@@;"
					+ "PublishSubscribe@@: [Durable@@];" + "Reliability@@: PersistentDelivery@@ Acknowledgement@@;";
		}

		return "CommunicationTechnologie@@: (SOAP@@|REST@@);" + "REST@@: Post@@;";
	}

	public String setMockSPSpecCapabilityWithOutput(String capabilityID) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] ServiceState@@ CapabilityName@@;"
				+ mockMOMWithOutput() + "ServiceState@@: StateMessaging@@ StatefulService@@;"
				+ "StateMessaging@@: TwoWayState@@;" + "StatefulService@@: StateRepository@@;";

		return result.replaceAll("@@", capabilityID);
	}

	public String setMockSPSpecCapabilityWithoutOutput(String capabilityID) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] "
				+ "ServiceState@@ CapabilityName@@;" + "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);"
				+ "REST@@: Post@@;" + "MOM@@: AsynchronousQueue@@ ;" + "ServiceState@@: StatefulService@@;"
				+ "StatefulService@@: TemporaryMemory@@;";

		return result.replaceAll("@@", capabilityID);

	}

	// SP

	public String setFMSPCapabilityWithOutput(String capabilityID) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] [ServiceState@@] CapabilityName@@;"
				+ "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);" + "REST@@: (Post@@|Get@@|Put@@|Delete@@);"
				+ "MOM@@: AsynchronousQueue@@ [PublishSubscribe@@] [Transactional@@] [Reliability@@];"
				+ "PublishSubscribe@@: [Durable@@];" + "Reliability@@: (PersistentDelivery@@|Acknowledgement@@)+;"
				+ "ServiceState@@: (StateMessaging@@|StatefulService@@)+;" + "StateMessaging@@: [TwoWayState@@];"
				+ "StatefulService@@: (StateRepository@@|TemporaryMemory@@);";

		this.cstSP += "MOM@@ implies (Transactional@@ or Acknowledgement@@); Transactional@@ implies !Acknowledgement@@;";

		this.cstSP = this.cstSP.replaceAll("@@", capabilityID);

		return result.replaceAll("@@", capabilityID);
	}

	public String setFMSPCapabilityWithoutOutput(String capabilityID) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] "
				+ "[ServiceState@@] CapabilityName@@;" + "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);"
				+ "REST@@: (Post@@|Get@@|Put@@|Delete@@);" + "MOM@@: AsynchronousQueue@@ ;"
				+ "ServiceState@@: StatefulService@@;" + "StatefulService@@: (StateRepository@@|TemporaryMemory@@);";

		return result.replaceAll("@@", capabilityID);

	}

	//
	public static String setServiceSPFeatures(String serviceID, String capability) {
		String result = "Service@@: ServiceName@@ @Capability@;";

		result = result.replaceAll("@Capability@", capability);
		return result.replaceAll("@@", serviceID);
	}

	//
	public static String setInputDataSPFeatures(String inputID) {
		String result = "InputData@@: InputName@@ InputType@@;";
		return result.replaceAll("@@", inputID);
	}

	//
	public static String setOutputDataSPFeatures(String outputID) {
		String result = "OutputData@@: OutputName@@ OutputType@@;";
		return result.replaceAll("@@", outputID);
	}

	//
	// public static String addSPCsts(int serviceNumber, int capabilityNumber) {
	// String result = "!PublishSubscribe@@; !Transactional@@; !Reliability@@;
	// !StateMessaging@@;";
	// return result.replaceAll("@@", "_" + serviceNumber + "_" +
	// capabilityNumber);
	// }

	// public static String addSPGlobalCsts(int serviceNumber, int
	// capabilityNumber) {
	// String result = "Transactional@@ implies !Acknowledgement@@;";
	// return result.replaceAll("@@", "_" + serviceNumber + "_" +
	// capabilityNumber);
	// }

	// SC

	public String setFMSCCapabilityWithOutput(String capabilityID) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] [StateMessaging@@] CapabilityName@@;"
				+ "CommunicationTechnologie@@: ResponseHandler@@ (SOAP@@|REST@@|MOM@@);"
				+ "ResponseHandler@@: (Synchronous@@|Asynchronous@@);" + "REST@@: (Post@@|Get@@|Put@@|Delete@@);"
				+ "MOM@@: MOMConfiguration@@ AsynchronousQueue@@ [PublishSubscribe@@] [Transactional@@] [Reliability@@];"
				+ "PublishSubscribe@@: [Durable@@] TopicConfiguration@@ ;"
				+ "AsynchronousQueue@@: QueueConfiguration@@ ;" + "QueueConfiguration@@: QueueOutJNDI@@ QueueInJNDI@@;"
				+ "TopicConfiguration@@: TopicJNDI@@;"
				+ "MOMConfiguration@@: SecurityCredentials@@ InitialContextFactory@@ ConnectionConsumerFactory@@ SecurityPrincipal@@ ProviderUrl@@ ;"
				+ "Reliability@@: (PersistentDelivery@@|Acknowledgement@@)+;"
				+ "StateMessaging@@: (TwoWayState@@|StateRepository@@|TemporaryMemory@@)+;"
				+ "Authentification@@: Username@@ Password@@;";

		this.cstSC += "MOM@@ implies (Transactional@@ or Acknowledgement@@); Transactional@@ implies !Acknowledgement@@;";

		this.cstSC = this.cstSC.replaceAll("@@", capabilityID);

		// MOM implies (Transactional or Acknowledgement)

		return result.replaceAll("@@", capabilityID);
	}

	public String setFMSCCapabilityWithOutOutput(String capabilityID) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] CapabilityName@@;"
				+ "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);" + "REST@@: (Post@@|Get@@|Put@@|Delete@@);"
				+ "MOM@@: MOMConfiguration@@ AsynchronousQueue@@ [Transactional@@] [Reliability@@];"
				+ "AsynchronousQueue@@: QueueConfiguration@@ ;" + "QueueConfiguration@@: QueueOutJNDI@@ QueueInJNDI@@;"
				+ "TopicConfiguration@@: TopicJNDI@@;"
				+ "MOMConfiguration@@: SecurityCredentials@@ InitialContextFactory@@ ConnectionConsumerFactory@@ SecurityPrincipal@@ ProviderUrl@@ ;"
				+ "Reliability@@: (PersistentDelivery@@|Acknowledgement@@)+;"
				+ "Authentification@@: Username@@ Password@@;";

		this.cstSC += "MOM@@ implies (Transactional@@ or Acknowledgement@@); Transactional@@ implies !Acknowledgement@@;";

		this.cstSC = this.cstSC.replaceAll("@@", capabilityID);

		return result.replaceAll("@@", capabilityID);
	}

	//
	public static String setServiceSCFeatures(String serviceID, String capability) {
		String result = "Service@@: ServiceName@@ @Capability@;";

		result = result.replaceAll("@Capability@", capability);

		return result.replaceAll("@@", serviceID);
	}

	//
	public static String setInputDataSCFeatures(String inputID) {
		String result = "InputData@@: InputName@@ InputType@@ InputValue@@;";
		return result.replaceAll("@@", inputID);
	}

	//
	public static String setOutputDataSCFeatures(String outputID) {
		String result = "OutputData@@: OutputName@@ OutputType@@;";
		return result.replaceAll("@@", outputID);
	}

	//
	// public static String addSCCsts(int serviceNumber, int capabilityNumber) {
	// String result = "!PublishSubscribe@@; !StateMessaging@@;";
	// return result.replaceAll("@@", "_" + serviceNumber + "_" +
	// capabilityNumber);
	// }

	// public static String addSCGlobalCsts(int serviceNumber, int
	// capabilityNumber) {
	// String result = "Transactional@@ implies !Acknowledgement@@;";
	// return result.replaceAll("@@", "_" + serviceNumber + "_" +
	// capabilityNumber);
	// }

	public FMFactory() {

		_fmSC = SC_ROOT + ":";
		_fmSP = SP_ROOT + ":";

		mockSPSpec = SP_ROOT + ":";

		contractFG = new ContractFG();
		// fmUpdateBDD = new FMUpdateBDD();
		// fmDeleteBDD = new FMDeleteBDD();

		// contract = new Contract();

		FMBDD.getInstance();
	}

	public void Init() {

		contractFG = new ContractFG();

		Scanner sc = new Scanner(System.in);
		System.out.print("Service count: ");
		int serviceCount;

		while ((serviceCount = sc.nextInt()) == 0)
			System.out.print("Service count: ");

		for (int serviceNumber = 1; serviceNumber <= serviceCount; serviceNumber++) {
			int capabilityCount;
			System.out.print("Capability count for service " + serviceNumber + " : ");

			while ((capabilityCount = sc.nextInt()) == 0)
				System.out.print("Capability count for service " + serviceNumber + " : ");

			ServiceFG serviceFG = new ServiceFG();
			serviceFG.name = "Service_" + serviceNumber;

			for (int capabilityNumber = 1; capabilityNumber <= capabilityCount; capabilityNumber++) {

				System.out.print(
						"InputData count for service " + serviceNumber + " and capability " + capabilityNumber + " : ");
				int inputDataCount = sc.nextInt();

				System.out.print("OutputData count for service " + serviceNumber + " and capability " + capabilityNumber
						+ " : ");
				int outputDataCount = sc.nextInt();

				CapabilityFG capabilityFG = new CapabilityFG();
				capabilityFG.name = "Capability_" + serviceNumber + "_" + capabilityNumber;
				capabilityFG.inputDataCount = inputDataCount;
				capabilityFG.outputDataCount = outputDataCount;

				serviceFG.capabilityFGs.add(capabilityFG);
			}

			contractFG.serviceFGs.add(serviceFG);
		}

		sc.close();
	}

	public void buildFMs() throws Exception {

		ArrayList<String> servicesValueSP = new ArrayList<String>();
		ArrayList<String> servicesKeySP = new ArrayList<String>();

		ArrayList<String> servicesValueSC = new ArrayList<String>();
		ArrayList<String> servicesKeySC = new ArrayList<String>();

		ArrayList<String> servicesValueMockSPSpec = new ArrayList<String>();
		
		for (ServiceFG serviceFG : contractFG.serviceFGs) {
			

			// serviceFG.name = "Service_" + serviceNumber;

			ArrayList<String> capabilitiesValueSP = new ArrayList<String>();
			ArrayList<String> capabilitiesKeySP = new ArrayList<String>();

			ArrayList<String> capabilitiesValueSC = new ArrayList<String>();
			ArrayList<String> capabilitiesKeySC = new ArrayList<String>();

			ArrayList<String> capabilitiesValueMockSPSpec = new ArrayList<String>();
			
			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {
				

				// capabilityFG.name = "Capability_" + serviceNumber + "_" +
				// capabilityNumber;

				String capabilitySC = "";
				String capabilitySP = "";
				String capabilityMockSPSpec = "";

				if (capabilityFG.outputDataCount != 0) {
					capabilitySP = setFMSPCapabilityWithOutput(capabilityFG.id);
					capabilitySC = setFMSCCapabilityWithOutput(capabilityFG.id);

					capabilityMockSPSpec = setMockSPSpecCapabilityWithOutput(capabilityFG.id);
				} else {
					capabilitySP = setFMSPCapabilityWithoutOutput(capabilityFG.id);
					capabilitySC = setFMSCCapabilityWithOutOutput(capabilityFG.id);

					capabilityMockSPSpec = setMockSPSpecCapabilityWithoutOutput(capabilityFG.id);
				}
				String capabilitySPCst = "";
				String capabilitySCCst = "";

				//
				String inputDataSC = "";
				String inputDataSP = "";
				String inputDataFeature = "";

				// capabilityFG.inputDataCount = inputDataCount;

				//

				for (InputFG inputFG : capabilityFG.inputFGs) {

					// System.err.println(capabilityFG.inputDataCount);

					inputDataSC += setInputDataSCFeatures(inputFG.id);
					inputDataSP += setInputDataSPFeatures(inputFG.id);
					inputDataFeature += " InputData" + inputFG.id;
				}

				if (capabilityFG.inputDataCount > 0) {
					inputDataFeature = " InputDataClassName" + capabilityFG.id + inputDataFeature;
				}
				//
				capabilitySC += inputDataSC;
				capabilitySC = capabilitySC.replaceAll("@InputData@", inputDataFeature);
				//
				capabilitySP += inputDataSP;
				capabilitySP = capabilitySP.replaceAll("@InputData@", inputDataFeature);
				//
				capabilityMockSPSpec += inputDataSP;
				capabilityMockSPSpec = capabilityMockSPSpec.replaceAll("@InputData@", inputDataFeature);
				//
				//////////////

				////////////////
				// @OutputData@
				//
				String outputDataSC = "";
				String outputDataSP = "";
				String outputDataFeature = "";
				//
				// capabilityFG.outputDataCount = outputDataCount;
				//
				// if (capabilityFG.outputDataCount == 0) {
				//
				// // delete f -> output
				// } else {

				for (OutputFG outputFG : capabilityFG.outputFGs) {
					

					outputDataSC += setOutputDataSCFeatures(outputFG.id);
					outputDataSP += setOutputDataSPFeatures(outputFG.id);
					outputDataFeature += " OutputData" + outputFG.id;
				}
				// }

				if (capabilityFG.outputDataCount > 0) {
					outputDataFeature = " OutputDataClassName" + capabilityFG.id
							+ outputDataFeature;
				}

				capabilitySC += outputDataSC;
				capabilitySC = capabilitySC.replaceAll("@OutputData@", outputDataFeature);
				//
				// add csts
				// capabilitySC += this.cstSC;
				//
				capabilitiesValueSC.add(capabilitySC);
				capabilitiesKeySC.add("Capability" + capabilityFG.id);

				capabilitySP += outputDataSP;
				capabilitySP = capabilitySP.replaceAll("@OutputData@", outputDataFeature);
				//
				// add csts
				// capabilitySP += this.cstSP;
				//
				capabilitiesValueSP.add(capabilitySP);
				capabilitiesKeySP.add("Capability" + capabilityFG.id);

				capabilityMockSPSpec += outputDataSP;
				capabilityMockSPSpec = capabilityMockSPSpec.replaceAll("@OutputData@", outputDataFeature);
				//
				// add csts
				// capabilitySP += this.cstSP;
				//
				capabilitiesValueMockSPSpec.add(capabilityMockSPSpec);

				capabilityFG.capabilityFMSP = capabilitySP + capabilitySPCst;
				capabilityFG.capabilityFMSC = capabilitySC + capabilitySCCst;

				// serviceFG.capabilityFGs.add(capabilityFG);

			}

			////////////////
			// SC
			String serviceValueSC = "";
			serviceValueSC += setServiceSCFeatures(serviceFG.id, buildAlternativeFeature(capabilitiesKeySC));

			for (int capI = 0; capI < capabilitiesValueSC.size(); capI++) {
				serviceValueSC += capabilitiesValueSC.get(capI);
			}
			//
			servicesValueSC.add(serviceValueSC);
			servicesKeySC.add("Service" + serviceFG.id);
			////////////////

			////////////////
			// SP
			String serviceValueSP = "";
			serviceValueSP += setServiceSPFeatures(serviceFG.id, buildAlternativeFeature(capabilitiesKeySP));

			for (int capI = 0; capI < capabilitiesValueSP.size(); capI++) {
				serviceValueSP += capabilitiesValueSP.get(capI);
			}
			//
			servicesValueSP.add(serviceValueSP);
			servicesKeySP.add("Service" + serviceFG.id);
			////////////////

			////////////////
			// MockSPSpec
			String serviceValueMockSPSpec = "";
			serviceValueMockSPSpec += setServiceSPFeatures(serviceFG.id, buildAlternativeFeature(capabilitiesKeySP));

			for (int capI = 0; capI < capabilitiesValueMockSPSpec.size(); capI++) {
				serviceValueMockSPSpec += capabilitiesValueMockSPSpec.get(capI);
			}
			//
			servicesValueMockSPSpec.add(serviceValueMockSPSpec);
			////////////////
		}

		// ////////////////
		// // SC
		String serviceValueSC = "";
		serviceValueSC += buildAlternativeFeature(servicesKeySC);

		serviceValueSC += "; ";

		for (int capI = 0; capI < servicesValueSC.size(); capI++) {
			serviceValueSC += servicesValueSC.get(capI);
		}
		//
		this._fmSC += serviceValueSC + cstSC;
		this._fmSC = this._fmSC.replaceAll(";", ";\n");
		////////////////

		////////////////
		// SP
		String serviceValueSP = "";
		serviceValueSP += buildAlternativeFeature(servicesKeySP);
		serviceValueSP += "; ";

		for (int capI = 0; capI < servicesValueSP.size(); capI++) {
			serviceValueSP += servicesValueSP.get(capI);
		}
		//
		this._fmSP += serviceValueSP + cstSP;
		this._fmSP = this._fmSP.replaceAll(";", ";\n");
		//////////////

		////////////////
		// SP
		String serviceValueMockSPSpec = "";
		serviceValueMockSPSpec += buildAlternativeFeature(servicesKeySP);
		serviceValueMockSPSpec += "; ";

		for (int capI = 0; capI < servicesValueMockSPSpec.size(); capI++) {
			serviceValueMockSPSpec += servicesValueMockSPSpec.get(capI);
		}
		//
		this.mockSPSpec += serviceValueMockSPSpec;
		this.mockSPSpec = this.mockSPSpec.replaceAll(";", ";\n");
		//////////////

		// add quotes
		this._fmSP = FMBDD.getInstance().FM("fmsp", this._fmSP).toString();
		this._fmSC = FMBDD.getInstance().FM("fmsC", this._fmSC).toString();
		this.mockSPSpec = FMBDD.getInstance().FM("fmsppecmoc", this.mockSPSpec).toString();

		// this.fmSPReduceComplexity = this._fmSP;
		this.specializedFMSP = this._fmSP;
		////////////////
	}

	public static String buildAlternativeFeature(ArrayList<String> features) {

		String result = "";
		if (features.size() == 1) {

			result = addQuote(features.get(0));
		}

		else {

			result = "(";

			for (int capI = 0; capI < features.size(); capI++) {
				result += addQuote(features.get(capI));

				if (capI != features.size() - 1)
					result += "|";
			}

			result += ")";
		}

		return result + " ";

	}

	//
	// is not faster than reduceComplexitySP the comparison or the update is
	// done between two capabilities
	// and can generate an incorrect result
	// faster if the comparison or the update is done between two FMs
	// @Deprecated
	// public String reduceComplexitySP2(String fm) {
	//
	// System.out.println("Reduce complexity");
	//
	// // FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
	// FeatureModelVariable fmSPFMV = null;
	// String result = "";
	// try {
	// fmSPFMV = fmUpdateBDD.FM("fmSP", fm);
	//
	// result = fm;
	//
	// SetVariable fmSPFMVFeatures = fmSPFMV.features();
	// ArrayList<String> reduceFeaturesStringList = util.Functions
	// .fileToStrings(SwitchyardProject.filesDir +
	// "reduce_complexity_features_sp.txt");
	// // ArrayList<String> reduceFeaturesStringList =
	// // util.Functions.fileToStrings(SwitchyardProject.filesDir +
	// "internal_features_sp.txt");
	//
	// //
	// reduceFeaturesStringList.addAll(util.Functions.fileToStrings(SwitchyardProject.filesDir
	// + "reduce_complexity_features_sp.txt"));
	//
	// String regexReduceFeaturesString =
	// regexFeatures(reduceFeaturesStringList);
	//
	// // System.out.println(regexReduceFeaturesString);
	//
	// for (String featureName : fmSPFMVFeatures.names()) {
	//
	// if (featureName.matches(regexReduceFeaturesString)) {
	// // featuresToSlice.add(featureName);
	//
	// // System.out.println(featureName);
	// result = result.replaceAll(featureName, "");
	// }
	// }
	// result = result.replaceAll(":\\s*;", ";").replaceAll(";",
	// ";\n").replaceAll("(?m)^;?[ \t]*\r?\n", "");
	// // this.fmSPReduceComplexity = fmSPFMV.toString();
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// return result;
	// }

	// public static String insertReducedFeatures(String fm)
	// {
	//
	// }

	public static ArrayList<FeatureInsert> getFeaturesToReduce(String fm) {

		ArrayList<FeatureInsert> featureInserts = new ArrayList<FeatureInsert>();

		FeatureModelVariable fmSPFMV = null;
		try {
			fmSPFMV = FMBDD.getInstance().FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmSPFMV.features();
			ArrayList<String> reduceFeaturesStringList = util.Functions
					.StringToList(SwitchyardProject.REDUCE_COMPLEXITY_FEATURES_SP_CONTENT, "\n");

			String regexReduceFeaturesString = regexFeatures(reduceFeaturesStringList);

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(regexReduceFeaturesString)) {

					String featureParent = fmSPFMV.getFeature(featureName).parent().getFtName();

					// System.out.println(featureName + " : " + featureParent);

					FeatureModelVariable fmvToInsert = new FeatureModelVariable("fm1", fmSPFMV.extract(featureName));

					featureInserts
							.add(new FeatureInsert(featureName, featureParent, FeatureEdgeKind.MANDATORY, fmvToInsert));
					// fmSPFMV.removeFeature(featureName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return featureInserts;
	}

	public static String removeFeatures(String fm, ArrayList<FeatureInsert> featureInserts) throws Exception {

		FeatureModelVariable fmv = FMBDD.getInstance().FM("fm", fm);

		for (FeatureInsert featureInsert : featureInserts) {

			fmv.removeFeature(featureInsert.featureName);
		}

		return fmv.toString();
	}

	public static String insertFeatures(String fm, ArrayList<FeatureInsert> featureInserts) throws Exception {

		FeatureModelVariable fmv = FMBDD.getInstance().FM("fm", fm);

		for (FeatureInsert featureInsert : featureInserts) {

			if (fmv.features().names().contains(featureInsert.featureParent))
				fmv.insert(featureInsert.fmvToInsert, featureInsert.featureParent, featureInsert.featureEdgeKind);

		}

		return fmv.toString();
	}

	// to accelerate the update operator
	public static String reduceComplexitySP(String fm) {

		System.out.println("Reduce complexity");

		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		FeatureModelVariable fmSPFMV = null;
		try {
			fmSPFMV = FMBDD.getInstance().FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmSPFMV.features();
			ArrayList<String> reduceFeaturesStringList = util.Functions
					.StringToList(SwitchyardProject.REDUCE_COMPLEXITY_FEATURES_SP_CONTENT, "\n");
			// ArrayList<String> reduceFeaturesStringList =
			// util.Functions.fileToStrings(SwitchyardProject.filesDir +
			// "internal_features_sp.txt");

			// reduceFeaturesStringList.addAll(util.Functions.fileToStrings(SwitchyardProject.filesDir
			// + "reduce_complexity_features_sp.txt"));

			String regexReduceFeaturesString = regexFeatures(reduceFeaturesStringList);

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(regexReduceFeaturesString)) {
					// featuresToSlice.add(featureName);
					fmSPFMV.removeFeature(featureName);
				}
			}
			// this.fmSPReduceComplexity = fmSPFMV.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fmSPFMV.toString();
	}

	// public static String checkEssentialAndInternalVariability(String fm) {
	//
	// // System.out.println("Found internal and essential features SP");
	// // FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
	// FeatureModelVariable fmSPFMV;
	//
	// // Set<String> internaFeatures = new HashSet<String>();
	//
	// String error = "";
	//
	// try {
	// fmSPFMV = FMBDD.getInstance().FM("specializedFMSP", fm);
	//
	// SetVariable fmSPFMVFeatures = fmSPFMV.features();
	//
	// ArrayList<String> internalEssentialFeaturesStringList = util.Functions
	// .StringToList(SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT, "\n");
	//
	// internalEssentialFeaturesStringList
	// .addAll(util.Functions.StringToList(SwitchyardProject.ESSENTIAL_FEATURES_CONTENT,
	// "\n"));
	//
	// String regexInternalEssentialFeaturesString =
	// regexFeatures(internalEssentialFeaturesStringList);
	// // System.out.println(regexInternalEssentialFeaturesString);
	//
	// // Set<String> optionalFeatures = fmSPFMV.getOptionals();
	// Set<String> mandatoryFeatures = fmSPFMV.getMandatory();
	//
	// for (String featureName : fmSPFMVFeatures.names()) {
	//
	// if (featureName.matches(regexInternalEssentialFeaturesString)
	// && !mandatoryFeatures.contains(featureName)) {
	// // internaFeatures.add(featureName);
	// // fmSPFMV.removeFeature(featureName);
	//
	// error += "The variability of " + featureName + " must be resolved.\n";
	// // System.out.println("The variability of " + featureName +
	// // " must be resolved.");
	// }
	// }
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	//
	// return error;
	// }

	public static Set<String> getCorrespondingFeatures(Set<String> features, String featuresFileContent) {

		// System.out.println("Found internal features SP");
		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		// FeatureModelVariable fmSPFMV;

		Set<String> internaFeatures = new HashSet<String>();

		try {
			// fmSPFMV = fmUpdateBDD.FM("fmSP", fm);

			// SetVariable fmSPFMVFeatures = fmSPFMV.features();

			ArrayList<String> internalFeaturesStringList = util.Functions.StringToList(featuresFileContent, "\n");

			String regexInternalFeaturesString = regexFeatures(internalFeaturesStringList);

			// System.out.println(regexInternalFeaturesString);

			for (String featureName : features) {

				if (featureName.matches(regexInternalFeaturesString)) {
					internaFeatures.add(featureName);
					// fmSPFMV.removeFeature(featureName);

					// System.out.println(featureName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return internaFeatures;

	}

	public static String regexFeatures(ArrayList<String> inFeatures) {

		// a
		// b
		// => (a|b).*

		String result = "(";

		if (inFeatures.size() == 1)
			return inFeatures.get(0) + ".*";

		for (int i = 0; i < inFeatures.size(); i++) {

			result += inFeatures.get(i);

			if (inFeatures.size() - 1 != i)
				result += "|";

		}

		result += ")";

		result += "|" + result + "_.*";

		return result;
	}

	public static Set<String> getSharedFeatures(FeatureModelVariable fmv) {

		Set<String> result = new HashSet<String>();

		Set<String> featuresFM = fmv.features().names();

		ArrayList<String> sharedFeaturesStringList = util.Functions
				.fileToStrings(SwitchyardProject.FEATURES_DIR + "essential_features.txt");
		sharedFeaturesStringList
				.addAll(util.Functions.fileToStrings(SwitchyardProject.FEATURES_DIR + "specialized_features.txt"));

		for (String featureFM : featuresFM) {
			for (String sharedFeature : sharedFeaturesStringList) {

				if (featureFM.matches(sharedFeature + "_.*")) {
					result.add(featureFM);
					break;
				}
			}
		}

		return result;

	}

	public static Set<String> getOmmitedSharedFeaturesSP(String fmSC, String fmSPSpec) throws Exception {

		Set<String> result = new HashSet<String>();

		FeatureModelVariable fmSPSpecFMV = FMBDD.getInstance().FM("fmSPSpec", fmSPSpec);
		FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("fmSP", fmSC);

		Set<String> fmSPSpecFeatures = fmSPSpecFMV.features().names();
		Set<String> fmSPFeatures = fmSPFMV.features().names();

		Set<String> difference = com.google.common.collect.Sets.difference(fmSPFeatures, fmSPSpecFeatures);

		result = com.google.common.collect.Sets.difference(difference,
				getCorrespondingFeatures(difference, SwitchyardProject.INTERNAL_FEATURES_SC_CONTENT));

		// System.out.println("SC: " + fmSPFeatures + "\n");
		// System.out.println("SPSpec: " + fmSPSpecFeatures + "\n");
		// System.out.println("diff: " +result);
		// System.exit(-1);

		//
		// String regexFeaturesString = regexFeatures(sharedFeaturesStringList);

		// Set<String> fmSCFeatures = fmSCFMV.getFm().features();
		// Set<String> fmSPFeatures = fmSPFMV.getFm().features();
		//
		// Set<String> intersectionFeatures = new HashSet<String>(fmSCFeatures);
		// intersectionFeatures.retainAll(fmSPFeatures);

		return result;

	}

	// public void updateFMSC() throws Exception {
	// // FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
	//
	// FeatureModelVariable fmSPFMV = fmUpdateBDD.FM("fmSP", this._fmSP);
	//
	// ArrayList<String> essentialFeaturesStringList =
	// util.Functions.fileToStrings(SwitchyardProject.filesDir +
	// "essential_features.txt");
	//
	// for (ServiceFG serviceFG : this.contractFG.serviceFGs) {
	//
	// for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {
	//
	// FeatureModelVariable fmToUpdate = fmUpdateBDD.FM("fmToUpdate",
	// capabilityFG.capabilityFMSC);
	//
	// FeatureModelVariable fmToPreserve = fmUpdateBDD.FM("fmToPreserve",
	// capabilityFG.capabilityFMSP);
	//
	// FeatureModelVariable updated = fmUpdateBDD.updateFM(fmToUpdate,
	// fmToPreserve, SliceMode.INCLUDING);
	//
	// // System.out.println("SC: " + fmToUpdate);
	// // System.out.println("SP: " + fmToPreserve);
	// // System.out.println("SC updated: " +updated);
	// // System.exit(-1);
	// }
	// }
	// }

	public static String checkAttributesValue(String fm) throws Exception {

		String error = "";

		FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("fmSP", fm);

		ArrayList<String> attributeFeaturesStringList = util.Functions
				.StringToList(SwitchyardProject.ATTRIBUTES_SC_CONTENT, "\n");

		String regexFeaturesString = regexFeatures(attributeFeaturesStringList);

		// System.out.println(regexFeaturesString);

		SetVariable fmSPFMVFeatures = fmSPFMV.features();

		for (String featureName : fmSPFMVFeatures.names()) {

			if (featureName.matches(regexFeaturesString) && !featureName.matches(".+" + EQ_ATTRIBUTE + ".+")) {
				error += "The feature " + featureName + " is an attribute and must be valued by =" + ".\n";
			}
		}

		return error;
	}

	// @Deprecated
	// //compare two whole FMs is comsumming
	// public boolean checkSpecialization(String fmSP, String fmSPSpec) throws
	// Exception {
	// Comparison p = fmUpdateBDD.FM("fm_sp_spec",
	// fmSPSpec).compare(fmUpdateBDD.FM("fm_sp", fmSP));
	//
	// // System.out.println(p);
	//
	// if (p == Comparison.SPECIALIZATION)
	// return true;
	// else {
	// error += "fm_sp_spec is a " + p + " and it must be a sepcialization of
	// fm_sp.\n";
	// return false;
	// }
	// }

	public static String checkSpecialization2(String fmSP, String fmSPSpec) throws Exception {

		ContractFG contractFGSP = extractContractFG(fmSP);
		ContractFG contractFGSPSpec = extractContractFG(fmSPSpec);

		Comparison comparison = null;
		String error = "";

		for (int i = 0; i < contractFGSP.serviceFGs.size(); i++) {

			// contractFGSP.serviceFGs.get(i);
			// contractFGSPSpec.serviceFGs.get(i);

			for (int j = 0; j < contractFGSP.serviceFGs.get(i).capabilityFGs.size(); j++) {

				CapabilityFG capabilityFGSP = contractFGSP.serviceFGs.get(i).capabilityFGs.get(j);
				CapabilityFG capabilityFGSPSpec = contractFGSPSpec.serviceFGs.get(i).capabilityFGs.get(j);

				// contractFGSP.serviceFGs.get(i).capabilityFGs.get(j);
				// contractFGSPSpec.serviceFGs.get(i).capabilityFGs.get(j);

				FeatureModelVariable fmSPSpecFMV = FMBDD.getInstance().FM("fmSPSpec",
						reduceComplexitySP(capabilityFGSPSpec.capabilityFM));

				FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("fmSPFMV",
						reduceComplexitySP(capabilityFGSP.capabilityFM));

				comparison = fmSPSpecFMV.compare(fmSPFMV);

				// System.out.println("capabilityFMSPspec:\n" +
				// capabilityFMSPspec);
				// System.out.println("capabilityFMSP:\n" + capabilityFMSP);

				if (comparison != Comparison.SPECIALIZATION) {
					error += capabilityFGSPSpec.name + " of fm_sp_spec is a " + comparison + " of "
							+ capabilityFGSP.name + " of fm_sp and it must be a sepcialization.\n";

				}
			}

		}

		// for (ServiceFG serviceFG : contractFG.serviceFGs) {
		//
		// for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {
		//
		// FeatureModel<String> capabilityFMSP =
		// fmSPFMV.extract(capabilityFG.capabilityName);
		// FeatureModel<String> capabilityFMSPspec =
		// fmSPSpecFMV.extract(capabilityFG.capabilityName);
		//
		// comparison = (new FeatureModelVariable("", capabilityFMSPspec))
		// .compare(new FeatureModelVariable("", capabilityFMSP));
		//
		// // System.out.println("capabilityFMSPspec:\n" +
		// // capabilityFMSPspec);
		// // System.out.println("capabilityFMSP:\n" + capabilityFMSP);
		//
		// if (comparison != Comparison.SPECIALIZATION) {
		// error += capabilityFG.capabilityName + " of fm_sp_spec is a " +
		// comparison + " of "
		// + capabilityFG.capabilityName + " of fm_sp and it must be a
		// sepcialization.\n";
		// return false;
		// }
		//
		// }
		//
		// }

		return error;
		// if (comparison == Comparison.SPECIALIZATION)
		// return true;
		// else {
		// error += "fm_sp_spec is a " + comparison + " and it must be a
		// sepcialization of fm_sp.\n";
		// return false;
		// }
	}

	// @Deprecated
	// public String deleteAndUpdate(String fmSPSpec, String fmSC) throws
	// Exception {
	// // FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
	//
	// FeatureModelVariable fmSPSpecFMV = fmUpdateBDD.FM("fmSPSpec",
	// reduceComplexitySP(fmSPSpec));
	//
	// // System.out.println("Spec: \n" + fmSPSpecFMV);
	//
	// FeatureModelVariable fmSCFMV = fmUpdateBDD.FM("fmSCFMV", fmSC);
	//
	// // System.out.println("SC: \n" + fmSCFMV);
	//
	// // FMDeleteBDD fmDeleteBDD = new FMDeleteBDD();
	//
	// // System.out.println("features to delete \n" +
	// // getOmmitedSharedFeaturesSP(fmSC, fmSPSpec));
	//
	// System.out.println("Delete ommited shared features");
	// FeatureModelVariable fmSCFMVDeleted = fmDeleteBDD.deleteFM(fmSCFMV,
	// getOmmitedSharedFeaturesSP(fmSC, fmSPSpec));
	//
	// // System.out.println("Deleted: \n" + fmSCFMVDeleted);
	//
	// // System.exit(-1);
	//
	// System.out.println("Updating");
	// FeatureModelVariable fmSCFMVUpdated =
	// fmUpdateBDD.updateFM(fmSCFMVDeleted, fmSPSpecFMV,
	// getCorrespondingFeatures(fmSPSpecFMV.features().names(),
	// SwitchyardProject.filesDir + "internal_features_sp.txt"),
	// SliceMode.EXCLUDING);
	//
	// this.updatedFMSC = fmSCFMVUpdated.toString();
	//
	// this.updatedAttributedFMSC = setAttributesValues(this.updatedFMSC);
	// return fmSCFMVUpdated.toString();
	//
	// }

	public static String slice(String fmToSlice, Set<String> featureSetToSlice, SliceMode sliceMode) throws Exception {

		System.out.println("Execute slice operation");

		ContractFG contractFGResult = new ContractFG();

		ContractFG contractFGToSlice = extractContractFG(fmToSlice);

		for (ServiceFG serviceFGToSlice : contractFGToSlice.serviceFGs) {

			ServiceFG serviceFGResult = new ServiceFG();
			serviceFGResult.name = serviceFGToSlice.name;
			serviceFGResult.id = serviceFGResult.name.substring(serviceFGResult.name.indexOf("_"));
			// serviceFGResult.serviceName = serviceFGToSlice.serviceName;

			for (CapabilityFG capabilityFGToUpdate : serviceFGToSlice.capabilityFGs) {

				CapabilityFG capabilityFGResult = new CapabilityFG();
				capabilityFGResult.name = capabilityFGToUpdate.name;

				capabilityFGResult.id = capabilityFGToUpdate.name.substring(capabilityFGToUpdate.name.indexOf("_"));

				// toupdate
				FeatureModelVariable capabilityFGToUpdateFMV = FMBDD.getInstance().FM("capabilityFGToUpdate",
						capabilityFGToUpdate.capabilityFM);

				FeatureModelVariable capabilityFGToUpdateFMVDelAttributeFMV = FMBDD.getInstance().FM("fm",
						deleteAttributesValues(capabilityFGToUpdateFMV.toString()));

				ArrayList<FeatureInsert> featuresReducedToUpdate = getFeaturesToReduce(
						capabilityFGToUpdateFMVDelAttributeFMV.toString());

				// All featuresReducedToUpdate are core features. Thus, if
				// featureSetToSlice in featuresReducedToUpdate, then it is ok.

				// FeatureModelVariable capabilityFGToUpdateFMVComplexityReduced
				// = capabilityFGToUpdateFMVDelAttributeFMV;
				FeatureModelVariable capabilityFGToUpdateFMVComplexityReduced = FMBDD.getInstance().FM("fmSPSpec",
						removeFeatures(capabilityFGToUpdateFMVDelAttributeFMV.toString(), featuresReducedToUpdate));

				Set<String> featureSetToSliceCapability = com.google.common.collect.Sets.intersection(featureSetToSlice,
						capabilityFGToUpdateFMVComplexityReduced.features().names());

				FeatureModelVariable capabilitySliced = capabilityFGToUpdateFMVComplexityReduced;

				boolean ok = !((featureSetToSliceCapability.size() == 0 && sliceMode == SliceMode.EXCLUDING)
						|| (featureSetToSliceCapability.size() == capabilityFGToUpdateFMVDelAttributeFMV.features()
								.size() && sliceMode == SliceMode.INCLUDING));

				if (ok) {
					capabilitySliced = FMBDD.getSlicerInstance().sliceFM(capabilityFGToUpdateFMVComplexityReduced,
							featureSetToSliceCapability, sliceMode);
				}

				System.out.println(capabilitySliced);

				// to avoid inserting the features to slice
				for (FeatureInsert featureInsert : featuresReducedToUpdate) {

					for (String feature : featureInsert.fmvToInsert.features().names()) {

						if (featureSetToSlice.contains(feature))
							featureInsert.fmvToInsert.removeFeature(feature);
					}
				}

				capabilityFGResult.capabilityFM = capabilitySliced.toString();

				capabilityFGResult.capabilityFM = insertFeatures(capabilitySliced.toString(), featuresReducedToUpdate);
				//
				capabilityFGResult.capabilityFM = setAttributesValues(capabilityFGResult.capabilityFM,
						extractAttributesValues(capabilityFGToUpdateFMV.toString()));

				serviceFGResult.capabilityFGs.add(capabilityFGResult);
				//
				// System.out.println(capabilityFGResult.capabilityFM);

			}

			contractFGResult.serviceFGs.add(serviceFGResult);

		}

		return buildFMV(contractFGResult, fmToSlice);
	}

	// public String fixManuallyOperation()
	// {
	//
	//
	// }

	public static String updateAndDelete2(String fmToUpdate, String fmToPreserve, Set<String> featureSetToDelete,
			boolean performSlice, Set<String> featureSetToSlice) throws Exception {

		System.out.println("Execute update and delete operations");

		ContractFG contractFGResult = new ContractFG();

		ContractFG contractFGToUpdate = extractContractFG(fmToUpdate);

		ContractFG contractFGToPreserve = extractContractFG(fmToPreserve);

		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		// FMDeleteBDD fmDeleteBDD = new FMDeleteBDD();

		for (ServiceFG serviceFGToUpdate : contractFGToUpdate.serviceFGs) {
			// if(contractFGToPreserve.serviceFGs.contains(serviceFGToUpdate.serviceName))
			for (ServiceFG serviceFGToPreserve : contractFGToPreserve.serviceFGs) {
				// search service
				if (serviceFGToUpdate.name.equals(serviceFGToPreserve.name)) {

					ServiceFG serviceFGResult = new ServiceFG();
					serviceFGResult.name = serviceFGToUpdate.name;
					// serviceFGResult.serviceName =
					// serviceFGToPreserve.serviceName;

					serviceFGResult.id = serviceFGResult.name.substring(serviceFGResult.name.indexOf("_"));

					for (CapabilityFG capabilityFGToUpdate : serviceFGToUpdate.capabilityFGs) {
						for (CapabilityFG capabilityFGToPreserve : serviceFGToPreserve.capabilityFGs) {
							// search capability
							if (capabilityFGToUpdate.name.equals(capabilityFGToPreserve.name)) {

								CapabilityFG capabilityFGResult = new CapabilityFG();
								capabilityFGResult.name = capabilityFGToUpdate.name;

								capabilityFGResult.id = capabilityFGResult.name
										.substring(capabilityFGResult.name.indexOf("_"));

								// transformation process

								// toupdate
								FeatureModelVariable capabilityFGToUpdateFMV = FMBDD.getInstance()
										.FM("capabilityFGToUpdate", capabilityFGToUpdate.capabilityFM);

								FeatureModelVariable capabilityFGToUpdateFMVDelAttributeFMV = FMBDD.getInstance()
										.FM("fm", deleteAttributesValues(capabilityFGToUpdateFMV.toString()));

								ArrayList<FeatureInsert> featuresReducedToUpdate = getFeaturesToReduce(
										capabilityFGToUpdateFMVDelAttributeFMV.toString());

								FeatureModelVariable capabilityFGToUpdateFMVComplexityReduced = FMBDD.getInstance().FM(
										"fmSPSpec", removeFeatures(capabilityFGToUpdateFMVDelAttributeFMV.toString(),
												featuresReducedToUpdate));

								// topreserve
								FeatureModelVariable capabilityFGToPreserveFMV = FMBDD.getInstance()
										.FM("capabilityFGToPreserve", capabilityFGToPreserve.capabilityFM);

								FeatureModelVariable capabilityFGToPreserveFMVDelAttributeFMV = FMBDD.getInstance()
										.FM("fm", deleteAttributesValues(capabilityFGToPreserveFMV.toString()));

								FeatureModelVariable capabilityFGToPreserveFMVComplexityReduced = FMBDD.getInstance()
										.FM("fmSPSpec", reduceComplexitySP(
												capabilityFGToPreserveFMVDelAttributeFMV.toString()));

								//
								System.out.println("Updating");

								// FeatureModelVariable
								// capabilityUpdatedPrimFMV;

								// FMBDD.getInstance().FM("r",reduceComplexitySP(
								// capabilityFGToUpdateFMVDelAttributeFMV.toString()));

								Formula<String> formulaUpdate = FMUpdateBDD.getUpdateFMFormula(
										capabilityFGToUpdateFMVComplexityReduced,
										capabilityFGToPreserveFMVComplexityReduced, performSlice, featureSetToSlice,
										SliceMode.EXCLUDING);

								// if (performSlice == true) {
								//
								// capabilityUpdatedPrimFMV =
								// FMUpdateBDD.updateWithSliceFM(
								// capabilityFGToUpdateFMVComplexityReduced,
								// capabilityFGToPreserveFMVComplexityReduced,
								// featureSetToSlice,
								// SliceMode.EXCLUDING);
								// } else {
								//
								// capabilityUpdatedPrimFMV =
								// FMUpdateBDD.updateFMWithOutSlice(
								// capabilityFGToUpdateFMVComplexityReduced,
								// capabilityFGToPreserveFMVComplexityReduced);
								// }

								Set<String> featureSetToDeleteCapability = com.google.common.collect.Sets.intersection(
										featureSetToDelete,
										capabilityFGToUpdateFMVComplexityReduced.features().names());

								// System.out.println(featureSetToDeleteCapability);

								System.out.println("Delete ommited shared features");
								// FeatureModelVariable capabilityUpdatedFMV =
								// FMDeleteBDD.deleteFM2(
								// capabilityFGToUpdateFMVComplexityReduced,
								// featureSetToDeleteCapability);

								Formula<String> formulaUpdateDelete = formulaUpdate;

								if (featureSetToDeleteCapability.size() != 0) {
									Formula<String> formulaDelete = FMDeleteBDD.getDeleteFMFormula(
											capabilityFGToUpdateFMVComplexityReduced, featureSetToDeleteCapability);

									formulaUpdateDelete = formulaUpdate.andWith(formulaDelete);

								}

								FeatureModelVariable capabilityUpdatedFMV = FMBDD.synthesisFM(formulaUpdateDelete,
										capabilityFGToUpdateFMVComplexityReduced);

								// delete redundant constraints

								// cleanup in delete
								// capabilityUpdatedFMV.cleanup2();
								// capabilityUpdatedFMV.eliminateRedundantConstraints();

								// System.exit(-1);

								// for (Expression<String> constraint :
								// capabilityUpdatedFMV.getFm().getConstraints())
								// {
								//
								// cst += constraint + ";\n";
								// }

								// System.out.println(getOmmitedSharedFeaturesSP(capabilityFGToUpdateFMV.toString(),
								// capabilityFGToPreserveFMV.toString()) +
								// "\n");

								// FIXME
								// anomalie in update:: ksynthetisis. contrainst
								// such a ->(a|b)
								// are not considered
								// We add manually MOM implies (Transactional or
								// Acknowledgement) if Transactional or
								// Acknowledgement exists

								// String id = "_" + serviceNumber + "_" +
								// capabilityNumber;

								// String id = "_" +
								// capabilityFGToUpdate.capabilityName
								// .substring(capabilityFGToUpdate.capabilityName.indexOf("_"));

								// int AckTrans = 0;
								// for (String feature :
								// capabilityUpdatedFMV.features().names()) {
								// if (feature.contains("Transactional") ||
								// feature.contains("Acknowledgement")) {
								// cst += "MOM@@ implies (Transactional@@ or
								// Acknowledgement@@)".replaceAll("@@",
								// capabilityFGToUpdate.id) + ";\n";
								// AckTrans++;
								// }
								// }
								//
								// // (Acknowledgement_3_3 ->
								// !Transactional_3_3);
								// if (AckTrans == 2)
								// cst += "(Acknowledgement@@ ->
								// !Transactional@@)".replaceAll("@@",
								// capabilityFGToUpdate.id) + ";\n";

								// String cst = "";

								// if (capabilityUpdatedFMV.features().names()
								// .contains("Acknowledgement" +
								// capabilityFGToUpdate.id)
								// && capabilityUpdatedFMV.features().names()
								// .contains("Transactional" +
								// capabilityFGToUpdate.id)) {
								//
								// contractFGResult.csts += "MOM@@ implies
								// (Transactional@@ or Acknowledgement@@)".
								// replaceAll("@@", capabilityFGToUpdate.id) +
								// ";\n";
								//
								// contractFGResult.csts += "(Acknowledgement@@
								// -> !Transactional@@)".replaceAll("@@",
								// capabilityFGToUpdate.id) + ";\n";
								//
								// }

								// addPropositionalConstraints(capabilityUpdatedFMV,
								// capabilityFGToUpdate, contractFGResult);

								System.out.println(capabilityUpdatedFMV + "\n");

								// remove constraints that contain feature to
								// delete

								// System.out.println(featureSetToDeleteCapability);
								//
								// System.out.println(capabilityUpdatedFMV);

								// System.exit(-1);

								// capabilityUpdatedFMV.getFm().removeAllConstraints();

								// capabilityFGResult.capabilityFM =
								// capabilityUpdatedFMV.toString();

								// capabilityUpdatedFMV.cleanup2();

								capabilityFGResult.capabilityFM = insertFeatures(capabilityUpdatedFMV.toString(),
										featuresReducedToUpdate);

								capabilityFGResult.capabilityFM = setAttributesValues(capabilityFGResult.capabilityFM,
										extractAttributesValues(capabilityFGToUpdateFMV.toString()));

								capabilityFGResult.capabilityFM = setAttributesValues(capabilityFGResult.capabilityFM,
										extractSharedAttributesValues(capabilityFGToPreserveFMV.toString()));

								serviceFGResult.capabilityFGs.add(capabilityFGResult);

								// System.exit(-1);

								break;
							}
						}

					}

					contractFGResult.serviceFGs.add(serviceFGResult);

					break;
				}

			}

		}

		// contractFGResult.csts = cst;

		// buildFMV(contractFGResult);

		// add cst

		return buildFMV(contractFGResult, fmToPreserve);
	}

	// @Deprecated
	// public String updateAndDelete(String fmSPSpec, String fmSC) throws
	// Exception {
	//
	// System.out.println("Execute update and delete operations");
	// // FeatureModelVariable fmSPSpecFMV = fmUpdateBDD.FM("fmSPSpec",
	// // reduceComplexitySP2(fmSPSpec));
	//
	// FeatureModelVariable fmSPSpecFMV = FMBDD.getInstance().FM("fmSPSpec",
	// fmSPSpec);
	//
	// FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmSCFMV", fmSC);
	//
	// // System.out.println(fmSPSpecFMV);
	// //
	// // System.exit(-1);
	//
	// String cst = "";
	// String resultFM = SC_ROOT + ": ";
	//
	// // System.out.println("eza");
	//
	// // contractFG = getServiceCapability(fm)
	//
	// ArrayList<String> keyServiceGF = new ArrayList<String>();
	// for (ServiceFG serviceFG : contractFG.serviceFGs) {
	//
	// keyServiceGF.add(serviceFG.serviceName);
	//
	// }
	//
	// resultFM += buildAlternativeFeature(keyServiceGF) + ";";
	//
	// // System.out.println(resultFM);
	//
	// int serviceNumber = 1;
	// for (ServiceFG serviceFG : contractFG.serviceFGs) {
	//
	// int capabilityNumber = 1;
	//
	// ArrayList<String> keyCapabilityFG = new ArrayList<String>();
	// for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {
	//
	// keyCapabilityFG.add(capabilityFG.capabilityName);
	//
	// }
	//
	// resultFM += serviceFG.serviceName + ":" + " ServiceName_" + serviceNumber
	// + " "
	// + buildAlternativeFeature(keyCapabilityFG) + ";";
	//
	// for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {
	//
	// String id = "_" + serviceNumber + "_" + capabilityNumber;
	//
	// String capabilityId = "Capability_" + serviceNumber + "_" +
	// capabilityNumber;
	//
	// FeatureModel<String> capabilityFMSC = fmSCFMV.extract(capabilityId);
	// FeatureModel<String> capabilityFMSPspec =
	// fmSPSpecFMV.extract(capabilityId);
	//
	// // SC
	// // remove first line (1: Capability_1_1 ; )
	// // String capabilityFMSCString = capabilityFMSC.toString()
	// // .substring(capabilityFMSC.toString().indexOf('\n') + 1);
	// //
	//
	// FeatureModelVariable capabilityFMSCFMV = new FeatureModelVariable("FMSC",
	// capabilityFMSC);
	// // System.out.println("----------------\n" + capabilityFMSCFMV);
	//
	// // fmUpdateBDD.FM("capSC", capabilityFMSCString);
	//
	// // SP
	// // remove first line (1: Capability_1_1 ; )
	// // String capabilityFMSPspecString =
	// // capabilityFMSPspec.toString()
	// // .substring(capabilityFMSPspec.toString().indexOf('\n') + 1);
	// //
	// FeatureModelVariable capabilityFMSPSpecFMV = new FeatureModelVariable("",
	// capabilityFMSPspec);
	//
	// // // delete
	// // System.out.println("Delete ommited shared features");
	// // FeatureModelVariable capabilityFMSCFMVDeleted =
	// // fmDeleteBDD.deleteFM(capabilityFMSCFMV,
	// // getOmmitedSharedFeaturesSP(capabilityFMSCFMV.toString(),
	// // capabilityFMSPSpecFMV.toString()));
	// //
	// // System.out.println("Updating");
	// // FeatureModelVariable capabilityFMSCFMVUpdatedFMV =
	// // fmUpdateBDD.updateFM(capabilityFMSCFMVDeleted,
	// // fmUpdateBDD.FM("fmSPSpec",
	// // reduceComplexitySP(capabilityFMSPSpecFMV.toString())),
	// // getCorrespondingFeatures(capabilityFMSPSpecFMV.features().names(),
	// // SwitchyardProject.filesDir + "internal_features_sp.txt"),
	// // SliceMode.EXCLUDING);
	//
	// System.out.println("Updating");
	// FeatureModelVariable capabilityFMSCFMVUpdatedPrimFMV =
	// FMUpdateBDD.updateWithSliceFM(capabilityFMSCFMV,
	// FMBDD.getInstance().FM("fmSPSpec",
	// reduceComplexitySP(capabilityFMSPSpecFMV.toString())),
	// getCorrespondingFeatures(capabilityFMSPSpecFMV.features().names(),
	// SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT),
	// SliceMode.EXCLUDING);
	//
	// // System.out.println("\n\n" +
	// // capabilityFMSCFMVUpdatedPrimFMV.toString() + "\n\n");
	//
	// System.out.println("Delete ommited shared features");
	// // FeatureModelVariable capabilityFMSCFMVUpdatedFMV =
	// // fmDeleteBDD.deleteFM(capabilityFMSCFMVUpdatedPrimFMV,
	// // getOmmitedSharedFeaturesSP(capabilityFMSCFMV.toString(),
	// // capabilityFMSPSpecFMV.toString()));
	//
	// FeatureModelVariable capabilityFMSCFMVUpdatedFMV = FMDeleteBDD.deleteFM2(
	// FMBDD.getInstance().FM("m1", capabilityFMSCFMVUpdatedPrimFMV.toString()),
	// getOmmitedSharedFeaturesSP(capabilityFMSCFMV.toString(),
	// capabilityFMSPSpecFMV.toString()));
	//
	// for (Expression<String> constraint :
	// capabilityFMSCFMVUpdatedFMV.getFm().getConstraints()) {
	//
	// cst += constraint + ";";
	// }
	//
	// // FIXME
	// // anomalie in update:: ksynthetisis. contrainst such a ->(a|b)
	// // are not considered
	// // We add manually MOM implies (Transactional or
	// // Acknowledgement) if Transactional or Acknowledgement exists
	//
	// for (String feature : capabilityFMSCFMVUpdatedFMV.features().names()) {
	//
	// if (feature.contains("Transactional") ||
	// feature.contains("Acknowledgement")) {
	// cst += "MOM@@ implies (Transactional@@ or
	// Acknowledgement@@)".replaceAll("@@", id) + ";";
	// break;
	// }
	//
	// }
	//
	// // System.out.println(cst);
	//
	// capabilityFMSCFMVUpdatedFMV.getFm().removeAllConstraints();
	//
	// resultFM += capabilityFMSCFMVUpdatedFMV;
	//
	// System.out.println(resultFM + "\n");
	// // System.exit(-1);
	// //
	// // System.out.println(capabilityFMSCFMVUpdatedFMV);
	//
	// capabilityNumber++;
	//
	// }
	//
	// serviceNumber++;
	// }
	//
	// // FeatureModel<String> fmSCUpdateFM = new FeatureModel<String>(null);
	// //
	// // System.out.println("Delete ommited shared features");
	// // FeatureModelVariable fmSCFMVDeleted = fmDeleteBDD.deleteFM(fmSCFMV,
	// // getOmmitedSharedFeaturesSP(fmSC, fmSPSpec));
	// //
	// // System.out.println("Updating");
	// // FeatureModelVariable fmSCFMVUpdated =
	// // fmUpdateBDD.updateFM(fmSCFMVDeleted, fmSPSpecFMV,
	// // getCorrespondingFeatures(fmSPSpecFMV.features().names(),
	// // SwitchyardProject.filesDir + "internal_features_sp.txt"),
	// // SliceMode.EXCLUDING);
	// //
	// // this.updatedFMSC = fmSCFMVUpdated.toString();
	// //
	// // this.updatedAttributedFMSC = setAttributesValues(this.updatedFMSC);
	//
	// // FeatureModelVariable fmSCFMVUpdated = null;
	//
	// // System.out.println(resultFM + cst);
	//
	// resultFM += cst;
	//
	// this.updatedFMSC = resultFM;
	//
	// this.updatedAttributedFMSC = setAttributesValues(this.updatedFMSC,
	// attributes);
	//
	// return resultFM;
	//
	// }

	public static String deleteAttributesValues(String fm) {

		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = FMBDD.getInstance().FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmFMV.features();

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(".+" + EQ_ATTRIBUTE + ".*")) {

					fmFMV.renameFeature(featureName, featureName.substring(0, featureName.indexOf(EQ_ATTRIBUTE)));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fmFMV.toString();
	}

	public static Map<String, String> extractSharedAttributesValues(String fm) throws Exception {

		Map<String, String> attributesResult = new HashMap<String, String>();

		FeatureModelVariable fmFMV = FMBDD.getInstance().FM("fm", fm);

		Set<String> sharedFeatures = getSharedFeatures(fmFMV);

		for (String featureName : sharedFeatures) {

			if (featureName.matches(".+" + EQ_ATTRIBUTE + ".*")) {

				attributesResult.put(featureName.substring(0, featureName.indexOf(EQ_ATTRIBUTE)),
						featureName.substring(featureName.indexOf(EQ_ATTRIBUTE) + EQ_ATTRIBUTE.length()));

			}
		}

		return attributesResult;
	}

	public static Map<String, String> extractAttributesValues(String fm) {

		Map<String, String> attributesResult = new HashMap<String, String>();
		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = FMBDD.getInstance().FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmFMV.features();

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(".+" + EQ_ATTRIBUTE + ".*")) {
					attributesResult.put(featureName.substring(0, featureName.indexOf(EQ_ATTRIBUTE)),
							featureName.substring(featureName.indexOf(EQ_ATTRIBUTE) + EQ_ATTRIBUTE.length()));

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return attributesResult;
	}

	public static String setAttributesValues(String fm, Map<String, String> attributes) {

		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = FMBDD.getInstance().FM("fm", fm);

			Iterator it = attributes.entrySet().iterator();
			while (it.hasNext()) {

				Map.Entry pair = (Map.Entry) it.next();

				// System.out.println(pair.getKey() + " = " + pair.getValue());

				if (fmFMV.features().names().contains((String) pair.getKey())) {
					String oldFeatureName = (String) pair.getKey();

					// String newFeatureName = addQuote(oldFeatureName +
					// EQ_ATTRIBUTE + pair.getValue());

					String newFeatureName = oldFeatureName + EQ_ATTRIBUTE + pair.getValue();

					fmFMV.renameFeature(oldFeatureName, newFeatureName);
				}
				// it.remove(); // avoids a ConcurrentModificationException
			}

			// SetVariable fmSPFMVFeatures = fmFMV.features();
			//
			// for (String featureName : fmSPFMVFeatures.names()) {
			//
			// if (featureName.matches(".+" + EQ_ATTRIBUTE + ".*")) {
			//
			// fmFMV.renameFeature(featureName, featureName.substring(0,
			// featureName.indexOf(EQ_ATTRIBUTE)));
			//
			// }
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fmFMV.toString();
	}

	public static Contract convertFMSCUpdateToContractXML(String fm) throws Exception {
		// should be executed after update

		Map<String, String> attributes = new HashMap<String, String>();
		attributes = extractAttributesValues(fm);

		Contract contract = new Contract();
		ArrayList<Service> services = new ArrayList<Service>();

		contract.projectName = attributes.get("ProjectName_0");
		contract.hostName = attributes.get("HostName");
		contract.dataInputPkg = contract.projectName + "." + SwitchyardProject.INPUT_DIR;
		contract.dataOutputPkg = contract.projectName + "." + SwitchyardProject.OUTPUT_DIR;

		FeatureModelVariable fmFMV = FMBDD.getInstance().FM("fm", fm);
		ContractFG contractFG = extractContractFG(fm);

		Set<String> featuresFM = fmFMV.features().names();

		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			Service service = new Service();
			service.interfaceName = attributes.get("ServiceName" + serviceFG.id);

			service.beanName = service.interfaceName + "Bean";
			service.number = getFeatureIDNumber(serviceFG.id);

			ArrayList<Capability> capabilities = new ArrayList<Capability>();
			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				Capability capability = new Capability();

				capability.name = attributes.get("CapabilityName" + capabilityFG.id);
				capability.serviceName = service.interfaceName;

				capability.number = getFeatureIDNumber(capabilityFG.id);

				///////// Input output
				ArrayList<Input> inputs = new ArrayList<Input>();
				for (InputFG inputfg : capabilityFG.inputFGs) {

					Input input = new Input();
					input.name = attributes.get("InputName" + inputfg.id);
					input.type = attributes.get("InputType" + inputfg.id);
					input.number = getFeatureIDNumber(inputfg.id);

					// SC
					input.value = attributes.get("InputValue" + inputfg.id);

					inputs.add(input);
				}
				capability.inputs = inputs;
				//
				ArrayList<Output> outputs = new ArrayList<Output>();

				for (OutputFG outputfg : capabilityFG.outputFGs) {

					Output output = new Output();
					output.name = attributes.get("OutputName" + outputfg.id);
					output.type = attributes.get("OutputType" + outputfg.id);
					output.number = getFeatureIDNumber(outputfg.id);

					outputs.add(output);
				}
				//
				capability.outputs = outputs;
				////////////////////////////////

				////////// features true or false
				//

				// SC features
				//
				capability.authentification = featuresFM.contains("TemporaryMemory" + capabilityFG.id);
				capability.synchronous = featuresFM.contains("Synchronous" + capabilityFG.id);
				capability.asynchronous = featuresFM.contains("Asynchronous" + capabilityFG.id);
				capability.username = attributes.get("Username" + capabilityFG.id);
				capability.password = attributes.get("Password" + capabilityFG.id);
				//////////////

				capability.authentification = featuresFM.contains("Authentification" + capabilityFG.id);
				capability.serviceState = featuresFM.contains("ServiceState" + capabilityFG.id);
				capability.stateMessaging = featuresFM.contains("StateMessaging" + capabilityFG.id);
				capability.twoWayState = featuresFM.contains("TwoWayState" + capabilityFG.id);
				capability.statefullService = featuresFM.contains("StatefulService" + capabilityFG.id);
				capability.stateRepository = featuresFM.contains("StateRepository" + capabilityFG.id);
				capability.soap = featuresFM.contains("SOAP" + capabilityFG.id);
				capability.rest = featuresFM.contains("REST" + capabilityFG.id);
				//
				if (featuresFM.contains("Put" + capabilityFG.id))
					capability.restMethod = "Put";
				else if (featuresFM.contains("Get" + capabilityFG.id))
					capability.restMethod = "Get";
				else if (featuresFM.contains("Post" + capabilityFG.id))
					capability.restMethod = "Post";
				else if (featuresFM.contains("Delete" + capabilityFG.id))
					capability.restMethod = "Delete";
				//
				capability.jms = featuresFM.contains("MOM" + capabilityFG.id);
				//
				if (capability.jms == true) {
					capability.broker.serviceName = service.interfaceName;
					capability.broker.capabilityName = capability.name;
					// capability.broker.setQueues(contract.projectName);
					//
					capability.broker.acknowledgement = featuresFM.contains("Acknowledgement" + capabilityFG.id);
					capability.broker.transactional = featuresFM.contains("Transactional" + capabilityFG.id);
					capability.broker.persistentDelivery = featuresFM.contains("PersistentDelivery" + capabilityFG.id);

					capability.broker.publishSubscribe = featuresFM.contains("PublishSubscribe" + capabilityFG.id);
					capability.broker.durable = featuresFM.contains("Durable" + capabilityFG.id);

					// hidden features
					capability.broker.initialContextFactory = attributes.get("InitialContextFactory" + capabilityFG.id);
					capability.broker.providerUrl = attributes.get("ProviderUrl" + capabilityFG.id);
					capability.broker.securityPrincipal = attributes.get("SecurityPrincipal" + capabilityFG.id);
					capability.broker.securityCredentials = attributes.get("SecurityCredentials" + capabilityFG.id);
					capability.broker.connectionFactory = attributes.get("ConnectionFactory" + capabilityFG.id);
					capability.broker.connectionConsumerFactory = attributes
							.get("ConnectionConsumerFactory" + capabilityFG.id);

					capability.broker.queueIn = attributes.get("QueueInJNDI" + capabilityFG.id);
					capability.broker.queueOut = attributes.get("QueueOutJNDI" + capabilityFG.id);

					if (capability.broker.publishSubscribe == true)
						capability.broker.topic = attributes.get("TopicJNDI" + capabilityFG.id);

					// this.initialContextFactory =
					// "org.jboss.naming.remote.client.InitialContextFactory";
					// this.providerUrl = "remote://localhost:4447";
					// this.securityPrincipal = "guest";
					// this.securityCredentials = "jboss@dmin88";
					// this.connectionFactory = "#ConnectionFactory";
					// this.connectionConsumerFactory =
					// "jms/RemoteConnectionFactory";
					// this.queueIn = artifactId + "_in_queue_" + serviceName +
					// "_" + capabilityName;
					// this.queueOut = artifactId + "_out_queue_" + serviceName
					// + "_" + capabilityName;
					// this.topic = artifactId + "_topic_" + serviceName + "_" +
					// capabilityName;
				} else
					capability.broker = null;

				capability.dataInputClassName = attributes.get("InputDataClassName" + capabilityFG.id);
				capability.dataOutputClassName = attributes.get("OutputDataClassName" + capabilityFG.id);

				capability.setConfigurations();
				//
				/////////////////////////////////////

				capabilities.add(capability);
			}

			service.capabilities = capabilities;

			services.add(service);
		}

		contract.services = services;

		return contract;
	}

	// public static String reduceServices(String fm) throws Exception {
	// String result = "";
	//
	// FeatureModelVariable fmv = FMBDD.getInstance().FM("fmi", fm);
	//
	// for (String feature : fmv.root().children().names()) {
	//
	// if (!feature.matches("Service_.*"))
	// result += feature + " ";
	//
	// }
	//
	// System.out.println(result);
	//
	// return result;
	// }

	public static String buildFMV(ContractFG contractFG, String fm) throws Exception {

		String result = SC_ROOT + ": ";
		// String csts = "";

		FeatureModelVariable fmv = FMBDD.getInstance().FM("fmi", fm);

		// insert children of root
		for (String feature : fmv.root().children().names()) {

			if (!feature.matches("Service_.*"))
				result += addQuote(feature) + " ";

		}

		ArrayList<String> keyServiceGF = new ArrayList<String>();
		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			keyServiceGF.add(serviceFG.name);

		}

		result += buildAlternativeFeature(keyServiceGF) + ";\n";

		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			ArrayList<String> keyCapabilityFG = new ArrayList<String>();
			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				keyCapabilityFG.add(capabilityFG.name);

			}

			result += serviceFG.name + ": " + buildAlternativeFeature(keyCapabilityFG);

			// insert children of service
			for (String feature : fmv.getFeature(serviceFG.name).children().names()) {

				if (!feature.matches("Capability_.*"))
					result += addQuote(feature) + " ";

			}

			// String serviceName = searchFeatureMatch(fmv, "ServiceName" +
			// serviceFG.id);

			result += ";\n";

			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				FeatureModelVariable fmvCapability = FMBDD.getInstance().FM("fmv", capabilityFG.capabilityFM);

				// for (Expression<String> constraint :
				// fmvCapability.getFm().getConstraints()) {
				//
				// csts += constraint + ";\n";
				// }
				//
				fmvCapability.removeAllConstraints();

				addPropositionalConstraints(fmvCapability, capabilityFG, contractFG);

				result += fmvCapability.toString();

			}
		}

		System.out.println("ezaea: " + contractFG.csts);

		// result += csts + contractFG.csts;
		result += "\n" + contractFG.csts;
		return result;

	}

	public static ContractFG extractContractFG(String fm) throws Exception {

		String FEATURE_SERVICE = "Service";
		String FEATURE_SERVICE_NAME = "ServiceName";
		String FEATURE_CAPABILITY = "Capability";
		String FEATURE_INPUT_DATA = "InputData";
		String FEATURE_OUTPUT_DATA = "OutputData";

		ContractFG contractFG = new ContractFG();
		FeatureModelVariable fmFMV = FMBDD.getInstance().FM("fm", fm);

		Set<String> fmFeatures = fmFMV.features().names();

		for (String featureService : fmFeatures) {

			if (featureService.matches(FEATURE_SERVICE + "_.*")) {

				ServiceFG serviceFG = new ServiceFG();

				FeatureModel<String> serviceFM = fmFMV.extract(featureService);

				serviceFG.name = featureService;

				serviceFG.id = getFeatureID(serviceFG.name);

				Set<String> serviceFeatures = serviceFM.features();

				for (String featureCapability : serviceFeatures) {

					// if(featureCapability.matches(FEATURE_SERVICE_NAME +
					// "_.*"))
					// {
					// serviceFG.serviceName = featureCapability;
					// }

					if (featureCapability.matches(FEATURE_CAPABILITY + "_.*")) {

						CapabilityFG capabilityFG = new CapabilityFG();
						capabilityFG.name = featureCapability;

						// capabilityFG.id = capabilityFG.capabilityName
						// .substring(capabilityFG.capabilityName.indexOf("_"));

						capabilityFG.id = getFeatureID(capabilityFG.name);

						FeatureModelVariable capabilityFMSCFMV = new FeatureModelVariable("FMSC",
								fmFMV.extract(featureCapability));

						capabilityFG.capabilityFM = capabilityFMSCFMV.toString();

						int inputCount = 0, outputCount = 0;

						for (String featureInoutPut : capabilityFMSCFMV.features().names()) {

							if (featureInoutPut.matches(FEATURE_INPUT_DATA + "_.*")) {

								InputFG inputFG = new InputFG();
								inputFG.name = featureInoutPut;
								inputFG.id = getFeatureID(inputFG.name);

								inputCount++;

								capabilityFG.inputFGs.add(inputFG);

							}

							if (featureInoutPut.matches(FEATURE_OUTPUT_DATA + "_.*")) {

								OutputFG outputFG = new OutputFG();
								outputFG.name = featureInoutPut;
								outputFG.id = getFeatureID(outputFG.name);

								outputCount++;

								capabilityFG.outputFGs.add(outputFG);

							}

						}

						capabilityFG.inputDataCount = inputCount;
						capabilityFG.outputDataCount = outputCount;

						serviceFG.capabilityFGs.add(capabilityFG);
					}

				}

				contractFG.serviceFGs.add(serviceFG);
			}

		}

		return contractFG;
	}

	public static String getFeatureID(String feature) {
		return feature.substring(feature.indexOf("_"));
	}

	public static Integer getFeatureIDNumber(String featureId) {
		return Integer.valueOf(featureId.substring(featureId.lastIndexOf("_") + 1));
	}

	// public static String resolveinsertedFeatureVariability(String fm,
	// ArrayList<String> options)
	// {
	//
	// String projectName = options.get(0);
	//
	// return fm;
	//
	// }

	public static String insertFeatureFromXML(String fm, ArrayList<FeatureInsertForXML> featureInsertForXMLs,
			boolean insertAttributes, ArrayList<String> options) throws Exception {

		// String projectName = options.get(0);
		System.out.println("Insert and resolve the variability of hidden features");

		ContractFG contractFG = extractContractFG(fm);

		FeatureModelVariable fmv = FMBDD.getInstance().FM("fm", fm);

		// insert features not in service features
		for (FeatureInsertForXML featureInsertForXML : featureInsertForXMLs) {

			if (!featureInsertForXML.fmvToInsert.contains("@@1")) {
				insertFeatureElementForXML(featureInsertForXML, fmv, null, insertAttributes, options);
			}
		}

		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				FeatureModelVariable fmCapabilityFMV = FMBDD.getInstance().FM("fm", capabilityFG.capabilityFM);

				for (FeatureInsertForXML featureInsertForXML : featureInsertForXMLs) {

					insertFeatureElementForXML(featureInsertForXML, fmCapabilityFMV, capabilityFG, insertAttributes,
							options);
				}

				// addPropositionalConstraints(fmCapabilityFMV, capabilityFG,
				// contractFG);

				capabilityFG.capabilityFM = fmCapabilityFMV.toString();

			}

		}
		return buildFMV(contractFG, fmv.toString());
	}

	public static void addPropositionalConstraints(FeatureModelVariable fmCapabilityFMV, CapabilityFG capabilityFG,
			ContractFG contractFG) {

		// System.out.println();
		// System.out.println();
		// System.out.println(fmCapabilityFMV.features().names());
		// System.out.println(capabilityFG.id);
		//
		// System.exit(-1);

		if (fmCapabilityFMV.features().names().contains("Acknowledgement" + capabilityFG.id)
				&& fmCapabilityFMV.features().names().contains("Transactional" + capabilityFG.id)) {

			contractFG.csts += "MOM@@ implies (Transactional@@ or Acknowledgement@@)".replaceAll("@@", capabilityFG.id)
					+ ";\n";

			contractFG.csts += "(Acknowledgement@@ -> !Transactional@@)".replaceAll("@@", capabilityFG.id) + ";\n";

		}
	}

	public static void insertFeatureElementForXML(FeatureInsertForXML featureInsertForXML, FeatureModelVariable fmv,
			CapabilityFG capabilityFG, boolean insertAttributes, ArrayList<String> options) throws Exception {

		if (capabilityFG == null)
			capabilityFG = new CapabilityFG();

		String featureParent = featureInsertForXML.featureParent.replaceAll("@@1", capabilityFG.id);

		if (fmv.features().names().contains(featureParent)) {

			FeatureModelVariable featureToInsertFMV = FMBDD.getInstance().FM("fmi",
					featureInsertForXML.fmvToInsert.replaceAll("@@1", capabilityFG.id));

			FeatureEdgeKind operator = FeatureEdgeKind.MANDATORY;

			if (FeatureEdgeKind.MANDATORY.toString().equals(featureInsertForXML.featureEdgeKind))
				operator = FeatureEdgeKind.MANDATORY;
			else if (FeatureEdgeKind.OPTIONAL.toString().equals(featureInsertForXML.featureEdgeKind))
				operator = FeatureEdgeKind.OPTIONAL;

			fmv.insert(featureToInsertFMV, featureInsertForXML.featureParent.replaceAll("@@1", capabilityFG.id),
					operator);

			if (insertAttributes)
				for (FeatureAttribute featureAttribute : featureInsertForXML.attributes) {

					String featureName = featureAttribute.name.replaceAll("@@1", capabilityFG.id);

					String newFeatureName = featureName + EQ_ATTRIBUTE
							+ featureAttribute.attribute.replaceAll("@@1", capabilityFG.id)
									.replaceAll("@@2", options.get(0)).replaceAll("@@3", options.get(1));

					newFeatureName = addQuote(newFeatureName);

					fmv.renameFeature(featureName, newFeatureName);

				}
		}
	}

	public static void exportFM(String fm, String fmName, String fmDirPath, String s2t2DirPath) throws Exception {

		util.Functions.mkdirIfExist(fmDirPath);
		util.Functions.mkdirIfExist(s2t2DirPath);
		util.Functions.stringToFile(fm, fmDirPath + fmName + ".fml", false);

		S2T2Converter s2t2Converter = new S2T2Converter();

		String xmiS2T2 = s2t2Converter.fmlToS2T2XMI(FMBDD.getInstance().FM("fm_sp_spec", fm));
		util.Functions.stringToFile(xmiS2T2, s2t2DirPath + fmName + ".fmprimitives", false);
	}

	public static ArrayList<String> getFeatureNamesFromFM(String fm, ArrayList<String> features) throws Exception {

		ArrayList<String> result = new ArrayList<String>();

		FeatureModelVariable fmv = FMBDD.getInstance().FM("fm", fm);

		for (String featureFM : fmv.features().names()) {

			for (String feature : features) {
				if (featureFM.matches(feature + "_.+")) {
					result.add(featureFM);

					break;
				}
			}
		}

		return result;
	}

	public static String addQuote(String str) {
		return "\"" + str + "\"";
	}

	public static String searchFeatureMatch(FeatureModelVariable fmv, String featureToSearch) {
		String result = "";

		for (String feature : fmv.features().names()) {

			if (feature.matches(".*" + featureToSearch + ".*")) {
				return feature;
			}
		}

		return result;
	}
	
	public static String getRootFeatures(FeatureModelVariable fmv) {
		String result = "";
		for (String feature : fmv.root().children().names()) {

			if (!feature.matches("Service_.*"))
				result += addQuote(feature) + " ";

		}

		return result;
	}

	public static String getServiceFeatures(FeatureModelVariable fmv, String serviceName) {

		String result = "";

		for (String feature : fmv.getFeature(serviceName).children().names()) {

			if (!feature.matches("Capability_.*"))
				result += addQuote(feature) + " ";

		}

		return result;
	}
}
