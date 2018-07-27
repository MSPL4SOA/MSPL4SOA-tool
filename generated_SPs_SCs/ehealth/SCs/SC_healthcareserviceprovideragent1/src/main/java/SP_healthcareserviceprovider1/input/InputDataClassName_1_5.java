package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_5")
public class InputDataClassName_1_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_5_3")
	protected Float InputName_1_5_3;
	@XmlElement(name = "InputName_1_5_4")
	protected String InputName_1_5_4;
	@XmlElement(name = "InputName_1_5_1")
	protected String InputName_1_5_1;
	@XmlElement(name = "InputName_1_5_2")
	protected Float InputName_1_5_2;

	public Float getInputName_1_5_3() {
		return InputName_1_5_3;
	}

	public String getInputName_1_5_4() {
		return InputName_1_5_4;
	}

	public String getInputName_1_5_1() {
		return InputName_1_5_1;
	}

	public Float getInputName_1_5_2() {
		return InputName_1_5_2;
	}

	public void setInputName_1_5_3(Float value) {
		this.InputName_1_5_3 = value;
	}

	public void setInputName_1_5_4(String value) {
		this.InputName_1_5_4 = value;
	}

	public void setInputName_1_5_1(String value) {
		this.InputName_1_5_1 = value;
	}

	public void setInputName_1_5_2(Float value) {
		this.InputName_1_5_2 = value;
	}

}
