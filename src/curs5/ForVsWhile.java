package curs5;

import java.util.Scanner;

public class ForVsWhile {
	
	/*
	 * Facem un program care ii cere utilizatorului numere pe care le aduna
	 * Userul introduce cate numere doreste
	 * Cand doreste sa se opreasca va introduce 0
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RezolvareCuFor();
		System.out.println("-------------------");
		RezolvareCuWhile();
		}
	
	
	public static void RezolvareCuFor() {
			System.out.println("Please enter a number:");
			Scanner scan = new Scanner(System.in);
			int sum = 0;
			
			for(int x=scan.nextInt();x!=0;x=scan.nextInt()) {
				sum+=x;
				System.out.println("Please enter a number:");
			}
			
			scan.close();
			System.out.println("Suma totala este: "+ sum);
		}

	
	public static void RezolvareCuWhile() {
		System.out.println("Please enter a number:");
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();
		int sum = 0;
		
		while(number!=0) {
			sum +=number;
			System.out.println("Please enter a number:");
			number = scan1.nextInt();
		}
		
		scan1.close();
		System.out.println("Suma totala este: "+ sum);
	}

}
