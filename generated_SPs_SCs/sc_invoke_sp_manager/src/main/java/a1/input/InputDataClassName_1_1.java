package a1.input;

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
	protected String InputName_1_1_1;
	@XmlElement(name = "InputName_1_1_2")
	protected String InputName_1_1_2;

	public String getInputName_1_1_1() {
		return InputName_1_1_1;
	}

	public String getInputName_1_1_2() {
		return InputName_1_1_2;
	}

	public void setInputName_1_1_1(String value) {
		this.InputName_1_1_1 = value;
	}

	public void setInputName_1_1_2(String value) {
		this.InputName_1_1_2 = value;
	}

}