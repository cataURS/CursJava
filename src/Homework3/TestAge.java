package Homework3;

import java.util.Scanner;

public class TestAge {

	int age; 
	
	public void AskUserForAge() {
		System.out.println("Please enter your age:");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		scan.close();
		
	}
	
	public void CheckAge() {
		if(age < 18) {
			System.out.println("Esti minor");
		}
		else if (age > 65) {
			System.out.println("Esti batran");
			}
		else {
			System.out.println("Esti adult");
	    }
		
	}
}
