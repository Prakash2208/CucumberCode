package stepDefenitions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyClass {
	
File f;
	
	FileReader fr;
	
	Properties prop;
	
	public String propetyfetch() throws IOException {
		
		
		 f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\DemoCucumber\\src\\test\\resources\\PropertyFiles\\keys.properties");
				
				 fr= new FileReader(f);
				
		 prop= new Properties();
				
				prop.load(fr);
				
				
				String property = prop.getProperty("url");
				
				System.out.println(property);
				
				return property;
			}
	
	
	public String usernamefetch() throws IOException {
		
		f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\DemoCucumber\\src\\test\\resources\\PropertyFiles\\keys.properties");
		
		fr= new FileReader(f);
		
		 prop= new Properties();
				
				prop.load(fr);
				
				String Username = prop.getProperty("Username");
				
				return Username;
				
		
	}
	
	
public String passwordfetch() throws IOException {
		
		f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\DemoCucumber\\src\\test\\resources\\PropertyFiles\\keys.properties");
		
		fr= new FileReader(f);
		
		 prop= new Properties();
				
				prop.load(fr);
				
				String Password = prop.getProperty("Password");
				
				return Password;
				
		
	}

public String Cardnumberfetch() throws IOException {
	
	f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\DemoCucumber\\src\\test\\resources\\PropertyFiles\\keys.properties");
	
	fr= new FileReader(f);
	
	 prop= new Properties();
			
			prop.load(fr);
			
			String number = prop.getProperty("CreditCardNumber");
			return number;
	
	
}
	


}


