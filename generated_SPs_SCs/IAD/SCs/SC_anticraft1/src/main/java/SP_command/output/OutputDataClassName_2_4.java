package SP_command.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_2_4")
public class OutputDataClassName_2_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_2_4_1")
	protected Float OutputName_2_4_1;

	public Float getOutputName_2_4_1() {
		return OutputName_2_4_1;
	}

	public void setOutputName_2_4_1(Float value) {
		this.OutputName_2_4_1 = value;
	}

}
