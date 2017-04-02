package SP_helicopter2.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_2")
@XmlType(name = "inputDataClassName_2_2", propOrder = { "InputName_2_2_1" })
public class InputDataClassName_2_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_2_1")
	protected Float InputName_2_2_1;

	public Float getInputName_2_2_1() {
		return InputName_2_2_1;
	}

	public void setInputName_2_2_1(Float value) {
		this.InputName_2_2_1 = value;
	}

}
