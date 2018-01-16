package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_2")
@XmlType(name = "inputDataClassName_4_2", propOrder = { "InputName_4_2_7",
		"InputName_4_2_8", "InputName_4_2_3", "InputName_4_2_4",
		"InputName_4_2_5", "InputName_4_2_6", "InputName_4_2_1",
		"InputName_4_2_2" })
public class InputDataClassName_4_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_2_7")
	protected Integer InputName_4_2_7;
	@XmlElement(name = "InputName_4_2_8")
	protected Integer InputName_4_2_8;
	@XmlElement(name = "InputName_4_2_3")
	protected String InputName_4_2_3;
	@XmlElement(name = "InputName_4_2_4")
	protected String InputName_4_2_4;
	@XmlElement(name = "InputName_4_2_5")
	protected Float InputName_4_2_5;
	@XmlElement(name = "InputName_4_2_6")
	protected Integer InputName_4_2_6;
	@XmlElement(name = "InputName_4_2_1")
	protected Float InputName_4_2_1;
	@XmlElement(name = "InputName_4_2_2")
	protected Float InputName_4_2_2;

	public Integer getInputName_4_2_7() {
		return InputName_4_2_7;
	}

	public Integer getInputName_4_2_8() {
		return InputName_4_2_8;
	}

	public String getInputName_4_2_3() {
		return InputName_4_2_3;
	}

	public String getInputName_4_2_4() {
		return InputName_4_2_4;
	}

	public Float getInputName_4_2_5() {
		return InputName_4_2_5;
	}

	public Integer getInputName_4_2_6() {
		return InputName_4_2_6;
	}

	public Float getInputName_4_2_1() {
		return InputName_4_2_1;
	}

	public Float getInputName_4_2_2() {
		return InputName_4_2_2;
	}

	public void setInputName_4_2_7(Integer value) {
		this.InputName_4_2_7 = value;
	}

	public void setInputName_4_2_8(Integer value) {
		this.InputName_4_2_8 = value;
	}

	public void setInputName_4_2_3(String value) {
		this.InputName_4_2_3 = value;
	}

	public void setInputName_4_2_4(String value) {
		this.InputName_4_2_4 = value;
	}

	public void setInputName_4_2_5(Float value) {
		this.InputName_4_2_5 = value;
	}

	public void setInputName_4_2_6(Integer value) {
		this.InputName_4_2_6 = value;
	}

	public void setInputName_4_2_1(Float value) {
		this.InputName_4_2_1 = value;
	}

	public void setInputName_4_2_2(Float value) {
		this.InputName_4_2_2 = value;
	}

}
