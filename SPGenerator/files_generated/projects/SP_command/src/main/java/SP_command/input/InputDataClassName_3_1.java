package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_1")
@XmlType(name = "inputDataClassName_3_1", propOrder = { "InputName_3_1_1" })
public class InputDataClassName_3_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_1_1")
	protected String InputName_3_1_1;

	public String getInputName_3_1_1() {
		return InputName_3_1_1;
	}

	public void setInputName_3_1_1(String value) {
		this.InputName_3_1_1 = value;
	}

}
