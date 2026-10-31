package ddt__extra;

import java.io.FileReader;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetDataFromJsonFile {

	public static  void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
   FileReader fr = new FileReader("./src/test/resources/commondata.json");
   
   JSONParser parser = new JSONParser();
   Object obj = parser.parser(fr);
   
   JSONObject jobj = (JSONObject) obj ;
   
   String BROWSER = jobj.get("bro").toString();
   
   String URL  = jobj.get("url").toString();
   
   String USERNAME = jobj.get("un").toString();
   
   String PASSWORD = jobj.get("pwd").toString();
   
   
   System.out.println(BROWSER);
   
   System.out.println(URL);
   
   System.out.println(USERNAME);
   
   System.out.println(PASSWORD);
   
   
	}
	

   
   

	}
