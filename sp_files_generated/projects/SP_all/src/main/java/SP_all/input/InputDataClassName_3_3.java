package SP_all.input;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "InputDataClassName_3_3")
@XmlType(name = "inputDataClassName_3_3", propOrder = { "InputName_3_3_1",
		"InputName_3_3_2", "InputName_3_3_3", "InputName_3_3_4" })
public class InputDataClassName_3_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "InputName_3_3_1")
	protected Float InputName_3_3_1;
	@XmlElement(name = "InputName_3_3_2")
	protected Integer InputName_3_3_2;
	@XmlElement(name = "InputName_3_3_3")
	protected Integer InputName_3_3_3;
	@XmlElement(name = "InputName_3_3_4")
	protected Float InputName_3_3_4;

	public Float getInputName_3_3_1() {
		return InputName_3_3_1;
	}

	public Integer getInputName_3_3_2() {
		return InputName_3_3_2;
	}

	public Integer getInputName_3_3_3() {
		return InputName_3_3_3;
	}

	public Float getInputName_3_3_4() {
		return InputName_3_3_4;
	}

	public void setInputName_3_3_1(Float value) {
		this.InputName_3_3_1 = value;
	}

	public void setInputName_3_3_2(Integer value) {
		this.InputName_3_3_2 = value;
	}

	public void setInputName_3_3_3(Integer value) {
		this.InputName_3_3_3 = value;
	}

	public void setInputName_3_3_4(Float value) {
		this.InputName_3_3_4 = value;
	}

}
