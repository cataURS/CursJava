package Homework11;

public class Primate {
	
	String walk;
	String run;
	String speak;
	
	public Primate (String walk, String run, String speak) {
		this.walk = walk;
		this.run = run;
		this.speak = speak;
	}
	
	public void walk() {
		System.out.println(walk);
	}

	public void run() {
		System.out.println(run);
	}
	
	public void speak() {
		System.out.println(speak);
		
	}
}