package SP_infantry1.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_5")
public class OutputDataClassName_5_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_5_1")
	protected String OutputName_5_5_1;

	public String getOutputName_5_5_1() {
		return OutputName_5_5_1;
	}

	public void setOutputName_5_5_1(String value) {
		this.OutputName_5_5_1 = value;
	}

}
