package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_2")
public class InputDataClassName_6_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_2_1")
	protected Float InputName_6_2_1;
	@XmlElement(name = "InputName_6_2_2")
	protected Float InputName_6_2_2;
	@XmlElement(name = "InputName_6_2_3")
	protected String InputName_6_2_3;

	public Float getInputName_6_2_1() {
		return InputName_6_2_1;
	}

	public Float getInputName_6_2_2() {
		return InputName_6_2_2;
	}

	public String getInputName_6_2_3() {
		return InputName_6_2_3;
	}

	public void setInputName_6_2_1(Float value) {
		this.InputName_6_2_1 = value;
	}

	public void setInputName_6_2_2(Float value) {
		this.InputName_6_2_2 = value;
	}

	public void setInputName_6_2_3(String value) {
		this.InputName_6_2_3 = value;
	}

}
