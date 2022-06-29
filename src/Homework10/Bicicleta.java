package Homework10;

public class Bicicleta extends Vehicul{
	
	public void setBicicleta() {
		setBrand("Pegas");
		setNivelPoluare(0);
		setVitezaMedie("15 km/h");
	}
	
	@Override
	public String nume () {
		String nume = "Fatbike";
		return nume;
		
	}
	
	@Override
	public String motorizare() {
		String motorizare = "Pedala";
		return motorizare;
		
	}
	
	@Override
	public void detaliiVehicul() {
		System.out.println("Nivelul de poluare pentru b este: 0 si "
				+ " viteza medie atinsa este de 15 km/h");
	}
	
}
