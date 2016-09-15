package familiar;

import java.util.ArrayList;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import features.bean.Contract;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.FeatureModel;
import main.MainGui;

public class InsertHiddenFeatures2 {

	public static void main(String[] args) throws Exception {

		String projectName = "a1";

		String projectDir = MainGui.projectsFilesGeneratedPath + projectName + "/fm_familiar_generated/";

		String fmSCPath = projectDir + "fm_sc_update.fml";
		String fmSCString = util.Functions.fileToString(fmSCPath).replaceAll("=", "_eq_");

		// FeatureModelVariable fmSCFMV = FMBDD.getInstance().FM("fmsc",
		// fmSCString);

		HiddenFeatures hiddenSharedFeatures = (HiddenFeatures) util.JAXBUtil
				.unmarshall("/home/akram/Desktop/hiddensharedfeatures.xml", HiddenFeatures.class);

		HiddenFeatures hiddenSPInternalFeatures = (HiddenFeatures) util.JAXBUtil
				.unmarshall("/home/akram/Desktop/hiddenspinternalfeatures.xml", HiddenFeatures.class);

		hiddenSharedFeatures.featureInserts.addAll(hiddenSPInternalFeatures.featureInserts);

		ArrayList<String> options = new ArrayList<String>();
		options.add("proj_name");
		options.add("host_name");
		String result = FMFactory.insertFeatureFromXML(fmSCString, hiddenSharedFeatures.featureInserts, options);

//		FMFactory.extractAttributesValues(result);
		
		System.out.println(result);

		System.exit(-1);

		util.Functions.stringToFile(result, "/home/akram/Desktop/fminsert.fml", false);

		Contract contract = FMFactory.convertFMSCUpdateToContractXML(result);

		util.JAXBUtil.marshall(contract, "/home/akram/Desktop/contract.xml");

	}

}
