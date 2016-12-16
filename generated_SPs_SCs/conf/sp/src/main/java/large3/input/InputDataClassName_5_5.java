package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_5")
@XmlType(name = "inputDataClassName_5_5", propOrder = { "InputName_5_5_1",
		"InputName_5_5_2", "InputName_5_5_5", "InputName_5_5_6",
		"InputName_5_5_3", "InputName_5_5_4" })
public class InputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_5_1")
	protected String InputName_5_5_1;
	@XmlElement(name = "InputName_5_5_2")
	protected Integer InputName_5_5_2;
	@XmlElement(name = "InputName_5_5_5")
	protected String InputName_5_5_5;
	@XmlElement(name = "InputName_5_5_6")
	protected Integer InputName_5_5_6;
	@XmlElement(name = "InputName_5_5_3")
	protected Float InputName_5_5_3;
	@XmlElement(name = "InputName_5_5_4")
	protected Float InputName_5_5_4;

	public String getInputName_5_5_1() {
		return InputName_5_5_1;
	}

	public Integer getInputName_5_5_2() {
		return InputName_5_5_2;
	}

	public String getInputName_5_5_5() {
		return InputName_5_5_5;
	}

	public Integer getInputName_5_5_6() {
		return InputName_5_5_6;
	}

	public Float getInputName_5_5_3() {
		return InputName_5_5_3;
	}

	public Float getInputName_5_5_4() {
		return InputName_5_5_4;
	}

	public void setInputName_5_5_1(String value) {
		this.InputName_5_5_1 = value;
	}

	public void setInputName_5_5_2(Integer value) {
		this.InputName_5_5_2 = value;
	}

	public void setInputName_5_5_5(String value) {
		this.InputName_5_5_5 = value;
	}

	public void setInputName_5_5_6(Integer value) {
		this.InputName_5_5_6 = value;
	}

	public void setInputName_5_5_3(Float value) {
		this.InputName_5_5_3 = value;
	}

	public void setInputName_5_5_4(Float value) {
		this.InputName_5_5_4 = value;
	}

}
