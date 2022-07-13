package Homework11;

public interface BasicNeeds {

	public default String eat() {
		return "food";
	}
	void sleep();
	void drink();
	
	
}