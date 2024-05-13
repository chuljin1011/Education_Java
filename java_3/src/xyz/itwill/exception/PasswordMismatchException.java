package xyz.itwill.exception;

public class PasswordMismatchException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PasswordMismatchException() {

	}
	
	public PasswordMismatchException(String message) {
		super(message);
	}

}
