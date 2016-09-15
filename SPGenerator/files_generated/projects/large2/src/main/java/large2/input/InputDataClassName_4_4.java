package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_4")
@XmlType(name = "inputDataClassName_4_4", propOrder = { "InputName_4_4_5",
		"InputName_4_4_6", "InputName_4_4_1", "InputName_4_4_2",
		"InputName_4_4_3", "InputName_4_4_4" })
public class InputDataClassName_4_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_4_5")
	protected Float InputName_4_4_5;
	@XmlElement(name = "InputName_4_4_6")
	protected Integer InputName_4_4_6;
	@XmlElement(name = "InputName_4_4_1")
	protected Float InputName_4_4_1;
	@XmlElement(name = "InputName_4_4_2")
	protected Float InputName_4_4_2;
	@XmlElement(name = "InputName_4_4_3")
	protected String InputName_4_4_3;
	@XmlElement(name = "InputName_4_4_4")
	protected String InputName_4_4_4;

	public Float getInputName_4_4_5() {
		return InputName_4_4_5;
	}

	public Integer getInputName_4_4_6() {
		return InputName_4_4_6;
	}

	public Float getInputName_4_4_1() {
		return InputName_4_4_1;
	}

	public Float getInputName_4_4_2() {
		return InputName_4_4_2;
	}

	public String getInputName_4_4_3() {
		return InputName_4_4_3;
	}

	public String getInputName_4_4_4() {
		return InputName_4_4_4;
	}

	public void setInputName_4_4_5(Float value) {
		this.InputName_4_4_5 = value;
	}

	public void setInputName_4_4_6(Integer value) {
		this.InputName_4_4_6 = value;
	}

	public void setInputName_4_4_1(Float value) {
		this.InputName_4_4_1 = value;
	}

	public void setInputName_4_4_2(Float value) {
		this.InputName_4_4_2 = value;
	}

	public void setInputName_4_4_3(String value) {
		this.InputName_4_4_3 = value;
	}

	public void setInputName_4_4_4(String value) {
		this.InputName_4_4_4 = value;
	}

}
