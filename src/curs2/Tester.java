package curs2;

public class Tester {
	
	//variabile
	private String nume;
	private int ratePerHour;

	//constructor default
	//public Tester() {}
	
	public Tester(String nume, int ratePerHour) {
	setNume(nume);
	setRatePerHour(ratePerHour);
	
	}
	
	
	//metode getter & setter
	
	public String getNume() {
		return nume;
	}
	
	private void setNume(String nume) {
		this.nume = nume;
	}
	//Tester tester1 = new Tester();
	// tester1.setNume("Oana")
	//tester1.getNume() --> Oana
	
	//Tester tester2 = new Tester();
	// tester2.setNume("Diana")
	//tester2.getNume() --> Diana
	
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	private void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
	
	
	
	

}