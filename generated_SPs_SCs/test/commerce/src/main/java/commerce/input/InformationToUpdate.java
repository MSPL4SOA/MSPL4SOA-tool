package commerce.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InformationToUpdate")
@XmlType(name = "informationToUpdate", propOrder = { "age", "address" })
public class InformationToUpdate implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "age")
	protected Integer age;
	@XmlElement(name = "address")
	protected String address;

	public Integer getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void setAge(Integer value) {
		this.age = value;
	}

	public void setAddress(String value) {
		this.address = value;
	}

}
