package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  
  driver.get("https://www.bluestone.com/");
  
  //handle hidden division pop up
  driver.findElement(By.id("denyBtn")).click();
  
  //identify watch Jewellery
 WebElement target = driver.findElement(By.xpath("//a[text( )='Watch Jewellery ']"));
 
 //perform mouseHover action on watch Jewellery 
  Actions act = new Actions(driver);
  act.moveToElement(target);
  act.moveToElement(target).perform();
  
  //click on band option
  driver.findElement(By.xpath("//a[.='Band']")).click();
  
	}

}
