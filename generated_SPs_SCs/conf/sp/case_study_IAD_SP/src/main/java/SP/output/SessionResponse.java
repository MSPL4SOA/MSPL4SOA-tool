package SP.output;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "SessionResponse")
@XmlType(name = "sessionResponse", propOrder = { "ok" })
public class SessionResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ok")
	protected Boolean ok;

	public Boolean getOk() {
		return ok;
	}

	public void setOk(Boolean value) {
		this.ok = value;
	}

}
