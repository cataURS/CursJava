package curs3;

import java.util.Scanner;

public class GreatestOf3Nr {
	
	/*
	 * facem un program care citeste 3nr de la tastatura si verifica care este cel mai mare
	 * si printeaza in consola
	 * daca 2 numere sunt egale va printa "Some numbers are equal"
	 * 
	 */

	int number1;
	int number2;
	int number3;
	//int number1, number2, number3;
	
	public void CitesteNr() {
		System.out.println("Please enter first number: ");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		System.out.println("Please enter second number: ");
		number2 = scan.nextInt();
		System.out.println("Please enter third number: ");
		number3 = scan.nextInt();
		scan.close(); //inchidem canalul de comunicare in
		
	}
	
	public void ComparaNr() {
		
		//AND &&
		//OR ||
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("First number is the greatest");
		}
		else if (number2 > number1 && number2 > number3) {
			System.out.println("Second number is the greatest");
			}
		else if (number3 > number1 && number3 > number2){
			System.out.println("Third number is the greatest");
		}
		else {
			System.out.println("Some numbers are equal");
		}
	}
	
}
