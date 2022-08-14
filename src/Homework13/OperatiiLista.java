package Homework13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class OperatiiLista {
	
	public void scrieLista() throws IOException {
		
		try(OutputStream  scrie =  new FileOutputStream("lista.legume")) {
			
			Properties lista =  new Properties();
			lista.setProperty("rosie", "23");
			lista.setProperty("ardei", "31");
			lista.setProperty("castravete", "12");
			lista.setProperty("cartof", "44");			
			lista.setProperty("morcov", "58");
			//outPutStream.close();
			System.out.println("Lista piata :" + lista);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

public void citesteLista(String key) throws FileNotFoundException, IOException {
		
		try(InputStream citeste =  new FileInputStream("lista.legume")) {
			
			Properties obj =  new Properties();
			obj.load(citeste);
			
			System.out.println("Lista piata :" + obj);
			
			String calorii = obj.getProperty(key);
			System.out.println("Leguma aleasa de tine are :" + calorii + " calorii!");
	
			 
		 }catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
			 	System.out.println("Nu vindem aceasta leguma! Te rog alege alta leguma");
				e.printStackTrace();
			}	
	}

}
