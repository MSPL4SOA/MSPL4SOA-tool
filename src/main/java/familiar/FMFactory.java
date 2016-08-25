package familiar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import features.bean.Capability;
import features.bean.Contract;
import features.bean.Input;
import features.bean.Output;
import features.bean.Service;
import fr.unice.polytech.modalis.familiar.operations.featureide.FMSlicerSAT;
import fr.unice.polytech.modalis.familiar.variable.Comparison;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.FeatureVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import generating.SwitchyardProject;
import gsd.synthesis.Expression;
import gsd.synthesis.FeatureGraph;
import gsd.synthesis.FeatureModel;

public class FMFactory {

	public String cstSP = "";
	public String cstSC = "";
	//
	public String _fmSP = "";
	public String _fmSC = "";

	public String fmSPReduceComplexity = "";

	public ContractFG contractFG;

	public FMUpdateBDD fmUpdateBDD;
	FMDeleteBDD fmDeleteBDD;

	public String error = "";

	public Map<String, String> attributes = new HashMap<String, String>();

	public static final String EQ_ATTRIBUTE = "_eq_";

	// SP
	// we avoid a different name (ServiceProvider) to accelarate the reasoning
	// process
	public static final String SP_ROOT = "Root";
	public static final String SC_ROOT = "Root";

	public String specializedFMSP;

	public String specializedAttributedFMSP;

	public String updatedFMSC;
	public String updatedAttributedFMSC;

	public String mockSPSpec = "";

	public Contract contract;

	/// MockSPSpec

