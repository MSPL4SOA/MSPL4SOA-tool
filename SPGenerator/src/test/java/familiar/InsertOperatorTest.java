package familiar;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.FeatureModel;
import main.MainGui;

public class InsertOperatorTest {

	public static void main(String[] args) throws Exception {

		String projectName = "sp_manager";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath).replaceAll("=", "_eq_");

		FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmsc", fmSCString);
		
		System.out.println(fmSCFMV.getFeature("InputData_1_1_1").parent().getFtName());
		

		
		System.exit(-1);
		
		FeatureModel<String> inputFM = fmSCFMV.extract("InputData_1_1_1");
		FeatureModelVariable inputFMV = new FeatureModelVariable("aze", inputFM);
		
		
		fmSCString = FMFactory.reduceComplexitySP(fmSCString);
		FeatureModelVariable fmReduced = FMBDD.getInstance().FM("g", fmSCString);
		
		fmReduced.insert(inputFMV, "Capability_1_1", FeatureEdgeKind.MANDATORY);
		
		
		System.out.println(fmReduced);
	}

}
