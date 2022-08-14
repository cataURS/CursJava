package Homework15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare2list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		List<String> rezultat = new ArrayList<>();
		boolean duplicat = false;
		
		String[] listaProduse1 = {"Product1","Product2","Product3","Product4","Product5"};
		String[] listaProduse2 = {"Product1","Product2","Product6","Product4","Product8"};
		
		for(int i=0; i<listaProduse1.length; i++) {
				if(listaProduse1[i].equals(listaProduse2[i])) {
					
					rezultat.add("yes");
				} else {
					rezultat.add("no");
				}
			}	
		
		System.out.println(rezultat);
	}
}

		//as fi vrut sa fac ceva de genul cu parcurgerea ambelor liste separat pt ca momentan compara 
		//valorile de pe aceasi pozitie.
		//aici am o problema ca retine doar ultima comparatie facuta dar nu am mai stat sa-mi bat capul :))
		
		/* for(int j=0; j<listaProduse2.length;j++) {
		
		if(!listaProduse1[i].equals(listaProduse2[j])) {
			
			duplicat = false;
		} else {
			duplicat = true;
		}
	}
	if(duplicat == true) {
		rezultat.add("yes");
	}else {
		rezultat.add("no");
	}
}	

System.out.println(rezultat);
}
*/
