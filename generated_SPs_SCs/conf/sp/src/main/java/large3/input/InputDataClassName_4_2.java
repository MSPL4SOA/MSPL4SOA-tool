package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_2")
@XmlType(name = "inputDataClassName_4_2", propOrder = { "InputName_4_2_3",
		"InputName_4_2_4", "InputName_4_2_5", "InputName_4_2_6",
		"InputName_4_2_1", "InputName_4_2_2" })
public class InputDataClassName_4_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_2_3")
	protected String InputName_4_2_3;
	@XmlElement(name = "InputName_4_2_4")
	protected Integer InputName_4_2_4;
	@XmlElement(name = "InputName_4_2_5")
	protected Float InputName_4_2_5;
	@XmlElement(name = "InputName_4_2_6")
	protected String InputName_4_2_6;
	@XmlElement(name = "InputName_4_2_1")
	protected Integer InputName_4_2_1;
	@XmlElement(name = "InputName_4_2_2")
	protected String InputName_4_2_2;

	public String getInputName_4_2_3() {
		return InputName_4_2_3;
	}

	public Integer getInputName_4_2_4() {
		return InputName_4_2_4;
	}

	public Float getInputName_4_2_5() {
		return InputName_4_2_5;
	}

	public String getInputName_4_2_6() {
		return InputName_4_2_6;
	}

	public Integer getInputName_4_2_1() {
		return InputName_4_2_1;
	}

	public String getInputName_4_2_2() {
		return InputName_4_2_2;
	}

	public void setInputName_4_2_3(String value) {
		this.InputName_4_2_3 = value;
	}

	public void setInputName_4_2_4(Integer value) {
		this.InputName_4_2_4 = value;
	}

	public void setInputName_4_2_5(Float value) {
		this.InputName_4_2_5 = value;
	}

	public void setInputName_4_2_6(String value) {
		this.InputName_4_2_6 = value;
	}

	public void setInputName_4_2_1(Integer value) {
		this.InputName_4_2_1 = value;
	}

	public void setInputName_4_2_2(String value) {
		this.InputName_4_2_2 = value;
	}

}
