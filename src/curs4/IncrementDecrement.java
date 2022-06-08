package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num++ --> post increment
		// ++num --> pre increment
		
		int num = 10;
		
		System.out.println("valoarea lui num inainte de increment : " + num);
		System.out.println("valoarea lui num in POST increment : " + num++);
		System.out.println("valoarea lui num inainte de increment : " + num);
		
		
		int num2 = 10;
		
		System.out.println("valoarea lui num inainte de increment : " + num2);
		System.out.println("valoarea lui num in PRE increment : " + ++num2);
		System.out.println("valoarea lui num inainte de increment : " + num2);
		
		//Pre increment -> ++num
		//Post increment -> num++
		//Pre decrement -> --num
		//Post decrement -> num--
		
		
		
	}

}
