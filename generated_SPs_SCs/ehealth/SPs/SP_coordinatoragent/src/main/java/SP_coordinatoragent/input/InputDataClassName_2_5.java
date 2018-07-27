package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_5")
@XmlType(name = "inputDataClassName_2_5", propOrder = { "InputName_2_5_1" })
public class InputDataClassName_2_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_5_1")
	protected Integer InputName_2_5_1;

	public Integer getInputName_2_5_1() {
		return InputName_2_5_1;
	}

	public void setInputName_2_5_1(Integer value) {
		this.InputName_2_5_1 = value;
	}

}
