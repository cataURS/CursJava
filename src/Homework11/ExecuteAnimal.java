package Homework11;

public class ExecuteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Primate DataType instance of Human:");
		System.out.println("-------------------------------------");
		Primate om = new Human("Can walk", "Can run", "I can speak!", "I need to sleep!", "beer");
		om.walk();
		om.run();
		System.out.println(((Human) om).eat());
		om.speak();
		((Human) om).sleep();
		
		System.out.println();
		System.out.println("Primate DataType instance of Monkey:");
		System.out.println("-------------------------------------");
		Primate chimp = new Monkey("can walk", "can run", "cannot speak", "I need to sleep!", "water");
		chimp.walk();
		chimp.run();
		((Monkey) chimp).sleep();
		System.out.println(((Monkey) chimp).eat());
		chimp.speak();

	}

}