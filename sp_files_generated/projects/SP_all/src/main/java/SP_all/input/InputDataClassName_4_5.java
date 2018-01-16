package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_5")
@XmlType(name = "inputDataClassName_4_5", propOrder = { "InputName_4_5_1" })
public class InputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_5_1")
	protected Integer InputName_4_5_1;

	public Integer getInputName_4_5_1() {
		return InputName_4_5_1;
	}

	public void setInputName_4_5_1(Integer value) {
		this.InputName_4_5_1 = value;
	}

}
