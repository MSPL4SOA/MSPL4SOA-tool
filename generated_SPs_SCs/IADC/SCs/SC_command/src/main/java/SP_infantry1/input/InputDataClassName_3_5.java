package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_5")
public class InputDataClassName_3_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_5_5")
	protected String InputName_3_5_5;
	@XmlElement(name = "InputName_3_5_6")
	protected Integer InputName_3_5_6;
	@XmlElement(name = "InputName_3_5_3")
	protected Float InputName_3_5_3;
	@XmlElement(name = "InputName_3_5_4")
	protected Float InputName_3_5_4;
	@XmlElement(name = "InputName_3_5_1")
	protected Integer InputName_3_5_1;
	@XmlElement(name = "InputName_3_5_2")
	protected Float InputName_3_5_2;

	public String getInputName_3_5_5() {
		return InputName_3_5_5;
	}

	public Integer getInputName_3_5_6() {
		return InputName_3_5_6;
	}

	public Float getInputName_3_5_3() {
		return InputName_3_5_3;
	}

	public Float getInputName_3_5_4() {
		return InputName_3_5_4;
	}

	public Integer getInputName_3_5_1() {
		return InputName_3_5_1;
	}

	public Float getInputName_3_5_2() {
		return InputName_3_5_2;
	}

	public void setInputName_3_5_5(String value) {
		this.InputName_3_5_5 = value;
	}

	public void setInputName_3_5_6(Integer value) {
		this.InputName_3_5_6 = value;
	}

	public void setInputName_3_5_3(Float value) {
		this.InputName_3_5_3 = value;
	}

	public void setInputName_3_5_4(Float value) {
		this.InputName_3_5_4 = value;
	}

	public void setInputName_3_5_1(Integer value) {
		this.InputName_3_5_1 = value;
	}

	public void setInputName_3_5_2(Float value) {
		this.InputName_3_5_2 = value;
	}

}
