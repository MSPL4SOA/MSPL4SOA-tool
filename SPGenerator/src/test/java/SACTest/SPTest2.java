package SACTest;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import familiar.FMBDD;
import familiar.FMFactory;
import familiar.FeatureInsertForXML;
import familiar.HiddenFeatures;
import fr.unice.polytech.modalis.familiar.operations.CountingStrategy;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import generating.SwitchyardProject;
import main.MainGui;
import util.Functions;

public class SPTest2 {

	public static void main(String[] args) throws Exception {

		//You must change from SwitchyarProject
//		public static final String FEATURES_DIR = FILES_DIR + "features/";
//		to public static final String FEATURES_DIR = FILES_DIR + "features2/";
		/// Preparation
		//
		String projectName = "large3";
		String projectOutName = "large3_2";
		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";
		String fmOutDir = MainGui.projectsFilesGeneratedPath + projectOutName + "/fm_familiar_generated/";
		String st2tOutDir = MainGui.projectsFilesGeneratedPath + projectOutName + "/fm_s2t2_generated/";

		//
		HiddenFeatures hiddenSharedFeatures = (HiddenFeatures) util.JAXBUtil
				.unmarshall(SwitchyardProject.HIDDEN_SHARED_FEATURES, HiddenFeatures.class);

		HiddenFeatures hiddenSPInternalFeatures = (HiddenFeatures) util.JAXBUtil
				.unmarshall(SwitchyardProject.HIDDEN_SP_FEATURES, HiddenFeatures.class);

		ArrayList<FeatureInsertForXML> featureHiddenSharedSP = new ArrayList<FeatureInsertForXML>();
		featureHiddenSharedSP.addAll(hiddenSharedFeatures.featureInserts);
		featureHiddenSharedSP.addAll(hiddenSPInternalFeatures.featureInserts);

		ArrayList<String> options = new ArrayList<String>();
		options.add(projectName);
		options.add(SwitchyardProject.HOST_NAME);
		//
		///

		//////////// step 1 and 2

		// fmsphidden
		String fmSPHiddenPath = projectDir + "fm_sp.fml";
		String fmSPHiddenStr = util.Functions.fileToString(fmSPHiddenPath);
		FeatureModelVariable fmSPHiddenFMV = FMBDD.getInstance().FM("zae", fmSPHiddenStr);
		String fmSPHiddenDAStr = FMFactory.deleteAttributesValues(fmSPHiddenStr);
		FeatureModelVariable fmSPHiddenDAFMV = FMBDD.getInstance().FM("zae", fmSPHiddenDAStr);
		FMFactory.exportFM(fmSPHiddenStr, "fm_sp_hidden", fmOutDir, st2tOutDir);
		//
		// fmsp
		String fmSPStr = FMFactory.insertFeatureFromXML(fmSPHiddenStr, featureHiddenSharedSP, false, options);
		FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("zae", fmSPStr);
		FMFactory.exportFM(fmSPStr, "fm_sp", fmOutDir, st2tOutDir);
		//
		// fmschidden
		String fmSCHiddenPath = projectDir + "fm_sc.fml";
		String fmSCHiddenStr = util.Functions.fileToString(fmSCHiddenPath);
		FeatureModelVariable fmSCHiddenFMV = FMBDD.getInstance().FM("zae", fmSCHiddenStr);
		String fmSCHiddenDAStr = FMFactory.deleteAttributesValues(fmSCHiddenStr);
		FeatureModelVariable fmSCHiddenDAFMV = FMBDD.getInstance().FM("zae", fmSCHiddenDAStr);
		FMFactory.exportFM(fmSCHiddenStr, "fm_sc_hidden", fmOutDir, st2tOutDir);
		//
		// fmsc 
		String fmSCStr = FMFactory.insertFeatureFromXML(fmSCHiddenStr, hiddenSharedFeatures.featureInserts, false,
				options);
		FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("zae", fmSCStr);
		FMFactory.exportFM(fmSCStr, "fm_sc", fmOutDir, st2tOutDir);

		// step 3, 4, 5, 6, 7, 8
		//
		// fmspspec-update
		String fmSPSpecializeUpdatePath = projectDir + "fm_sp_spec.fml";
		String fmSPSpecializeUpdateStr = util.Functions.fileToString(fmSPSpecializeUpdatePath);
		FeatureModelVariable fmSPSpecializeUpdateFMV = FMBDD.getInstance().FM("zae", fmSPSpecializeUpdateStr);
		String fmSPSpecializeUpdateDAStr = FMFactory.deleteAttributesValues(fmSPSpecializeUpdateStr);
		FeatureModelVariable fmSPSpecializeUpdateDAFMV = FMBDD.getInstance().FM("zae", fmSPSpecializeUpdateDAStr);
		FMFactory.exportFM(fmSPSpecializeUpdateStr, "fm_sp_specialize-update", fmOutDir, st2tOutDir);
		//
		// fmspspec
		ArrayList<String> hiddenArrayList = util.Functions
				.fileToList(new File("./files_sp/features2/hidden_features.txt"));
		ArrayList<String> hiddenFMArrayList = FMFactory.getFeatureNamesFromFM(fmSPSpecializeUpdateDAStr,
				hiddenArrayList);

		hiddenFMArrayList.add("ProjectName");
		hiddenFMArrayList.add("HostName");

		FeatureModelVariable fmSPSpecializeFMV = FMBDD.getInstance().FM("zae", fmSPSpecializeUpdateStr);
		for (String feature : hiddenFMArrayList) {
			fmSPSpecializeFMV.removeFeature(feature);
		}

		String fmSPSpecializeStr = fmSPSpecializeFMV.toString();
		FMFactory.exportFM(fmSPSpecializeStr, "fm_sp_specialize", fmOutDir, st2tOutDir);

		//
		// fm_sp_specialize-shared

		ArrayList<String> internalSPArrayList = util.Functions
				.fileToList(new File("./files_sp/features2/internal_features_sp.txt"));
		ArrayList<String> internalSPFMArrayList = FMFactory.getFeatureNamesFromFM(fmSPSpecializeUpdateDAStr,
				internalSPArrayList);

		FeatureModelVariable fmSPSpecializeSharedFMV = FMBDD.getInstance().FM("zae", fmSPSpecializeUpdateStr);
		for (String feature : internalSPFMArrayList) {
			fmSPSpecializeSharedFMV.removeFeature(feature);
		}

		String fmSPSpecializeSharedStr = fmSPSpecializeSharedFMV.toString();
		FMFactory.exportFM(fmSPSpecializeSharedStr, "fm_sp_specialize-shared", fmOutDir, st2tOutDir);

	
		
		//step 9
		// fmscupdate
		String fmSCUpdatePath = projectDir + "fm_sc_update.fml";
		String fmSCUpdateStr = util.Functions.fileToString(fmSCUpdatePath);
		FeatureModelVariable fmSCUpdateFMV = FMBDD.getInstance().FM("zae", fmSCUpdateStr);
		String fmSCUpdateDAStr = FMFactory.deleteAttributesValues(fmSCUpdateStr);
		FeatureModelVariable fmSCUpdateDAFMV = FMBDD.getInstance().FM("zae", fmSCUpdateDAStr);
		FMFactory.exportFM(fmSCUpdateStr, "fm_sc_update", fmOutDir, st2tOutDir);
		
		//fmscupdate-hidden
		 
		// fmspspec
		ArrayList<String> hiddenSCArrayList = util.Functions
				.fileToList(new File("./files_sp/features2/hidden_features_sc.txt"));
		ArrayList<String> hiddenSCFMArrayList = FMFactory.getFeatureNamesFromFM(fmSCUpdateDAStr,
				hiddenSCArrayList);

		hiddenSCFMArrayList.add("ProjectName=" + projectName);
		hiddenSCFMArrayList.add("HostName=http://localhost:8080/" + projectName);
		

		FeatureModelVariable fmSCUpdateHiddenFMV = FMBDD.getInstance().FM("zae", fmSCUpdateStr);
		for (String feature : hiddenSCFMArrayList) {
			fmSCUpdateHiddenFMV.removeFeature(feature);
		}

		String fmSCUpdateHiddenStr = fmSCUpdateHiddenFMV.toString();
		FMFactory.exportFM(fmSCUpdateHiddenStr, "fm_sc_update-hidden", fmOutDir, st2tOutDir);
		
		
//		FeatureModelVariable fmSCUpdateHiddenReduceFMV =
//				FMBDD.getInstance().FM("fm",FMFactory.reduceComplexitySP(fmSCUpdateHiddenStr));
//
//		int amsCount = (int) fmSCUpdateHiddenReduceFMV.counting(CountingStrategy.SAT_FML) / 2;
//		System.out.println(amsCount);

//		Set<String> fsphiddenMinusfspspec = com.google.common.collect.Sets
//				.difference(fmSPHiddenDAFMV.features().names(), fmSPSpecializeUpdateDAFMV.features().names());
//
//		String fmSPSpecUpdateStr = FMFactory.updateAndDelete2(fmSPStr, fmSPSpecializeUpdateStr, fsphiddenMinusfspspec,
//				false, null);
//		FeatureModelVariable fmSPSpecUpdateFMV = FMBDD.getInstance().FM("eza", fmSPSpecUpdateStr);
//		// Set<String> fmSPSpecUpdateInternalFeatures =
//		// FMFactory.getCorrespondingFeatures(
//		// fmSPSpecUpdateFMV.features().names(),
//		// SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);
//
//		String fmSPSpecUpdateDAStr = FMFactory.deleteAttributesValues(fmSPSpecUpdateStr);
//		FeatureModelVariable fmSPSpecUpdateDAFMV = FMBDD.getInstance().FM("eza", fmSPSpecUpdateDAStr);
//		Set<String> fmSPSpecUpdateDAInternalFeatures = FMFactory.getCorrespondingFeatures(
//				fmSPSpecUpdateDAFMV.features().names(), SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);
//
//		Map<String, String> fmSPSpecUpdateAFs = FMFactory.extractAttributesValues(fmSPSpecUpdateStr);
//		String fmSPSpecUpdateDAWIStr = FMFactory.slice(fmSPSpecUpdateDAStr, fmSPSpecUpdateDAInternalFeatures,
//				SliceMode.EXCLUDING);
//		//
//
//		String fmSPSpecUpdateWIStr = FMFactory.setAttributesValues(fmSPSpecUpdateDAWIStr, fmSPSpecUpdateAFs);
//
//		// System.out.println(fmSPSpecUpdateWIStr);
//
//		util.Functions.stringToFile(fmSPSpecUpdateWIStr, "/home/akram/Desktop/fm.fml", false);
//		// String fmSCPath = projectDir + "fm_sc.fml";
//		// String fmSCUpdatePath = projectDir + "fm_sc_update.fml";
//		//
//		// String fmscupdate = FMFactory.updateAndDelete2(spHidden,
//		// fmSPSpecializeSliceStr, difference, true,
//		// fmvspspecupdateInternalFeatures);

	}

}
