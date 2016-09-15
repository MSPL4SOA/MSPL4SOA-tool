package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import familiar.CapabilityFG;
import familiar.ContractFG;
import familiar.FMBDD;
import familiar.FMFactory;
import familiar.FMUpdateBDD;
import familiar.InputFG;
import familiar.OutputFG;
import familiar.ServiceFG;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import generating.SwitchyardProject;
import gsd.synthesis.FeatureModel;
import main.MainGui;

public class ServiceFGTest {

	public static String FEATURE_SERVICE = "Service";
	public static String FEATURE_CAPABILITY = "Capability";

	public static void main(String[] args) throws Exception {

		String projectName = "a1";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath);

		String fmSPPath = projectDir + "fm_sp_spec.fml";
		String fmSPString = util.Functions.fileToString(fmSPPath);

		FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fm1", fmSCString.replaceAll("=", "_eq_"));

//		System.out.println(FMFactory.getSharedFeatures(fmSCFMV));

		ContractFG contractFG = FMFactory.extractContractFG(fmSPString.replaceAll("=", "_eq_"));
		// System.out.println(FMFactory.buildFMV(contractFG));

		// FMUpdateBDD fmUpdateBDD = new FMUpdateBDD();
		//
		// FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fm1",
		// fmSCString.replaceAll("=", "_eq_"));
		// FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("fm2",
		// fmSPString.replaceAll("=", "_eq_"));
		//
		// System.out.println("begin2");
		// System.out.println(fmUpdateBDD.updateFM(fmSCFMV, fmSPFMV,
		// SliceMode.EXCLUDING));

		for (ServiceFG serviceFG : contractFG.serviceFGs) {

			 System.out.println(serviceFG.name + " : " + serviceFG.id +
			 "\n");

			for (CapabilityFG capabilityFG : serviceFG.capabilityFGs) {

				 System.out.println(capabilityFG.name + " : " +
				 capabilityFG.id + "\n");

//				System.out.println(capabilityFG.capabilityFM + "\n");

				for (InputFG in : capabilityFG.inputFGs) {

					System.out.println(in.id + " : " + in.name);
				}

				for (OutputFG out : capabilityFG.outputFGs) {

					System.out.println(out.id + " : " + out.name);
				}
			}

		}

	}

	// public static ContractFG getServiceCapability(String fm) throws Exception
	// {
	//
	// ContractFG contractFG = new ContractFG();
	// FeatureModelVariable fmFMV = FMBDD.getInstance().FM("fm", fm);
	//
	// System.out.println("Begin");
	// Set<String> fmFeatures = fmFMV.features().names();
	//
	// for (String featureService : fmFeatures) {
	//
	// if (featureService.matches(FEATURE_SERVICE + ".*")) {
	//
	// ServiceFG serviceFG = new ServiceFG();
	//
	// FeatureModel<String> serviceFM = fmFMV.extract(featureService);
	//
	// serviceFG.serviceName = featureService;
	//
	// Set<String> serviceFeatures = serviceFM.features();
	//
	// for (String featureCapability : serviceFeatures) {
	//
	// if (featureCapability.matches(FEATURE_CAPABILITY + ".*")) {
	//
	// CapabilityFG capabilityFG = new CapabilityFG();
	// capabilityFG.capabilityName = featureCapability;
	//
	// FeatureModelVariable capabilityFMSCFMV = new FeatureModelVariable("FMSC",
	// fmFMV.extract(featureCapability));
	//
	// capabilityFG.capabilityFM = capabilityFMSCFMV.toString();
	//
	// serviceFG.capabilityFGs.add(capabilityFG);
	// }
	//
	// }
	//
	// contractFG.serviceFGs.add(serviceFG);
	// }
	//
	// }
	//
	// return contractFG;
	// }

	// public static String getFeatureName(FeatureModelVariable fmv, String
	// featureToSearch) {
	//
	// for (String feature : fmv.features().names()) {
	//
	// if (feature.matches(".*" + featureToSearch + ".*")) {
	//
	// return feature.split(EQ_ATTRIBUTE)[0];
	// }
	// }
	// return "";
	// }

}
