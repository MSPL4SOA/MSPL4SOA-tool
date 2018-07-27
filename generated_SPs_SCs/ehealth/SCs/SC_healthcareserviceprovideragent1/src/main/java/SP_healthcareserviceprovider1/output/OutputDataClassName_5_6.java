package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_6")
public class OutputDataClassName_5_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_6_3")
	protected Integer OutputName_5_6_3;
	@XmlElement(name = "OutputName_5_6_1")
	protected Float OutputName_5_6_1;
	@XmlElement(name = "OutputName_5_6_2")
	protected String OutputName_5_6_2;

	public Integer getOutputName_5_6_3() {
		return OutputName_5_6_3;
	}

	public Float getOutputName_5_6_1() {
		return OutputName_5_6_1;
	}

	public String getOutputName_5_6_2() {
		return OutputName_5_6_2;
	}

	public void setOutputName_5_6_3(Integer value) {
		this.OutputName_5_6_3 = value;
	}

	public void setOutputName_5_6_1(Float value) {
		this.OutputName_5_6_1 = value;
	}

	public void setOutputName_5_6_2(String value) {
		this.OutputName_5_6_2 = value;
	}

}
