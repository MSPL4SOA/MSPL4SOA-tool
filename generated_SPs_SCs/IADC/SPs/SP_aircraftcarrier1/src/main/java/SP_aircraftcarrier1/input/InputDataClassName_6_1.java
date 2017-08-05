package SP_aircraftcarrier1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_1")
@XmlType(name = "inputDataClassName_6_1", propOrder = { "InputName_6_1_2",
		"InputName_6_1_3", "InputName_6_1_4", "InputName_6_1_5",
		"InputName_6_1_6", "InputName_6_1_1" })
public class InputDataClassName_6_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_1_2")
	protected Float InputName_6_1_2;
	@XmlElement(name = "InputName_6_1_3")
	protected Integer InputName_6_1_3;
	@XmlElement(name = "InputName_6_1_4")
	protected Float InputName_6_1_4;
	@XmlElement(name = "InputName_6_1_5")
	protected String InputName_6_1_5;
	@XmlElement(name = "InputName_6_1_6")
	protected Float InputName_6_1_6;
	@XmlElement(name = "InputName_6_1_1")
	protected Float InputName_6_1_1;

	public Float getInputName_6_1_2() {
		return InputName_6_1_2;
	}

	public Integer getInputName_6_1_3() {
		return InputName_6_1_3;
	}

	public Float getInputName_6_1_4() {
		return InputName_6_1_4;
	}

	public String getInputName_6_1_5() {
		return InputName_6_1_5;
	}

	public Float getInputName_6_1_6() {
		return InputName_6_1_6;
	}

	public Float getInputName_6_1_1() {
		return InputName_6_1_1;
	}

	public void setInputName_6_1_2(Float value) {
		this.InputName_6_1_2 = value;
	}

	public void setInputName_6_1_3(Integer value) {
		this.InputName_6_1_3 = value;
	}

	public void setInputName_6_1_4(Float value) {
		this.InputName_6_1_4 = value;
	}

	public void setInputName_6_1_5(String value) {
		this.InputName_6_1_5 = value;
	}

	public void setInputName_6_1_6(Float value) {
		this.InputName_6_1_6 = value;
	}

	public void setInputName_6_1_1(Float value) {
		this.InputName_6_1_1 = value;
	}

}
