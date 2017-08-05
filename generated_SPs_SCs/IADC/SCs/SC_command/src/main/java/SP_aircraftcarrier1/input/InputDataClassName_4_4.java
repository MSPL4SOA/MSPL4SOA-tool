package SP_aircraftcarrier1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_4")
public class InputDataClassName_4_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_4_1")
	protected Integer InputName_4_4_1;
	@XmlElement(name = "InputName_4_4_2")
	protected Integer InputName_4_4_2;
	@XmlElement(name = "InputName_4_4_3")
	protected Float InputName_4_4_3;

	public Integer getInputName_4_4_1() {
		return InputName_4_4_1;
	}

	public Integer getInputName_4_4_2() {
		return InputName_4_4_2;
	}

	public Float getInputName_4_4_3() {
		return InputName_4_4_3;
	}

	public void setInputName_4_4_1(Integer value) {
		this.InputName_4_4_1 = value;
	}

	public void setInputName_4_4_2(Integer value) {
		this.InputName_4_4_2 = value;
	}

	public void setInputName_4_4_3(Float value) {
		this.InputName_4_4_3 = value;
	}

}
