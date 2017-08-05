package SP_infantry1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_1_4")
@XmlType(name = "inputDataClassName_1_4", propOrder = { "InputName_1_4_1" })
public class InputDataClassName_1_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_1_4_1")
	protected Integer InputName_1_4_1;

	public Integer getInputName_1_4_1() {
		return InputName_1_4_1;
	}

	public void setInputName_1_4_1(Integer value) {
		this.InputName_1_4_1 = value;
	}

}
