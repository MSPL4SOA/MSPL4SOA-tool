package large11.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_1")
@XmlType(name = "inputDataClassName_6_1", propOrder = { "InputName_6_1_1",
		"InputName_6_1_2" })
public class InputDataClassName_6_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_1_1")
	protected Integer InputName_6_1_1;
	@XmlElement(name = "InputName_6_1_2")
	protected Float InputName_6_1_2;

	public Integer getInputName_6_1_1() {
		return InputName_6_1_1;
	}

	public Float getInputName_6_1_2() {
		return InputName_6_1_2;
	}

	public void setInputName_6_1_1(Integer value) {
		this.InputName_6_1_1 = value;
	}

	public void setInputName_6_1_2(Float value) {
		this.InputName_6_1_2 = value;
	}

}
