package sp_manager.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_1_5")
public class OutputDataClassName_1_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_1_5_1")
	protected Float OutputName_1_5_1;
	@XmlElement(name = "OutputName_1_5_2")
	protected Float OutputName_1_5_2;

	public Float getOutputName_1_5_1() {
		return OutputName_1_5_1;
	}

	public Float getOutputName_1_5_2() {
		return OutputName_1_5_2;
	}

	public void setOutputName_1_5_1(Float value) {
		this.OutputName_1_5_1 = value;
	}

	public void setOutputName_1_5_2(Float value) {
		this.OutputName_1_5_2 = value;
	}

}
