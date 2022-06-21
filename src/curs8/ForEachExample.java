package curs8;

public class ForEachExample {

	public static void main(String[] args) {

		String[] cities = {"Iasi", "Arad", "Cluj", "Alba"};
		//                     0      1       2       3 
		//System.out.println(cities.length);  == 4
		// 4 --> ArrayIndesOutOfBoundsException
		
		
		for(int i=0; i<cities.length; i++) {
			
			System.out.println(cities[i]);
			
		}
		
		System.out.println("---------------------------------");
		
		for(String oras : cities) {
			
			System.out.println(oras);
			
		}
		
		
		
	}

}
