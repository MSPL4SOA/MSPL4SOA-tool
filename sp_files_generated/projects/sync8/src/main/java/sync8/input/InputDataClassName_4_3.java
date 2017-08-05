package sync8.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_3")
@XmlType(name = "inputDataClassName_4_3", propOrder = { "InputName_4_3_2",
		"InputName_4_3_1" })
public class InputDataClassName_4_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_3_2")
	protected String InputName_4_3_2;
	@XmlElement(name = "InputName_4_3_1")
	protected Float InputName_4_3_1;

	public String getInputName_4_3_2() {
		return InputName_4_3_2;
	}

	public Float getInputName_4_3_1() {
		return InputName_4_3_1;
	}

	public void setInputName_4_3_2(String value) {
		this.InputName_4_3_2 = value;
	}

	public void setInputName_4_3_1(Float value) {
		this.InputName_4_3_1 = value;
	}

}
