package large3.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_3")
@XmlType(name = "inputDataClassName_3_3", propOrder = { "InputName_3_3_1",
		"InputName_3_3_2", "InputName_3_3_7", "InputName_3_3_5",
		"InputName_3_3_6", "InputName_3_3_3", "InputName_3_3_4" })
public class InputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_3_1")
	protected String InputName_3_3_1;
	@XmlElement(name = "InputName_3_3_2")
	protected Integer InputName_3_3_2;
	@XmlElement(name = "InputName_3_3_7")
	protected Integer InputName_3_3_7;
	@XmlElement(name = "InputName_3_3_5")
	protected Float InputName_3_3_5;
	@XmlElement(name = "InputName_3_3_6")
	protected String InputName_3_3_6;
	@XmlElement(name = "InputName_3_3_3")
	protected Float InputName_3_3_3;
	@XmlElement(name = "InputName_3_3_4")
	protected String InputName_3_3_4;

	public String getInputName_3_3_1() {
		return InputName_3_3_1;
	}

	public Integer getInputName_3_3_2() {
		return InputName_3_3_2;
	}

	public Integer getInputName_3_3_7() {
		return InputName_3_3_7;
	}

	public Float getInputName_3_3_5() {
		return InputName_3_3_5;
	}

	public String getInputName_3_3_6() {
		return InputName_3_3_6;
	}

	public Float getInputName_3_3_3() {
		return InputName_3_3_3;
	}

	public String getInputName_3_3_4() {
		return InputName_3_3_4;
	}

	public void setInputName_3_3_1(String value) {
		this.InputName_3_3_1 = value;
	}

	public void setInputName_3_3_2(Integer value) {
		this.InputName_3_3_2 = value;
	}

	public void setInputName_3_3_7(Integer value) {
		this.InputName_3_3_7 = value;
	}

	public void setInputName_3_3_5(Float value) {
		this.InputName_3_3_5 = value;
	}

	public void setInputName_3_3_6(String value) {
		this.InputName_3_3_6 = value;
	}

	public void setInputName_3_3_3(Float value) {
		this.InputName_3_3_3 = value;
	}

	public void setInputName_3_3_4(String value) {
		this.InputName_3_3_4 = value;
	}

}
