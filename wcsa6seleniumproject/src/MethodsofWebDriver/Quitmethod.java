package MethodsofWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class Quitmethod {
	public static void main(String[] args)throws InterruptedException {
		//parent browser

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//launch the WebApplication
	driver.get("https://omayo.blogspot.com/");
	Thread.sleep(2000);
	
	//launch the child browser
	driver.findElement(By.xpath("//a[text()='open a popup window']")).click();
		
			
			//use the close method
			//driver.close();
			driver.quit();
	}
}
	


			
	
	
	
		 

