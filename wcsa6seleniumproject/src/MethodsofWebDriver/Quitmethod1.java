package MethodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Quitmethod1 {
	public static void main(String[] args) throws InterruptedException {
		//parent browser
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//launch the WebApplication
	driver.get("https.//www.flipkart.com/");
	Thread.sleep(2000);
	
  

	
	
		
	}

}
