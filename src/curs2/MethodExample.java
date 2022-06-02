package curs2;

public class MethodExample {

	/*
	 * numar de camere dinamic
	 * calcul al mp al fiecarei camere
	 * nr total de mp
	 */
	
	
	
	public static void main(String[] args) {

		//room1
	int lenght =4;
	int width =2;
	int totalMP = lenght * width;
	System.out.println("Aria camerei 1 este :" + totalMP);
		//room2
	int lenght2 = 3;
	int with2= 4;
	int totalMP2 = lenght2* with2;
	System.out.println("Aria camerei 2 este :" + totalMP2);	
	
	MethodExample room = new MethodExample();
	System.out.println(room.calculateArea(4, 2));
	MethodExample room2 = new MethodExample();
	System.out.println(room2.calculateArea(3, 3));
	
	
	System.out.println("-------------------------------");
	MethodExample room3 = new MethodExample();
	System.out.println(room3.calculateArea(4, 4));
	//room3.calculateArea2(4, 4);
	


	System.out.println(caluclateTotal(room.calculateArea(4, 2), room2.calculateArea(3,3), room3.calculateArea(4, 4), 70, 55));
	
	}
	
	
	public int calculateArea(int lenght, int width) {
		System.out.println("Aria camerei este :" + lenght*width);	
		return lenght * width;
	}
	
	/*
	 * public void calculateArea2(int lenght, int width) {
	 * System.out.println("Aria camerei este :" + lenght*width); }
	 */
	
	public static int caluclateTotal(int...rooms) {  //varargs--> argumente variabaile --> int...rooms --> int[] rooms 
		int result = 0;
		for(int room : rooms ) {
			result = result + room;
			//result = 0+ 8;
			//8 = 8 +12;
			//20 = 20 +16;
		}
		
		return result;
	}
	
	
	

}