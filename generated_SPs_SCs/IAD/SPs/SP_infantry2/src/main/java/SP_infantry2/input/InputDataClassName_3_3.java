package SP_infantry2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_3")
@XmlType(name = "inputDataClassName_3_3", propOrder = { "InputName_3_3_1",
		"InputName_3_3_2", "InputName_3_3_9", "InputName_3_3_7",
		"InputName_3_3_8", "InputName_3_3_5", "InputName_3_3_6",
		"InputName_3_3_3", "InputName_3_3_4" })
public class InputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_3_1")
	protected Float InputName_3_3_1;
	@XmlElement(name = "InputName_3_3_2")
	protected String InputName_3_3_2;
	@XmlElement(name = "InputName_3_3_9")
	protected Integer InputName_3_3_9;
	@XmlElement(name = "InputName_3_3_7")
	protected Integer InputName_3_3_7;
	@XmlElement(name = "InputName_3_3_8")
	protected Integer InputName_3_3_8;
	@XmlElement(name = "InputName_3_3_5")
	protected Integer InputName_3_3_5;
	@XmlElement(name = "InputName_3_3_6")
	protected Integer InputName_3_3_6;
	@XmlElement(name = "InputName_3_3_3")
	protected String InputName_3_3_3;
	@XmlElement(name = "InputName_3_3_4")
	protected Float InputName_3_3_4;

	public Float getInputName_3_3_1() {
		return InputName_3_3_1;
	}

	public String getInputName_3_3_2() {
		return InputName_3_3_2;
	}

	public Integer getInputName_3_3_9() {
		return InputName_3_3_9;
	}

	public Integer getInputName_3_3_7() {
		return InputName_3_3_7;
	}

	public Integer getInputName_3_3_8() {
		return InputName_3_3_8;
	}

	public Integer getInputName_3_3_5() {
		return InputName_3_3_5;
	}

	public Integer getInputName_3_3_6() {
		return InputName_3_3_6;
	}

	public String getInputName_3_3_3() {
		return InputName_3_3_3;
	}

	public Float getInputName_3_3_4() {
		return InputName_3_3_4;
	}

	public void setInputName_3_3_1(Float value) {
		this.InputName_3_3_1 = value;
	}

	public void setInputName_3_3_2(String value) {
		this.InputName_3_3_2 = value;
	}

	public void setInputName_3_3_9(Integer value) {
		this.InputName_3_3_9 = value;
	}

	public void setInputName_3_3_7(Integer value) {
		this.InputName_3_3_7 = value;
	}

	public void setInputName_3_3_8(Integer value) {
		this.InputName_3_3_8 = value;
	}

	public void setInputName_3_3_5(Integer value) {
		this.InputName_3_3_5 = value;
	}

	public void setInputName_3_3_6(Integer value) {
		this.InputName_3_3_6 = value;
	}

	public void setInputName_3_3_3(String value) {
		this.InputName_3_3_3 = value;
	}

	public void setInputName_3_3_4(Float value) {
		this.InputName_3_3_4 = value;
	}

}
