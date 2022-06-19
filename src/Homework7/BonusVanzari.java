package Homework7;

import java.util.Scanner;

public class BonusVanzari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ideea initiala, merge si asta dar BonusVanzari2 e ce trebuie :))

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu ani vechime :");
		int an  =  scan.nextInt();
		System.out.println("Te rog introdu valoare vanzari :");
		int valoare = scan.nextInt();
		System.out.println("Te rog introdu luna vanzari :");
		int luna = scan.nextInt();
		
		int nrOfdays = 0;
		int bonus;
		
		switch(an) {
		
		case 1:
			bonus = 100;
			System.out.println("felicitari, primestiun bonus de " + bonus + " lei!");
			break;
		case 2:
			bonus = 200;
			System.out.println("felicitari, primestiun bonus de " + bonus + " lei!");
			break;
		case 3:
			if(valoare <= 5000) {
				bonus = 600;
				System.out.println("felicitari, primesti un bonus de " + bonus + " lei!");
			}
			if(valoare <= 10000 && luna <=6) {
				bonus = 800;
				System.out.println("felicitari, primesti un bonus de " + bonus + " lei!");
			}
			if(valoare <= 10000 && luna >=7) {
				bonus = 1000;
				System.out.println("felicitari, primesti un bonus de " + bonus + " lei!");
			}
			if(valoare <= 10000 && luna == 12) {
				bonus = 900;
				System.out.println("In Decembrie se vand singure, primesti un bonus de " + bonus + " lei!");
			}
			if(valoare > 10000) {
				bonus = 1200;
				System.out.println("felicitari, primesti un bonus de " + bonus + " lei!");
			}
			break;
			
		default:
			System.out.println("Nu primesti bonus, sry!");
		}
		
	}

}
