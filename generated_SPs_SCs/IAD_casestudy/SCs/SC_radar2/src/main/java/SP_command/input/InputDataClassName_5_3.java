package SP_command.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_3")
public class InputDataClassName_5_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_3_1")
	protected Float InputName_5_3_1;

	public Float getInputName_5_3_1() {
		return InputName_5_3_1;
	}

	public void setInputName_5_3_1(Float value) {
		this.InputName_5_3_1 = value;
	}

}
