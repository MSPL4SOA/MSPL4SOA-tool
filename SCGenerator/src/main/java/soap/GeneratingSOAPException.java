package soap;

public class GeneratingSOAPException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public GeneratingSOAPException(String message) {
		super("Generation SOAP Exception: " + message);
	}
}