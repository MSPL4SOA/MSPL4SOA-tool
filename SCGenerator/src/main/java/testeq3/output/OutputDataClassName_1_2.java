package testeq3.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_2")
public class OutputDataClassName_1_2 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_2_1")
	protected String OutputName_1_2_1;

	public String getOutputName_1_2_1() {
		return OutputName_1_2_1;
	}

	public void setOutputName_1_2_1(String value) {
		this.OutputName_1_2_1 = value;
	}

}
