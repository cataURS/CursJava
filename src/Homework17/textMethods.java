package Homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import javax.print.attribute.Size2DSyntax;

public class textMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numaraCuvant();
		System.out.println("---------------------------------------------------");
		imparteProp();
		System.out.println("---------------------------------------------------");
		//deleteA();
		System.out.println("---------------------------------------------------");
		replaceO();

	}
	
	public static String text = "Lorem ipsum dolor sit amet, consectetur "
			+ "adipiscing elit. nulla Aliquam consectetur odio ac quam commodo, eu "
			+ "eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, "
			+ "vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius "
			+ "malesuada. Nulla neque lacus, euismod quis erat nec, convallis"
			+ "vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. "
			+ "Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
	public static StringBuilder sb = new StringBuilder(text);
	
	
	public static void numaraCuvant() {
		
		String[] array = text.split(" ");
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i].equals("Nulla")) {
				count++;
			}
		}
		System.out.println("Cuvantul Nulla apare de :"+ count);
	}
	
	public static void imparteProp() {
		String[] prop = sb.toString().split("[.]");
		for(String string : prop) {
			System.out.println(string);
		}
			
	}
	
	public static void deleteA() {
		List<Integer> indices1 = new ArrayList<>();
		int index = 0;
		while(index <= sb.length()) {
			int wordIndex = sb.indexOf("a",index);
			if(wordIndex == -1) {
				break;
			}
			indices1.add(wordIndex);
			index = wordIndex + "a".length();
		}
		System.out.println(indices1);
		//for-ul asta arunca un Index out of bounds pt un length pe care nu inteleg de unde il ia
			for(int x : indices1) {
				sb.deleteCharAt(x);
			}
		System.out.println(sb);
	}
	
	public static void replaceO() {
		char W = '#';
		List<Integer> indici = new ArrayList<>();
		int index = 0;
		while(index <= sb.length()) {
			int wordIndex = sb.indexOf("o",index);
			if(wordIndex == -1) {
				break;
			}
			indici.add(wordIndex);
			index = wordIndex + "a".length();
		}
		System.out.println(indici);
			for(int x : indici) {
				sb.setCharAt(x, W);
			}
		System.out.println(sb);
	}

}
