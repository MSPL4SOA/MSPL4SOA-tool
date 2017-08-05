package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_3")
public class InputDataClassName_4_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_3_2")
	protected Float InputName_4_3_2;
	@XmlElement(name = "InputName_4_3_3")
	protected Float InputName_4_3_3;
	@XmlElement(name = "InputName_4_3_1")
	protected Integer InputName_4_3_1;

	public Float getInputName_4_3_2() {
		return InputName_4_3_2;
	}

	public Float getInputName_4_3_3() {
		return InputName_4_3_3;
	}

	public Integer getInputName_4_3_1() {
		return InputName_4_3_1;
	}

	public void setInputName_4_3_2(Float value) {
		this.InputName_4_3_2 = value;
	}

	public void setInputName_4_3_3(Float value) {
		this.InputName_4_3_3 = value;
	}

	public void setInputName_4_3_1(Integer value) {
		this.InputName_4_3_1 = value;
	}

}
