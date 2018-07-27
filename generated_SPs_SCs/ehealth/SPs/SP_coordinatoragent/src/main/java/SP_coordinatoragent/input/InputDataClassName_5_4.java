package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_4")
@XmlType(name = "inputDataClassName_5_4", propOrder = { "InputName_5_4_1" })
public class InputDataClassName_5_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_4_1")
	protected Float InputName_5_4_1;

	public Float getInputName_5_4_1() {
		return InputName_5_4_1;
	}

	public void setInputName_5_4_1(Float value) {
		this.InputName_5_4_1 = value;
	}

}
