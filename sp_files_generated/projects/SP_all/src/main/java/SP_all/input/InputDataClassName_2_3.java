package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_3")
@XmlType(name = "inputDataClassName_2_3", propOrder = { "InputName_2_3_1",
		"InputName_2_3_2", "InputName_2_3_3", "InputName_2_3_4",
		"InputName_2_3_5", "InputName_2_3_6", "InputName_2_3_7",
		"InputName_2_3_8" })
public class InputDataClassName_2_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_3_1")
	protected String InputName_2_3_1;
	@XmlElement(name = "InputName_2_3_2")
	protected Integer InputName_2_3_2;
	@XmlElement(name = "InputName_2_3_3")
	protected Integer InputName_2_3_3;
	@XmlElement(name = "InputName_2_3_4")
	protected String InputName_2_3_4;
	@XmlElement(name = "InputName_2_3_5")
	protected Integer InputName_2_3_5;
	@XmlElement(name = "InputName_2_3_6")
	protected Float InputName_2_3_6;
	@XmlElement(name = "InputName_2_3_7")
	protected Integer InputName_2_3_7;
	@XmlElement(name = "InputName_2_3_8")
	protected Integer InputName_2_3_8;

	public String getInputName_2_3_1() {
		return InputName_2_3_1;
	}

	public Integer getInputName_2_3_2() {
		return InputName_2_3_2;
	}

	public Integer getInputName_2_3_3() {
		return InputName_2_3_3;
	}

	public String getInputName_2_3_4() {
		return InputName_2_3_4;
	}

	public Integer getInputName_2_3_5() {
		return InputName_2_3_5;
	}

	public Float getInputName_2_3_6() {
		return InputName_2_3_6;
	}

	public Integer getInputName_2_3_7() {
		return InputName_2_3_7;
	}

	public Integer getInputName_2_3_8() {
		return InputName_2_3_8;
	}

	public void setInputName_2_3_1(String value) {
		this.InputName_2_3_1 = value;
	}

	public void setInputName_2_3_2(Integer value) {
		this.InputName_2_3_2 = value;
	}

	public void setInputName_2_3_3(Integer value) {
		this.InputName_2_3_3 = value;
	}

	public void setInputName_2_3_4(String value) {
		this.InputName_2_3_4 = value;
	}

	public void setInputName_2_3_5(Integer value) {
		this.InputName_2_3_5 = value;
	}

	public void setInputName_2_3_6(Float value) {
		this.InputName_2_3_6 = value;
	}

	public void setInputName_2_3_7(Integer value) {
		this.InputName_2_3_7 = value;
	}

	public void setInputName_2_3_8(Integer value) {
		this.InputName_2_3_8 = value;
	}

}
