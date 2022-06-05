package Homework3;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Ford", "Diesel");
		
		System.out.println(car1.CarDetails());
		
		Car car2 = new Car("Toyota", "Gasoline");
		
		Car.type = "Sedan";
		
		System.out.println(car2.CarDetails());
		System.out.println(car1.CarDetails());
		

	}

}
