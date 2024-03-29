package curs13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {
	
	public void writePropertiesFile() throws IOException {
		
		try(OutputStream  outPutStream =  new FileOutputStream("test.properties")) {
			
			Properties prop =  new Properties();
			prop.setProperty("user", "testUser1");
			prop.setProperty("pass", "pass1234");
			prop.setProperty("email", "test@email.com");
			prop.setProperty("country", "RO");			
			prop.store(outPutStream, "am salvat fisierul properties");
			//outPutStream.close();
			System.out.println("Inside write prop file :" + prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void readPropertiesFile(String key) throws FileNotFoundException, IOException {
		
		try(InputStream inputStream =  new FileInputStream("test.properties")) {
			
			Properties prop =  new Properties();
			prop.load(inputStream);
			
			String value = prop.getProperty(key);
			System.out.println(value);
	
			 
		 }catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	
	
	public void updatePropertiesFile(String key, String value) throws IOException {
		
		Properties prop = new Properties();
		
		try(InputStream inputStream =  new FileInputStream("test.properties")){
			
			prop.load(inputStream);
	
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(OutputStream outPutStream = new FileOutputStream("test.properties")){
			
			prop.setProperty(key, value);
			prop.store(outPutStream, null);
			
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteFromPropertiesFile(String key) throws IOException {
		
		Properties prop  =  new Properties();
		
		try(InputStream inputStream =  new FileInputStream("test.properties")){
			
			prop.load(inputStream);
	
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(OutputStream outPut = new FileOutputStream("test.properties")){
			
			prop.remove(key);
			prop.store(outPut, null);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}