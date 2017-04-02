package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_4")
public class InputDataClassName_7_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_4_4")
	protected Float InputName_7_4_4;
	@XmlElement(name = "InputName_7_4_5")
	protected Integer InputName_7_4_5;
	@XmlElement(name = "InputName_7_4_2")
	protected Float InputName_7_4_2;
	@XmlElement(name = "InputName_7_4_3")
	protected String InputName_7_4_3;
	@XmlElement(name = "InputName_7_4_1")
	protected Float InputName_7_4_1;

	public Float getInputName_7_4_4() {
		return InputName_7_4_4;
	}

	public Integer getInputName_7_4_5() {
		return InputName_7_4_5;
	}

	public Float getInputName_7_4_2() {
		return InputName_7_4_2;
	}

	public String getInputName_7_4_3() {
		return InputName_7_4_3;
	}

	public Float getInputName_7_4_1() {
		return InputName_7_4_1;
	}

	public void setInputName_7_4_4(Float value) {
		this.InputName_7_4_4 = value;
	}

	public void setInputName_7_4_5(Integer value) {
		this.InputName_7_4_5 = value;
	}

	public void setInputName_7_4_2(Float value) {
		this.InputName_7_4_2 = value;
	}

	public void setInputName_7_4_3(String value) {
		this.InputName_7_4_3 = value;
	}

	public void setInputName_7_4_1(Float value) {
		this.InputName_7_4_1 = value;
	}

}
