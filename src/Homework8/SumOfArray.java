package Homework8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
	
	int[] numbers = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfArray run = new SumOfArray();
		run.InsertNumbers();
		run.CalculateSum();
		

	}
	
	public void InsertNumbers() {
		
		System.out.println("Te rog introdu 10 numere: ");
		
		for(int i=0 ; i< numbers.length ; i++) {
			
			Scanner scan = new Scanner(System.in);
			numbers[i] = scan.nextInt();
		}
	}
	
	public void CalculateSum() {
		
		int sum = 0;
		for(int nr : numbers) {
			sum = sum + nr;
		}
		System.out.println("Suma numerelor din array este: " + sum);
		
	}

}
