package SP_helicopter1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_1")
@XmlType(name = "inputDataClassName_1_1", propOrder = { "InputName_1_1_1",
		"InputName_1_1_2" })
public class InputDataClassName_1_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_1_1")
	protected Integer InputName_1_1_1;
	@XmlElement(name = "InputName_1_1_2")
	protected Integer InputName_1_1_2;

	public Integer getInputName_1_1_1() {
		return InputName_1_1_1;
	}

	public Integer getInputName_1_1_2() {
		return InputName_1_1_2;
	}

	public void setInputName_1_1_1(Integer value) {
		this.InputName_1_1_1 = value;
	}

	public void setInputName_1_1_2(Integer value) {
		this.InputName_1_1_2 = value;
	}

}
