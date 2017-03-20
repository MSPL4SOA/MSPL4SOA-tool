package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_5")
@XmlType(name = "inputDataClassName_5_5", propOrder = { "InputName_5_5_1",
		"InputName_5_5_2", "InputName_5_5_3" })
public class InputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_5_1")
	protected Float InputName_5_5_1;
	@XmlElement(name = "InputName_5_5_2")
	protected Float InputName_5_5_2;
	@XmlElement(name = "InputName_5_5_3")
	protected Float InputName_5_5_3;

	public Float getInputName_5_5_1() {
		return InputName_5_5_1;
	}

	public Float getInputName_5_5_2() {
		return InputName_5_5_2;
	}

	public Float getInputName_5_5_3() {
		return InputName_5_5_3;
	}

	public void setInputName_5_5_1(Float value) {
		this.InputName_5_5_1 = value;
	}

	public void setInputName_5_5_2(Float value) {
		this.InputName_5_5_2 = value;
	}

	public void setInputName_5_5_3(Float value) {
		this.InputName_5_5_3 = value;
	}

}
