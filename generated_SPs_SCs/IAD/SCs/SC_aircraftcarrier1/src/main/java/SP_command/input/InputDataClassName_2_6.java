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
	protected String InputName_2_6_1;
	@XmlElement(name = "InputName_2_6_2")
	protected String InputName_2_6_2;
	@XmlElement(name = "InputName_2_6_3")
	protected Float InputName_2_6_3;
	@XmlElement(name = "InputName_2_6_4")
	protected String InputName_2_6_4;
	@XmlElement(name = "InputName_2_6_5")
	protected String InputName_2_6_5;
	@XmlElement(name = "InputName_2_6_6")
	protected Integer InputName_2_6_6;

	public String getInputName_2_6_1() {
		return InputName_2_6_1;
	}

	public String getInputName_2_6_2() {
		return InputName_2_6_2;
	}

	public Float getInputName_2_6_3() {
		return InputName_2_6_3;
	}

	public String getInputName_2_6_4() {
		return InputName_2_6_4;
	}

	public String getInputName_2_6_5() {
		return InputName_2_6_5;
	}

	public Integer getInputName_2_6_6() {
		return InputName_2_6_6;
	}

	public void setInputName_2_6_1(String value) {
		this.InputName_2_6_1 = value;
	}

	public void setInputName_2_6_2(String value) {
		this.InputName_2_6_2 = value;
	}

	public void setInputName_2_6_3(Float value) {
		this.InputName_2_6_3 = value;
	}

	public void setInputName_2_6_4(String value) {
		this.InputName_2_6_4 = value;
	}

	public void setInputName_2_6_5(String value) {
		this.InputName_2_6_5 = value;
	}

	public void setInputName_2_6_6(Integer value) {
		this.InputName_2_6_6 = value;
	}

}
