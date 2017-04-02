package SP_infantry2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_1")
@XmlType(name = "inputDataClassName_1_1", propOrder = { "InputName_1_1_1",
		"InputName_1_1_2", "InputName_1_1_5", "InputName_1_1_3",
		"InputName_1_1_4" })
public class InputDataClassName_1_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_1_1")
	protected Float InputName_1_1_1;
	@XmlElement(name = "InputName_1_1_2")
	protected Float InputName_1_1_2;
	@XmlElement(name = "InputName_1_1_5")
	protected Integer InputName_1_1_5;
	@XmlElement(name = "InputName_1_1_3")
	protected Integer InputName_1_1_3;
	@XmlElement(name = "InputName_1_1_4")
	protected Float InputName_1_1_4;

	public Float getInputName_1_1_1() {
		return InputName_1_1_1;
	}

	public Float getInputName_1_1_2() {
		return InputName_1_1_2;
	}

	public Integer getInputName_1_1_5() {
		return InputName_1_1_5;
	}

	public Integer getInputName_1_1_3() {
		return InputName_1_1_3;
	}

	public Float getInputName_1_1_4() {
		return InputName_1_1_4;
	}

	public void setInputName_1_1_1(Float value) {
		this.InputName_1_1_1 = value;
	}

	public void setInputName_1_1_2(Float value) {
		this.InputName_1_1_2 = value;
	}

	public void setInputName_1_1_5(Integer value) {
		this.InputName_1_1_5 = value;
	}

	public void setInputName_1_1_3(Integer value) {
		this.InputName_1_1_3 = value;
	}

	public void setInputName_1_1_4(Float value) {
		this.InputName_1_1_4 = value;
	}

}
