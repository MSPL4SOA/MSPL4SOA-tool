package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_4")
@XmlType(name = "inputDataClassName_1_4", propOrder = { "InputName_1_4_4",
		"InputName_1_4_2", "InputName_1_4_3", "InputName_1_4_1" })
public class InputDataClassName_1_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_4_4")
	protected Integer InputName_1_4_4;
	@XmlElement(name = "InputName_1_4_2")
	protected Float InputName_1_4_2;
	@XmlElement(name = "InputName_1_4_3")
	protected String InputName_1_4_3;
	@XmlElement(name = "InputName_1_4_1")
	protected String InputName_1_4_1;

	public Integer getInputName_1_4_4() {
		return InputName_1_4_4;
	}

	public Float getInputName_1_4_2() {
		return InputName_1_4_2;
	}

	public String getInputName_1_4_3() {
		return InputName_1_4_3;
	}

	public String getInputName_1_4_1() {
		return InputName_1_4_1;
	}

	public void setInputName_1_4_4(Integer value) {
		this.InputName_1_4_4 = value;
	}

	public void setInputName_1_4_2(Float value) {
		this.InputName_1_4_2 = value;
	}

	public void setInputName_1_4_3(String value) {
		this.InputName_1_4_3 = value;
	}

	public void setInputName_1_4_1(String value) {
		this.InputName_1_4_1 = value;
	}

}
