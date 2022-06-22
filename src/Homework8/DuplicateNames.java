package Homework8;

public class DuplicateNames {
	
	String[] MyStringArray = {"Maria", "Bob", "Ion", "George", "Oana",
			"Bogdan", "Oana", "Ion"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateNames ruleaza = new DuplicateNames();
		ruleaza.CheckUnicity();
		
		
	}

	public int compareNames(String[] MyStringArray, String element) {
			
			int count = 0;
			for(String value : MyStringArray) {
				
				if(value == element ) {
					count++;
				}
			}return count;
			
		}
	
	public void CheckUnicity() {
		
		for(int i=0;i<MyStringArray.length;i++) {
			
			String nume = MyStringArray[i];
			
			//pe aici pe undeva trebuie sa fac o validare sa nu mai printeze de 2 ori mesajul pt acelasi nume
			//defapt de cate ori e cuvantul in array
			
			if(compareNames(MyStringArray, nume) >1) {
				System.out.println("Nume duplicat " + nume);
			}
		}

	}
}
