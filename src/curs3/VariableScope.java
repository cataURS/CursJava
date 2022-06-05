package curs3;

public class VariableScope {
	
	//variabila de instanta
	public String prenume;
	
	public static String prenume2;

	//context static
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(prenume);
		System.out.println(prenume2);
		
		VariableScope obj = new VariableScope();
		obj.prenume = "Jhonny";
		System.out.println(obj.prenume);
		System.out.println(obj.printeazaNume());
		System.out.println(obj.prenume);
	}
	
	public String printeazaNume() {
		String nume; //variabila locala
		prenume = "Bravo";
		return prenume;
		
	}

}
