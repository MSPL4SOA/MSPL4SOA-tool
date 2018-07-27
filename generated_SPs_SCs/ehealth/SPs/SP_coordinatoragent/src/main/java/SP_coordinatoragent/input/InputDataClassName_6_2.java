package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_2")
@XmlType(name = "inputDataClassName_6_2", propOrder = { "InputName_6_2_1",
		"InputName_6_2_2", "InputName_6_2_3", "InputName_6_2_4",
		"InputName_6_2_5", "InputName_6_2_6" })
public class InputDataClassName_6_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_2_1")
	protected Float InputName_6_2_1;
	@XmlElement(name = "InputName_6_2_2")
	protected Integer InputName_6_2_2;
	@XmlElement(name = "InputName_6_2_3")
	protected String InputName_6_2_3;
	@XmlElement(name = "InputName_6_2_4")
	protected String InputName_6_2_4;
	@XmlElement(name = "InputName_6_2_5")
	protected Integer InputName_6_2_5;
	@XmlElement(name = "InputName_6_2_6")
	protected Float InputName_6_2_6;

	public Float getInputName_6_2_1() {
		return InputName_6_2_1;
	}

	public Integer getInputName_6_2_2() {
		return InputName_6_2_2;
	}

	public String getInputName_6_2_3() {
		return InputName_6_2_3;
	}

	public String getInputName_6_2_4() {
		return InputName_6_2_4;
	}

	public Integer getInputName_6_2_5() {
		return InputName_6_2_5;
	}

	public Float getInputName_6_2_6() {
		return InputName_6_2_6;
	}

	public void setInputName_6_2_1(Float value) {
		this.InputName_6_2_1 = value;
	}

	public void setInputName_6_2_2(Integer value) {
		this.InputName_6_2_2 = value;
	}

	public void setInputName_6_2_3(String value) {
		this.InputName_6_2_3 = value;
	}

	public void setInputName_6_2_4(String value) {
		this.InputName_6_2_4 = value;
	}

	public void setInputName_6_2_5(Integer value) {
		this.InputName_6_2_5 = value;
	}

	public void setInputName_6_2_6(Float value) {
		this.InputName_6_2_6 = value;
	}

}
