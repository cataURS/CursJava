package curs5;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * intrebam utilizatorul un numar dupa care vom 
		 * printa tabla inmultirii a acelui numar pana la 10
		 */
		System.out.println("please enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		for(int i=0;i<=10;i++) {
			
			System.out.println(number+ " * " + i + " = "+ number*i);
			
		}

		System.out.println("--------------------------------------------------------------------");
		
		int x = 0;
		while(x<=10) {
			
			System.out.println(number+ " * " + x + " = "+ number*x);
			x++;
			
		}
		
	}

}
