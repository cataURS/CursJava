package Homework16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class catalogUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<String, Integer> colegutii = new HashMap<>();
		
		colegutii.put("Mihai",4);
		colegutii.put("Cristi",7);
		colegutii.put("Livia",10);
		colegutii.put("Alex",8);
		
		System.out.println(colegutii);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu nume: ");
		String nume = scan.next();
		System.out.println("Introdu nota: ");
		int nota = scan.nextInt();
		
		if(!colegutii.containsKey(nume)) {
			colegutii.put(nume, nota);
			System.out.println("NU aveai nota, ti-am trecut acum!");
			System.out.println(colegutii.get(nume));
			
		} else if (colegutii.get(nume) > nota) {
				System.out.println("Nu ai nevoie de alta nota!");
			} else {
				colegutii.replace(nume, nota);
				}
		
		
		System.out.println(colegutii);


	}

}
