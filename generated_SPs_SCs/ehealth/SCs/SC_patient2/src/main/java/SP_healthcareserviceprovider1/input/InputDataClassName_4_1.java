package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_1")
public class InputDataClassName_4_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_1_4")
	protected Float InputName_4_1_4;
	@XmlElement(name = "InputName_4_1_1")
	protected String InputName_4_1_1;
	@XmlElement(name = "InputName_4_1_2")
	protected String InputName_4_1_2;
	@XmlElement(name = "InputName_4_1_3")
	protected Integer InputName_4_1_3;

	public Float getInputName_4_1_4() {
		return InputName_4_1_4;
	}

	public String getInputName_4_1_1() {
		return InputName_4_1_1;
	}

	public String getInputName_4_1_2() {
		return InputName_4_1_2;
	}

	public Integer getInputName_4_1_3() {
		return InputName_4_1_3;
	}

	public void setInputName_4_1_4(Float value) {
		this.InputName_4_1_4 = value;
	}

	public void setInputName_4_1_1(String value) {
		this.InputName_4_1_1 = value;
	}

	public void setInputName_4_1_2(String value) {
		this.InputName_4_1_2 = value;
	}

	public void setInputName_4_1_3(Integer value) {
		this.InputName_4_1_3 = value;
	}

}
