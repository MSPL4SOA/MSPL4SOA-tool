package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_5")
@XmlType(name = "outputDataClassName_4_5", propOrder = { "OutputName_4_5_1" })
public class OutputDataClassName_4_5 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_5_1")
	protected String OutputName_4_5_1;

	public String getOutputName_4_5_1() {
		return OutputName_4_5_1;
	}

	public void setOutputName_4_5_1(String value) {
		this.OutputName_4_5_1 = value;
	}

}
