package sync8.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_5")
@XmlType(name = "inputDataClassName_5_5", propOrder = { "InputName_5_5_1",
		"InputName_5_5_2" })
public class InputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_5_1")
	protected String InputName_5_5_1;
	@XmlElement(name = "InputName_5_5_2")
	protected Integer InputName_5_5_2;

	public String getInputName_5_5_1() {
		return InputName_5_5_1;
	}

	public Integer getInputName_5_5_2() {
		return InputName_5_5_2;
	}

	public void setInputName_5_5_1(String value) {
		this.InputName_5_5_1 = value;
	}

	public void setInputName_5_5_2(Integer value) {
		this.InputName_5_5_2 = value;
	}

}
