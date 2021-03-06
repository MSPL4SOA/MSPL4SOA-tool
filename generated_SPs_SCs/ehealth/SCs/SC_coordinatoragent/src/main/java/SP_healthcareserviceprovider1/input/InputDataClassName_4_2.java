package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_2")
public class InputDataClassName_4_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_2_1")
	protected Float InputName_4_2_1;
	@XmlElement(name = "InputName_4_2_2")
	protected Float InputName_4_2_2;

	public Float getInputName_4_2_1() {
		return InputName_4_2_1;
	}

	public Float getInputName_4_2_2() {
		return InputName_4_2_2;
	}

	public void setInputName_4_2_1(Float value) {
		this.InputName_4_2_1 = value;
	}

	public void setInputName_4_2_2(Float value) {
		this.InputName_4_2_2 = value;
	}

}
