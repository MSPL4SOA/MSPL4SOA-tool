package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_3")
public class InputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_3_1")
	protected Integer InputName_3_3_1;
	@XmlElement(name = "InputName_3_3_2")
	protected Float InputName_3_3_2;
	@XmlElement(name = "InputName_3_3_3")
	protected Float InputName_3_3_3;

	public Integer getInputName_3_3_1() {
		return InputName_3_3_1;
	}

	public Float getInputName_3_3_2() {
		return InputName_3_3_2;
	}

	public Float getInputName_3_3_3() {
		return InputName_3_3_3;
	}

	public void setInputName_3_3_1(Integer value) {
		this.InputName_3_3_1 = value;
	}

	public void setInputName_3_3_2(Float value) {
		this.InputName_3_3_2 = value;
	}

	public void setInputName_3_3_3(Float value) {
		this.InputName_3_3_3 = value;
	}

}
