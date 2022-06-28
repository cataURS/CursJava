package Homework6;

import java.util.Scanner;

public class LoginSimulator {
	
	String username = "TestUser";
	int pass = 1234;
	boolean valid = true;
	Scanner scan = new Scanner(System.in);
	String entered_user;
	int entered_pass;
	static int counter = 0;
	
	public String EnterUser() {
		System.out.println("Please enter username: ");
		entered_user = scan.next();
		return entered_user;
	}
	
	public int EnterPass() {
		System.out.println("Please enter password: ");
		entered_pass = scan.nextInt();
		return entered_pass;
	}
	
	public void ValidateCred(String entered_user, int entered_pass) {
		valid = true;
		
		if(!entered_user.equals(username)) {
			valid = false;
			System.out.println("Login error!");
		}else if(entered_pass != pass) {
			valid = false;
			System.out.println("Login error!");
			
		}
		
		if(counter == 3) {
			valid = false;
			System.out.println("Maximum attempts reached. User blocked");
		}
	}
	
	

	public static void main(String[] args) {

		LoginSimulator login = new LoginSimulator();
		
		login.EnterUser();
		login.EnterPass();
	
		//ma dau batut,nu stiu cum sa il fac sa ceara user si parola separat,
		//e posibil sa nu functioneze tocmai ok nici dupa asta :))
		
		do {
			
			login.ValidateCred(login.EnterUser(), login.EnterPass());
			counter++;
			
		}while(!login.valid);
		
		System.out.println("Login successful!");
	}

}
