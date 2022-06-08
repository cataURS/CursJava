package Homework4;

import java.util.Scanner;

public class ApplyDiscount {
	
	float factura;
	float result;
	
	public void AskUserForFactura() {
		System.out.println("Introduceti valoare factura: ");
		Scanner scan = new Scanner(System.in);
		factura = scan.nextInt();
		scan.close();
	}
	
	public void CalculateDiscount() {
		
	//scris initial folosind if else, de dragul artei
		/*
		if(factura > 100) {
			factura = factura - factura * 10/100;
			System.out.println("Factura a fost redusa cu 10%: " + factura);
		}else if(factura < 100) {
			factura = factura - factura * 5/100;
			System.out.println("Factura a fost redusa cu 5%: " + factura);
		}else {
			System.out.println("Factura este " + factura + " nu se aplica reducere!");
		}
		*/
		
		/* sa scriem si folosind ternary operator (the hard way)
		 * este posibil sa putem face asta intr-o singura linie? observ ca 
		 * problema lui este transformarea stringului in float, intreb de curiozitate
		*/
		// result = (factura == 100)? "Factura nu are reducere" :(factura > 100)?(factura - factura * 10/100):(factura - factura * 5/100);
		
		//the easy way
		
		result = (factura > 100)?factura - factura * 10/100:factura - factura * 5/100;
		System.out.println("Factura a fost redusa, noua valoare este: " + result);
		
	}

}
