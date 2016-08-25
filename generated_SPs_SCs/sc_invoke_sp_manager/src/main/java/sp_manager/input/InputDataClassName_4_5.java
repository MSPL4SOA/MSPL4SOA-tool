package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_4_5")
public class InputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_4_5_1")
	protected Float InputName_4_5_1;
	@XmlElement(name = "InputName_4_5_2")
	protected String InputName_4_5_2;
	@XmlElement(name = "InputName_4_5_3")
	protected String InputName_4_5_3;

	public Float getInputName_4_5_1() {
		return InputName_4_5_1;
	}

	public String getInputName_4_5_2() {
		return InputName_4_5_2;
	}

	public String getInputName_4_5_3() {
		return InputName_4_5_3;
	}

	public void setInputName_4_5_1(Float value) {
		this.InputName_4_5_1 = value;
	}

	public void setInputName_4_5_2(String value) {
		this.InputName_4_5_2 = value;
	}

	public void setInputName_4_5_3(String value) {
		this.InputName_4_5_3 = value;
	}

}
