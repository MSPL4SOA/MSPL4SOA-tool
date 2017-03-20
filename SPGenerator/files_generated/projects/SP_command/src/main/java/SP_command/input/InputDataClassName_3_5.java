package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_5")
@XmlType(name = "inputDataClassName_3_5", propOrder = { "InputName_3_5_7",
		"InputName_3_5_8", "InputName_3_5_5", "InputName_3_5_6",
		"InputName_3_5_3", "InputName_3_5_4", "InputName_3_5_1",
		"InputName_3_5_2" })
public class InputDataClassName_3_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_5_7")
	protected Float InputName_3_5_7;
	@XmlElement(name = "InputName_3_5_8")
	protected Integer InputName_3_5_8;
	@XmlElement(name = "InputName_3_5_5")
	protected Integer InputName_3_5_5;
	@XmlElement(name = "InputName_3_5_6")
	protected String InputName_3_5_6;
	@XmlElement(name = "InputName_3_5_3")
	protected Float InputName_3_5_3;
	@XmlElement(name = "InputName_3_5_4")
	protected String InputName_3_5_4;
	@XmlElement(name = "InputName_3_5_1")
	protected String InputName_3_5_1;
	@XmlElement(name = "InputName_3_5_2")
	protected Integer InputName_3_5_2;

	public Float getInputName_3_5_7() {
		return InputName_3_5_7;
	}

	public Integer getInputName_3_5_8() {
		return InputName_3_5_8;
	}

	public Integer getInputName_3_5_5() {
		return InputName_3_5_5;
	}

	public String getInputName_3_5_6() {
		return InputName_3_5_6;
	}

	public Float getInputName_3_5_3() {
		return InputName_3_5_3;
	}

	public String getInputName_3_5_4() {
		return InputName_3_5_4;
	}

	public String getInputName_3_5_1() {
		return InputName_3_5_1;
	}

	public Integer getInputName_3_5_2() {
		return InputName_3_5_2;
	}

	public void setInputName_3_5_7(Float value) {
		this.InputName_3_5_7 = value;
	}

	public void setInputName_3_5_8(Integer value) {
		this.InputName_3_5_8 = value;
	}

	public void setInputName_3_5_5(Integer value) {
		this.InputName_3_5_5 = value;
	}

	public void setInputName_3_5_6(String value) {
		this.InputName_3_5_6 = value;
	}

	public void setInputName_3_5_3(Float value) {
		this.InputName_3_5_3 = value;
	}

	public void setInputName_3_5_4(String value) {
		this.InputName_3_5_4 = value;
	}

	public void setInputName_3_5_1(String value) {
		this.InputName_3_5_1 = value;
	}

	public void setInputName_3_5_2(Integer value) {
		this.InputName_3_5_2 = value;
	}

}
