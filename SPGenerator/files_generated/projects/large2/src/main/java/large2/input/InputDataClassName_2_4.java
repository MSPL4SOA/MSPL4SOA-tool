package large2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_4")
@XmlType(name = "inputDataClassName_2_4", propOrder = { "InputName_2_4_1",
		"InputName_2_4_2" })
public class InputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_4_1")
	protected Float InputName_2_4_1;
	@XmlElement(name = "InputName_2_4_2")
	protected Float InputName_2_4_2;

	public Float getInputName_2_4_1() {
		return InputName_2_4_1;
	}

	public Float getInputName_2_4_2() {
		return InputName_2_4_2;
	}

	public void setInputName_2_4_1(Float value) {
		this.InputName_2_4_1 = value;
	}

	public void setInputName_2_4_2(Float value) {
		this.InputName_2_4_2 = value;
	}

}
