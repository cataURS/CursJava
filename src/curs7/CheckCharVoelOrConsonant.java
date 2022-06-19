package curs7;

import java.util.Scanner;

public class CheckCharVoelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Te rog indrodu caracterul: ");
		Scanner scan = new Scanner(System.in);
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("Is Vowel");
			break;
			
		default:
			System.out.println("Is not a Vowel");
			
		}
		
	}

}
