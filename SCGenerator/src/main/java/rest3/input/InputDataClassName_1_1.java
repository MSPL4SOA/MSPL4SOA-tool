package rest3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_1")
public class InputDataClassName_1_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_1_1")
	protected Float InputName_1_1_1;
	@XmlElement(name = "InputName_1_1_2")
	protected Integer InputName_1_1_2;

	public Float getInputName_1_1_1() {
		return InputName_1_1_1;
	}

	public Integer getInputName_1_1_2() {
		return InputName_1_1_2;
	}

	public void setInputName_1_1_1(Float value) {
		this.InputName_1_1_1 = value;
	}

	public void setInputName_1_1_2(Integer value) {
		this.InputName_1_1_2 = value;
	}

}
