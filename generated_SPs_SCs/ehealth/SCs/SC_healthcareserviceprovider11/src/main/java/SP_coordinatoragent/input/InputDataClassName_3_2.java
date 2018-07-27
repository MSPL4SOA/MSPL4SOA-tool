package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_2")
public class InputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_2_2")
	protected Integer InputName_3_2_2;
	@XmlElement(name = "InputName_3_2_1")
	protected String InputName_3_2_1;

	public Integer getInputName_3_2_2() {
		return InputName_3_2_2;
	}

	public String getInputName_3_2_1() {
		return InputName_3_2_1;
	}

	public void setInputName_3_2_2(Integer value) {
		this.InputName_3_2_2 = value;
	}

	public void setInputName_3_2_1(String value) {
		this.InputName_3_2_1 = value;
	}

}
