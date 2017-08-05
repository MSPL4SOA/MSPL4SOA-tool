package SP_helicopter1.input;

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
	protected Integer InputName_5_4_2;
	@XmlElement(name = "InputName_5_4_3")
	protected String InputName_5_4_3;
	@XmlElement(name = "InputName_5_4_1")
	protected Integer InputName_5_4_1;
	@XmlElement(name = "InputName_5_4_4")
	protected String InputName_5_4_4;

	public Integer getInputName_5_4_2() {
		return InputName_5_4_2;
	}

	public String getInputName_5_4_3() {
		return InputName_5_4_3;
	}

	public Integer getInputName_5_4_1() {
		return InputName_5_4_1;
	}

	public String getInputName_5_4_4() {
		return InputName_5_4_4;
	}

	public void setInputName_5_4_2(Integer value) {
		this.InputName_5_4_2 = value;
	}

	public void setInputName_5_4_3(String value) {
		this.InputName_5_4_3 = value;
	}

	public void setInputName_5_4_1(Integer value) {
		this.InputName_5_4_1 = value;
	}

	public void setInputName_5_4_4(String value) {
		this.InputName_5_4_4 = value;
	}

}
