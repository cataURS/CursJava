package curs7;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * intrebam userul ce calificativa primit
		 * in functie de calificativ, printam un mesaj
		 * A-> felicitari
		 * B-> destul de bine
		 * C-> suficient
		 * D-> insuficient
		 * default (daca introduce alt calif) -> nota invalida
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog indrodu calificativul: ");
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		
		case "A":
			System.out.println("Felicitari!");
			break;
			
		case "B":
			System.out.println("Destul de bine!");
			break;
			
		case "C":
			System.out.println("Suficient!");
			break;
			
		case "D":
			System.out.println("Insuficient!");
			break;
		
		default:
			System.out.println("Nota invalida!");
		}
		
	}

}
