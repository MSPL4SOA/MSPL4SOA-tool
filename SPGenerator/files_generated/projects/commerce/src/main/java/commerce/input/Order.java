package commerce.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Order")
@XmlType(name = "order", propOrder = { "id" })
public class Order implements Serializable {

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
