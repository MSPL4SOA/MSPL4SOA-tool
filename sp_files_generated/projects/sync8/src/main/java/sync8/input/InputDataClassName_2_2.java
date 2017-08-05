package sync8.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_2")
@XmlType(name = "inputDataClassName_2_2", propOrder = { "InputName_2_2_1",
		"InputName_2_2_2", "InputName_2_2_3", "InputName_2_2_4",
		"InputName_2_2_5" })
public class InputDataClassName_2_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_2_1")
	protected Integer InputName_2_2_1;
	@XmlElement(name = "InputName_2_2_2")
	protected Float InputName_2_2_2;
	@XmlElement(name = "InputName_2_2_3")
	protected Integer InputName_2_2_3;
	@XmlElement(name = "InputName_2_2_4")
	protected Float InputName_2_2_4;
	@XmlElement(name = "InputName_2_2_5")
	protected Float InputName_2_2_5;

	public Integer getInputName_2_2_1() {
		return InputName_2_2_1;
	}

	public Float getInputName_2_2_2() {
		return InputName_2_2_2;
	}

	public Integer getInputName_2_2_3() {
		return InputName_2_2_3;
	}

	public Float getInputName_2_2_4() {
		return InputName_2_2_4;
	}

	public Float getInputName_2_2_5() {
		return InputName_2_2_5;
	}

	public void setInputName_2_2_1(Integer value) {
		this.InputName_2_2_1 = value;
	}

	public void setInputName_2_2_2(Float value) {
		this.InputName_2_2_2 = value;
	}

	public void setInputName_2_2_3(Integer value) {
		this.InputName_2_2_3 = value;
	}

	public void setInputName_2_2_4(Float value) {
		this.InputName_2_2_4 = value;
	}

	public void setInputName_2_2_5(Float value) {
		this.InputName_2_2_5 = value;
	}

}
