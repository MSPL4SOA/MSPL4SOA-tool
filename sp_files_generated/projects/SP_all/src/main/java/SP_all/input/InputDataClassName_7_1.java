package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_1")
@XmlType(name = "inputDataClassName_7_1", propOrder = { "InputName_7_1_1",
		"InputName_7_1_2" })
public class InputDataClassName_7_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_1_1")
	protected String InputName_7_1_1;
	@XmlElement(name = "InputName_7_1_2")
	protected String InputName_7_1_2;

	public String getInputName_7_1_1() {
		return InputName_7_1_1;
	}

	public String getInputName_7_1_2() {
		return InputName_7_1_2;
	}

	public void setInputName_7_1_1(String value) {
		this.InputName_7_1_1 = value;
	}

	public void setInputName_7_1_2(String value) {
		this.InputName_7_1_2 = value;
	}

}
