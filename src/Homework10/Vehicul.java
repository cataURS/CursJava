package Homework10;

public class Vehicul {

	private String brand;
	private int nivelPoluare;
	private String vitezaMedie;
	
	
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public String getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(String vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}

	public String nume () {
		String nume = "Logan";
		return nume;
		
	}
	
	public String motorizare() {
		String motorizare = "GPL";
		return motorizare;
		
	}
	
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina Dacia este :5 si "
				+ " viteza medie atinsa este de 180 km/h");
	}
	
	
}
