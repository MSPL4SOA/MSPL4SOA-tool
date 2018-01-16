package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_5")
@XmlType(name = "inputDataClassName_7_5", propOrder = { "InputName_7_5_3",
		"InputName_7_5_4", "InputName_7_5_1", "InputName_7_5_2",
		"InputName_7_5_5" })
public class InputDataClassName_7_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_5_3")
	protected Float InputName_7_5_3;
	@XmlElement(name = "InputName_7_5_4")
	protected String InputName_7_5_4;
	@XmlElement(name = "InputName_7_5_1")
	protected Float InputName_7_5_1;
	@XmlElement(name = "InputName_7_5_2")
	protected Float InputName_7_5_2;
	@XmlElement(name = "InputName_7_5_5")
	protected String InputName_7_5_5;

	public Float getInputName_7_5_3() {
		return InputName_7_5_3;
	}

	public String getInputName_7_5_4() {
		return InputName_7_5_4;
	}

	public Float getInputName_7_5_1() {
		return InputName_7_5_1;
	}

	public Float getInputName_7_5_2() {
		return InputName_7_5_2;
	}

	public String getInputName_7_5_5() {
		return InputName_7_5_5;
	}

	public void setInputName_7_5_3(Float value) {
		this.InputName_7_5_3 = value;
	}

	public void setInputName_7_5_4(String value) {
		this.InputName_7_5_4 = value;
	}

	public void setInputName_7_5_1(Float value) {
		this.InputName_7_5_1 = value;
	}

	public void setInputName_7_5_2(Float value) {
		this.InputName_7_5_2 = value;
	}

	public void setInputName_7_5_5(String value) {
		this.InputName_7_5_5 = value;
	}

}
