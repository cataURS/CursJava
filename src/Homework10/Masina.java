package Homework10;

public class Masina extends Vehicul{
	
	public Masina() {
		setBrand("Volkswagen");
		setNivelPoluare(5);
		setVitezaMedie("200 km/h");
	}
	
	@Override
	public String nume () {
		String nume = "Golf";
		return nume;
		
	}
	
	@Override
	public String motorizare() {
		String motorizare = "Diesel";
		return motorizare;
		
	}
	
	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru masina Golf este: 9000 si "
				+ " viteza medie atinsa este de 200 km/h");
	}
	
}
