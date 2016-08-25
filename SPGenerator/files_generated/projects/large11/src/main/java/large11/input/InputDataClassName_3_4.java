package large11.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_4")
@XmlType(name = "inputDataClassName_3_4", propOrder = { "InputName_3_4_1",
		"InputName_3_4_2" })
public class InputDataClassName_3_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_4_1")
	protected Float InputName_3_4_1;
	@XmlElement(name = "InputName_3_4_2")
	protected Float InputName_3_4_2;

	public Float getInputName_3_4_1() {
		return InputName_3_4_1;
	}

	public Float getInputName_3_4_2() {
		return InputName_3_4_2;
	}

	public void setInputName_3_4_1(Float value) {
		this.InputName_3_4_1 = value;
	}

	public void setInputName_3_4_2(Float value) {
		this.InputName_3_4_2 = value;
	}

}
