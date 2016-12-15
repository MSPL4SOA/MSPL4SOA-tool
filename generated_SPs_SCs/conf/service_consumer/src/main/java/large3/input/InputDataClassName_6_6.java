package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_6")
public class InputDataClassName_6_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_6_1")
	protected String InputName_6_6_1;
	@XmlElement(name = "InputName_6_6_2")
	protected Integer InputName_6_6_2;
	@XmlElement(name = "InputName_6_6_3")
	protected Integer InputName_6_6_3;
	@XmlElement(name = "InputName_6_6_4")
	protected Float InputName_6_6_4;

	public String getInputName_6_6_1() {
		return InputName_6_6_1;
	}

	public Integer getInputName_6_6_2() {
		return InputName_6_6_2;
	}

	public Integer getInputName_6_6_3() {
		return InputName_6_6_3;
	}

	public Float getInputName_6_6_4() {
		return InputName_6_6_4;
	}

	public void setInputName_6_6_1(String value) {
		this.InputName_6_6_1 = value;
	}

	public void setInputName_6_6_2(Integer value) {
		this.InputName_6_6_2 = value;
	}

	public void setInputName_6_6_3(Integer value) {
		this.InputName_6_6_3 = value;
	}

	public void setInputName_6_6_4(Float value) {
		this.InputName_6_6_4 = value;
	}

}
