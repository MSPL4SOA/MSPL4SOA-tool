package SP_drone1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_3")
@XmlType(name = "inputDataClassName_2_3", propOrder = { "InputName_2_3_1",
		"InputName_2_3_2" })
public class InputDataClassName_2_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_3_1")
	protected String InputName_2_3_1;
	@XmlElement(name = "InputName_2_3_2")
	protected Float InputName_2_3_2;

	public String getInputName_2_3_1() {
		return InputName_2_3_1;
	}

	public Float getInputName_2_3_2() {
		return InputName_2_3_2;
	}

	public void setInputName_2_3_1(String value) {
		this.InputName_2_3_1 = value;
	}

	public void setInputName_2_3_2(Float value) {
		this.InputName_2_3_2 = value;
	}

}
