package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_3")
@XmlType(name = "inputDataClassName_6_3", propOrder = { "InputName_6_3_1",
		"InputName_6_3_2", "InputName_6_3_3", "InputName_6_3_4",
		"InputName_6_3_5", "InputName_6_3_6" })
public class InputDataClassName_6_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_3_1")
	protected Integer InputName_6_3_1;
	@XmlElement(name = "InputName_6_3_2")
	protected String InputName_6_3_2;
	@XmlElement(name = "InputName_6_3_3")
	protected Float InputName_6_3_3;
	@XmlElement(name = "InputName_6_3_4")
	protected Float InputName_6_3_4;
	@XmlElement(name = "InputName_6_3_5")
	protected Integer InputName_6_3_5;
	@XmlElement(name = "InputName_6_3_6")
	protected Float InputName_6_3_6;

	public Integer getInputName_6_3_1() {
		return InputName_6_3_1;
	}

	public String getInputName_6_3_2() {
		return InputName_6_3_2;
	}

	public Float getInputName_6_3_3() {
		return InputName_6_3_3;
	}

	public Float getInputName_6_3_4() {
		return InputName_6_3_4;
	}

	public Integer getInputName_6_3_5() {
		return InputName_6_3_5;
	}

	public Float getInputName_6_3_6() {
		return InputName_6_3_6;
	}

	public void setInputName_6_3_1(Integer value) {
		this.InputName_6_3_1 = value;
	}

	public void setInputName_6_3_2(String value) {
		this.InputName_6_3_2 = value;
	}

	public void setInputName_6_3_3(Float value) {
		this.InputName_6_3_3 = value;
	}

	public void setInputName_6_3_4(Float value) {
		this.InputName_6_3_4 = value;
	}

	public void setInputName_6_3_5(Integer value) {
		this.InputName_6_3_5 = value;
	}

	public void setInputName_6_3_6(Float value) {
		this.InputName_6_3_6 = value;
	}

}
