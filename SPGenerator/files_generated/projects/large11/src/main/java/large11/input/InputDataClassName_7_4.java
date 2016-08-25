package large11.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_4")
@XmlType(name = "inputDataClassName_7_4", propOrder = { "InputName_7_4_1" })
public class InputDataClassName_7_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_4_1")
	protected Float InputName_7_4_1;

	public Float getInputName_7_4_1() {
		return InputName_7_4_1;
	}

	public void setInputName_7_4_1(Float value) {
		this.InputName_7_4_1 = value;
	}

}
