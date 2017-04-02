package SP_helicopter1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_3")
public class OutputDataClassName_1_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_3_2")
	protected Float OutputName_1_3_2;
	@XmlElement(name = "OutputName_1_3_1")
	protected Integer OutputName_1_3_1;

	public Float getOutputName_1_3_2() {
		return OutputName_1_3_2;
	}

	public Integer getOutputName_1_3_1() {
		return OutputName_1_3_1;
	}

	public void setOutputName_1_3_2(Float value) {
		this.OutputName_1_3_2 = value;
	}

	public void setOutputName_1_3_1(Integer value) {
		this.OutputName_1_3_1 = value;
	}

}
