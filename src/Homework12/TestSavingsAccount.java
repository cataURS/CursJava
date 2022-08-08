package Homework12;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) throws InsufficientFundsException {
		// TODO Auto-generated method stub
		
		Customer client = new Customer("Ion","Bucuresti","ion@bani.org");
		
		//mi-a luat ceva pana caajung la acoladele alea care imi invalidau initializarea
		SavingsAccount save = new SavingsAccount(123, 140.0, client) {
		};
		
		//aici as merge pe client.name dar trebuie schimbat 'nume' in public, altfel nu vad rezolvarea :))
		//am putea sa mai cream un nume in account dar nu vad rostul de a folosi asta in favoarea celei de mai sus
		System.out.println("Hi " + save.accountOwner);
		System.out.println("Please enter the ammount to withdraw: ");
		Scanner scan = new Scanner(System.in);
		double value = scan.nextDouble();
		save.Withdraw(value);
		
	}

}
