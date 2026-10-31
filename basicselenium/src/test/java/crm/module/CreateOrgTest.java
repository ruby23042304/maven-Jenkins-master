package crm.module;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("http://localhost:8888/");
      
      driver.findElement(By.name("user_name")).sendKeys("admin");
      driver.findElement(By.name("user_password")).sendKeys("manager");
      driver.findElement(By.id("submitButton")).click();
       
      boolean homever = driver.findElement(By.partialLinkText("Home")).isDisplayed();
      if (homever) {
    	  System.out.println("logged in successfully");
    	  
    //   create organization
    	  driver.findElement(By.linkText("Organization")).click();
    	  driver.findElement(By.cssSelector("img[alt='Create Organizatio...']")).click();
    	  
   //   fill the form
    	String orgName = "automationwithpiyush_0077";
    	WebElement orgField = driver.findElement(By.name("accountname"));
    	orgField.sendKeys(orgName);
    	driver.findElement(By.xpath("//input[contains(@title,'Save [Alt+S]')]")).click();
    	
   //   verification
    	driver.findElement(By.id("dtlview_Organization Name")).getText();
    	
  //    logout
    	
    	
  //    close the browser
    	driver.quit();
    	
    	
      }
	}

}     