	public String setMockSPSpecCapabilityWithOutput(int serviceNumber, int capabilityNumber) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] ServiceState@@ CapabilityName@@;"
				+ "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);" + "REST@@: Get@@;"
				+ "MOM@@: AsynchronousQueue@@ [PublishSubscribe@@] Reliability@@;" + "PublishSubscribe@@: [Durable@@];"
				+ "Reliability@@: PersistentDelivery@@ Acknowledgement@@;"
				+ "ServiceState@@: StateMessaging@@ StatefulService@@;" + "StateMessaging@@: TwoWayState@@;"
				+ "StatefulService@@: StateRepository@@;";

		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);
	}

	public String setMockSPSpecCapabilityWithoutOutput(int serviceNumber, int capabilityNumber) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] "
				+ "ServiceState@@ CapabilityName@@;" + "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);"
				+ "REST@@: Post@@;" + "MOM@@: AsynchronousQueue@@ ;" + "ServiceState@@: StatefulService@@;"
				+ "StatefulService@@: TemporaryMemory@@;";

		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);

	}

	// SP

	public String setFMSPCapabilityWithOutput(int serviceNumber, int capabilityNumber) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] [ServiceState@@] CapabilityName@@;"
				+ "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);" + "REST@@: (Post@@|Get@@|Put@@|Delete@@);"
				+ "MOM@@: AsynchronousQueue@@ [PublishSubscribe@@] [Transactional@@] [Reliability@@];"
				+ "PublishSubscribe@@: [Durable@@];" + "Reliability@@: (PersistentDelivery@@|Acknowledgement@@)+;"
				+ "ServiceState@@: (StateMessaging@@|StatefulService@@)+;" + "StateMessaging@@: [TwoWayState@@];"
				+ "StatefulService@@: (StateRepository@@|TemporaryMemory@@);";

		this.cstSP += "MOM@@ implies (Transactional@@ or Acknowledgement@@); Transactional@@ implies !Acknowledgement@@;";

		this.cstSP = this.cstSP.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);

		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);
	}

	public String setFMSPCapabilityWithoutOutput(int serviceNumber, int capabilityNumber) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] "
				+ "[ServiceState@@] CapabilityName@@;" + "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);"
				+ "REST@@: (Post@@|Get@@|Put@@|Delete@@);" + "MOM@@: AsynchronousQueue@@ ;"
				+ "ServiceState@@: StatefulService@@;" + "StatefulService@@: (StateRepository@@|TemporaryMemory@@);";

		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);

	}

	//
	public static String setServiceSPFeatures(int serviceNumber, String capability) {
		String result = "Service@@: ServiceName@@ @Capability@;";

		result = result.replaceAll("@Capability@", capability);
		return result.replaceAll("@@", "_" + serviceNumber);
	}

	//
	public static String setInputDataSPFeatures(int serviceNumber, int capabilityNumber, int inputNumber) {
		String result = "InputData@@: InputName@@ InputType@@;";
		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber + "_" + inputNumber);
	}

	//
	public static String setOutputDataSPFeatures(int serviceNumber, int capabilityNumber, int inputNumber) {
		String result = "OutputData@@: OutputName@@ OutputType@@;";
		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber + "_" + inputNumber);
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

	public String setFMSCCapabilityWithOutput(int serviceNumber, int capabilityNumber) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] [StateMessaging@@] CapabilityName@@;"
				+ "CommunicationTechnologie@@: ResponseHandler@@ (SOAP@@|REST@@|MOM@@);"
				+ "ResponseHandler@@: (Synchronous@@|Asynchronous@@);" + "REST@@: (Post@@|Get@@|Put@@|Delete@@);"
				+ "MOM@@: AsynchronousQueue@@ [PublishSubscribe@@] [Transactional@@] [Reliability@@];"
				+ "PublishSubscribe@@: [Durable@@];" + "Reliability@@: (PersistentDelivery@@|Acknowledgement@@)+;"
				+ "StateMessaging@@: (TwoWayState@@|StateRepository@@|TemporaryMemory@@)+;"
				+ "Authentification@@: Username@@ Password@@;";

		this.cstSC += "MOM@@ implies (Transactional@@ or Acknowledgement@@); Transactional@@ implies !Acknowledgement@@;";

		this.cstSC = this.cstSC.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);

		// MOM implies (Transactional or Acknowledgement)

		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);
	}

	public String setFMSCCapabilityWithOutOutput(int serviceNumber, int capabilityNumber) {

		String result = "Capability@@: @InputData@ @OutputData@ CommunicationTechnologie@@ [Authentification@@] CapabilityName@@;"
				+ "CommunicationTechnologie@@: (SOAP@@|REST@@|MOM@@);" + "REST@@: (Post@@|Get@@|Put@@|Delete@@);"
				+ "MOM@@: AsynchronousQueue@@ [Transactional@@] [Reliability@@];" + "PublishSubscribe@@: [Durable@@];"
				+ "Reliability@@: (PersistentDelivery@@|Acknowledgement@@)+;"
				+ "Authentification@@: Username@@ Password@@;";

		this.cstSC += "MOM@@ implies (Transactional@@ or Acknowledgement@@); Transactional@@ implies !Acknowledgement@@;";

		this.cstSC = this.cstSC.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);

		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber);
	}

	//
	public static String setServiceSCFeatures(int serviceNumber, String capability) {
		String result = "Service@@: ServiceName@@ @Capability@;";

		result = result.replaceAll("@Capability@", capability);

		return result.replaceAll("@@", "_" + serviceNumber);
	}

	//
	public static String setInputDataSCFeatures(int serviceNumber, int capabilityNumber, int inputNumber) {
		String result = "InputData@@: InputName@@ InputType@@ InputValue@@;";
		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber + "_" + inputNumber);
	}

	//
	public static String setOutputDataSCFeatures(int serviceNumber, int capabilityNumber, int inputNumber) {
		String result = "OutputData@@: OutputName@@ OutputType@@;";
		return result.replaceAll("@@", "_" + serviceNumber + "_" + capabilityNumber + "_" + inputNumber);
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
		fmUpdateBDD = new FMUpdateBDD();
		fmDeleteBDD = new FMDeleteBDD();

		contract = new Contract();
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
			serviceFG.serviceName = "Service_" + serviceNumber;

			for (int capabilityNumber = 1; capabilityNumber <= capabilityCount; capabilityNumber++) {

				System.out.print(
						"InputData count for service " + serviceNumber + " and capability " + capabilityNumber + " : ");
				int inputDataCount = sc.nextInt();

				System.out.print("OutputData count for service " + serviceNumber + " and capability " + capabilityNumber
						+ " : ");
				int outputDataCount = sc.nextInt();

				CapabilityFG capabilityFG = new CapabilityFG();
				capabilityFG.capabilityName = "Capability_" + serviceNumber + "_" + capabilityNumber;
				capabilityFG.inputDataCount = inputDataCount;
				capabilityFG.outputDataCount = outputDataCount;

				serviceFG.capabilityFGs.add(capabilityFG);
			}

			contractFG.serviceFGs.add(serviceFG);
		}

	}

	public void buildFMs() throws Exception {

		ArrayList<String> servicesValueSP = new ArrayList<String>();
		ArrayList<String> servicesKeySP = new ArrayList<String>();

		ArrayList<String> servicesValueSC = new ArrayList<String>();
		ArrayList<String> servicesKeySC = new ArrayList<String>();

		ArrayList<String> servicesValueMockSPSpec = new ArrayList<String>();

		for (int serviceNumber = 1; serviceNumber <= contractFG.serviceFGs.size(); serviceNumber++) {

			ServiceFG serviceFG = contractFG.serviceFGs.get(serviceNumber - 1);
			serviceFG.serviceName = "Service_" + serviceNumber;

			ArrayList<String> capabilitiesValueSP = new ArrayList<String>();
			ArrayList<String> capabilitiesKeySP = new ArrayList<String>();

			ArrayList<String> capabilitiesValueSC = new ArrayList<String>();
			ArrayList<String> capabilitiesKeySC = new ArrayList<String>();

			ArrayList<String> capabilitiesValueMockSPSpec = new ArrayList<String>();

			for (int capabilityNumber = 1; capabilityNumber <= serviceFG.capabilityFGs.size(); capabilityNumber++) {

				CapabilityFG capabilityFG = serviceFG.capabilityFGs.get(capabilityNumber - 1);
				capabilityFG.capabilityName = "Capability_" + serviceNumber + "_" + capabilityNumber;

				String capabilitySC = "";
				String capabilitySP = "";
				String capabilityMockSPSpec = "";

				if (capabilityFG.outputDataCount != 0) {
					capabilitySP = setFMSPCapabilityWithOutput(serviceNumber, capabilityNumber);
					capabilitySC = setFMSCCapabilityWithOutput(serviceNumber, capabilityNumber);

					capabilityMockSPSpec = setMockSPSpecCapabilityWithOutput(serviceNumber, capabilityNumber);
				} else {
					capabilitySP = setFMSPCapabilityWithoutOutput(serviceNumber, capabilityNumber);
					capabilitySC = setFMSCCapabilityWithOutOutput(serviceNumber, capabilityNumber);

					capabilityMockSPSpec = setMockSPSpecCapabilityWithoutOutput(serviceNumber, capabilityNumber);
				}
				String capabilitySPCst = "";
				String capabilitySCCst = "";

				//
				String inputDataSC = "";
				String inputDataSP = "";
				String inputDataFeature = "";

				// capabilityFG.inputDataCount = inputDataCount;

				//
				for (int inputNumber = 1; inputNumber <= capabilityFG.inputDataCount; inputNumber++) {

					inputDataSC += setInputDataSCFeatures(serviceNumber, capabilityNumber, inputNumber);
					inputDataSP += setInputDataSPFeatures(serviceNumber, capabilityNumber, inputNumber);
					inputDataFeature += " InputData" + "_" + serviceNumber + "_" + capabilityNumber + "_" + inputNumber;
				}

				if (capabilityFG.inputDataCount > 0) {
					inputDataFeature = " InputDataClassName" + "_" + serviceNumber + "_" + capabilityNumber
							+ inputDataFeature;
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

				for (int outputNumber = 1; outputNumber <= capabilityFG.outputDataCount; outputNumber++) {
					outputDataSC += setOutputDataSCFeatures(serviceNumber, capabilityNumber, outputNumber);
					outputDataSP += setOutputDataSPFeatures(serviceNumber, capabilityNumber, outputNumber);
					outputDataFeature += " OutputData" + "_" + serviceNumber + "_" + capabilityNumber + "_"
							+ outputNumber;
				}
				// }

				if (capabilityFG.outputDataCount > 0) {
					outputDataFeature = " OutputDataClassName" + "_" + serviceNumber + "_" + capabilityNumber
							+ outputDataFeature;
				}

				capabilitySC += outputDataSC;
				capabilitySC = capabilitySC.replaceAll("@OutputData@", outputDataFeature);
				//
				// add csts
				// capabilitySC += this.cstSC;
				//
				capabilitiesValueSC.add(capabilitySC);
				capabilitiesKeySC.add("Capability_" + serviceNumber + "_" + capabilityNumber);

				capabilitySP += outputDataSP;
				capabilitySP = capabilitySP.replaceAll("@OutputData@", outputDataFeature);
				//
				// add csts
				// capabilitySP += this.cstSP;
				//
				capabilitiesValueSP.add(capabilitySP);
				capabilitiesKeySP.add("Capability_" + serviceNumber + "_" + capabilityNumber);

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
			serviceValueSC += setServiceSCFeatures(serviceNumber, buildServicekey(capabilitiesKeySC));

			for (int capI = 0; capI < capabilitiesValueSC.size(); capI++) {
				serviceValueSC += capabilitiesValueSC.get(capI);
			}
			//
			servicesValueSC.add(serviceValueSC);
			servicesKeySC.add("Service_" + serviceNumber);
			////////////////

			////////////////
			// SP
			String serviceValueSP = "";
			serviceValueSP += setServiceSPFeatures(serviceNumber, buildServicekey(capabilitiesKeySP));

			for (int capI = 0; capI < capabilitiesValueSP.size(); capI++) {
				serviceValueSP += capabilitiesValueSP.get(capI);
			}
			//
			servicesValueSP.add(serviceValueSP);
			servicesKeySP.add("Service_" + serviceNumber);
			////////////////

			////////////////
			// MockSPSpec
			String serviceValueMockSPSpec = "";
			serviceValueMockSPSpec += setServiceSPFeatures(serviceNumber, buildServicekey(capabilitiesKeySP));

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
		serviceValueSC += buildServicekey(servicesKeySC);

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
		serviceValueSP += buildServicekey(servicesKeySP);
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
		serviceValueMockSPSpec += buildServicekey(servicesKeySP);
		serviceValueMockSPSpec += "; ";

		for (int capI = 0; capI < servicesValueMockSPSpec.size(); capI++) {
			serviceValueMockSPSpec += servicesValueMockSPSpec.get(capI);
		}
		//
		this.mockSPSpec += serviceValueMockSPSpec;
		this.mockSPSpec = this.mockSPSpec.replaceAll(";", ";\n");
		//////////////

		this.fmSPReduceComplexity = this._fmSP;
		this.specializedFMSP = this._fmSP;
		////////////////
	}

	public static String buildServicekey(ArrayList<String> capabilitiesKeySP) {

		if (capabilitiesKeySP.size() == 1) {

			return capabilitiesKeySP.get(0);
		}

		String serviceTempSP = "(";

		for (int capI = 0; capI < capabilitiesKeySP.size(); capI++) {
			serviceTempSP += capabilitiesKeySP.get(capI);

			if (capI != capabilitiesKeySP.size() - 1)
				serviceTempSP += "|";
		}

		serviceTempSP += ")";

		return serviceTempSP;

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
	// result = fm.replaceAll("\"", "");
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

	// to accelerate the update operator
	public String reduceComplexitySP(String fm) {

		System.out.println("Reduce complexity");

		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		FeatureModelVariable fmSPFMV = null;
		try {
			fmSPFMV = fmUpdateBDD.FM("fmSP", fm);

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
			this.fmSPReduceComplexity = fmSPFMV.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fmSPFMV.toString();
	}

	public boolean checkEssentialAndInternalVariability(String fm) {

		// System.out.println("Found internal and essential features SP");
		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		FeatureModelVariable fmSPFMV;

		// Set<String> internaFeatures = new HashSet<String>();

		boolean result = true;

		try {
			fmSPFMV = fmUpdateBDD.FM("specializedFMSP", fm);

			SetVariable fmSPFMVFeatures = fmSPFMV.features();

			ArrayList<String> internalEssentialFeaturesStringList = util.Functions
					.StringToList(SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT, "\n");

			internalEssentialFeaturesStringList
					.addAll(util.Functions.StringToList(SwitchyardProject.ESSENTIAL_FEATURES_CONTENT, "\n"));

			String regexInternalEssentialFeaturesString = regexFeatures(internalEssentialFeaturesStringList);
			// System.out.println(regexInternalEssentialFeaturesString);

			// Set<String> optionalFeatures = fmSPFMV.getOptionals();
			Set<String> mandatoryFeatures = fmSPFMV.getMandatory();

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(regexInternalEssentialFeaturesString)
						&& !mandatoryFeatures.contains(featureName)) {
					// internaFeatures.add(featureName);
					// fmSPFMV.removeFeature(featureName);

					result = false;
					error += "The variability of " + featureName + " must be resolved.\n";
					// System.out.println("The variability of " + featureName +
					// " must be resolved.");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public Set<String> getCorrespondingFeatures(Set<String> features, String featuresFileContent) {

		// System.out.println("Found internal features SP");
		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		// FeatureModelVariable fmSPFMV;

		Set<String> internaFeatures = new HashSet<String>();

		try {
			// fmSPFMV = fmUpdateBDD.FM("fmSP", fm);

			// SetVariable fmSPFMVFeatures = fmSPFMV.features();

			ArrayList<String> internalFeaturesStringList = util.Functions.StringToList(featuresFileContent,"\n");

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

	private String regexFeatures(ArrayList<String> inFeatures) {

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

		result += ").*";

		return result;
	}

	public Set<String> getOmmitedSharedFeaturesSP(String fmSC, String fmSPSpec) throws Exception {

		Set<String> result = new HashSet<String>();

		FeatureModelVariable fmSPSpecFMV = fmUpdateBDD.FM("fmSPSpec", fmSPSpec);
		FeatureModelVariable fmSPFMV = fmUpdateBDD.FM("fmSP", fmSC);

		Set<String> fmSPSpecFeatures = fmSPSpecFMV.features().names();
		Set<String> fmSPFeatures = fmSPFMV.features().names();

		Set<String> difference = com.google.common.collect.Sets.difference(fmSPFeatures, fmSPSpecFeatures);

		result = com.google.common.collect.Sets.difference(difference,
				getCorrespondingFeatures(difference, SwitchyardProject.INTERNAL_FEATURES_SC_CONTENT));

		// System.out.println("SC: " + fmSPFeatures + "\n");
		// System.out.println("SPSpec: " + fmSPSpecFeatures + "\n");
		// System.out.println("diff: " +result);
		// System.exit(-1);

		// ArrayList<String> sharedFeaturesStringList =
		// util.Functions.fileToStrings(SwitchyardProject.filesDir +
		// "essential_features.txt");
		// sharedFeaturesStringList.addAll(util.Functions.fileToStrings(SwitchyardProject.filesDir
		// + "specialized_features.txt"));
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

	public boolean checkAttributesValue(String fm) throws Exception {

		boolean result = true;

		FeatureModelVariable fmSPFMV = fmUpdateBDD.FM("fmSP", fm);

		ArrayList<String> attributeFeaturesStringList = util.Functions.StringToList(SwitchyardProject.ATTRIBUTES_SP_CONTENT,"\n");

		String regexFeaturesString = regexFeatures(attributeFeaturesStringList);

		// System.out.println(regexFeaturesString);

		SetVariable fmSPFMVFeatures = fmSPFMV.features();

		for (String featureName : fmSPFMVFeatures.names()) {

			if (featureName.matches(regexFeaturesString) && !featureName.matches(".+" + EQ_ATTRIBUTE + ".+")) {
				result = false;

				error += "The feature " + featureName + " is an attribute and must be valued by =" + ".\n";
			}
		}

		return result;
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

	public boolean checkSpecialization2(String fmSP, String fmSPSpec) throws Exception {

		FeatureModelVariable fmSPSpecFMV = fmUpdateBDD.FM("fmSPSpec", reduceComplexitySP(fmSPSpec));
		FeatureModelVariable fmSPFMV = fmUpdateBDD.FM("fmSPFMV", reduceComplexitySP(fmSP));

		Comparison comparison = null;

		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				FeatureModel<String> capabilityFMSP = fmSPFMV.extract(capabilityFG.capabilityName);
				FeatureModel<String> capabilityFMSPspec = fmSPSpecFMV.extract(capabilityFG.capabilityName);

				comparison = (new FeatureModelVariable("", capabilityFMSPspec))
						.compare(new FeatureModelVariable("", capabilityFMSP));

				// System.out.println("capabilityFMSPspec:\n" +
				// capabilityFMSPspec);
				// System.out.println("capabilityFMSP:\n" + capabilityFMSP);

				if (comparison != Comparison.SPECIALIZATION) {
					error += capabilityFG.capabilityName + " of fm_sp_spec is a " + comparison + " of "
							+ capabilityFG.capabilityName + " of fm_sp and it must be a sepcialization.\n";
					return false;
				}

			}

		}

		return true;
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

	public String updateAndDelete(String fmSPSpec, String fmSC) throws Exception {

		System.out.println("Execute update and delete operations");
		// FeatureModelVariable fmSPSpecFMV = fmUpdateBDD.FM("fmSPSpec",
		// reduceComplexitySP2(fmSPSpec));

		FeatureModelVariable fmSPSpecFMV = fmUpdateBDD.FM("fmSPSpec", fmSPSpec);

		FeatureModelVariable fmSCFMV = fmUpdateBDD.FM("fmSCFMV", fmSC);

		// System.out.println(fmSPSpecFMV);
		//
		// System.exit(-1);

		String cst = "";
		String resultFM = SC_ROOT + ": ";

		// System.out.println("eza");

		ArrayList<String> keyServiceGF = new ArrayList<String>();
		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			keyServiceGF.add(serviceFG.serviceName);

		}

		resultFM += buildServicekey(keyServiceGF) + ";";

		// System.out.println(resultFM);

		int serviceNumber = 1;
		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			int capabilityNumber = 1;

			ArrayList<String> keyCapabilityFG = new ArrayList<String>();
			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				keyCapabilityFG.add(capabilityFG.capabilityName);

			}

			resultFM += serviceFG.serviceName + ":" + " ServiceName_" + serviceNumber + " "
					+ buildServicekey(keyCapabilityFG) + ";";

			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				String id = "_" + serviceNumber + "_" + capabilityNumber;

				String capabilityId = "Capability_" + serviceNumber + "_" + capabilityNumber;

				FeatureModel<String> capabilityFMSC = fmSCFMV.extract(capabilityId);
				FeatureModel<String> capabilityFMSPspec = fmSPSpecFMV.extract(capabilityId);

				// SC
				// remove first line (1: Capability_1_1 ; )
				// String capabilityFMSCString = capabilityFMSC.toString()
				// .substring(capabilityFMSC.toString().indexOf('\n') + 1);
				//

				FeatureModelVariable capabilityFMSCFMV = new FeatureModelVariable("FMSC", capabilityFMSC);
				// System.out.println("----------------\n" + capabilityFMSCFMV);

				// fmUpdateBDD.FM("capSC", capabilityFMSCString);

				// SP
				// remove first line (1: Capability_1_1 ; )
				// String capabilityFMSPspecString =
				// capabilityFMSPspec.toString()
				// .substring(capabilityFMSPspec.toString().indexOf('\n') + 1);
				//
				FeatureModelVariable capabilityFMSPSpecFMV = new FeatureModelVariable("", capabilityFMSPspec);

				// // delete
				// System.out.println("Delete ommited shared features");
				// FeatureModelVariable capabilityFMSCFMVDeleted =
				// fmDeleteBDD.deleteFM(capabilityFMSCFMV,
				// getOmmitedSharedFeaturesSP(capabilityFMSCFMV.toString(),
				// capabilityFMSPSpecFMV.toString()));
				//
				// System.out.println("Updating");
				// FeatureModelVariable capabilityFMSCFMVUpdatedFMV =
				// fmUpdateBDD.updateFM(capabilityFMSCFMVDeleted,
				// fmUpdateBDD.FM("fmSPSpec",
				// reduceComplexitySP(capabilityFMSPSpecFMV.toString())),
				// getCorrespondingFeatures(capabilityFMSPSpecFMV.features().names(),
				// SwitchyardProject.filesDir + "internal_features_sp.txt"),
				// SliceMode.EXCLUDING);

				System.out.println("Updating");
				FeatureModelVariable capabilityFMSCFMVUpdatedPrimFMV = fmUpdateBDD.updateFM(capabilityFMSCFMV,
						fmUpdateBDD.FM("fmSPSpec", reduceComplexitySP(capabilityFMSPSpecFMV.toString())),
						getCorrespondingFeatures(capabilityFMSPSpecFMV.features().names(),
								SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT),
						SliceMode.EXCLUDING);

				// System.out.println("\n\n" +
				// capabilityFMSCFMVUpdatedPrimFMV.toString().replaceAll("\"",
				// "") + "\n\n");

				System.out.println("Delete ommited shared features");
				FeatureModelVariable capabilityFMSCFMVUpdatedFMV = fmDeleteBDD.deleteFM(
						fmDeleteBDD.FM("m1", capabilityFMSCFMVUpdatedPrimFMV.toString()),
						getOmmitedSharedFeaturesSP(capabilityFMSCFMV.toString(), capabilityFMSPSpecFMV.toString()));

				for (Expression<String> constraint : capabilityFMSCFMVUpdatedFMV.getFm().getConstraints()) {

					cst += constraint + ";";
				}

				// FIXME
				// anomalie in update:: ksynthetisis. contrainst such a ->(a|b)
				// are not considered
				// We add manually MOM implies (Transactional or
				// Acknowledgement) if Transactional or Acknowledgement exists

				for (String feature : capabilityFMSCFMVUpdatedFMV.features().names()) {

					if (feature.contains("Transactional") || feature.contains("Acknowledgement")) {
						cst += "MOM@@ implies (Transactional@@ or Acknowledgement@@)".replaceAll("@@", id) + ";";
						break;
					}

				}

				// System.out.println(cst);

				capabilityFMSCFMVUpdatedFMV.getFm().removeAllConstraints();

				resultFM += capabilityFMSCFMVUpdatedFMV;

				System.out.println(resultFM + "\n");
				// System.exit(-1);
				//
				// System.out.println(capabilityFMSCFMVUpdatedFMV);

				capabilityNumber++;

			}

			serviceNumber++;
		}

		// FeatureModel<String> fmSCUpdateFM = new FeatureModel<String>(null);
		//
		// System.out.println("Delete ommited shared features");
		// FeatureModelVariable fmSCFMVDeleted = fmDeleteBDD.deleteFM(fmSCFMV,
		// getOmmitedSharedFeaturesSP(fmSC, fmSPSpec));
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

		// FeatureModelVariable fmSCFMVUpdated = null;

		// System.out.println(resultFM + cst);

		resultFM += cst;

		this.updatedFMSC = resultFM;

		this.updatedAttributedFMSC = setAttributesValues(this.updatedFMSC);

		return resultFM;

	}

	public String deleteAttributesValues(String fm) {

		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = fmUpdateBDD.FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmFMV.features();

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(".+" + EQ_ATTRIBUTE + ".*")) {

					fmFMV.renameFeature(featureName, featureName.substring(0, featureName.indexOf(EQ_ATTRIBUTE)));

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fmFMV.toString();
	}

	public Map<String, String> extractAttributesValues(String fm) {

		attributes = new HashMap<String, String>();
		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = fmUpdateBDD.FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmFMV.features();

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(".+" + EQ_ATTRIBUTE + ".*")) {

					attributes.put(featureName.substring(0, featureName.indexOf(EQ_ATTRIBUTE)),
							featureName.substring(featureName.indexOf(EQ_ATTRIBUTE) + EQ_ATTRIBUTE.length()));

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return attributes;
	}

	public String setAttributesValues(String fm) {

		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = fmUpdateBDD.FM("fm", fm);

			Iterator it = attributes.entrySet().iterator();
			while (it.hasNext()) {

				Map.Entry pair = (Map.Entry) it.next();

				// System.out.println(pair.getKey() + " = " + pair.getValue());

				fmFMV.renameFeature((String) pair.getKey(), pair.getKey() + EQ_ATTRIBUTE + pair.getValue());

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fmFMV.toString();
	}

	public Contract convertFMSCUpdateToContractXML(String fm) throws Exception {
		// should be executed after update

		int serviceNumber = 1;
		contract = new Contract();
		ArrayList<Service> services = new ArrayList<Service>();

		FeatureModelVariable fmFMV = fmUpdateBDD.FM("fm", fm);

		contract.projectName = contractFG.projectName;

		for (ServiceFG serviceFG : this.contractFG.serviceFGs) {

			int capabilityNumber = 1;

			Service service = new Service();
			service.interfaceName = attributes.get("ServiceName_" + serviceNumber);
			service.beanName = service.interfaceName + "Bean";
			service.number = serviceNumber;

			ArrayList<Capability> capabilities = new ArrayList<Capability>();
			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				String capabilityId = "_" + serviceNumber + "_" + capabilityNumber;

				Capability capability = new Capability();

				capability.name = attributes.get("CapabilityName" + capabilityId);
				capability.serviceName = service.interfaceName;
				capability.number = capabilityNumber;

				///////// Input output
				ArrayList<Input> inputs = new ArrayList<Input>();
				for (int inputDataNumber = 1; inputDataNumber <= capabilityFG.inputDataCount; inputDataNumber++) {

					String inputDataId = capabilityId + "_" + inputDataNumber;

					Input input = new Input();
					input.name = attributes.get("InputName" + inputDataId);
					input.type = attributes.get("InputType" + inputDataId);
					input.number = inputDataNumber;

					inputs.add(input);
				}
				capability.inputs = inputs;
				//
				ArrayList<Output> outputs = new ArrayList<Output>();
				for (int outputDataNumber = 1; outputDataNumber <= capabilityFG.outputDataCount; outputDataNumber++) {

					String outputDataId = capabilityId + "_" + outputDataNumber;

					Output output = new Output();
					output.name = attributes.get("OutputName" + outputDataId);
					output.type = attributes.get("OutputType" + outputDataId);
					output.number = outputDataNumber;

					outputs.add(output);

					// System.out.println(attributes);
					// System.out.println(output.name);
					// System.out.println(output.type);
					//
					// System.exit(-1);
				}
				//
				capability.outputs = outputs;
				////////////////////////////////

				////////// features true or false
				//

				capability.authentification = fmFMV.features().names()
						.contains("Authentification" + capabilityId);
				capability.serviceState = fmFMV.features().names().contains("ServiceState" + capabilityId);
				capability.stateMessaging = fmFMV.features().names()
						.contains("StateMessaging" + capabilityId);
				capability.twoWayState = fmFMV.features().names().contains("TwoWayState" + capabilityId);
				capability.statefullService = fmFMV.features().names().contains("StatefulService" + capabilityId);
				capability.stateRepository = fmFMV.features().names().contains("StateRepository" + capabilityId);
				capability.soap = fmFMV.features().names().contains("SOAP" + capabilityId);
				capability.rest = fmFMV.features().names().contains("REST" + capabilityId);
				//
				if (fmFMV.features().names().contains("Put" + capabilityId))
					capability.restMethod = "Put";
				else if (fmFMV.features().names().contains("Get" + capabilityId))
					capability.restMethod = "Get";
				else if (fmFMV.features().names().contains("Post" + capabilityId))
					capability.restMethod = "Post";
				else if (fmFMV.features().names().contains("Delete" + capabilityId))
					capability.restMethod = "Delete";
				//
				capability.jms = fmFMV.features().names().contains("MOM" + capabilityId);
				//
				if (capability.jms == true) {
					capability.broker.serviceName = service.interfaceName;
					capability.broker.capabilityName = capability.name;
					capability.broker.setQueues(contract.projectName);
					//
					capability.broker.acknowledgement = fmFMV.features().names()
							.contains("Acknowledgement" + capabilityId);
					capability.broker.transactional = fmFMV.features().names()
							.contains("Transactional" + capabilityId);
					capability.broker.persistentDelivery = fmFMV.features().names()
							.contains("PersistentDelivery" + capabilityId);

					capability.broker.publishSubscribe = fmFMV.features().names()
							.contains("PublishSubscribe" + capabilityId);
					capability.broker.durable = fmFMV.features().names()
							.contains("Durable" + capabilityId);

				} else
					capability.broker = null;

				capability.dataInputClassName = attributes.get("InputDataClassName" + capabilityId);
				capability.dataOutputClassName = attributes.get("OutputDataClassName" + capabilityId);

				capability.setConfigurations();
				//
				/////////////////////////////////////

				capabilities.add(capability);
				capabilityNumber++;
			}

			service.capabilities = capabilities;

			services.add(service);
			serviceNumber++;
		}

		contract.services = services;

		return contract;
	}
}
