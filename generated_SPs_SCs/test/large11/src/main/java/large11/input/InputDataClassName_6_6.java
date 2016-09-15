package large11.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_6")
@XmlType(name = "inputDataClassName_6_6", propOrder = { "InputName_6_6_1" })
public class InputDataClassName_6_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_6_1")
	protected Float InputName_6_6_1;

	public Float getInputName_6_6_1() {
		return InputName_6_6_1;
	}

	public void setInputName_6_6_1(Float value) {
		this.InputName_6_6_1 = value;
	}

}
