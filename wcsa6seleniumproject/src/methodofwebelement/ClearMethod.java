package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
    WebDriver	driver	=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://www.flipkart.com/search?q=laptop&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
    
    //identify username text box and pass the valid inputs
    driver.findElement(By.name("username")).sendKeys("admin123");
    //identify password text box and pass the valid inputs
    WebElement passwordTextBox = driver.findElement(By.name("pwd"));
    passwordTextBox.sendKeys("manager");
    //identify login button and click
  WebElement loginButton = driver.findElement(By.id("loginButton"));
  loginButton.click();
  Thread.sleep(2000);
  //identify username text box and clear the inputs
  driver.findElement(By.name("username")).clear();
  
  
    
    
   

	
	}	

}
