package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_2")
@XmlType(name = "inputDataClassName_3_2", propOrder = { "InputName_3_2_2",
		"InputName_3_2_3", "InputName_3_2_1", "InputName_3_2_6",
		"InputName_3_2_7", "InputName_3_2_4", "InputName_3_2_5" })
public class InputDataClassName_3_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_2_2")
	protected Float InputName_3_2_2;
	@XmlElement(name = "InputName_3_2_3")
	protected String InputName_3_2_3;
	@XmlElement(name = "InputName_3_2_1")
	protected String InputName_3_2_1;
	@XmlElement(name = "InputName_3_2_6")
	protected String InputName_3_2_6;
	@XmlElement(name = "InputName_3_2_7")
	protected String InputName_3_2_7;
	@XmlElement(name = "InputName_3_2_4")
	protected Integer InputName_3_2_4;
	@XmlElement(name = "InputName_3_2_5")
	protected String InputName_3_2_5;

	public Float getInputName_3_2_2() {
		return InputName_3_2_2;
	}

	public String getInputName_3_2_3() {
		return InputName_3_2_3;
	}

	public String getInputName_3_2_1() {
		return InputName_3_2_1;
	}

	public String getInputName_3_2_6() {
		return InputName_3_2_6;
	}

	public String getInputName_3_2_7() {
		return InputName_3_2_7;
	}

	public Integer getInputName_3_2_4() {
		return InputName_3_2_4;
	}

	public String getInputName_3_2_5() {
		return InputName_3_2_5;
	}

	public void setInputName_3_2_2(Float value) {
		this.InputName_3_2_2 = value;
	}

	public void setInputName_3_2_3(String value) {
		this.InputName_3_2_3 = value;
	}

	public void setInputName_3_2_1(String value) {
		this.InputName_3_2_1 = value;
	}

	public void setInputName_3_2_6(String value) {
		this.InputName_3_2_6 = value;
	}

	public void setInputName_3_2_7(String value) {
		this.InputName_3_2_7 = value;
	}

	public void setInputName_3_2_4(Integer value) {
		this.InputName_3_2_4 = value;
	}

	public void setInputName_3_2_5(String value) {
		this.InputName_3_2_5 = value;
	}

}
