package SP_aircraftcarrier1.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_2_5")
public class InputDataClassName_2_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_2_5_1")
	protected Float InputName_2_5_1;
	@XmlElement(name = "InputName_2_5_2")
	protected String InputName_2_5_2;
	@XmlElement(name = "InputName_2_5_3")
	protected String InputName_2_5_3;
	@XmlElement(name = "InputName_2_5_4")
	protected String InputName_2_5_4;

	public Float getInputName_2_5_1() {
		return InputName_2_5_1;
	}

	public String getInputName_2_5_2() {
		return InputName_2_5_2;
	}

	public String getInputName_2_5_3() {
		return InputName_2_5_3;
	}

	public String getInputName_2_5_4() {
		return InputName_2_5_4;
	}

	public void setInputName_2_5_1(Float value) {
		this.InputName_2_5_1 = value;
	}

	public void setInputName_2_5_2(String value) {
		this.InputName_2_5_2 = value;
	}

	public void setInputName_2_5_3(String value) {
		this.InputName_2_5_3 = value;
	}

	public void setInputName_2_5_4(String value) {
		this.InputName_2_5_4 = value;
	}

}
