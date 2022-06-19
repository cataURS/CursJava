package Homework6;

import java.util.Arrays;

public class Fib {
	
	int nr = 9;
	int a = 0;
	int b = 1;
	int[] fib = new int[10];
	
	//nu situ cum sa bag si a si b ca primele valori
	
	public void FibFor() {
		
		for(int i=0;i<=nr;i++) {
			fib[i] = a+b;
			a = b;
			b = fib[i];
			
		}
		System.out.println("FOR:Seria Fibonacci pt " + nr + " numere: " + Arrays.toString(fib));
		
	}
	
	//merge si nu prea inteleg de ce :))
	public void FibWhile() {
		
		int count = 0;
				
		while(nr<9) {
			fib[count] = a+b;
			a = b;
			b = fib[count];
			count++;
			
		}
		System.out.println("WHILE:Seria Fibonacci pt " + nr + " numere: " + Arrays.toString(fib));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fib prog = new Fib();
		
		prog.FibFor();
		prog.FibWhile();
		

	}

}
