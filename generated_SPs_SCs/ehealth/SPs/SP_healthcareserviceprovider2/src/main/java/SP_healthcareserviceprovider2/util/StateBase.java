package SP_infantry2.util;

public class StateBase {

	protected Object value;

	public void setState(Object value) {
		this.value = value;
	}

	public Object getState() {
		return this.value;
	}

	public void setStateNull() {
		this.value = null;
	}

}
