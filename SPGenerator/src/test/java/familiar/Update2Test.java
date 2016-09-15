package familiar;

import java.util.Set;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import generating.SwitchyardProject;
import main.MainGui;

public class Update2Test {

	public static void main(String[] args) throws Exception {

		String projectName = "large2";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath).replaceAll("=", "_eq_");

		String fmSPPath = projectDir + "fm_sp_spec.fml";
		String fmSPString = util.Functions.fileToString(fmSPPath).replaceAll("=", "_eq_");
		
		

		// fmSCString = FMFactory.setAttributesValues(fmSCString,
		// FMFactory.extractAttributesValues(fmSPString));

		FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmsc", fmSCString);
		FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("fmsp", fmSPString);
//		
//		if(fmSCFMV.features().names().contains("Service_1"))
//			System.out.println("ok");
//		
//		System.exit(-1);

		FeatureModelVariable fmSPDeleteAttributeFMV = FMBDD.getInstance().FM("fmspd",
				FMFactory.deleteAttributesValues(fmSPFMV.toString()));

		Set<String> fmSCFMVSharedFeatureSet = FMFactory.getSharedFeatures(fmSCFMV);

		// Set<String> fmSPFMVSharedFeatureSet =
		// FMFactory.getSharedFeatures(fmSPFMV);

		Set<String> omittedSharedFeatures = com.google.common.collect.Sets.difference(fmSCFMVSharedFeatureSet,
				fmSPDeleteAttributeFMV.features().names());

		// System.out.println(fmSCFMVSharedFeatureSet);
		// System.out.println(omittedSharedFeatures);

		// System.exit(-1);

		Set<String> featureSetToSlice = FMFactory.getCorrespondingFeatures
				(fmSPDeleteAttributeFMV.features().names(),
				SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);

		// System.out.println("\n\n"
		// + FMFactory.updateAndDelete2(fmSCString, fmSPString,
		// omittedSharedFeatures, true, featureSetToSlice));

		util.Functions.stringToFile(
				FMFactory.updateAndDelete2(fmSCString, fmSPString, omittedSharedFeatures, true, featureSetToSlice),
				"/home/akram/Desktop/fm.fml", false);
	}

}
