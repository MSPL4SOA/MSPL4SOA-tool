package large3.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_1")
public class OutputDataClassName_2_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_1_1")
	protected String OutputName_2_1_1;

	public String getOutputName_2_1_1() {
		return OutputName_2_1_1;
	}

	public void setOutputName_2_1_1(String value) {
		this.OutputName_2_1_1 = value;
	}

}
