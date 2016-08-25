package sp_manager.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_5")
public class OutputDataClassName_7_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_5_1")
	protected Float OutputName_7_5_1;

	public Float getOutputName_7_5_1() {
		return OutputName_7_5_1;
	}

	public void setOutputName_7_5_1(Float value) {
		this.OutputName_7_5_1 = value;
	}

}
