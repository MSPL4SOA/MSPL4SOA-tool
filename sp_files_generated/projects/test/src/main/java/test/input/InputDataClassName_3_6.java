package test.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_6")
@XmlType(name = "inputDataClassName_3_6", propOrder = { "InputName_3_6_6",
		"InputName_3_6_7", "InputName_3_6_4", "InputName_3_6_5",
		"InputName_3_6_2", "InputName_3_6_3", "InputName_3_6_1" })
public class InputDataClassName_3_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_6_6")
	protected Float InputName_3_6_6;
	@XmlElement(name = "InputName_3_6_7")
	protected Float InputName_3_6_7;
	@XmlElement(name = "InputName_3_6_4")
	protected String InputName_3_6_4;
	@XmlElement(name = "InputName_3_6_5")
	protected Integer InputName_3_6_5;
	@XmlElement(name = "InputName_3_6_2")
	protected String InputName_3_6_2;
	@XmlElement(name = "InputName_3_6_3")
	protected Float InputName_3_6_3;
	@XmlElement(name = "InputName_3_6_1")
	protected String InputName_3_6_1;

	public Float getInputName_3_6_6() {
		return InputName_3_6_6;
	}

	public Float getInputName_3_6_7() {
		return InputName_3_6_7;
	}

	public String getInputName_3_6_4() {
		return InputName_3_6_4;
	}

	public Integer getInputName_3_6_5() {
		return InputName_3_6_5;
	}

	public String getInputName_3_6_2() {
		return InputName_3_6_2;
	}

	public Float getInputName_3_6_3() {
		return InputName_3_6_3;
	}

	public String getInputName_3_6_1() {
		return InputName_3_6_1;
	}

	public void setInputName_3_6_6(Float value) {
		this.InputName_3_6_6 = value;
	}

	public void setInputName_3_6_7(Float value) {
		this.InputName_3_6_7 = value;
	}

	public void setInputName_3_6_4(String value) {
		this.InputName_3_6_4 = value;
	}

	public void setInputName_3_6_5(Integer value) {
		this.InputName_3_6_5 = value;
	}

	public void setInputName_3_6_2(String value) {
		this.InputName_3_6_2 = value;
	}

	public void setInputName_3_6_3(Float value) {
		this.InputName_3_6_3 = value;
	}

	public void setInputName_3_6_1(String value) {
		this.InputName_3_6_1 = value;
	}

}
