package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_3")
public class InputDataClassName_7_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_3_3")
	protected Integer InputName_7_3_3;
	@XmlElement(name = "InputName_7_3_4")
	protected String InputName_7_3_4;
	@XmlElement(name = "InputName_7_3_1")
	protected Integer InputName_7_3_1;
	@XmlElement(name = "InputName_7_3_2")
	protected String InputName_7_3_2;

	public Integer getInputName_7_3_3() {
		return InputName_7_3_3;
	}

	public String getInputName_7_3_4() {
		return InputName_7_3_4;
	}

	public Integer getInputName_7_3_1() {
		return InputName_7_3_1;
	}

	public String getInputName_7_3_2() {
		return InputName_7_3_2;
	}

	public void setInputName_7_3_3(Integer value) {
		this.InputName_7_3_3 = value;
	}

	public void setInputName_7_3_4(String value) {
		this.InputName_7_3_4 = value;
	}

	public void setInputName_7_3_1(Integer value) {
		this.InputName_7_3_1 = value;
	}

	public void setInputName_7_3_2(String value) {
		this.InputName_7_3_2 = value;
	}

}
