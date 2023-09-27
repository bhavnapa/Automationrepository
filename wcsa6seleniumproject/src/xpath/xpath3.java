package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath3 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://chat.qspiders.com/");
	
	Thread.sleep(7000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Registered Number']")).sendKeys("9876543210");
	
	Thread.sleep(7000);
	driver.findElement(By.xpath("//input [@placeholder='Enter password']")).sendKeys("password123");
	 
	Thread.sleep(7000);
	driver.findElement(By.xpath("//button[contains(@type, 'submit')]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text( ), 'logout')]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
	
	
	}

}
