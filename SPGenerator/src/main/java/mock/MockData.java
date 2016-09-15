package mock;

import java.util.ArrayList;

import familiar.FMBDD;
import familiar.FMUpdateBDD;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import generating.SwitchyardProject;

public class MockData {

	public static String setAttributes(String fm) throws Exception {

		FeatureModelVariable fmFMV = FMBDD.getInstance().FM("fmSP", fm);

		ArrayList<String> attributeFeaturesStringList = util.Functions.StringToList(SwitchyardProject.ATTRIBUTES_SP_CONTENT,"\n");

		String regexFeaturesString = regexFeatures(attributeFeaturesStringList);

		// System.out.println(regexFeaturesString);

		SetVariable fmSPFMVFeatures = fmFMV.features();

		for (String featureName : fmSPFMVFeatures.names()) {

			if (featureName.matches(regexFeaturesString)) {

				String value = "";

				//InputDataClassName
				// InputName
				// InputType
				//OutputDataClassName
				// OutputName
				// OutputType
				// CapabilityName
				// ServiceName

				if (featureName.contains("InputDataClassName"))
					value = featureName;
				else if (featureName.contains("InputName"))
					value = featureName;
				else if (featureName.contains("InputType")) {

					String data = "";

					int rand = (int) (Math.random() * 10);

					if (rand < 3)
						data = "String";
					else if (rand < 6)
						data = "Integer";
					else
						data = "Float";

					value = data;

				} else if (featureName.contains("OutputDataClassName"))
					value = featureName;
				else if (featureName.contains("OutputName"))
					value = featureName;

				else if (featureName.contains("OutputType")) {

					String data = "";

					int rand = (int) (Math.random() * 10);

					if (rand < 3)
						data = "String";
					else if (rand < 6)
						data = "Integer";
					else
						data = "Float";

					value = data;

				} else if (featureName.contains("CapabilityName"))
					value = featureName;
				else if (featureName.contains("ServiceName"))
					value = featureName;

				fm = fm.replaceFirst(featureName, featureName + "=" + value.replaceAll("-", ""));
				// .replaceAll("_", "")

				// fmFMV.renameFeature(featureName, featureName + "=" + value);
			}
		}

		return fm;
	}

	private static String regexFeatures(ArrayList<String> inFeatures) {

		// a
		// b
		// => (a|b).*

		String result = "(";

		if (inFeatures.size() == 1)
			return inFeatures.get(0) + ".*";

		for (int i = 0; i < inFeatures.size(); i++) {

			result += inFeatures.get(i);

			if (inFeatures.size() - 1 != i)
				result += "|";

		}

		result += ").*";

		return result;
	}

}
