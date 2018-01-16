package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_3")
@XmlType(name = "inputDataClassName_6_3", propOrder = { "InputName_6_3_1" })
public class InputDataClassName_6_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_3_1")
	protected Float InputName_6_3_1;

	public Float getInputName_6_3_1() {
		return InputName_6_3_1;
	}

	public void setInputName_6_3_1(Float value) {
		this.InputName_6_3_1 = value;
	}

}
