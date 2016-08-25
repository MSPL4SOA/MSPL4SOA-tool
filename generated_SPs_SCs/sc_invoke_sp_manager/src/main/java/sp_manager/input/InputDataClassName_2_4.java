package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_4")
public class InputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_4_1")
	protected Integer InputName_2_4_1;

	public Integer getInputName_2_4_1() {
		return InputName_2_4_1;
	}

	public void setInputName_2_4_1(Integer value) {
		this.InputName_2_4_1 = value;
	}

}
