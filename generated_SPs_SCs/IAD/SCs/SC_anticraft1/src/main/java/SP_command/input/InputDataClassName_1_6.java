package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_6")
public class InputDataClassName_1_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_6_4")
	protected String InputName_1_6_4;
	@XmlElement(name = "InputName_1_6_5")
	protected Integer InputName_1_6_5;
	@XmlElement(name = "InputName_1_6_2")
	protected Integer InputName_1_6_2;
	@XmlElement(name = "InputName_1_6_3")
	protected String InputName_1_6_3;
	@XmlElement(name = "InputName_1_6_1")
	protected Float InputName_1_6_1;

	public String getInputName_1_6_4() {
		return InputName_1_6_4;
	}

	public Integer getInputName_1_6_5() {
		return InputName_1_6_5;
	}

	public Integer getInputName_1_6_2() {
		return InputName_1_6_2;
	}

	public String getInputName_1_6_3() {
		return InputName_1_6_3;
	}

	public Float getInputName_1_6_1() {
		return InputName_1_6_1;
	}

	public void setInputName_1_6_4(String value) {
		this.InputName_1_6_4 = value;
	}

	public void setInputName_1_6_5(Integer value) {
		this.InputName_1_6_5 = value;
	}

	public void setInputName_1_6_2(Integer value) {
		this.InputName_1_6_2 = value;
	}

	public void setInputName_1_6_3(String value) {
		this.InputName_1_6_3 = value;
	}

	public void setInputName_1_6_1(Float value) {
		this.InputName_1_6_1 = value;
	}

}
