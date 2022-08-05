package Homework12;

public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException() {
		super("Insufficient funds for transaction");
	}
	

}
