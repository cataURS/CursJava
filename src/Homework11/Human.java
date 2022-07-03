package Homework11;

public class Human extends Primate implements BasicNeeds {

	@Override
	public String eat() {
		String food = "Omnivore";
		return food;
	}

	@Override
	public void sleep() {
		System.out.println("I need to sleep!");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}
	
	public void walk() {
		System.out.println("Can walk");
	}
	
	
	public void run() {
		System.out.println("Can run");
	}
	
	public void speak() {
		System.out.println("I can speak!");
	}

	

}
