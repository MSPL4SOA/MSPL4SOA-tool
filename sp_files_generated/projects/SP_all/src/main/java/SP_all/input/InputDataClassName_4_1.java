package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_1")
@XmlType(name = "inputDataClassName_4_1", propOrder = { "InputName_4_1_1" })
public class InputDataClassName_4_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_1_1")
	protected String InputName_4_1_1;

	public String getInputName_4_1_1() {
		return InputName_4_1_1;
	}

	public void setInputName_4_1_1(String value) {
		this.InputName_4_1_1 = value;
	}

}
