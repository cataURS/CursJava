package curs3;

import java.util.Scanner;

public class CheckNrIsOddOrEven {
	
	int number;
	/*
	 * program care verifica daca nr este par sau impar
	 * daca este par, printeaza "Nr is Even"
	 * daca nr esteimpar, printeaza "Nr is Odd"
	 * Nr este dat dinamic, (citit de la tastatura)
	 */

	// 1 metoda care citeste nr de la tastatura
	
	public void AskUserForNr() {
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
		//System.out.println();
		
	}
	// 2 metoda verifica nr este par sau impar
	public void CheckNumber() {
		
		//% --modulus
		
		if(number % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}
}
