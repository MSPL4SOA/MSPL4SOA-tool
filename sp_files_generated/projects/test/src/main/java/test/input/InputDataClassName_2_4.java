package test.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_4")
@XmlType(name = "inputDataClassName_2_4", propOrder = { "InputName_2_4_1",
		"InputName_2_4_2", "InputName_2_4_3", "InputName_2_4_4",
		"InputName_2_4_5", "InputName_2_4_6", "InputName_2_4_7" })
public class InputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_4_1")
	protected Float InputName_2_4_1;
	@XmlElement(name = "InputName_2_4_2")
	protected Float InputName_2_4_2;
	@XmlElement(name = "InputName_2_4_3")
	protected String InputName_2_4_3;
	@XmlElement(name = "InputName_2_4_4")
	protected Float InputName_2_4_4;
	@XmlElement(name = "InputName_2_4_5")
	protected Float InputName_2_4_5;
	@XmlElement(name = "InputName_2_4_6")
	protected Float InputName_2_4_6;
	@XmlElement(name = "InputName_2_4_7")
	protected Integer InputName_2_4_7;

	public Float getInputName_2_4_1() {
		return InputName_2_4_1;
	}

	public Float getInputName_2_4_2() {
		return InputName_2_4_2;
	}

	public String getInputName_2_4_3() {
		return InputName_2_4_3;
	}

	public Float getInputName_2_4_4() {
		return InputName_2_4_4;
	}

	public Float getInputName_2_4_5() {
		return InputName_2_4_5;
	}

	public Float getInputName_2_4_6() {
		return InputName_2_4_6;
	}

	public Integer getInputName_2_4_7() {
		return InputName_2_4_7;
	}

	public void setInputName_2_4_1(Float value) {
		this.InputName_2_4_1 = value;
	}

	public void setInputName_2_4_2(Float value) {
		this.InputName_2_4_2 = value;
	}

	public void setInputName_2_4_3(String value) {
		this.InputName_2_4_3 = value;
	}

	public void setInputName_2_4_4(Float value) {
		this.InputName_2_4_4 = value;
	}

	public void setInputName_2_4_5(Float value) {
		this.InputName_2_4_5 = value;
	}

	public void setInputName_2_4_6(Float value) {
		this.InputName_2_4_6 = value;
	}

	public void setInputName_2_4_7(Integer value) {
		this.InputName_2_4_7 = value;
	}

}
