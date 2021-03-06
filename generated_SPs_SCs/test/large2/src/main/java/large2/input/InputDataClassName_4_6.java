package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_6")
@XmlType(name = "inputDataClassName_4_6", propOrder = { "InputName_4_6_3",
		"InputName_4_6_4", "InputName_4_6_5", "InputName_4_6_1",
		"InputName_4_6_2" })
public class InputDataClassName_4_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_6_3")
	protected String InputName_4_6_3;
	@XmlElement(name = "InputName_4_6_4")
	protected Float InputName_4_6_4;
	@XmlElement(name = "InputName_4_6_5")
	protected Integer InputName_4_6_5;
	@XmlElement(name = "InputName_4_6_1")
	protected Integer InputName_4_6_1;
	@XmlElement(name = "InputName_4_6_2")
	protected Integer InputName_4_6_2;

	public String getInputName_4_6_3() {
		return InputName_4_6_3;
	}

	public Float getInputName_4_6_4() {
		return InputName_4_6_4;
	}

	public Integer getInputName_4_6_5() {
		return InputName_4_6_5;
	}

	public Integer getInputName_4_6_1() {
		return InputName_4_6_1;
	}

	public Integer getInputName_4_6_2() {
		return InputName_4_6_2;
	}

	public void setInputName_4_6_3(String value) {
		this.InputName_4_6_3 = value;
	}

	public void setInputName_4_6_4(Float value) {
		this.InputName_4_6_4 = value;
	}

	public void setInputName_4_6_5(Integer value) {
		this.InputName_4_6_5 = value;
	}

	public void setInputName_4_6_1(Integer value) {
		this.InputName_4_6_1 = value;
	}

	public void setInputName_4_6_2(Integer value) {
		this.InputName_4_6_2 = value;
	}

}
