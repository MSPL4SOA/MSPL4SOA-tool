package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_4")
public class OutputDataClassName_4_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_4_2")
	protected Integer OutputName_4_4_2;
	@XmlElement(name = "OutputName_4_4_1")
	protected Float OutputName_4_4_1;

	public Integer getOutputName_4_4_2() {
		return OutputName_4_4_2;
	}

	public Float getOutputName_4_4_1() {
		return OutputName_4_4_1;
	}

	public void setOutputName_4_4_2(Integer value) {
		this.OutputName_4_4_2 = value;
	}

	public void setOutputName_4_4_1(Float value) {
		this.OutputName_4_4_1 = value;
	}

}
