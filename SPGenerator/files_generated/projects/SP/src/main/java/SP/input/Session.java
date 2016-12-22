package SP.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Session")
@XmlType(name = "session", propOrder = { "id" })
public class Session implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	protected String id;

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

}
