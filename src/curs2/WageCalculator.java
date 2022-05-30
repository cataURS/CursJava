package curs2;

public class WageCalculator {
	
	int HoursWorked = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//salarii 2 testeri
		Tester tester1 = new Tester("Ion", 20);
		//tester1.setNume("Ion");
		//tester1.nume = "Ion";
		
		Tester tester2 = new Tester("Maria", 10);
		//tester2.setNume("Maria");
		
		Tester tester3 = new Tester("Oana", 12);
		
		
		System.out.println(tester1.getNume().length());
		
		System.out.println(tester2.getNume().length());
		
		System.out.println(tester3.getNume().length());
		
		WageCalculator calc = new WageCalculator();
		
		System.out.println("Salariul lui" + tester1.getNume() + " este: " + 
		calc.calculateSalary(tester1.getRatePerHour()));
		
		//OOP -> polimorfism, abstraction, inheritance, encapsulation

	}

	public int calculateSalary(int rateHourly) {
		return rateHourly * HoursWorked;
	}
}
