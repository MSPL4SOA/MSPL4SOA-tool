package sp_manager.output;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_7_4")
public class OutputDataClassName_7_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_7_4_1")
	protected String OutputName_7_4_1;
	@XmlElement(name = "OutputName_7_4_2")
	protected Float OutputName_7_4_2;

	public String getOutputName_7_4_1() {
		return OutputName_7_4_1;
	}

	public Float getOutputName_7_4_2() {
		return OutputName_7_4_2;
	}

	public void setOutputName_7_4_1(String value) {
		this.OutputName_7_4_1 = value;
	}

	public void setOutputName_7_4_2(Float value) {
		this.OutputName_7_4_2 = value;
	}

}
