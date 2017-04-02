package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_5")
public class InputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_5_1")
	protected Integer InputName_5_5_1;
	@XmlElement(name = "InputName_5_5_2")
	protected Integer InputName_5_5_2;
	@XmlElement(name = "InputName_5_5_3")
	protected String InputName_5_5_3;

	public Integer getInputName_5_5_1() {
		return InputName_5_5_1;
	}

	public Integer getInputName_5_5_2() {
		return InputName_5_5_2;
	}

	public String getInputName_5_5_3() {
		return InputName_5_5_3;
	}

	public void setInputName_5_5_1(Integer value) {
		this.InputName_5_5_1 = value;
	}

	public void setInputName_5_5_2(Integer value) {
		this.InputName_5_5_2 = value;
	}

	public void setInputName_5_5_3(String value) {
		this.InputName_5_5_3 = value;
	}

}
