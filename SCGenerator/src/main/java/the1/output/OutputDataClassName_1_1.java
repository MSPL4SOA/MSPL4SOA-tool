package the1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_1")
public class OutputDataClassName_1_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_1_2")
	protected Float OutputName_1_1_2;
	@XmlElement(name = "OutputName_1_1_3")
	protected Integer OutputName_1_1_3;
	@XmlElement(name = "OutputName_1_1_1")
	protected Float OutputName_1_1_1;

	public Float getOutputName_1_1_2() {
		return OutputName_1_1_2;
	}

	public Integer getOutputName_1_1_3() {
		return OutputName_1_1_3;
	}

	public Float getOutputName_1_1_1() {
		return OutputName_1_1_1;
	}

	public void setOutputName_1_1_2(Float value) {
		this.OutputName_1_1_2 = value;
	}

	public void setOutputName_1_1_3(Integer value) {
		this.OutputName_1_1_3 = value;
	}

	public void setOutputName_1_1_1(Float value) {
		this.OutputName_1_1_1 = value;
	}

}
