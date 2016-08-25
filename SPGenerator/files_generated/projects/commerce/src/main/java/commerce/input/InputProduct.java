package commerce.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputProduct")
@XmlType(name = "inputProduct", propOrder = { "id", "name", "qte" })
public class InputProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	protected String id;
	@XmlElement(name = "name")
	protected String name;
	@XmlElement(name = "qte")
	protected Integer qte;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getQte() {
		return qte;
	}

	public void setId(String value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

	public void setQte(Integer value) {
		this.qte = value;
	}

}
