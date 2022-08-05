package curs14;

import java.io.IOException;

public class TestTextFileProcessor {

	public static void main(String[] args)  {

		TextFileProcessor obj =  new TextFileProcessor();
		obj.writeFile("Text\n");
		obj.readFile();
		System.out.println("---------------------");
		obj.updateFile("Alt text in fisier\n");
		obj.updateFile("Alta linie\n");
		obj.readFile();
		obj.deleteLineFromFile("Alta linie", "");
		
		System.out.println("------------------------");
		obj.readFile();
		obj.deleteFIle();


		
	}

}