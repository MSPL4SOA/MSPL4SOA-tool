package sync8.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_5")
@XmlType(name = "inputDataClassName_1_5", propOrder = { "InputName_1_5_5",
		"InputName_1_5_6", "InputName_1_5_3", "InputName_1_5_4",
		"InputName_1_5_1", "InputName_1_5_2" })
public class InputDataClassName_1_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_5_5")
	protected Integer InputName_1_5_5;
	@XmlElement(name = "InputName_1_5_6")
	protected Float InputName_1_5_6;
	@XmlElement(name = "InputName_1_5_3")
	protected String InputName_1_5_3;
	@XmlElement(name = "InputName_1_5_4")
	protected String InputName_1_5_4;
	@XmlElement(name = "InputName_1_5_1")
	protected Float InputName_1_5_1;
	@XmlElement(name = "InputName_1_5_2")
	protected String InputName_1_5_2;

	public Integer getInputName_1_5_5() {
		return InputName_1_5_5;
	}

	public Float getInputName_1_5_6() {
		return InputName_1_5_6;
	}

	public String getInputName_1_5_3() {
		return InputName_1_5_3;
	}

	public String getInputName_1_5_4() {
		return InputName_1_5_4;
	}

	public Float getInputName_1_5_1() {
		return InputName_1_5_1;
	}

	public String getInputName_1_5_2() {
		return InputName_1_5_2;
	}

	public void setInputName_1_5_5(Integer value) {
		this.InputName_1_5_5 = value;
	}

	public void setInputName_1_5_6(Float value) {
		this.InputName_1_5_6 = value;
	}

	public void setInputName_1_5_3(String value) {
		this.InputName_1_5_3 = value;
	}

	public void setInputName_1_5_4(String value) {
		this.InputName_1_5_4 = value;
	}

	public void setInputName_1_5_1(Float value) {
		this.InputName_1_5_1 = value;
	}

	public void setInputName_1_5_2(String value) {
		this.InputName_1_5_2 = value;
	}

}
