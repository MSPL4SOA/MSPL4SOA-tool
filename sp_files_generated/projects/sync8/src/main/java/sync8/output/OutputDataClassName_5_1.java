package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_5_1")
@XmlType(name = "outputDataClassName_5_1", propOrder = { "OutputName_5_1_1" })
public class OutputDataClassName_5_1 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_5_1_1")
	protected String OutputName_5_1_1;

	public String getOutputName_5_1_1() {
		return OutputName_5_1_1;
	}

	public void setOutputName_5_1_1(String value) {
		this.OutputName_5_1_1 = value;
	}

}
