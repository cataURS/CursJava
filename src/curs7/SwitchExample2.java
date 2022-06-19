package curs7;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * facem un program care verifica....
		 * 
		 */
		
		System.out.println("Te rog indrodu ce an esti: ");
		Scanner scan = new Scanner(System.in);
		int an = scan.nextInt();
		System.out.println("Te rog indrodu punctajul: ");
		int punctaj = scan.nextInt();
		
		switch(an) {
		
		case 1 :
		case 2 :
			System.out.println("Nu esti eligibil pt bursa!");
			break;
		case 3 :
			switch(punctaj) {
			
			case 50 :
				System.out.println("Esti eligibil pt Bursa 2");
				break;
			
			case 80 :
				System.out.println("Esti eligibil pt Bursa 1");
				break;
				
			default:
				System.out.println("Introdu o valoare valida!");
				
			}
			break;
		default:
			System.out.println("Nu esti eligibil pt bursa!");
			
		}

	}

}
