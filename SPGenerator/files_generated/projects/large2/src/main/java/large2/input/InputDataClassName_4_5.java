package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_5")
@XmlType(name = "inputDataClassName_4_5", propOrder = { "InputName_4_5_4",
		"InputName_4_5_5", "InputName_4_5_6", "InputName_4_5_7",
		"InputName_4_5_1", "InputName_4_5_2", "InputName_4_5_3" })
public class InputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_5_4")
	protected Float InputName_4_5_4;
	@XmlElement(name = "InputName_4_5_5")
	protected String InputName_4_5_5;
	@XmlElement(name = "InputName_4_5_6")
	protected Integer InputName_4_5_6;
	@XmlElement(name = "InputName_4_5_7")
	protected Float InputName_4_5_7;
	@XmlElement(name = "InputName_4_5_1")
	protected Float InputName_4_5_1;
	@XmlElement(name = "InputName_4_5_2")
	protected String InputName_4_5_2;
	@XmlElement(name = "InputName_4_5_3")
	protected String InputName_4_5_3;

	public Float getInputName_4_5_4() {
		return InputName_4_5_4;
	}

	public String getInputName_4_5_5() {
		return InputName_4_5_5;
	}

	public Integer getInputName_4_5_6() {
		return InputName_4_5_6;
	}

	public Float getInputName_4_5_7() {
		return InputName_4_5_7;
	}

	public Float getInputName_4_5_1() {
		return InputName_4_5_1;
	}

	public String getInputName_4_5_2() {
		return InputName_4_5_2;
	}

	public String getInputName_4_5_3() {
		return InputName_4_5_3;
	}

	public void setInputName_4_5_4(Float value) {
		this.InputName_4_5_4 = value;
	}

	public void setInputName_4_5_5(String value) {
		this.InputName_4_5_5 = value;
	}

	public void setInputName_4_5_6(Integer value) {
		this.InputName_4_5_6 = value;
	}

	public void setInputName_4_5_7(Float value) {
		this.InputName_4_5_7 = value;
	}

	public void setInputName_4_5_1(Float value) {
		this.InputName_4_5_1 = value;
	}

	public void setInputName_4_5_2(String value) {
		this.InputName_4_5_2 = value;
	}

	public void setInputName_4_5_3(String value) {
		this.InputName_4_5_3 = value;
	}

}
