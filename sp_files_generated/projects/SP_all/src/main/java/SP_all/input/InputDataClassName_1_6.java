package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_6")
@XmlType(name = "inputDataClassName_1_6", propOrder = { "InputName_1_6_1" })
public class InputDataClassName_1_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_6_1")
	protected String InputName_1_6_1;

	public String getInputName_1_6_1() {
		return InputName_1_6_1;
	}

	public void setInputName_1_6_1(String value) {
		this.InputName_1_6_1 = value;
	}

}
