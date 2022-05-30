package curs2;

public class Tester {

	//variabile
	private String nume;
	private int ratePerHour;
	
	
	
	//constructor default
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
	public int getRatePerHour() {
		return ratePerHour;
	}
	private void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
	
	
	
	
}
