package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_5")
@XmlType(name = "inputDataClassName_6_5", propOrder = { "InputName_6_5_1",
		"InputName_6_5_2", "InputName_6_5_3" })
public class InputDataClassName_6_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_5_1")
	protected Float InputName_6_5_1;
	@XmlElement(name = "InputName_6_5_2")
	protected Integer InputName_6_5_2;
	@XmlElement(name = "InputName_6_5_3")
	protected Integer InputName_6_5_3;

	public Float getInputName_6_5_1() {
		return InputName_6_5_1;
	}

	public Integer getInputName_6_5_2() {
		return InputName_6_5_2;
	}

	public Integer getInputName_6_5_3() {
		return InputName_6_5_3;
	}

	public void setInputName_6_5_1(Float value) {
		this.InputName_6_5_1 = value;
	}

	public void setInputName_6_5_2(Integer value) {
		this.InputName_6_5_2 = value;
	}

	public void setInputName_6_5_3(Integer value) {
		this.InputName_6_5_3 = value;
	}

}
