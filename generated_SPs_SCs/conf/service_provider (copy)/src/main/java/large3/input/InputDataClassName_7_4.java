package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_4")
@XmlType(name = "inputDataClassName_7_4", propOrder = { "InputName_7_4_4",
		"InputName_7_4_5", "InputName_7_4_2", "InputName_7_4_3",
		"InputName_7_4_1", "InputName_7_4_6" })
public class InputDataClassName_7_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_4_4")
	protected Integer InputName_7_4_4;
	@XmlElement(name = "InputName_7_4_5")
	protected Integer InputName_7_4_5;
	@XmlElement(name = "InputName_7_4_2")
	protected Float InputName_7_4_2;
	@XmlElement(name = "InputName_7_4_3")
	protected Integer InputName_7_4_3;
	@XmlElement(name = "InputName_7_4_1")
	protected String InputName_7_4_1;
	@XmlElement(name = "InputName_7_4_6")
	protected Integer InputName_7_4_6;

	public Integer getInputName_7_4_4() {
		return InputName_7_4_4;
	}

	public Integer getInputName_7_4_5() {
		return InputName_7_4_5;
	}

	public Float getInputName_7_4_2() {
		return InputName_7_4_2;
	}

	public Integer getInputName_7_4_3() {
		return InputName_7_4_3;
	}

	public String getInputName_7_4_1() {
		return InputName_7_4_1;
	}

	public Integer getInputName_7_4_6() {
		return InputName_7_4_6;
	}

	public void setInputName_7_4_4(Integer value) {
		this.InputName_7_4_4 = value;
	}

	public void setInputName_7_4_5(Integer value) {
		this.InputName_7_4_5 = value;
	}

	public void setInputName_7_4_2(Float value) {
		this.InputName_7_4_2 = value;
	}

	public void setInputName_7_4_3(Integer value) {
		this.InputName_7_4_3 = value;
	}

	public void setInputName_7_4_1(String value) {
		this.InputName_7_4_1 = value;
	}

	public void setInputName_7_4_6(Integer value) {
		this.InputName_7_4_6 = value;
	}

}
