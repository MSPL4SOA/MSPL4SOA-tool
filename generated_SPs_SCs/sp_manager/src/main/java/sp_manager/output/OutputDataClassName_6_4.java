package sp_manager.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "OutputDataClassName_6_4")
@XmlType(name = "outputDataClassName_6_4", propOrder = { "OutputName_6_4_1" })
public class OutputDataClassName_6_4 implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "OutputName_6_4_1")
	protected String OutputName_6_4_1;

	public String getOutputName_6_4_1() {
		return OutputName_6_4_1;
	}

	public void setOutputName_6_4_1(String value) {
		this.OutputName_6_4_1 = value;
	}

}
