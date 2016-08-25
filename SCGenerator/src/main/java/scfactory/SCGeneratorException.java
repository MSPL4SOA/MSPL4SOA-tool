package scfactory;

public class SCGeneratorException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public SCGeneratorException(String message) {
		super("Generation Configuration Exception: " + message);
	}
}