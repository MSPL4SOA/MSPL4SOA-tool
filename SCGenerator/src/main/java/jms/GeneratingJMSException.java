package jms;

public class GeneratingJMSException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public GeneratingJMSException(String message) {
		super("Generation JMS Exception: " + message);
	}
}