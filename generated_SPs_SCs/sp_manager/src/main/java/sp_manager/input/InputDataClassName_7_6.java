package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_7_6")
@XmlType(name = "inputDataClassName_7_6", propOrder = { "InputName_7_6_1",
		"InputName_7_6_2" })
public class InputDataClassName_7_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_7_6_1")
	protected Float InputName_7_6_1;
	@XmlElement(name = "InputName_7_6_2")
	protected Integer InputName_7_6_2;

	public Float getInputName_7_6_1() {
		return InputName_7_6_1;
	}

	public Integer getInputName_7_6_2() {
		return InputName_7_6_2;
	}

	public void setInputName_7_6_1(Float value) {
		this.InputName_7_6_1 = value;
	}

	public void setInputName_7_6_2(Integer value) {
		this.InputName_7_6_2 = value;
	}

}
