package sync8.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_5")
@XmlType(name = "inputDataClassName_6_5", propOrder = { "InputName_6_5_1",
		"InputName_6_5_2" })
public class InputDataClassName_6_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_5_1")
	protected String InputName_6_5_1;
	@XmlElement(name = "InputName_6_5_2")
	protected Float InputName_6_5_2;

	public String getInputName_6_5_1() {
		return InputName_6_5_1;
	}

	public Float getInputName_6_5_2() {
		return InputName_6_5_2;
	}

	public void setInputName_6_5_1(String value) {
		this.InputName_6_5_1 = value;
	}

	public void setInputName_6_5_2(Float value) {
		this.InputName_6_5_2 = value;
	}

}
