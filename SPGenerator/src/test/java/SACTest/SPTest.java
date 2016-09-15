package SACTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import familiar.FMBDD;
import familiar.FMFactory;
import familiar.FeatureInsertForXML;
import familiar.HiddenFeatures;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import generating.SwitchyardProject;
import main.MainGui;

public class SPTest {

	public static void main(String[] args) throws Exception {

		String projectName = "spc2";
		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		///
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

		// fmsphidden
		String fmSPHiddenPath = projectDir + "fm_sp.fml";
		String fmSPHiddenStr = util.Functions.fileToString(fmSPHiddenPath);
		FeatureModelVariable fmSPHiddenFMV = FMBDD.getInstance().FM("zae", fmSPHiddenStr);
		String fmSPHiddenDAStr = FMFactory.deleteAttributesValues(fmSPHiddenStr);
		FeatureModelVariable fmSPHiddenDAFMV = FMBDD.getInstance().FM("zae", fmSPHiddenDAStr);

		//

		// fmsp
		String fmSPStr = FMFactory.insertFeatureFromXML(fmSPHiddenStr, featureHiddenSharedSP, options);
		FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("zae", fmSPStr);

		// fmspspec
		String fmSPSpecializePath = projectDir + "fm_sp_spec.fml";
		String fmSPSpecializeStr = util.Functions.fileToString(fmSPSpecializePath);
		FeatureModelVariable fmSPSpecializeFMV = FMBDD.getInstance().FM("zae", fmSPSpecializeStr);
		String fmSPSpecializeDAStr = FMFactory.deleteAttributesValues(fmSPSpecializeStr);
		FeatureModelVariable fmSPSpecializeDAFMV = FMBDD.getInstance().FM("zae", fmSPSpecializeDAStr);

		
		Set<String> fsphiddenMinusfspspec = com.google.common.collect.Sets.difference(fmSPHiddenDAFMV.features().names(),
				fmSPSpecializeDAFMV.features().names());
	
		
		String fmSPSpecUpdateStr = FMFactory.updateAndDelete2(fmSPStr, fmSPSpecializeStr, fsphiddenMinusfspspec, false, null);
		FeatureModelVariable fmSPSpecUpdateFMV = FMBDD.getInstance().FM("eza", fmSPSpecUpdateStr);
//		Set<String> fmSPSpecUpdateInternalFeatures = FMFactory.getCorrespondingFeatures(
//				fmSPSpecUpdateFMV.features().names(), SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);
		
		String fmSPSpecUpdateDAStr = FMFactory.deleteAttributesValues(fmSPSpecUpdateStr);
		FeatureModelVariable fmSPSpecUpdateDAFMV =  FMBDD.getInstance().FM("eza", fmSPSpecUpdateDAStr);
		Set<String> fmSPSpecUpdateDAInternalFeatures = FMFactory.getCorrespondingFeatures(
				fmSPSpecUpdateDAFMV.features().names(), SwitchyardProject.INTERNAL_FEATURES_SP_CONTENT);

		Map<String, String> fmSPSpecUpdateAFs = FMFactory.extractAttributesValues(fmSPSpecUpdateStr);
		String fmSPSpecUpdateDAWIStr = FMFactory.slice(fmSPSpecUpdateDAStr, fmSPSpecUpdateDAInternalFeatures, SliceMode.EXCLUDING);
//		
		
		
		String fmSPSpecUpdateWIStr = FMFactory.setAttributesValues(fmSPSpecUpdateDAWIStr, fmSPSpecUpdateAFs);
		
//		System.out.println(fmSPSpecUpdateWIStr);
		
		util.Functions.stringToFile(fmSPSpecUpdateWIStr, "/home/akram/Desktop/fm.fml", false);
//		String fmSCPath = projectDir + "fm_sc.fml";
//		String fmSCUpdatePath = projectDir + "fm_sc_update.fml";
//
//		String fmscupdate = FMFactory.updateAndDelete2(spHidden, fmSPSpecializeSliceStr, difference, true,
//				fmvspspecupdateInternalFeatures);

	}

}
