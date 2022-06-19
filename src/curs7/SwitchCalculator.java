package curs7;

import java.util.Scanner;

public class SwitchCalculator {
	
	/*
	 * facem un calculator simplu pentru operatiile de baza:+ , * , -, /
	 * intrebam userul care este primul numar
	 * intrebam userul care este operatia matematica
	 * intrebam userul care este nr 2
	 * printam rezultatul
	 * printam rezultatul sub forma (2+2=4)
	 * 
	 */
	
	// 1 metoda pt introducere date
	
	// 1 metoda care face operatiile
	
	int num1;
	int num2;
	char operation;
	int result;
	
	public void AskUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter first number");
		num1 = scan.nextInt();
		
		System.out.println("PLease enter operation");
		operation = scan.next().charAt(0);
		
		System.out.println("PLease enter second number");
		num2 = scan.nextInt();
		scan.close();
	}
		
	public void CalculateValues() {
		switch(operation) {
		
		case '+' :
			result = num1+num2;
			System.out.println(result);
			break;
		
		case '-' :
			result = num1 - num2;
			System.out.println(result);
			break;
			
		case '*' :
			result = num1 * num2;
			System.out.println(result);
			break;
			
		case '/' :
			result = num1 / num2;
			System.out.println(result);
			break;
			
		default :
			System.out.println("Wrong operation!");
			
		}
	}
	
	public void PrintResults() {
		
		System.out.println(num1 + " "+ operation +" " + num2 + " = " + result);
	}

	
}

