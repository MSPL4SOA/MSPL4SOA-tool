package test;

import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import familiar.FMFactory;
import generating.SwitchyardProject;
import main.MainGui;
import util.Functions;

public class TestSlice {

	public static void main(String[] args) {

		String projectName = "sync5";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		// fm
		String fmSPPath = projectDir + "fm_sp.fml";
		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSPSpecializePath = projectDir + "fm_sp_spec.fml";
		String fmSPSpecializeSyncPath = projectDir + "fm_sp_spec_sync.fml";
		String fmSCUpdatePath = projectDir + "fm_sc_update.fml";

		// features
		String filesDir = SwitchyardProject.FILES_DIR + "features/";
		String internalFeaturesSPPath = filesDir + "internal_features_sp.txt";
		String internalFeaturesSCPath = filesDir + "internal_features_sc.txt";
		String essentialFeaturesPath = filesDir + "essential_features.txt";
		String specializedFeaturesPath = filesDir + "specialized_features.txt";
		
//		Set<String> featureSetToSlice = FMFactory.getCorrespondingFeatures(
//				fmSPSpecDeleteAttributeFMV.features().names(),
//				SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);
//		
//		FMFactory.slice(Functions.fileToString(fmSPSpecializePath), 
//				featureSetToSlice, SliceMode.EXCLUDING);

	}

}
