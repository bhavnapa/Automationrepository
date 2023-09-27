package Finalmock;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class finalmock {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.reliancedigital.in/");
	 WebElement tagret = driver.findElement(By.xpath("//li[@class=\"nav__container\"]"));
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(tagret).perform();
	 // driver.findElement(By.xpath());
	 
	  
	  
}
}
