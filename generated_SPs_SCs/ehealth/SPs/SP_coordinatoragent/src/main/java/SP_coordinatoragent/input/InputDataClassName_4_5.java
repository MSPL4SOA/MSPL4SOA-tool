package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_5")
@XmlType(name = "inputDataClassName_4_5", propOrder = { "InputName_4_5_8",
		"InputName_4_5_9", "InputName_4_5_4", "InputName_4_5_5",
		"InputName_4_5_6", "InputName_4_5_7", "InputName_4_5_1",
		"InputName_4_5_2", "InputName_4_5_3" })
public class InputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_5_8")
	protected String InputName_4_5_8;
	@XmlElement(name = "InputName_4_5_9")
	protected String InputName_4_5_9;
	@XmlElement(name = "InputName_4_5_4")
	protected String InputName_4_5_4;
	@XmlElement(name = "InputName_4_5_5")
	protected String InputName_4_5_5;
	@XmlElement(name = "InputName_4_5_6")
	protected String InputName_4_5_6;
	@XmlElement(name = "InputName_4_5_7")
	protected Float InputName_4_5_7;
	@XmlElement(name = "InputName_4_5_1")
	protected Float InputName_4_5_1;
	@XmlElement(name = "InputName_4_5_2")
	protected Integer InputName_4_5_2;
	@XmlElement(name = "InputName_4_5_3")
	protected Integer InputName_4_5_3;

	public String getInputName_4_5_8() {
		return InputName_4_5_8;
	}

	public String getInputName_4_5_9() {
		return InputName_4_5_9;
	}

	public String getInputName_4_5_4() {
		return InputName_4_5_4;
	}

	public String getInputName_4_5_5() {
		return InputName_4_5_5;
	}

	public String getInputName_4_5_6() {
		return InputName_4_5_6;
	}

	public Float getInputName_4_5_7() {
		return InputName_4_5_7;
	}

	public Float getInputName_4_5_1() {
		return InputName_4_5_1;
	}

	public Integer getInputName_4_5_2() {
		return InputName_4_5_2;
	}

	public Integer getInputName_4_5_3() {
		return InputName_4_5_3;
	}

	public void setInputName_4_5_8(String value) {
		this.InputName_4_5_8 = value;
	}

	public void setInputName_4_5_9(String value) {
		this.InputName_4_5_9 = value;
	}

	public void setInputName_4_5_4(String value) {
		this.InputName_4_5_4 = value;
	}

	public void setInputName_4_5_5(String value) {
		this.InputName_4_5_5 = value;
	}

	public void setInputName_4_5_6(String value) {
		this.InputName_4_5_6 = value;
	}

	public void setInputName_4_5_7(Float value) {
		this.InputName_4_5_7 = value;
	}

	public void setInputName_4_5_1(Float value) {
		this.InputName_4_5_1 = value;
	}

	public void setInputName_4_5_2(Integer value) {
		this.InputName_4_5_2 = value;
	}

	public void setInputName_4_5_3(Integer value) {
		this.InputName_4_5_3 = value;
	}

}
