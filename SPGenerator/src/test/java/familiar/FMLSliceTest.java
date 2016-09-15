package familiar;

import java.util.HashSet;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import main.MainGui;

public class FMLSliceTest {

	public static void main(String[] args) throws Exception {

		String projectName = "a1";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath).replaceAll("=", "_eq_");

		String fmSPPath = projectDir + "fm_sp_spec.fml";
		String fmSPString = util.Functions.fileToString(fmSPPath).replaceAll("=", "_eq_");

		// fmSCString = FMFactory.setAttributesValues(fmSCString,
		// FMFactory.extractAttributesValues(fmSPString));

		FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmsc", fmSCString);
		FeatureModelVariable fmSPFMV = FMBDD.getInstance().FM("fmsp", fmSPString);

		Set<String> set = new HashSet<String>();
		set.add("PublishSubscribe_2_1");
		set.add("PublishSubscribe_2_2");
		
		set.add("REST_2_2");

		util.Functions.stringToFile(FMFactory.slice(fmSCFMV.toString(), set, SliceMode.EXCLUDING),
				"/home/akram/Desktop/fm2.fml", false);

	}

}
