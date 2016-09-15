package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_1")
@XmlType(name = "inputDataClassName_7_1", propOrder = { "InputName_7_1_7",
		"InputName_7_1_5", "InputName_7_1_6", "InputName_7_1_3",
		"InputName_7_1_4", "InputName_7_1_1", "InputName_7_1_2" })
public class InputDataClassName_7_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_1_7")
	protected Float InputName_7_1_7;
	@XmlElement(name = "InputName_7_1_5")
	protected String InputName_7_1_5;
	@XmlElement(name = "InputName_7_1_6")
	protected Float InputName_7_1_6;
	@XmlElement(name = "InputName_7_1_3")
	protected String InputName_7_1_3;
	@XmlElement(name = "InputName_7_1_4")
	protected Integer InputName_7_1_4;
	@XmlElement(name = "InputName_7_1_1")
	protected Float InputName_7_1_1;
	@XmlElement(name = "InputName_7_1_2")
	protected Float InputName_7_1_2;

	public Float getInputName_7_1_7() {
		return InputName_7_1_7;
	}

	public String getInputName_7_1_5() {
		return InputName_7_1_5;
	}

	public Float getInputName_7_1_6() {
		return InputName_7_1_6;
	}

	public String getInputName_7_1_3() {
		return InputName_7_1_3;
	}

	public Integer getInputName_7_1_4() {
		return InputName_7_1_4;
	}

	public Float getInputName_7_1_1() {
		return InputName_7_1_1;
	}

	public Float getInputName_7_1_2() {
		return InputName_7_1_2;
	}

	public void setInputName_7_1_7(Float value) {
		this.InputName_7_1_7 = value;
	}

	public void setInputName_7_1_5(String value) {
		this.InputName_7_1_5 = value;
	}

	public void setInputName_7_1_6(Float value) {
		this.InputName_7_1_6 = value;
	}

	public void setInputName_7_1_3(String value) {
		this.InputName_7_1_3 = value;
	}

	public void setInputName_7_1_4(Integer value) {
		this.InputName_7_1_4 = value;
	}

	public void setInputName_7_1_1(Float value) {
		this.InputName_7_1_1 = value;
	}

	public void setInputName_7_1_2(Float value) {
		this.InputName_7_1_2 = value;
	}

}
