package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_6")
public class InputDataClassName_2_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_6_1")
	protected Float InputName_2_6_1;
	@XmlElement(name = "InputName_2_6_2")
	protected Float InputName_2_6_2;
	@XmlElement(name = "InputName_2_6_3")
	protected Float InputName_2_6_3;

	public Float getInputName_2_6_1() {
		return InputName_2_6_1;
	}

	public Float getInputName_2_6_2() {
		return InputName_2_6_2;
	}

	public Float getInputName_2_6_3() {
		return InputName_2_6_3;
	}

	public void setInputName_2_6_1(Float value) {
		this.InputName_2_6_1 = value;
	}

	public void setInputName_2_6_2(Float value) {
		this.InputName_2_6_2 = value;
	}

	public void setInputName_2_6_3(Float value) {
		this.InputName_2_6_3 = value;
	}

}
