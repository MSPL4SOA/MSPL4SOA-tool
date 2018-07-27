package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_1")
public class InputDataClassName_5_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_1_1")
	protected Float InputName_5_1_1;
	@XmlElement(name = "InputName_5_1_2")
	protected Integer InputName_5_1_2;

	public Float getInputName_5_1_1() {
		return InputName_5_1_1;
	}

	public Integer getInputName_5_1_2() {
		return InputName_5_1_2;
	}

	public void setInputName_5_1_1(Float value) {
		this.InputName_5_1_1 = value;
	}

	public void setInputName_5_1_2(Integer value) {
		this.InputName_5_1_2 = value;
	}

}
