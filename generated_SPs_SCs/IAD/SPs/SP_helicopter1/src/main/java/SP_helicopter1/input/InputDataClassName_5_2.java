package SP_helicopter1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_2")
@XmlType(name = "inputDataClassName_5_2", propOrder = { "InputName_5_2_1",
		"InputName_5_2_4", "InputName_5_2_5", "InputName_5_2_2",
		"InputName_5_2_3", "InputName_5_2_8", "InputName_5_2_9",
		"InputName_5_2_6", "InputName_5_2_7" })
public class InputDataClassName_5_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_2_1")
	protected Integer InputName_5_2_1;
	@XmlElement(name = "InputName_5_2_4")
	protected String InputName_5_2_4;
	@XmlElement(name = "InputName_5_2_5")
	protected String InputName_5_2_5;
	@XmlElement(name = "InputName_5_2_2")
	protected String InputName_5_2_2;
	@XmlElement(name = "InputName_5_2_3")
	protected Float InputName_5_2_3;
	@XmlElement(name = "InputName_5_2_8")
	protected Float InputName_5_2_8;
	@XmlElement(name = "InputName_5_2_9")
	protected Float InputName_5_2_9;
	@XmlElement(name = "InputName_5_2_6")
	protected Float InputName_5_2_6;
	@XmlElement(name = "InputName_5_2_7")
	protected Float InputName_5_2_7;

	public Integer getInputName_5_2_1() {
		return InputName_5_2_1;
	}

	public String getInputName_5_2_4() {
		return InputName_5_2_4;
	}

	public String getInputName_5_2_5() {
		return InputName_5_2_5;
	}

	public String getInputName_5_2_2() {
		return InputName_5_2_2;
	}

	public Float getInputName_5_2_3() {
		return InputName_5_2_3;
	}

	public Float getInputName_5_2_8() {
		return InputName_5_2_8;
	}

	public Float getInputName_5_2_9() {
		return InputName_5_2_9;
	}

	public Float getInputName_5_2_6() {
		return InputName_5_2_6;
	}

	public Float getInputName_5_2_7() {
		return InputName_5_2_7;
	}

	public void setInputName_5_2_1(Integer value) {
		this.InputName_5_2_1 = value;
	}

	public void setInputName_5_2_4(String value) {
		this.InputName_5_2_4 = value;
	}

	public void setInputName_5_2_5(String value) {
		this.InputName_5_2_5 = value;
	}

	public void setInputName_5_2_2(String value) {
		this.InputName_5_2_2 = value;
	}

	public void setInputName_5_2_3(Float value) {
		this.InputName_5_2_3 = value;
	}

	public void setInputName_5_2_8(Float value) {
		this.InputName_5_2_8 = value;
	}

	public void setInputName_5_2_9(Float value) {
		this.InputName_5_2_9 = value;
	}

	public void setInputName_5_2_6(Float value) {
		this.InputName_5_2_6 = value;
	}

	public void setInputName_5_2_7(Float value) {
		this.InputName_5_2_7 = value;
	}

}
