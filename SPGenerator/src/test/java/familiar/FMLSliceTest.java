package familiar;

import java.util.HashSet;
import java.util.Set;

import org.xtext.example.mydsl.fML.SliceMode;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import main.MainGui;

public class FMLSliceTest {

	public static void main(String[] args) throws Exception {

		String projectName = "the1";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc_update.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath);


		// fmSCString = FMFactory.setAttributesValues(fmSCString,
		// FMFactory.extractAttributesValues(fmSPString));

		FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmsc", fmSCString);

		Set<String> set = new HashSet<String>();
		set.add("PublishSubscribe_2_1");
		set.add("ResponseHandler_1_1");
		
		set.add("REST_2_2");

		util.Functions.stringToFile(FMFactory.slice(fmSCFMV.toString(), set, SliceMode.EXCLUDING),
				"/home/akram/Desktop/fm2.fml", false);

	}

}
