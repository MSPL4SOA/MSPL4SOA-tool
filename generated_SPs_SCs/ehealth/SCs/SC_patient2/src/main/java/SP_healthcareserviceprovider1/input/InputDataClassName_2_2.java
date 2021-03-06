package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_2")
public class InputDataClassName_2_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_2_1")
	protected Integer InputName_2_2_1;
	@XmlElement(name = "InputName_2_2_2")
	protected String InputName_2_2_2;
	@XmlElement(name = "InputName_2_2_3")
	protected String InputName_2_2_3;
	@XmlElement(name = "InputName_2_2_4")
	protected Float InputName_2_2_4;
	@XmlElement(name = "InputName_2_2_5")
	protected String InputName_2_2_5;

	public Integer getInputName_2_2_1() {
		return InputName_2_2_1;
	}

	public String getInputName_2_2_2() {
		return InputName_2_2_2;
	}

	public String getInputName_2_2_3() {
		return InputName_2_2_3;
	}

	public Float getInputName_2_2_4() {
		return InputName_2_2_4;
	}

	public String getInputName_2_2_5() {
		return InputName_2_2_5;
	}

	public void setInputName_2_2_1(Integer value) {
		this.InputName_2_2_1 = value;
	}

	public void setInputName_2_2_2(String value) {
		this.InputName_2_2_2 = value;
	}

	public void setInputName_2_2_3(String value) {
		this.InputName_2_2_3 = value;
	}

	public void setInputName_2_2_4(Float value) {
		this.InputName_2_2_4 = value;
	}

	public void setInputName_2_2_5(String value) {
		this.InputName_2_2_5 = value;
	}

}
