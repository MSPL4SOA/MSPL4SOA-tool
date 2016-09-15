package familiar;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;
import gsd.synthesis.FeatureModel;
import main.MainGui;

public class InsertHiddenFeatures1 {

	public static void main(String[] args) throws Exception {

		HiddenFeatures hiddenFeatures = new HiddenFeatures();

		FeatureInsertForXML featureInsert1 = new FeatureInsertForXML("ConnectionFactory", "MOMConfiguration@@1",
				FeatureEdgeKind.MANDATORY.toString(), "ConnectionFactory@@1;");
		
		featureInsert1.attributes.add(new FeatureAttribute("ConnectionFactory@@1","#ConnectionFactory"));


		hiddenFeatures.featureInserts.add(featureInsert1);

		util.JAXBUtil.marshall(hiddenFeatures, "/home/akram/Desktop/hiddenspinternalfeatures.xml");

	}

}
