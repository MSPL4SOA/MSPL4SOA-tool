package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_3")
public class InputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_3_1")
	protected String InputName_3_3_1;
	@XmlElement(name = "InputName_3_3_2")
	protected Float InputName_3_3_2;
	@XmlElement(name = "InputName_3_3_5")
	protected Float InputName_3_3_5;
	@XmlElement(name = "InputName_3_3_3")
	protected Float InputName_3_3_3;
	@XmlElement(name = "InputName_3_3_4")
	protected Float InputName_3_3_4;

	public String getInputName_3_3_1() {
		return InputName_3_3_1;
	}

	public Float getInputName_3_3_2() {
		return InputName_3_3_2;
	}

	public Float getInputName_3_3_5() {
		return InputName_3_3_5;
	}

	public Float getInputName_3_3_3() {
		return InputName_3_3_3;
	}

	public Float getInputName_3_3_4() {
		return InputName_3_3_4;
	}

	public void setInputName_3_3_1(String value) {
		this.InputName_3_3_1 = value;
	}

	public void setInputName_3_3_2(Float value) {
		this.InputName_3_3_2 = value;
	}

	public void setInputName_3_3_5(Float value) {
		this.InputName_3_3_5 = value;
	}

	public void setInputName_3_3_3(Float value) {
		this.InputName_3_3_3 = value;
	}

	public void setInputName_3_3_4(Float value) {
		this.InputName_3_3_4 = value;
	}

}
