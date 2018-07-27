package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_2")
public class InputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_2_1")
	protected Integer InputName_3_2_1;

	public Integer getInputName_3_2_1() {
		return InputName_3_2_1;
	}

	public void setInputName_3_2_1(Integer value) {
		this.InputName_3_2_1 = value;
	}

}
