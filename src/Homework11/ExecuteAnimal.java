package Homework11;

public class ExecuteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Primate DataType instance of Human:");
		System.out.println("-------------------------------------");
		Human om = new Human();
		om.walk();
		om.run();
		System.out.println(om.eat());
		om.speak();
		om.sleep();
		
		System.out.println();
		System.out.println("Primate DataType instance of Monkey:");
		System.out.println("-------------------------------------");
		Monkey chimp = new Monkey();
		chimp.walk();
		chimp.run();
		chimp.sleep();
		System.out.println(chimp.eat());
		om.speak();

	}

}
