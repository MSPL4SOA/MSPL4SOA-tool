package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_5")
public class InputDataClassName_3_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_5_3")
	protected Integer InputName_3_5_3;
	@XmlElement(name = "InputName_3_5_1")
	protected Integer InputName_3_5_1;
	@XmlElement(name = "InputName_3_5_2")
	protected Integer InputName_3_5_2;

	public Integer getInputName_3_5_3() {
		return InputName_3_5_3;
	}

	public Integer getInputName_3_5_1() {
		return InputName_3_5_1;
	}

	public Integer getInputName_3_5_2() {
		return InputName_3_5_2;
	}

	public void setInputName_3_5_3(Integer value) {
		this.InputName_3_5_3 = value;
	}

	public void setInputName_3_5_1(Integer value) {
		this.InputName_3_5_1 = value;
	}

	public void setInputName_3_5_2(Integer value) {
		this.InputName_3_5_2 = value;
	}

}
