package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_3")
@XmlType(name = "outputDataClassName_5_3", propOrder = { "OutputName_5_3_1",
		"OutputName_5_3_2" })
public class OutputDataClassName_5_3 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_3_1")
	protected String OutputName_5_3_1;
	@XmlElement(name = "OutputName_5_3_2")
	protected Float OutputName_5_3_2;

	public String getOutputName_5_3_1() {
		return OutputName_5_3_1;
	}

	public Float getOutputName_5_3_2() {
		return OutputName_5_3_2;
	}

	public void setOutputName_5_3_1(String value) {
		this.OutputName_5_3_1 = value;
	}

	public void setOutputName_5_3_2(Float value) {
		this.OutputName_5_3_2 = value;
	}

}
