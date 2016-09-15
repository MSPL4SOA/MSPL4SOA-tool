package familiar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.xtext.example.mydsl.fML.FeatureEdgeKind;

import features.bean.Input;
import fr.unice.polytech.modalis.familiar.variable.FeatureModelVariable;


public class FeatureInsert {

	public String featureName;

	public String featureParent;

	public FeatureEdgeKind featureEdgeKind;

	public FeatureModelVariable fmvToInsert;

	public FeatureInsert(String featureName, String featureParent, FeatureEdgeKind featureEdgeKind,
			FeatureModelVariable fmvToInsert) {
		this.featureName = featureName;
		this.featureParent = featureParent;
		this.featureEdgeKind = featureEdgeKind;
		this.fmvToInsert = fmvToInsert;
	}

}
