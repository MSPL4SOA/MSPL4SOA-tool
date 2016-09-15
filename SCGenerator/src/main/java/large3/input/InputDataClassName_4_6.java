package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_6")
public class InputDataClassName_4_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_6_3")
	protected Integer InputName_4_6_3;
	@XmlElement(name = "InputName_4_6_4")
	protected Integer InputName_4_6_4;
	@XmlElement(name = "InputName_4_6_1")
	protected Float InputName_4_6_1;
	@XmlElement(name = "InputName_4_6_2")
	protected Float InputName_4_6_2;

	public Integer getInputName_4_6_3() {
		return InputName_4_6_3;
	}

	public Integer getInputName_4_6_4() {
		return InputName_4_6_4;
	}

	public Float getInputName_4_6_1() {
		return InputName_4_6_1;
	}

	public Float getInputName_4_6_2() {
		return InputName_4_6_2;
	}

	public void setInputName_4_6_3(Integer value) {
		this.InputName_4_6_3 = value;
	}

	public void setInputName_4_6_4(Integer value) {
		this.InputName_4_6_4 = value;
	}

	public void setInputName_4_6_1(Float value) {
		this.InputName_4_6_1 = value;
	}

	public void setInputName_4_6_2(Float value) {
		this.InputName_4_6_2 = value;
	}

}
