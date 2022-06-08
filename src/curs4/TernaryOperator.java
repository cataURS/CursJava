package curs4;

public class TernaryOperator {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		int num3 = 8;
		
		int x = (num1>num2)? num1 : (num2<num3?num2:num3);
		
		System.out.println(x);
		
		if(num1>num2) {
			x = num1;
		}else {
			x= num2;
		}
		
		
	}

}
