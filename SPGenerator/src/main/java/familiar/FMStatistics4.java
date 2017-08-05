package familiar;

import java.util.ArrayList;


import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import fr.unice.polytech.modalis.familiar.operations.CountingStrategy;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import generating.SwitchyardProject;
import main.MainGui;
import util.Functions;


public class FMStatistics4 {

	static String filesDir = SwitchyardProject.FILES_DIR + "features/";

	public static int fmStatistics(String fmFilePath, String featureFilePath) {
		FeatureModelVariable fmSPFMV;

		int countFeatureFound = 0;

		try {

			// fmSPFMV = FMBDD.getInstance().FM("fm",
			// util.Functions.fileToString(fmFilePath));

			String fm = util.Functions.fileToString(fmFilePath);

			fmSPFMV = FMBDD.getInstance().FM("fm", deleteAttributesValues(fm));

			SetVariable fmSPFMVFeatures = fmSPFMV.features();

			ArrayList<String> featuresStringList = util.Functions.fileToStrings(featureFilePath);

			// remove hidden features
			ArrayList<String> featuresHiddenStringList = util.Functions
					.fileToStrings(filesDir + "all_hidden_features.txt");
			featuresStringList.removeAll(featuresHiddenStringList);

			for (String featureFMName : fmSPFMVFeatures.names()) {

				for (String featureToFindName : featuresStringList) {

					if (featureFMName.matches("^" + featureToFindName + "_.*")) {
						countFeatureFound++;

						// System.out.println(featureFMName);
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return countFeatureFound;

	}

	public static String deleteAttributesValues(String fm) {

		FeatureModelVariable fmFMV = null;
		try {
			fmFMV = FMBDD.getInstance().FM("fm", fm);

			SetVariable fmSPFMVFeatures = fmFMV.features();

			for (String featureName : fmSPFMVFeatures.names()) {

				if (featureName.matches(".+" + FMFactory.EQ_ATTRIBUTE + ".*")) {

					fmFMV.renameFeature(featureName,
							featureName.substring(0, featureName.indexOf(FMFactory.EQ_ATTRIBUTE)));

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fmFMV.toString();
	}

	public static void main(String[] args) throws Exception {

		FMBDD.getInstance();
		stat1();

		// Set<String> s1 = new HashSet<String>();
		// s1.add("a");
		// s1.add("b");
		// s1.add("c");
		//
		// Set<String> s2 = new HashSet<String>();
		// s2.add("a");
		// s2.add("b");
		// s2.add("d");
		//
		// Set<String> difference =
		// com.google.common.collect.Sets.difference(s1, s2);
		//
		// System.out.println(difference);

	}

	public static void stat1() throws Exception {

		String projectName = "SP_aircraftcarrier1";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		// // fm
		String fmSPPath = projectDir + "fm_sp.fml";
		String fmSPSyncFeaturesPath = projectDir + "fm_sp_sync_features.fml";
		String fmSPInternalFeaturesPath = projectDir + "fm_sp_internal_features.fml";
		String fmSPSpecializePath = projectDir + "fm_sp_spec.fml";
		String fmSPSpecializeSyncFeaturesPath = projectDir + "fm_sp_spec_sync_features.fml";
		String fmSPSpecializeInternalFeaturesPath = projectDir + "fm_sp_spec_internal_features.fml";
		String fmSPSpecializeSyncPath = projectDir + "fm_sp_spec_sync.fml";
		String fmSPSpecializeSyncSyncFeaturesPath = projectDir + "fm_sp_spec_sync_sync_features.fml";
		
		
		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSCSyncFeaturesPath = projectDir + "fm_sc_sync_features.fml";
		String fmSCUpdatePath = projectDir + "fm_sc_sync.fml";
		String fmSCUpdateSyncFeaturesPath = projectDir + "fm_sc_sync_sync_features.fml";

		// features

		String internalFeaturesSPPath = filesDir + "internal_features_sp.txt";
		String internalFeaturesSCPath = filesDir + "internal_features_sc.txt";
		String essentialFeaturesPath = filesDir + "essential_features.txt";
		String specializedFeaturesPath = filesDir + "specialized_features.txt";

		generateFMSync(fmSPPath, fmSPSyncFeaturesPath);
		generateFMSync(fmSPSpecializePath, fmSPSpecializeSyncFeaturesPath);
		generateFMSync(fmSPSpecializeSyncPath, fmSPSpecializeSyncSyncFeaturesPath);
		
		generateFMSync(fmSCPath, fmSCSyncFeaturesPath);
		generateFMSync(fmSCUpdatePath, fmSCUpdateSyncFeaturesPath);
		
		
//		generateFMInternal(fmSPPath, fmSPInternalFeaturesPath);
//		generateFMInternal(fmSPSpecializePath, fmSPSpecializeInternalFeaturesPath);
		
//		System.exit(-1);

		ArrayList<String> fms = new ArrayList<String>();
		// fms.add(fmSPPath);
		fms.add(fmSPSyncFeaturesPath);
		fms.add(fmSPSpecializeSyncFeaturesPath);
		fms.add(fmSPSpecializeSyncSyncFeaturesPath);
//		fms.add(fmSPInternalFeaturesPath);
//		fms.add(fmSPSpecializeInternalFeaturesPath);
		// fms.add(fmSPSpecializePath);
		// fms.add(fmSPSpecializeSyncPath);
		// fms.add(fmSCPath);
		fms.add(fmSCSyncFeaturesPath);
		fms.add(fmSCUpdateSyncFeaturesPath);
		// fms.add(fmSCUpdatePath);
		// fms.add(projectDir + "am_sc_update_infantry1.fml");
		// fms.add("/home/akram/Desktop/a_sc.fml");

		for (String fm : fms) {

			System.out.println(fm + " :: ");

			String internalFeatures;
			if (fm.contains("sc"))
				internalFeatures = internalFeaturesSCPath;
			else
				internalFeatures = internalFeaturesSPPath;

			int internalFeaturesCount = fmStatistics(fm, internalFeatures);
			System.out.println("Internal Features :: " + internalFeaturesCount);

			int essentialFeaturesCount = fmStatistics(fm, essentialFeaturesPath);
//			System.out.println("Essential Features :: " + essentialFeaturesCount);

			int specializedFeaturesCount = fmStatistics(fm, specializedFeaturesPath);
//			System.out.println("Specialized Features :: " + specializedFeaturesCount);

			int synchronizedFeaturesCount = essentialFeaturesCount + specializedFeaturesCount;
			System.out.println("Synchronized Features :: " + synchronizedFeaturesCount);

			System.out.println("Total Features :: " + (synchronizedFeaturesCount + internalFeaturesCount));

			 double amsCount = FMBDD.getInstance()
			 .FM("fm",
			 FMFactory.reduceComplexitySP(deleteAttributesValues(Functions.fileToString(fm))))
			 .counting(CountingStrategy.SAT_FML) / 2;
			
			 System.out.println("AMs :: " + amsCount);
			System.out.println("-------------------------");

		}

		//
		// // // input and output data
		// // String dataPath = "./files/data.txt";
		// // System.out.println("Input and output data :: ");
		// // System.out.println("Input Features :: " + fmStatistics(fmSPPath,
		// // dataPath));
		// // System.out.println("-------------------------");
		// //
		// // System.exit(-1);
		//
		// // SP
		// System.out.println("fm_sp :: ");
		// System.out.println("Internal Features :: " + fmStatistics(fmSPPath,
		// internalFeaturesSPPath));
		// System.out.println("Essential Features :: " + fmStatistics(fmSPPath,
		// essentialFeaturesPath));
		// System.out.println("Specialized Features :: " +
		// fmStatistics(fmSPPath, specializedFeaturesPath));
		// System.out.println("AMs :: " + FMBDD.getInstance()
		// .FM("fm_sp",
		// FMFactory.reduceComplexitySP(deleteAttributesValues(Functions.fileToString(fmSPPath))))
		// .counting(CountingStrategy.SAT_FML) / 2);
		// System.out.println("-------------------------");
		//
		// // SP specialize
		// System.out.println("fm_sp_spec :: ");
		// System.out.println("Internal Features :: " +
		// fmStatistics(fmSPSpecializePath, internalFeaturesSPPath));
		// System.out.println("Essential Features :: " +
		// fmStatistics(fmSPSpecializePath, essentialFeaturesPath));
		// System.out.println("Specialized Features :: " +
		// fmStatistics(fmSPSpecializePath, specializedFeaturesPath));
		// System.out.println("AMs :: " + FMBDD.getInstance()
		// .FM("fm_sp",
		// FMFactory
		// .reduceComplexitySP(deleteAttributesValues(Functions.fileToString(fmSPSpecializePath))))
		// .counting(CountingStrategy.SAT_FML) / 2);
		// System.out.println("-------------------------");
		//
		// // SP specialize sync
		// System.out.println("fm_sp_spec_sync :: ");
		// System.out.println("Internal Features :: " +
		// fmStatistics(fmSPSpecializeSyncPath, internalFeaturesSPPath));
		// System.out.println("Essential Features :: " +
		// fmStatistics(fmSPSpecializeSyncPath, essentialFeaturesPath));
		// System.out.println("Specialized Features :: " +
		// fmStatistics(fmSPSpecializeSyncPath, specializedFeaturesPath));
		// System.out.println("AMs :: " + FMBDD.getInstance()
		// .FM("fm_spd",
		// FMFactory.reduceComplexitySP(
		// deleteAttributesValues(Functions.fileToString(fmSPSpecializeSyncPath))))
		// .counting(CountingStrategy.SAT_FML) / 2);
		// System.out.println("-------------------------");
		//
		// // SC
		// System.out.println("fm_sc :: ");
		// System.out.println("Internal Features :: " + fmStatistics(fmSCPath,
		// internalFeaturesSCPath));
		// System.out.println("Essential Features :: " + fmStatistics(fmSCPath,
		// essentialFeaturesPath));
		// System.out.println("Specialized Features :: " +
		// fmStatistics(fmSCPath, specializedFeaturesPath));
		// System.out.println("AMs :: " + FMBDD.getInstance()
		// .FM("fm_sc",
		// FMFactory.reduceComplexitySP(deleteAttributesValues(Functions.fileToString(fmSCPath))))
		// .counting(CountingStrategy.SAT_FML) / 2);
		// System.out.println("-------------------------");
		//
		// // SC update
		// System.out.println("fm_sc_sync :: ");
		// System.out.println("Internal Features :: " +
		// fmStatistics(fmSCUpdatePath, internalFeaturesSCPath));
		// System.out.println("Essential Features :: " +
		// fmStatistics(fmSCUpdatePath, essentialFeaturesPath));
		// System.out.println("Specialized Features :: " +
		// fmStatistics(fmSCUpdatePath, specializedFeaturesPath));
		//
		// String fmSPspecReduceComplexity = FMFactory
		// .reduceComplexitySP(deleteAttributesValues(Functions.fileToString(fmSCUpdatePath)));
		// ;
		// System.out.println("AMs :: "
		// + FMBDD.getInstance().FM("fm_sc_update",
		// fmSPspecReduceComplexity).counting(CountingStrategy.SAT_FML)
		// / 2);
		// System.out.println("-------------------------");
	}

	public static void generateFMSync(String fmPath, String fmResultPath) {

		FeatureModelVariable fmv = null;
		try {
			fmv = FMBDD.getInstance().FM("e", Functions.fileToString(fmPath));

			Set<String> fmSCFMVSharedFeatureSet2 = FMFactory.getSharedFeatures(fmv);
			
			Set<String> difference =
					com.google.common.collect.Sets.difference(fmv.features().names(), fmSCFMVSharedFeatureSet2);

			Functions.stringToFile(FMFactory.slice(fmv.toString(), difference, SliceMode.EXCLUDING),
					fmResultPath, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void generateFMInternal(String fmPath, String fmResultPath) {

		FeatureModelVariable fmv = null;
		try {
			fmv = FMBDD.getInstance().FM("e", Functions.fileToString(fmPath));

			Set<String> fmSCFMVSharedFeatureSet2 = FMFactory.getSharedFeatures(fmv);
			
			fmSCFMVSharedFeatureSet2.remove("ServiceContract");

			Functions.stringToFile(FMFactory.slice(fmv.toString(), fmSCFMVSharedFeatureSet2, SliceMode.EXCLUDING),
					fmResultPath, false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
