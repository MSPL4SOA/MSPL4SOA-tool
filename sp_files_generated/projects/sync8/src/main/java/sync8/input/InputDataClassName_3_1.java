package sync8.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_1")
@XmlType(name = "inputDataClassName_3_1", propOrder = { "InputName_3_1_3",
		"InputName_3_1_4", "InputName_3_1_1", "InputName_3_1_2",
		"InputName_3_1_5" })
public class InputDataClassName_3_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_1_3")
	protected String InputName_3_1_3;
	@XmlElement(name = "InputName_3_1_4")
	protected Float InputName_3_1_4;
	@XmlElement(name = "InputName_3_1_1")
	protected Float InputName_3_1_1;
	@XmlElement(name = "InputName_3_1_2")
	protected Float InputName_3_1_2;
	@XmlElement(name = "InputName_3_1_5")
	protected Float InputName_3_1_5;

	public String getInputName_3_1_3() {
		return InputName_3_1_3;
	}

	public Float getInputName_3_1_4() {
		return InputName_3_1_4;
	}

	public Float getInputName_3_1_1() {
		return InputName_3_1_1;
	}

	public Float getInputName_3_1_2() {
		return InputName_3_1_2;
	}

	public Float getInputName_3_1_5() {
		return InputName_3_1_5;
	}

	public void setInputName_3_1_3(String value) {
		this.InputName_3_1_3 = value;
	}

	public void setInputName_3_1_4(Float value) {
		this.InputName_3_1_4 = value;
	}

	public void setInputName_3_1_1(Float value) {
		this.InputName_3_1_1 = value;
	}

	public void setInputName_3_1_2(Float value) {
		this.InputName_3_1_2 = value;
	}

	public void setInputName_3_1_5(Float value) {
		this.InputName_3_1_5 = value;
	}

}
