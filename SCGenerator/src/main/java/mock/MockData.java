package mock;

import java.util.ArrayList;

import org.apache.commons.lang.RandomStringUtils;

import familiar.FMBDD;
import familiar.FMFactory;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import fr.unice.polytech.modalis.familiar.variable.SetVariable;
import scfactory.SCProject;
import util.Functions;

public class MockData {

	public static String setAttributes(String fm) throws Exception {

		FeatureModelVariable fmFMV = FMBDD.getInstance().FM("fm", fm);

		ArrayList<String> attributeFeaturesStringList = util.Functions.StringToList(SCProject.SC_ATTRIBUTES_CONTENT, "\n");

		String regexFeaturesString = FMFactory.regexFeatures(attributeFeaturesStringList);

		// System.out.println(regexFeaturesString);

		SetVariable fmSPFMVFeatures = fmFMV.features();

		for (String featureName : fmSPFMVFeatures.names()) {

			if (featureName.matches(regexFeaturesString)) {

				String value = "";

				// InputValue
				// Username
				// Password

				if (featureName.contains("InputValue")) {

					value = String.valueOf(Functions.randInt(1, 1000));

				} else if (featureName.contains("Username")) {

					String data = "";

					int rand = (int) (Math.random() * 10);

					if (rand < 5)
						data = "admin";
					else
						data = RandomStringUtils.random(12, 0, 20, true, true,
								"abcdefghijklmnopqrstuvwxyz".toCharArray());

					value = data;

				} else if (featureName.contains("Password")) {

					String data = "";

					int rand = (int) (Math.random() * 10);

					if (rand < 5)
						data = "pass";
					else
						data = RandomStringUtils.random(16, 0, 20, true, true,
								"abcdefghijklmnopqrstuvwxyz".toCharArray());

					value = data;
				}

//				fm = fm.replaceFirst(featureName, FMFactory.addQuote(featureName + "=" + value));
				
				fmFMV.renameFeature(featureName, featureName + "=" + value);
			}
		}

		return fmFMV.toString();
	}
//
//	private static String regexFeatures(ArrayList<String> inFeatures) {
//
//		// a
//		// b
//		// => (a|b).*
//
//		String result = "(";
//
//		if (inFeatures.size() == 1)
//			return inFeatures.get(0) + ".*";
//
//		for (int i = 0; i < inFeatures.size(); i++) {
//
//			result += inFeatures.get(i);
//
//			if (inFeatures.size() - 1 != i)
//				result += "|";
//
//		}
//
//		result += ").*";
//
//		return result;
//	}

}
