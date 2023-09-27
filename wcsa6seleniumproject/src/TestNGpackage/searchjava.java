package TestNGpackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class searchjava {
	
  @Test
  public void java_search_in_chrome() throws InterruptedException {
	WebDriver  driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
	
	driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	 Reporter.log("java", false);
	Thread.sleep(2000);
	
	driver.quit();
		
	  
  }
}
