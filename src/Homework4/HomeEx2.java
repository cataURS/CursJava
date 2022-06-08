package Homework4;		

public class HomeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//se preta mai bine un float comision
		int comision;
		int vanzari = 3500;
		
		if(vanzari > 2500) {
			comision = vanzari * 5/100;
			System.out.println("Comisionul tau este: " + comision);
		}else {
			comision = 0;
			System.out.println("Comisionul tau este: " + comision);
		}

	}

}
