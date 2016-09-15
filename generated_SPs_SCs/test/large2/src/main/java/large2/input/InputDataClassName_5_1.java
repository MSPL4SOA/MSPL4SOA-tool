package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_1")
@XmlType(name = "inputDataClassName_5_1", propOrder = { "InputName_5_1_1",
		"InputName_5_1_2", "InputName_5_1_5", "InputName_5_1_3",
		"InputName_5_1_4" })
public class InputDataClassName_5_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_1_1")
	protected String InputName_5_1_1;
	@XmlElement(name = "InputName_5_1_2")
	protected Float InputName_5_1_2;
	@XmlElement(name = "InputName_5_1_5")
	protected Integer InputName_5_1_5;
	@XmlElement(name = "InputName_5_1_3")
	protected Integer InputName_5_1_3;
	@XmlElement(name = "InputName_5_1_4")
	protected Integer InputName_5_1_4;

	public String getInputName_5_1_1() {
		return InputName_5_1_1;
	}

	public Float getInputName_5_1_2() {
		return InputName_5_1_2;
	}

	public Integer getInputName_5_1_5() {
		return InputName_5_1_5;
	}

	public Integer getInputName_5_1_3() {
		return InputName_5_1_3;
	}

	public Integer getInputName_5_1_4() {
		return InputName_5_1_4;
	}

	public void setInputName_5_1_1(String value) {
		this.InputName_5_1_1 = value;
	}

	public void setInputName_5_1_2(Float value) {
		this.InputName_5_1_2 = value;
	}

	public void setInputName_5_1_5(Integer value) {
		this.InputName_5_1_5 = value;
	}

	public void setInputName_5_1_3(Integer value) {
		this.InputName_5_1_3 = value;
	}

	public void setInputName_5_1_4(Integer value) {
		this.InputName_5_1_4 = value;
	}

}
