package familiar;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "HiddenFeatures")
public class HiddenFeatures {
	
	@XmlElement(name = "featureInserts", type = FeatureInsertForXML.class)
	public ArrayList<FeatureInsertForXML> featureInserts;

	
	public HiddenFeatures() {
		featureInserts = new ArrayList<FeatureInsertForXML>();
	}
}
