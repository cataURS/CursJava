package Homework3;

public class Car {
	
	public static String brand;
	public static String type = "Suv";
	public static String engine;
	
	
	public Car(String brand, String engine) {
		setBrand(brand);
		setEngine(engine);
		
	}
	
	public String CarDetails () {
		return ("All " + brand + " cars are " + engine + " and are of type " + type);
		
	}
	
	public static String getBrand() {
		return brand;
	}
	public static void setBrand(String brand) {
		Car.brand = brand;
	}
	public static String getEngine() {
		return engine;
	}
	public static void setEngine(String engine) {
		Car.engine = engine;
	}
	
	

}
