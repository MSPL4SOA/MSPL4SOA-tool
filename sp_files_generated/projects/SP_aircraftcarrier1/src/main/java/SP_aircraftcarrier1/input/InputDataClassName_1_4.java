package SP_aircraftcarrier1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_4")
@XmlType(name = "inputDataClassName_1_4", propOrder = { "InputName_1_4_6",
		"InputName_1_4_7", "InputName_1_4_4", "InputName_1_4_5",
		"InputName_1_4_2", "InputName_1_4_3", "InputName_1_4_1" })
public class InputDataClassName_1_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_4_6")
	protected Float InputName_1_4_6;
	@XmlElement(name = "InputName_1_4_7")
	protected String InputName_1_4_7;
	@XmlElement(name = "InputName_1_4_4")
	protected Integer InputName_1_4_4;
	@XmlElement(name = "InputName_1_4_5")
	protected Float InputName_1_4_5;
	@XmlElement(name = "InputName_1_4_2")
	protected Integer InputName_1_4_2;
	@XmlElement(name = "InputName_1_4_3")
	protected String InputName_1_4_3;
	@XmlElement(name = "InputName_1_4_1")
	protected String InputName_1_4_1;

	public Float getInputName_1_4_6() {
		return InputName_1_4_6;
	}

	public String getInputName_1_4_7() {
		return InputName_1_4_7;
	}

	public Integer getInputName_1_4_4() {
		return InputName_1_4_4;
	}

	public Float getInputName_1_4_5() {
		return InputName_1_4_5;
	}

	public Integer getInputName_1_4_2() {
		return InputName_1_4_2;
	}

	public String getInputName_1_4_3() {
		return InputName_1_4_3;
	}

	public String getInputName_1_4_1() {
		return InputName_1_4_1;
	}

	public void setInputName_1_4_6(Float value) {
		this.InputName_1_4_6 = value;
	}

	public void setInputName_1_4_7(String value) {
		this.InputName_1_4_7 = value;
	}

	public void setInputName_1_4_4(Integer value) {
		this.InputName_1_4_4 = value;
	}

	public void setInputName_1_4_5(Float value) {
		this.InputName_1_4_5 = value;
	}

	public void setInputName_1_4_2(Integer value) {
		this.InputName_1_4_2 = value;
	}

	public void setInputName_1_4_3(String value) {
		this.InputName_1_4_3 = value;
	}

	public void setInputName_1_4_1(String value) {
		this.InputName_1_4_1 = value;
	}

}
