package Homework7;

import java.util.Scanner;

public class BonusVanzari2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ani vechime: ");
		int an  =  scan.nextInt();
		
		
		int bonus;
		
		switch(an) {
		
		case 1:
			bonus = 100;
			System.out.println("Felicitari, primestiun bonus de " + bonus + " lei!");
			break;
		case 2:
			bonus = 200;
			System.out.println("Felicitari, primestiun bonus de " + bonus + " lei!");
			break;
		case 3:
			
			//le-am adaugat aici sa fie mai dinamic
			System.out.println("Te rog introdu valoare vanzari: ");
			int valoare = scan.nextInt();
			System.out.println("Te rog introdu luna vanzari: ");
			int luna = scan.nextInt();
			
			switch(luna) {
			
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					if(valoare <= 5000) {
						bonus = 600;
						System.out.println("Felicitari, primesti un bonus de " + bonus + " lei!");
					}else if(valoare <= 10000) {
						bonus = 800;
						System.out.println("Felicitari, primesti un bonus de " + bonus + " lei!");
					}
					break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
					if(valoare <= 5000) {
						bonus = 600;
						System.out.println("Felicitari, primesti un bonus de " + bonus + " lei!");
					}else if(valoare <= 10000) {
						bonus = 1000;
						System.out.println("Felicitari, primesti un bonus de " + bonus + " lei!");
					}
					break;
				case 12:
					//prima conditie poate ramane sau nu, depinde cat de restrictivi vrem sa fim
					//enuntul poate fi interpretabil
					if(valoare <= 5000) {
						bonus = 600;
						System.out.println("Felicitari, primesti un bonus de " + bonus + " lei!");
					}else if(valoare <= 10000) {
						bonus = 900;
						//System.out.println("In Decembrie se vand singure, primesti un bonus de " + bonus + " lei!");
						System.out.println("In Decembrie se vand singure");
						//conform cu enuntul, eu sincer as merge pe varianta comentata de mai sus, la fel si mai sus la primul if
					}
				if(valoare > 10000) {
						bonus = 1200;
						System.out.println("Felicitari, primesti un bonus de " + bonus + " lei!");
					}
				break;
					
			}
			break;
			
			//if(luna > 12) {
				//System.out.println("Te rog introdu o luna valida!");
			//}
			
			//unde as putea pune o validare de genul?
			
		default:
			System.out.println("Nu primesti bonus, sry!");
		}
		
	}

}
