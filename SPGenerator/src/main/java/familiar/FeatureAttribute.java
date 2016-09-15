package familiar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "FeatureAttribute")
public class FeatureAttribute {

	public String name;
	public String attribute;
	
	public FeatureAttribute() {
	}

	public FeatureAttribute(String name, String attribute) {
		this.name = name;
		this.attribute = attribute;
	}

}
