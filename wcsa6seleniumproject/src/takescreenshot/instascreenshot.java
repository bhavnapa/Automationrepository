package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class instascreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    
	    driver.get("https://www.instagram.com/");
	    driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("password")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Log in']")).click();
	    
	    //Explicit TypeCast into TakeScreenshot
	    TakesScreenshot ts= (TakesScreenshot)driver;
	   File src=ts.getScreenshotAs(OutputType.FILE);
	   File dest =new File("./screenshot/ss1.png");
	   Files.copy(src,dest); //static method
		
		
		
	}

}
