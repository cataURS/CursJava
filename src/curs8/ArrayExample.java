package curs8;

public class ArrayExample {

	public static void main(String[] args) {

		
		String[] textArray =  new String[5];
		
		//String textArray2[] = new String[4];
		//String[] textArray = {null, null, null, null, null}
		textArray[0] = "This ";
		//String[] textArray = {"This", null, null, null, null}
		// index of array =       0   , 1    , 2   , 3   , 4
		//System.out.println(textArray[0]);
		textArray[1] = "is ";
		//String[] textArray = {"This", "is", null, null, null}
		textArray[2] = "an ";
		textArray[3] = "Array";
		textArray[4] = "!";
		//String[] textArray = {"This", "is", "an", "Array", "!"}
		//"{"This", "is", "an", "Array", "!"}".STRING
				
		for(String element : textArray ) {
			
			System.out.print(element);
			
		}
		
		
	}

}