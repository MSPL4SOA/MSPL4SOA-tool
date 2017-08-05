package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_2")
@XmlType(name = "inputDataClassName_7_2", propOrder = { "InputName_7_2_1" })
public class InputDataClassName_7_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_2_1")
	protected String InputName_7_2_1;

	public String getInputName_7_2_1() {
		return InputName_7_2_1;
	}

	public void setInputName_7_2_1(String value) {
		this.InputName_7_2_1 = value;
	}

}
