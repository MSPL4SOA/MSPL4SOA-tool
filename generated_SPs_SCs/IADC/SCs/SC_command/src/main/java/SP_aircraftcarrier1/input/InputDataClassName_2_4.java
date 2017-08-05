package SP_aircraftcarrier1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_4")
public class InputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_4_1")
	protected Float InputName_2_4_1;
	@XmlElement(name = "InputName_2_4_2")
	protected Integer InputName_2_4_2;
	@XmlElement(name = "InputName_2_4_3")
	protected Float InputName_2_4_3;
	@XmlElement(name = "InputName_2_4_4")
	protected Float InputName_2_4_4;

	public Float getInputName_2_4_1() {
		return InputName_2_4_1;
	}

	public Integer getInputName_2_4_2() {
		return InputName_2_4_2;
	}

	public Float getInputName_2_4_3() {
		return InputName_2_4_3;
	}

	public Float getInputName_2_4_4() {
		return InputName_2_4_4;
	}

	public void setInputName_2_4_1(Float value) {
		this.InputName_2_4_1 = value;
	}

	public void setInputName_2_4_2(Integer value) {
		this.InputName_2_4_2 = value;
	}

	public void setInputName_2_4_3(Float value) {
		this.InputName_2_4_3 = value;
	}

	public void setInputName_2_4_4(Float value) {
		this.InputName_2_4_4 = value;
	}

}
