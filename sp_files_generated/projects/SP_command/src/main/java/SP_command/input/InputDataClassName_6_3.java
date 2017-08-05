package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_3")
@XmlType(name = "inputDataClassName_6_3", propOrder = { "InputName_6_3_1",
		"InputName_6_3_2", "InputName_6_3_3", "InputName_6_3_4",
		"InputName_6_3_5", "InputName_6_3_6", "InputName_6_3_7" })
public class InputDataClassName_6_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_3_1")
	protected Float InputName_6_3_1;
	@XmlElement(name = "InputName_6_3_2")
	protected String InputName_6_3_2;
	@XmlElement(name = "InputName_6_3_3")
	protected String InputName_6_3_3;
	@XmlElement(name = "InputName_6_3_4")
	protected String InputName_6_3_4;
	@XmlElement(name = "InputName_6_3_5")
	protected Float InputName_6_3_5;
	@XmlElement(name = "InputName_6_3_6")
	protected String InputName_6_3_6;
	@XmlElement(name = "InputName_6_3_7")
	protected String InputName_6_3_7;

	public Float getInputName_6_3_1() {
		return InputName_6_3_1;
	}

	public String getInputName_6_3_2() {
		return InputName_6_3_2;
	}

	public String getInputName_6_3_3() {
		return InputName_6_3_3;
	}

	public String getInputName_6_3_4() {
		return InputName_6_3_4;
	}

	public Float getInputName_6_3_5() {
		return InputName_6_3_5;
	}

	public String getInputName_6_3_6() {
		return InputName_6_3_6;
	}

	public String getInputName_6_3_7() {
		return InputName_6_3_7;
	}

	public void setInputName_6_3_1(Float value) {
		this.InputName_6_3_1 = value;
	}

	public void setInputName_6_3_2(String value) {
		this.InputName_6_3_2 = value;
	}

	public void setInputName_6_3_3(String value) {
		this.InputName_6_3_3 = value;
	}

	public void setInputName_6_3_4(String value) {
		this.InputName_6_3_4 = value;
	}

	public void setInputName_6_3_5(Float value) {
		this.InputName_6_3_5 = value;
	}

	public void setInputName_6_3_6(String value) {
		this.InputName_6_3_6 = value;
	}

	public void setInputName_6_3_7(String value) {
		this.InputName_6_3_7 = value;
	}

}
