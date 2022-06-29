package Homework10;

public class Poluare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicul bici = new Bicicleta();
		
		Vehicul auto = new Masina();
		
		verificaMotorizare(auto);
		verificaMotorizare(bici);
		
		//de proba :)
		Vehicul vehi = new Vehicul();
		verificaMotorizare(vehi);

	}
	
	public static void verificaMotorizare(Vehicul v) {
		System.out.println(v.nume());
		System.out.println(v.motorizare());
		v.detaliiVehicul();
	}

}
