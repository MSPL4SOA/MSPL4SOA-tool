package SP_helicopter1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_2")
public class InputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_2_2")
	protected String InputName_3_2_2;
	@XmlElement(name = "InputName_3_2_3")
	protected Float InputName_3_2_3;
	@XmlElement(name = "InputName_3_2_1")
	protected Float InputName_3_2_1;
	@XmlElement(name = "InputName_3_2_4")
	protected Integer InputName_3_2_4;

	public String getInputName_3_2_2() {
		return InputName_3_2_2;
	}

	public Float getInputName_3_2_3() {
		return InputName_3_2_3;
	}

	public Float getInputName_3_2_1() {
		return InputName_3_2_1;
	}

	public Integer getInputName_3_2_4() {
		return InputName_3_2_4;
	}

	public void setInputName_3_2_2(String value) {
		this.InputName_3_2_2 = value;
	}

	public void setInputName_3_2_3(Float value) {
		this.InputName_3_2_3 = value;
	}

	public void setInputName_3_2_1(Float value) {
		this.InputName_3_2_1 = value;
	}

	public void setInputName_3_2_4(Integer value) {
		this.InputName_3_2_4 = value;
	}

}
