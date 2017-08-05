package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_2")
public class OutputDataClassName_6_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_2_1")
	protected Integer OutputName_6_2_1;

	public Integer getOutputName_6_2_1() {
		return OutputName_6_2_1;
	}

	public void setOutputName_6_2_1(Integer value) {
		this.OutputName_6_2_1 = value;
	}

}
