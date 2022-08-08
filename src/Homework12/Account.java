package Homework12;

public abstract class Account {
	
	private int accountNumber;
	double balance;
	public Customer accountOwner;
	
	public Account(int accountNumber, double balance, Customer accountOwner) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
	
	public abstract void Withdraw(double balance) throws InsufficientFundsException;
		
	

}
