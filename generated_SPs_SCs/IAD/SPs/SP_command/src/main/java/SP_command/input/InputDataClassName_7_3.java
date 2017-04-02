package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_3")
@XmlType(name = "inputDataClassName_7_3", propOrder = { "InputName_7_3_5",
		"InputName_7_3_6", "InputName_7_3_3", "InputName_7_3_4",
		"InputName_7_3_1", "InputName_7_3_2", "InputName_7_3_7",
		"InputName_7_3_8" })
public class InputDataClassName_7_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_3_5")
	protected Float InputName_7_3_5;
	@XmlElement(name = "InputName_7_3_6")
	protected Float InputName_7_3_6;
	@XmlElement(name = "InputName_7_3_3")
	protected String InputName_7_3_3;
	@XmlElement(name = "InputName_7_3_4")
	protected Integer InputName_7_3_4;
	@XmlElement(name = "InputName_7_3_1")
	protected String InputName_7_3_1;
	@XmlElement(name = "InputName_7_3_2")
	protected Integer InputName_7_3_2;
	@XmlElement(name = "InputName_7_3_7")
	protected Float InputName_7_3_7;
	@XmlElement(name = "InputName_7_3_8")
	protected Float InputName_7_3_8;

	public Float getInputName_7_3_5() {
		return InputName_7_3_5;
	}

	public Float getInputName_7_3_6() {
		return InputName_7_3_6;
	}

	public String getInputName_7_3_3() {
		return InputName_7_3_3;
	}

	public Integer getInputName_7_3_4() {
		return InputName_7_3_4;
	}

	public String getInputName_7_3_1() {
		return InputName_7_3_1;
	}

	public Integer getInputName_7_3_2() {
		return InputName_7_3_2;
	}

	public Float getInputName_7_3_7() {
		return InputName_7_3_7;
	}

	public Float getInputName_7_3_8() {
		return InputName_7_3_8;
	}

	public void setInputName_7_3_5(Float value) {
		this.InputName_7_3_5 = value;
	}

	public void setInputName_7_3_6(Float value) {
		this.InputName_7_3_6 = value;
	}

	public void setInputName_7_3_3(String value) {
		this.InputName_7_3_3 = value;
	}

	public void setInputName_7_3_4(Integer value) {
		this.InputName_7_3_4 = value;
	}

	public void setInputName_7_3_1(String value) {
		this.InputName_7_3_1 = value;
	}

	public void setInputName_7_3_2(Integer value) {
		this.InputName_7_3_2 = value;
	}

	public void setInputName_7_3_7(Float value) {
		this.InputName_7_3_7 = value;
	}

	public void setInputName_7_3_8(Float value) {
		this.InputName_7_3_8 = value;
	}

}
