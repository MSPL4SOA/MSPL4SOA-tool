package familiar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "featureInsert")
public class FeatureInsertForXML {

	public String featureName;

	public String featureParent;

	public String featureEdgeKind;

	public String fmvToInsert;

	@XmlElement(name = "featureAttribute", type = FeatureAttribute.class)
	public ArrayList<FeatureAttribute> attributes;

	public FeatureInsertForXML() {
		attributes = new ArrayList<FeatureAttribute>();
	}

	public FeatureInsertForXML(String featureName, String featureParent, String featureEdgeKind, String fmvToInsert) {
		this();
		this.featureName = featureName;
		this.featureParent = featureParent;
		this.featureEdgeKind = featureEdgeKind;
		this.fmvToInsert = fmvToInsert;
	}

}
