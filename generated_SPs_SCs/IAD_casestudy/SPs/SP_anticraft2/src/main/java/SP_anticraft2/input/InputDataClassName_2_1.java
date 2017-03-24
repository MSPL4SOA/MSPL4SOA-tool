package SP_anticraft2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_1")
@XmlType(name = "inputDataClassName_2_1", propOrder = { "InputName_2_1_1",
		"InputName_2_1_2", "InputName_2_1_3" })
public class InputDataClassName_2_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_1_1")
	protected String InputName_2_1_1;
	@XmlElement(name = "InputName_2_1_2")
	protected String InputName_2_1_2;
	@XmlElement(name = "InputName_2_1_3")
	protected Float InputName_2_1_3;

	public String getInputName_2_1_1() {
		return InputName_2_1_1;
	}

	public String getInputName_2_1_2() {
		return InputName_2_1_2;
	}

	public Float getInputName_2_1_3() {
		return InputName_2_1_3;
	}

	public void setInputName_2_1_1(String value) {
		this.InputName_2_1_1 = value;
	}

	public void setInputName_2_1_2(String value) {
		this.InputName_2_1_2 = value;
	}

	public void setInputName_2_1_3(Float value) {
		this.InputName_2_1_3 = value;
	}

}
