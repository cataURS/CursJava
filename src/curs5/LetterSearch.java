package curs5;

import java.util.Scanner;

public class LetterSearch {
	
	/*
	 * Vom face un program prin care citim un String de la tastatura 
	 * si cautam daca contine litera A
	 * 
	 * Daca o gasim printam: Litera A exista in text
	 * Daca nu: Litera A nu exista in text
	 * 
	 * sa numaram de cate ori apare A si printam
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("PLease enter a text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.next().toUpperCase();
		char letter = 'A';
		scan.next().
		scan.close();
		//text.toUpperCase(); //String.EqualsIngoreCase();
		
		// System.out.println(text.length());
		
		//boolean letterFound = false;
		int counter = 0;
		
		for(int i=0; i<text.length();i++) {
			
			if(text.charAt(i)==letter) {
				//letterFound = true;
				counter++;
				
			}
			
		}
		
		if(counter > 0) {
			System.out.println("Litera A exista in text " +counter);
		}else {
			System.out.println("Litera A nu exista in text");
		}

	}

}
