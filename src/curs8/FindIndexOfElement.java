package curs8;

public class FindIndexOfElement {

	int[] number = {3, 4, 5, 8, 7, 9};
	
	/**
	 * Avem un array de tip integer
	 * vrem sa printam care este elementul si indexul unui anume element
	 * Ex: index pentru element 8 este 3
	 * rezolvare cu FOR
	 * rezolvare cu FOR EACH
	 * 
	 */
	
	public static void main(String[] args) {
	
		FindIndexOfElement obj = new FindIndexOfElement();
		System.out.println("Rezolvare cu FOR:");
		obj.rezolvareCuFor(8);
		System.out.println("--------------------");
		System.out.println("Rezolvare cu FOR-EACH:");
		obj.rezolvareCuForEach(8);
		System.out.println("--------------------");
		System.out.println("Rezolvare cu While:");
		obj.rezolovareCuWhile(8);

	}

	
	public void rezolvareCuFor(int element) {
		
		for(int i=0; i<number.length; i++) {
			
			if(number[i] == element) {
				System.out.println("index pentru element " + element + " este " + i );
			}	
		}	
	}
	
	public void rezolvareCuForEach(int element) {
		
		int i = 0;
		for(int nr : number) {
			
			if(nr == element) {
				System.out.println("index pentru element " + element + " este " + i );
			}
			i++;
		}
		
	}
	
	public void rezolovareCuWhile(int element) {
	
		int i = 0;
		while(i<number.length) {
			if(number[i] == element) {
				System.out.println("index pentru element " + element + " este " + i );
			}	
			i++;
		}
		
	}
	
}