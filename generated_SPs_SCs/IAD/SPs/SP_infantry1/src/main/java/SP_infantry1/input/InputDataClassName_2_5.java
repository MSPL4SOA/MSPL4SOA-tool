package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_5")
@XmlType(name = "inputDataClassName_2_5", propOrder = { "InputName_2_5_1",
		"InputName_2_5_2", "InputName_2_5_3", "InputName_2_5_4",
		"InputName_2_5_5", "InputName_2_5_6", "InputName_2_5_7",
		"InputName_2_5_8" })
public class InputDataClassName_2_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_5_1")
	protected Integer InputName_2_5_1;
	@XmlElement(name = "InputName_2_5_2")
	protected String InputName_2_5_2;
	@XmlElement(name = "InputName_2_5_3")
	protected Integer InputName_2_5_3;
	@XmlElement(name = "InputName_2_5_4")
	protected Integer InputName_2_5_4;
	@XmlElement(name = "InputName_2_5_5")
	protected Float InputName_2_5_5;
	@XmlElement(name = "InputName_2_5_6")
	protected String InputName_2_5_6;
	@XmlElement(name = "InputName_2_5_7")
	protected String InputName_2_5_7;
	@XmlElement(name = "InputName_2_5_8")
	protected String InputName_2_5_8;

	public Integer getInputName_2_5_1() {
		return InputName_2_5_1;
	}

	public String getInputName_2_5_2() {
		return InputName_2_5_2;
	}

	public Integer getInputName_2_5_3() {
		return InputName_2_5_3;
	}

	public Integer getInputName_2_5_4() {
		return InputName_2_5_4;
	}

	public Float getInputName_2_5_5() {
		return InputName_2_5_5;
	}

	public String getInputName_2_5_6() {
		return InputName_2_5_6;
	}

	public String getInputName_2_5_7() {
		return InputName_2_5_7;
	}

	public String getInputName_2_5_8() {
		return InputName_2_5_8;
	}

	public void setInputName_2_5_1(Integer value) {
		this.InputName_2_5_1 = value;
	}

	public void setInputName_2_5_2(String value) {
		this.InputName_2_5_2 = value;
	}

	public void setInputName_2_5_3(Integer value) {
		this.InputName_2_5_3 = value;
	}

	public void setInputName_2_5_4(Integer value) {
		this.InputName_2_5_4 = value;
	}

	public void setInputName_2_5_5(Float value) {
		this.InputName_2_5_5 = value;
	}

	public void setInputName_2_5_6(String value) {
		this.InputName_2_5_6 = value;
	}

	public void setInputName_2_5_7(String value) {
		this.InputName_2_5_7 = value;
	}

	public void setInputName_2_5_8(String value) {
		this.InputName_2_5_8 = value;
	}

}
