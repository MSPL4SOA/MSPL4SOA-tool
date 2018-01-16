package SP_all.input;

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
	protected Float InputName_1_5_5;
	@XmlElement(name = "InputName_1_5_6")
	protected String InputName_1_5_6;
	@XmlElement(name = "InputName_1_5_3")
	protected Float InputName_1_5_3;
	@XmlElement(name = "InputName_1_5_4")
	protected Integer InputName_1_5_4;
	@XmlElement(name = "InputName_1_5_1")
	protected String InputName_1_5_1;
	@XmlElement(name = "InputName_1_5_2")
	protected Float InputName_1_5_2;

	public Float getInputName_1_5_5() {
		return InputName_1_5_5;
	}

	public String getInputName_1_5_6() {
		return InputName_1_5_6;
	}

	public Float getInputName_1_5_3() {
		return InputName_1_5_3;
	}

	public Integer getInputName_1_5_4() {
		return InputName_1_5_4;
	}

	public String getInputName_1_5_1() {
		return InputName_1_5_1;
	}

	public Float getInputName_1_5_2() {
		return InputName_1_5_2;
	}

	public void setInputName_1_5_5(Float value) {
		this.InputName_1_5_5 = value;
	}

	public void setInputName_1_5_6(String value) {
		this.InputName_1_5_6 = value;
	}

	public void setInputName_1_5_3(Float value) {
		this.InputName_1_5_3 = value;
	}

	public void setInputName_1_5_4(Integer value) {
		this.InputName_1_5_4 = value;
	}

	public void setInputName_1_5_1(String value) {
		this.InputName_1_5_1 = value;
	}

	public void setInputName_1_5_2(Float value) {
		this.InputName_1_5_2 = value;
	}

}
