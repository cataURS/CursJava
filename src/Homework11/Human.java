package Homework11;

public class Human extends Primate implements BasicNeeds {
	
	String sleep;
	String drink;

	public Human(String walk, String run, String speak, String sleep, String drink) {
		super(walk, run, speak);
		this.sleep = sleep;
		this.drink = drink;
		// TODO Auto-generated constructor stub
	}

	public String eat() {
		return "Omnivore";
	}

	@Override
	public void sleep() {
		System.out.println(sleep);
	}

	@Override
	public void drink() {
		System.out.println(drink);
	}
		
	}
