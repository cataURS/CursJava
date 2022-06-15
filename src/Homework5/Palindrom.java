package Homework5;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a word: ");
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		word.toLowerCase();
		int k = word.length() - 1;
		boolean isPalindrom = true;
		
		for(int i=0; i<k; i++) {
			if(word.charAt(i) != word.charAt(k)) {
				
				isPalindrom = false;
			}
			k--;
			
		}
		if(isPalindrom == false) {
			System.out.println("Word is NOT a palindrome!");
		}else {
		
		System.out.println("Word is a palindrome! YES");
		}
	}

}
