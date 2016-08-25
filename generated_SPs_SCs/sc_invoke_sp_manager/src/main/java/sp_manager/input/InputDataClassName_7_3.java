package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_3")
public class InputDataClassName_7_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_3_1")
	protected Float InputName_7_3_1;

	public Float getInputName_7_3_1() {
		return InputName_7_3_1;
	}

	public void setInputName_7_3_1(Float value) {
		this.InputName_7_3_1 = value;
	}

}
