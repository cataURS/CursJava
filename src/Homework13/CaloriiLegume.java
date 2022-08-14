package Homework13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Scanner;

public class CaloriiLegume {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		OperatiiLista op = new OperatiiLista();
		
		op.scrieLista();
		System.out.println("Introdu leguma dorita: ");
		Scanner scan = new Scanner(System.in);
	
		
		String leguma = scan.next();
		System.out.println(leguma);
		op.citesteLista(leguma);
		
	}

}
