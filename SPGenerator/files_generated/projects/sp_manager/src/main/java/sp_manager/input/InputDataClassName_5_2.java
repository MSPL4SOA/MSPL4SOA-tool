package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_5_2")
@XmlType(name = "inputDataClassName_5_2", propOrder = { "InputName_5_2_1",
		"InputName_5_2_2", "InputName_5_2_3", "InputName_5_2_4" })
public class InputDataClassName_5_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_5_2_1")
	protected Float InputName_5_2_1;
	@XmlElement(name = "InputName_5_2_2")
	protected Float InputName_5_2_2;
	@XmlElement(name = "InputName_5_2_3")
	protected Float InputName_5_2_3;
	@XmlElement(name = "InputName_5_2_4")
	protected String InputName_5_2_4;

	public Float getInputName_5_2_1() {
		return InputName_5_2_1;
	}

	public Float getInputName_5_2_2() {
		return InputName_5_2_2;
	}

	public Float getInputName_5_2_3() {
		return InputName_5_2_3;
	}

	public String getInputName_5_2_4() {
		return InputName_5_2_4;
	}

	public void setInputName_5_2_1(Float value) {
		this.InputName_5_2_1 = value;
	}

	public void setInputName_5_2_2(Float value) {
		this.InputName_5_2_2 = value;
	}

	public void setInputName_5_2_3(Float value) {
		this.InputName_5_2_3 = value;
	}

	public void setInputName_5_2_4(String value) {
		this.InputName_5_2_4 = value;
	}

}
