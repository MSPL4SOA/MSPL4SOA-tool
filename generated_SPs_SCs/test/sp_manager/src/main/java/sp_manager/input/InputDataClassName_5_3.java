package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_3")
@XmlType(name = "inputDataClassName_5_3", propOrder = { "InputName_5_3_1" })
public class InputDataClassName_5_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_3_1")
	protected String InputName_5_3_1;

	public String getInputName_5_3_1() {
		return InputName_5_3_1;
	}

	public void setInputName_5_3_1(String value) {
		this.InputName_5_3_1 = value;
	}

}
