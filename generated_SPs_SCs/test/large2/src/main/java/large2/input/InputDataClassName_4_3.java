package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_3")
@XmlType(name = "inputDataClassName_4_3", propOrder = { "InputName_4_3_6",
		"InputName_4_3_2", "InputName_4_3_3", "InputName_4_3_4",
		"InputName_4_3_5", "InputName_4_3_1" })
public class InputDataClassName_4_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_3_6")
	protected Integer InputName_4_3_6;
	@XmlElement(name = "InputName_4_3_2")
	protected String InputName_4_3_2;
	@XmlElement(name = "InputName_4_3_3")
	protected Integer InputName_4_3_3;
	@XmlElement(name = "InputName_4_3_4")
	protected String InputName_4_3_4;
	@XmlElement(name = "InputName_4_3_5")
	protected Float InputName_4_3_5;
	@XmlElement(name = "InputName_4_3_1")
	protected String InputName_4_3_1;

	public Integer getInputName_4_3_6() {
		return InputName_4_3_6;
	}

	public String getInputName_4_3_2() {
		return InputName_4_3_2;
	}

	public Integer getInputName_4_3_3() {
		return InputName_4_3_3;
	}

	public String getInputName_4_3_4() {
		return InputName_4_3_4;
	}

	public Float getInputName_4_3_5() {
		return InputName_4_3_5;
	}

	public String getInputName_4_3_1() {
		return InputName_4_3_1;
	}

	public void setInputName_4_3_6(Integer value) {
		this.InputName_4_3_6 = value;
	}

	public void setInputName_4_3_2(String value) {
		this.InputName_4_3_2 = value;
	}

	public void setInputName_4_3_3(Integer value) {
		this.InputName_4_3_3 = value;
	}

	public void setInputName_4_3_4(String value) {
		this.InputName_4_3_4 = value;
	}

	public void setInputName_4_3_5(Float value) {
		this.InputName_4_3_5 = value;
	}

	public void setInputName_4_3_1(String value) {
		this.InputName_4_3_1 = value;
	}

}
