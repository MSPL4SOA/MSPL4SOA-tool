package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_6")
@XmlType(name = "inputDataClassName_3_6", propOrder = { "InputName_3_6_1" })
public class InputDataClassName_3_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_6_1")
	protected Float InputName_3_6_1;

	public Float getInputName_3_6_1() {
		return InputName_3_6_1;
	}

	public void setInputName_3_6_1(Float value) {
		this.InputName_3_6_1 = value;
	}

}
