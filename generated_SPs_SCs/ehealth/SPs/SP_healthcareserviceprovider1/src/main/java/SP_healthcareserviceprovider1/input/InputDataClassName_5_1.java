package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_1")
@XmlType(name = "inputDataClassName_5_1", propOrder = { "InputName_5_1_1",
		"InputName_5_1_2", "InputName_5_1_5", "InputName_5_1_6",
		"InputName_5_1_3", "InputName_5_1_4", "InputName_5_1_9",
		"InputName_5_1_7", "InputName_5_1_8" })
public class InputDataClassName_5_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_1_1")
	protected String InputName_5_1_1;
	@XmlElement(name = "InputName_5_1_2")
	protected Integer InputName_5_1_2;
	@XmlElement(name = "InputName_5_1_5")
	protected Float InputName_5_1_5;
	@XmlElement(name = "InputName_5_1_6")
	protected Float InputName_5_1_6;
	@XmlElement(name = "InputName_5_1_3")
	protected String InputName_5_1_3;
	@XmlElement(name = "InputName_5_1_4")
	protected Integer InputName_5_1_4;
	@XmlElement(name = "InputName_5_1_9")
	protected Integer InputName_5_1_9;
	@XmlElement(name = "InputName_5_1_7")
	protected Integer InputName_5_1_7;
	@XmlElement(name = "InputName_5_1_8")
	protected String InputName_5_1_8;

	public String getInputName_5_1_1() {
		return InputName_5_1_1;
	}

	public Integer getInputName_5_1_2() {
		return InputName_5_1_2;
	}

	public Float getInputName_5_1_5() {
		return InputName_5_1_5;
	}

	public Float getInputName_5_1_6() {
		return InputName_5_1_6;
	}

	public String getInputName_5_1_3() {
		return InputName_5_1_3;
	}

	public Integer getInputName_5_1_4() {
		return InputName_5_1_4;
	}

	public Integer getInputName_5_1_9() {
		return InputName_5_1_9;
	}

	public Integer getInputName_5_1_7() {
		return InputName_5_1_7;
	}

	public String getInputName_5_1_8() {
		return InputName_5_1_8;
	}

	public void setInputName_5_1_1(String value) {
		this.InputName_5_1_1 = value;
	}

	public void setInputName_5_1_2(Integer value) {
		this.InputName_5_1_2 = value;
	}

	public void setInputName_5_1_5(Float value) {
		this.InputName_5_1_5 = value;
	}

	public void setInputName_5_1_6(Float value) {
		this.InputName_5_1_6 = value;
	}

	public void setInputName_5_1_3(String value) {
		this.InputName_5_1_3 = value;
	}

	public void setInputName_5_1_4(Integer value) {
		this.InputName_5_1_4 = value;
	}

	public void setInputName_5_1_9(Integer value) {
		this.InputName_5_1_9 = value;
	}

	public void setInputName_5_1_7(Integer value) {
		this.InputName_5_1_7 = value;
	}

	public void setInputName_5_1_8(String value) {
		this.InputName_5_1_8 = value;
	}

}
