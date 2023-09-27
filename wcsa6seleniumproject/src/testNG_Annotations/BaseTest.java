package testNG_Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	static WebDriver driver;
	
	@BeforeMethod
	public void setUP1()
	{
	WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));			
		driver.get("https://www.google.com");
	}
	@AfterMethod
	public void tearDown()
	{		
	driver.quit();
	}
 }
