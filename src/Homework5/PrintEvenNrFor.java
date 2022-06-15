package Homework5;

import java.util.Scanner;

public class PrintEvenNrFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter first number: ");
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt();
		System.out.println("Please enter second number: ");
		int second = scan.nextInt();
		scan.close();
		int i;

		//nu stiu ce nu merge aici, ma dau batut :))
		//am incercat sa fac diferit fata de metoda sin while unde am folosit acel array
		for(i=0;i<second;i++); {
			if(first % 2 == 0) 	{
				System.out.println("Even nr inbetween is: " + first);
			
				
			}
			first++;
			i++;
		}
	}
}

