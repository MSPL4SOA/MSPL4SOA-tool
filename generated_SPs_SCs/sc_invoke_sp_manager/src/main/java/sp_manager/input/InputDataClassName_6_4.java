package sp_manager.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_6_4")
public class InputDataClassName_6_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_6_4_1")
	protected Float InputName_6_4_1;
	@XmlElement(name = "InputName_6_4_2")
	protected Integer InputName_6_4_2;

	public Float getInputName_6_4_1() {
		return InputName_6_4_1;
	}

	public Integer getInputName_6_4_2() {
		return InputName_6_4_2;
	}

	public void setInputName_6_4_1(Float value) {
		this.InputName_6_4_1 = value;
	}

	public void setInputName_6_4_2(Integer value) {
		this.InputName_6_4_2 = value;
	}

}
