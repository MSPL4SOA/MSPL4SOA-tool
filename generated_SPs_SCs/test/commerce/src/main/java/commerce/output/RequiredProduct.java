package commerce.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "RequiredProduct")
@XmlType(name = "requiredProduct", propOrder = { "id", "name" })
public class RequiredProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	protected String id;
	@XmlElement(name = "name")
	protected String name;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}
