package SP_infantry2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_4")
@XmlType(name = "inputDataClassName_3_4", propOrder = { "InputName_3_4_1",
		"InputName_3_4_6", "InputName_3_4_4", "InputName_3_4_5",
		"InputName_3_4_2", "InputName_3_4_3" })
public class InputDataClassName_3_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_4_1")
	protected String InputName_3_4_1;
	@XmlElement(name = "InputName_3_4_6")
	protected Float InputName_3_4_6;
	@XmlElement(name = "InputName_3_4_4")
	protected String InputName_3_4_4;
	@XmlElement(name = "InputName_3_4_5")
	protected Float InputName_3_4_5;
	@XmlElement(name = "InputName_3_4_2")
	protected String InputName_3_4_2;
	@XmlElement(name = "InputName_3_4_3")
	protected Float InputName_3_4_3;

	public String getInputName_3_4_1() {
		return InputName_3_4_1;
	}

	public Float getInputName_3_4_6() {
		return InputName_3_4_6;
	}

	public String getInputName_3_4_4() {
		return InputName_3_4_4;
	}

	public Float getInputName_3_4_5() {
		return InputName_3_4_5;
	}

	public String getInputName_3_4_2() {
		return InputName_3_4_2;
	}

	public Float getInputName_3_4_3() {
		return InputName_3_4_3;
	}

	public void setInputName_3_4_1(String value) {
		this.InputName_3_4_1 = value;
	}

	public void setInputName_3_4_6(Float value) {
		this.InputName_3_4_6 = value;
	}

	public void setInputName_3_4_4(String value) {
		this.InputName_3_4_4 = value;
	}

	public void setInputName_3_4_5(Float value) {
		this.InputName_3_4_5 = value;
	}

	public void setInputName_3_4_2(String value) {
		this.InputName_3_4_2 = value;
	}

	public void setInputName_3_4_3(Float value) {
		this.InputName_3_4_3 = value;
	}

}
