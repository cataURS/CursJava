package curs4;

import java.util.Scanner;

public class SimpleCalculator {
	
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
		
		System.out.println("PLease enter first number");
		num2 = scan.nextInt();
		scan.close();
	}
		
	public void CalculateValues() {
		if(operation == '+') { //pentru string nu folosim ==, folosim equals
			
			result = num1 + num2;
			PrintResults();
			
		}else if(operation == '-') {
			
			result = num1 - num2;
			PrintResults();
			
		}else if(operation == '*' || operation == 'x') {
			
			result = num1 * num2;
			PrintResults();
			
		}else if(operation == '/' || operation == ':') {
			
			result = num1 / num2;
			PrintResults();
			
		}else {
			
			System.out.println("Wrong operation; Please insert only +, -, /, *");
			
		}
	}
	
	public void PrintResults() {
		
		System.out.println(num1 + " "+ operation +" " + num2 + " = " + result);
	}

}
