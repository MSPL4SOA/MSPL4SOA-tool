package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_4")
public class InputDataClassName_5_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_4_2")
	protected Float InputName_5_4_2;
	@XmlElement(name = "InputName_5_4_1")
	protected Integer InputName_5_4_1;

	public Float getInputName_5_4_2() {
		return InputName_5_4_2;
	}

	public Integer getInputName_5_4_1() {
		return InputName_5_4_1;
	}

	public void setInputName_5_4_2(Float value) {
		this.InputName_5_4_2 = value;
	}

	public void setInputName_5_4_1(Integer value) {
		this.InputName_5_4_1 = value;
	}

}
