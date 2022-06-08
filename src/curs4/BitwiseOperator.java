package curs4;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * dif dintre 
		 * 
		 * && --> AND --> short circuit
		 * ((x != 0) & (1/x>5)) - se evalueazaprima conditie si daca este true, evalueaza cond 2a
		 * 
		 * si
		 * 
		 * & --> AND
		 * ((x != 0) & (1/x>5)) - se evalueazaprima conditie, dupa, a2a, dupa aplica conditia &
		 * 
		 *  a || b  --> evalueaza A si daca A este false, evalueaza B
		 *   
		 *  a | b   --> evalueaza A, evalueaza B si dupa aplica | (or)
		 */
		
		int x = 0;
		
		if((x != 0) && (1/x>5)){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
