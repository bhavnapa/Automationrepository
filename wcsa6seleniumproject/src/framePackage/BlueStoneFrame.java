package framePackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BlueStoneFrame {
	public static void main(String[] args) {
    WebDriver	driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.bluestone.com/");
    
    driver.findElement(By.id("denyBtn")).click();
    
	
	
	//this chat box is designed under the frame
	//identify frame first by identify it....
    
    //driver.switchTo().frame("fc waight");.....we handle frame by 
    
    WebElement frameElement = driver.findElement(By.id("iframe"));
	
	driver.switchTo().frame(frameElement);
	
	WebElement ChatBox = driver.findElement(By.id("chat-icon"));
	ChatBox.click();
	
	//switch control to main page 
	//driver.switchTo().defaultContent();
	
	//switch control to parent page
	driver.switchTo().parentFrame();
	driver.findElement(By.id("chat-fc-name")).sendKeys("bhavna");
	driver.findElement(By.id("chat-fc-email")).sendKeys("bhavanapatil2509@gmail.com");
	driver.findElement(By.id("chat-fc-phone")).sendKeys("8390022931");

	}
	

}
