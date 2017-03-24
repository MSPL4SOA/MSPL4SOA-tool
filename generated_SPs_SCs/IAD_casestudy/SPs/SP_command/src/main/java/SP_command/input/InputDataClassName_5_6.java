package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_6")
@XmlType(name = "inputDataClassName_5_6", propOrder = { "InputName_5_6_8",
		"InputName_5_6_9", "InputName_5_6_6", "InputName_5_6_7",
		"InputName_5_6_1", "InputName_5_6_4", "InputName_5_6_5",
		"InputName_5_6_2", "InputName_5_6_3" })
public class InputDataClassName_5_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_6_8")
	protected Integer InputName_5_6_8;
	@XmlElement(name = "InputName_5_6_9")
	protected String InputName_5_6_9;
	@XmlElement(name = "InputName_5_6_6")
	protected String InputName_5_6_6;
	@XmlElement(name = "InputName_5_6_7")
	protected String InputName_5_6_7;
	@XmlElement(name = "InputName_5_6_1")
	protected Float InputName_5_6_1;
	@XmlElement(name = "InputName_5_6_4")
	protected Float InputName_5_6_4;
	@XmlElement(name = "InputName_5_6_5")
	protected Float InputName_5_6_5;
	@XmlElement(name = "InputName_5_6_2")
	protected Float InputName_5_6_2;
	@XmlElement(name = "InputName_5_6_3")
	protected Integer InputName_5_6_3;

	public Integer getInputName_5_6_8() {
		return InputName_5_6_8;
	}

	public String getInputName_5_6_9() {
		return InputName_5_6_9;
	}

	public String getInputName_5_6_6() {
		return InputName_5_6_6;
	}

	public String getInputName_5_6_7() {
		return InputName_5_6_7;
	}

	public Float getInputName_5_6_1() {
		return InputName_5_6_1;
	}

	public Float getInputName_5_6_4() {
		return InputName_5_6_4;
	}

	public Float getInputName_5_6_5() {
		return InputName_5_6_5;
	}

	public Float getInputName_5_6_2() {
		return InputName_5_6_2;
	}

	public Integer getInputName_5_6_3() {
		return InputName_5_6_3;
	}

	public void setInputName_5_6_8(Integer value) {
		this.InputName_5_6_8 = value;
	}

	public void setInputName_5_6_9(String value) {
		this.InputName_5_6_9 = value;
	}

	public void setInputName_5_6_6(String value) {
		this.InputName_5_6_6 = value;
	}

	public void setInputName_5_6_7(String value) {
		this.InputName_5_6_7 = value;
	}

	public void setInputName_5_6_1(Float value) {
		this.InputName_5_6_1 = value;
	}

	public void setInputName_5_6_4(Float value) {
		this.InputName_5_6_4 = value;
	}

	public void setInputName_5_6_5(Float value) {
		this.InputName_5_6_5 = value;
	}

	public void setInputName_5_6_2(Float value) {
		this.InputName_5_6_2 = value;
	}

	public void setInputName_5_6_3(Integer value) {
		this.InputName_5_6_3 = value;
	}

}
