package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_3")
@XmlType(name = "inputDataClassName_1_3", propOrder = { "InputName_1_3_1",
		"InputName_1_3_2" })
public class InputDataClassName_1_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_3_1")
	protected String InputName_1_3_1;
	@XmlElement(name = "InputName_1_3_2")
	protected Integer InputName_1_3_2;

	public String getInputName_1_3_1() {
		return InputName_1_3_1;
	}

	public Integer getInputName_1_3_2() {
		return InputName_1_3_2;
	}

	public void setInputName_1_3_1(String value) {
		this.InputName_1_3_1 = value;
	}

	public void setInputName_1_3_2(Integer value) {
		this.InputName_1_3_2 = value;
	}

}
