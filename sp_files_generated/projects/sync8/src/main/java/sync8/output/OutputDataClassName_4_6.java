package sync8.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_4_6")
@XmlType(name = "outputDataClassName_4_6", propOrder = { "OutputName_4_6_1" })
public class OutputDataClassName_4_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_4_6_1")
	protected String OutputName_4_6_1;

	public String getOutputName_4_6_1() {
		return OutputName_4_6_1;
	}

	public void setOutputName_4_6_1(String value) {
		this.OutputName_4_6_1 = value;
	}

}
