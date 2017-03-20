package SP_command.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_3_6")
@XmlType(name = "outputDataClassName_3_6", propOrder = { "OutputName_3_6_1" })
public class OutputDataClassName_3_6 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_3_6_1")
	protected String OutputName_3_6_1;

	public String getOutputName_3_6_1() {
		return OutputName_3_6_1;
	}

	public void setOutputName_3_6_1(String value) {
		this.OutputName_3_6_1 = value;
	}

}
