package Homework18;

import java.util.Arrays;

public class ArraySorting {
	
	public static String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
	public static Integer[] intArray = {100, 500, 300, 400, 200};
	public static Character[] charArray = {'a', 'b', 'd', 'c'};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortArray(textArray);
		System.out.println("------------------------------------");
		SortArray(intArray);
		System.out.println("------------------------------------");
		SortArray(charArray);
		System.out.println("------------------------------------");

	}
	
	public static <T> void SortArray(T[] arr) {
		Arrays.sort(arr);
		System.out.println("Array ordonat : " + Arrays.toString(arr));
	}

}
