package ddt_extra;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertiesFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
	//  create java representation object of the physical file
		
	    FileInputStream  fis = new FileInputStream("./src/test/resources/commondata.properties");
	    
	    Properties pObj = new Properties();
	      
   // load all the keys
	    
	    pObj.load(fis);
	    
  // by using key fetch the value
	    
	   String BROWSER = pObj.getProperty("browser");
	   
	   String URL = pObj.getProperty("url");
	   
	   String USERNAME = pObj.getProperty("username");
	   
	   String PASSWORD = pObj.getProperty("password");
	   
	   
	 System.out.println(BROWSER);
	 
	 System.out.println(URL);
	 
	 System.out.println(USERNAME);
	 
	 System.out.println(PASSWORD);
	 
  
	}
}

		
		
		

	

