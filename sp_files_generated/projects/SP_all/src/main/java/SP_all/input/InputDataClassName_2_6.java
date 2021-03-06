package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_6")
@XmlType(name = "inputDataClassName_2_6", propOrder = { "InputName_2_6_1",
		"InputName_2_6_2", "InputName_2_6_3" })
public class InputDataClassName_2_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_6_1")
	protected Integer InputName_2_6_1;
	@XmlElement(name = "InputName_2_6_2")
	protected String InputName_2_6_2;
	@XmlElement(name = "InputName_2_6_3")
	protected String InputName_2_6_3;

	public Integer getInputName_2_6_1() {
		return InputName_2_6_1;
	}

	public String getInputName_2_6_2() {
		return InputName_2_6_2;
	}

	public String getInputName_2_6_3() {
		return InputName_2_6_3;
	}

	public void setInputName_2_6_1(Integer value) {
		this.InputName_2_6_1 = value;
	}

	public void setInputName_2_6_2(String value) {
		this.InputName_2_6_2 = value;
	}

	public void setInputName_2_6_3(String value) {
		this.InputName_2_6_3 = value;
	}

}
