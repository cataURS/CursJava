package Homework12;

public abstract class SavingsAccount extends Account{

	public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super(accountNumber, balance, accountOwner);
	}
	
	@Override
	public void Withdraw(double value) throws InsufficientFundsException {
	if (value > balance) {
		System.out.println("The amount you entered is greater than the available balance: " + balance);
		System.out.println("Thank you for usinng our ATM!");
		throw new InsufficientFundsException();
		} else {
		balance = balance - value;
		System.out.println("Please pick your money!");
		System.out.println("Your new balance is: " + balance);
		System.out.println("Thank you for usinng our ATM!");
			}
	}

}
