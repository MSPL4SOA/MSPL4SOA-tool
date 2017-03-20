package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_2")
@XmlType(name = "inputDataClassName_1_2", propOrder = { "InputName_1_2_1",
		"InputName_1_2_4", "InputName_1_2_2", "InputName_1_2_3" })
public class InputDataClassName_1_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_2_1")
	protected Float InputName_1_2_1;
	@XmlElement(name = "InputName_1_2_4")
	protected Float InputName_1_2_4;
	@XmlElement(name = "InputName_1_2_2")
	protected Float InputName_1_2_2;
	@XmlElement(name = "InputName_1_2_3")
	protected String InputName_1_2_3;

	public Float getInputName_1_2_1() {
		return InputName_1_2_1;
	}

	public Float getInputName_1_2_4() {
		return InputName_1_2_4;
	}

	public Float getInputName_1_2_2() {
		return InputName_1_2_2;
	}

	public String getInputName_1_2_3() {
		return InputName_1_2_3;
	}

	public void setInputName_1_2_1(Float value) {
		this.InputName_1_2_1 = value;
	}

	public void setInputName_1_2_4(Float value) {
		this.InputName_1_2_4 = value;
	}

	public void setInputName_1_2_2(Float value) {
		this.InputName_1_2_2 = value;
	}

	public void setInputName_1_2_3(String value) {
		this.InputName_1_2_3 = value;
	}

}
