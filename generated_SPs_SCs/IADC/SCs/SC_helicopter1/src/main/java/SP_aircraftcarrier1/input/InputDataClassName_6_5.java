package SP_aircraftcarrier1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_5")
public class InputDataClassName_6_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_5_1")
	protected Integer InputName_6_5_1;

	public Integer getInputName_6_5_1() {
		return InputName_6_5_1;
	}

	public void setInputName_6_5_1(Integer value) {
		this.InputName_6_5_1 = value;
	}

}
