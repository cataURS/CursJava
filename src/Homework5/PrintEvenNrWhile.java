package Homework5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrintEvenNrWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter first number: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.println("Please enter second number: ");
		int second = scan.nextInt();
		
		//am vrut sa merg pe un array dar nu stiu cum sa il initializez dinamic incat sa 
		//contina nr exact de valori gasite.
		//am mers pe o initializare cu second number deoarece e cel mai mare :)
		int[] even = new int[second/3]; //formula asta e un fel de hotfix, sigur nu e exacta pt toate combinatiile posibile
		int i = 0;
		
		while(second > first) {
			second--;
			if(second % 2 == 0) {
				even[i] = second;
			} else { i--;}
			i++;
			
		}	
		System.out.println("Even no. found between the 2 introduced are: " + Arrays.toString(even));
	}

}
