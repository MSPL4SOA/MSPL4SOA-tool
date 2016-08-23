package large11.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_2")
@XmlType(name = "inputDataClassName_3_2", propOrder = { "InputName_3_2_1",
		"InputName_3_2_2" })
public class InputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_2_1")
	protected String InputName_3_2_1;
	@XmlElement(name = "InputName_3_2_2")
	protected String InputName_3_2_2;

	public String getInputName_3_2_1() {
		return InputName_3_2_1;
	}

	public String getInputName_3_2_2() {
		return InputName_3_2_2;
	}

	public void setInputName_3_2_1(String value) {
		this.InputName_3_2_1 = value;
	}

	public void setInputName_3_2_2(String value) {
		this.InputName_3_2_2 = value;
	}

}
