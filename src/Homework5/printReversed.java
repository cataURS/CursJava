package Homework5;

import java.util.Scanner;

public class printReversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initial am incercat sa fac asta dar nu a mers, plecasem pe un mindset 
		//de a salva ca string si a schimba caracterele (total gresit), eram atat de departe de varianta 
		//corecta cu restul impartirii
		
		/*		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		String nr = scan.next();
		int p = nr.length() -1;
		String x;
		
		
		while(p>0) {
			String rev = null;
			x = nr.charAt(p);
			rev.concat(x);
			p--;
		}
		
	} 
*/
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int nr = scan.nextInt();
		int rev = 0;
		
		while(nr != 0) {
			int digit = nr % 10;
			rev = rev * 10 + digit;
			nr /=10;
		}
		System.out.println("Reversed number: " + rev);
	}
}
