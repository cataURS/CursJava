package Homework14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileProcessor {
	
	/*
	 * write to txt file
	 */
	public void createFile(String text) {
		
		try {
			
			FileWriter editor = new FileWriter("file.txt");
			editor.write(text);
			editor.close();
			System.out.println("Succesfully wrote to file!");
		}catch(IOException e) {
			
			System.out.println("Cannot write to file!");
			e.printStackTrace();
		
	}}
	
	/*
	 * read from txt file
	 * 
	 */
	public void readFile() {
		
		String longest = null;
		int wlength = 0;
		
		 File cititor = new File("file.txt");
		 try {
			 Scanner scan =  new Scanner(cititor);
			 
			 while(scan.hasNext()) {
				 String text =  scan.next();
				 
				 	if(text.length() > wlength) {
				 		longest = text;
				 		wlength = text.length();
				 	}
			 }
			 System.out.println("Cel mai lung cuvant este :" + longest);
			 scan.close();
		 }catch (Exception e) {
			 
			 System.out.println("Cannot read file");
			 e.printStackTrace();
		 
		 } 
	}

}
