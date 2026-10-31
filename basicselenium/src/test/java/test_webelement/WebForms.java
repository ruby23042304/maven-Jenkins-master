package test_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebForms {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
	WebElement we =driver.findElement(By.xpath("//h1[@class=\"display-6\"]"));
	String first_name =we.getText();
	System.out.println(first_name);
	
	
	if(first_name.equals("Web form"))
	{
		System.out.println("Test Case Pass");
	}
	else
		
	{
		System.out.println("Test Case fail");
	}
	
	driver.findElement(By.id("my-text-id")).sendKeys("Hello");
	driver.findElement(By.name("my-password")).sendKeys("123");
	driver.findElement(By.name("my-textarea")).sendKeys("Newyork");
	
	
	
	
	
	
	}

}
