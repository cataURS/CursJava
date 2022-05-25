package curs1;

public class FirstJavaClass {
	
	/*
	 * 
	 */
	//variabila
	String nume="Jhonny";
	int age=23;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstJavaClass obiect = new FirstJavaClass();
		obiect.greetings();

	}
	
	//metoda
	public void greetings() {
		System.out.println("Hello "+nume);
	}
	//public -> access modifier
	//void -> return type
	//greetings -> numele metodei
}
