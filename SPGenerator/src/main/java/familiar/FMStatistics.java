package familiar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import fr.unice.polytech.modalis.familiar.operations.CountingStrategy;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import generating.SwitchyardProject;
import main.MainGui;
import util.Functions;

public class FMStatistics {

	public static final String EQ_ATTRIBUTE = "_eq_";

	public static int fmStatistics(String fmFilePath, String featureFilePath) {
		FeatureModelVariable fmSPFMV;

		int countFeatureFound = 0;

		try {

			// fmSPFMV = FMBDD.getInstance().FM("fm",
			// util.Functions.fileToString(fmFilePath));

			String fm = util.Functions.fileToString(fmFilePath).replaceAll("=", EQ_ATTRIBUTE);

			fmSPFMV = FMBDD.getInstance().FM("fm", deleteAttributesValues(fm));
			
			SetVariable fmSPFMVFeatures = fmSPFMV.features();

			ArrayList<String> featuresStringList = util.Functions.fileToStrings(featureFilePath);

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

		String projectName = "large3";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		// fm
		String fmSPPath = "/home/akram/Desktop/fm.fml";
		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSPSpecializePath = projectDir + "fm_sp_spec.fml";
		String fmSCUpdatePath = projectDir + "fm_sc_update.fml";

		// features
		String filesDir = SwitchyardProject.FILES_DIR + "features/";
		String internalFeaturesSPPath = filesDir + "internal_features_sp.txt";
		String internalFeaturesSCPath = filesDir + "internal_features_sc.txt";
		String essentialFeaturesPath = filesDir + "essential_features.txt";
		String specializedFeaturesPath = filesDir + "specialized_features.txt";

		// // input and output data
		// String dataPath = "./files/data.txt";
		// System.out.println("Input and output data :: ");
		// System.out.println("Input Features :: " + fmStatistics(fmSPPath,
		// dataPath));
		// System.out.println("-------------------------");
		//
		// System.exit(-1);

		// SP
		System.out.println("fm_sp :: ");
		System.out.println("Internal Features :: " + fmStatistics(fmSPPath, internalFeaturesSPPath));
		System.out.println("Essential Features :: " + fmStatistics(fmSPPath, essentialFeaturesPath));
		System.out.println("Specialized Features :: " + fmStatistics(fmSPPath, specializedFeaturesPath));
		System.out.println("AMs :: "
				+ FMBDD.getInstance().FM("fm_sp", Functions.fileToString(fmSPPath)).counting(CountingStrategy.SAT_FML)
						/ 2);
		System.out.println("-------------------------");

//		// SP specialize
		System.out.println("fm_sp_spec :: ");
		System.out.println("Internal Features :: " + fmStatistics(fmSPSpecializePath, internalFeaturesSPPath));
		System.out.println("Essential Features :: " + fmStatistics(fmSPSpecializePath, essentialFeaturesPath));
		System.out.println("Specialized Features :: " + fmStatistics(fmSPSpecializePath, specializedFeaturesPath));
		// System.out
		// .println(
		// "AMs :: " + FMBDD.getInstance()
		// .FM("fm_sp_spec",
		// deleteAttributesValues(Functions.fileToString(fmSPSpecializePath)
		// .replaceAll("=", EQ_ATTRIBUTE)))
		// .counting(CountingStrategy.SAT_FML) / 2);
		System.out.println("AMs :: " + FMBDD.getInstance()
				.FM("fm_sp", Functions.fileToString(fmSPSpecializePath).replaceAll("=", EQ_ATTRIBUTE))
				.counting(CountingStrategy.SAT_FML) / 2);
		System.out.println("-------------------------");

		// SC
//		System.out.println("fm_sc :: ");
//		System.out.println("Internal Features :: " + fmStatistics(fmSCPath, internalFeaturesSCPath));
//		System.out.println("Essential Features :: " + fmStatistics(fmSCPath, essentialFeaturesPath));
//		System.out.println("Specialized Features :: " + fmStatistics(fmSCPath, specializedFeaturesPath));
//		System.out.println("AMs :: "
//				+ FMBDD.getInstance().FM("fm_sc", Functions.fileToString(fmSCPath)).counting(CountingStrategy.SAT_FML)
//						/ 2);
//		System.out.println("-------------------------");
//
		// SC update
		System.out.println("fm_sc_update :: ");
		System.out.println("Internal Features :: " + fmStatistics(fmSCUpdatePath, internalFeaturesSCPath));
		System.out.println("Essential Features :: " + fmStatistics(fmSCUpdatePath, essentialFeaturesPath));
		System.out.println("Specialized Features :: " + fmStatistics(fmSCUpdatePath, specializedFeaturesPath));
		System.out
				.println(
						"AMs :: "
								+ FMBDD.getInstance()
										.FM("fm_sc_update",
												deleteAttributesValues(Functions.fileToString(fmSCUpdatePath)
														.replaceAll("=", EQ_ATTRIBUTE)))
								.counting(CountingStrategy.SAT_FML) / 2);
		System.out.println("-------------------------");
	}

}
