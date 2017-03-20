package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_6")
@XmlType(name = "inputDataClassName_6_6", propOrder = { "InputName_6_6_1",
		"InputName_6_6_2", "InputName_6_6_3", "InputName_6_6_4" })
public class InputDataClassName_6_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_6_1")
	protected String InputName_6_6_1;
	@XmlElement(name = "InputName_6_6_2")
	protected Float InputName_6_6_2;
	@XmlElement(name = "InputName_6_6_3")
	protected Float InputName_6_6_3;
	@XmlElement(name = "InputName_6_6_4")
	protected Float InputName_6_6_4;

	public String getInputName_6_6_1() {
		return InputName_6_6_1;
	}

	public Float getInputName_6_6_2() {
		return InputName_6_6_2;
	}

	public Float getInputName_6_6_3() {
		return InputName_6_6_3;
	}

	public Float getInputName_6_6_4() {
		return InputName_6_6_4;
	}

	public void setInputName_6_6_1(String value) {
		this.InputName_6_6_1 = value;
	}

	public void setInputName_6_6_2(Float value) {
		this.InputName_6_6_2 = value;
	}

	public void setInputName_6_6_3(Float value) {
		this.InputName_6_6_3 = value;
	}

	public void setInputName_6_6_4(Float value) {
		this.InputName_6_6_4 = value;
	}

}
