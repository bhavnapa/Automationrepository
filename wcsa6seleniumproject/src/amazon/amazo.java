package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazo {
	public static void main(String[] args) throws InterruptedException {
		//to auto generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	//identify email text box
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("bhavna@123");
	
	//identify password textbox 
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("bhavna123");
	
	//login button

	
	    
	
	
		
	}

	
		
	}
	


