package rest;

public class GeneratingRESTException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public GeneratingRESTException(String message) {
		super("Generation REST Exception: " + message);
	}
}