package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//button[@aria-label='aria-label']")).click();
	
	driver.findElement(By.xpath("//a[@aria-label='Google Apps']")).click();
	
	driver.switchTo().frame("app");
	
	driver.findElement(By.xpath("//span[text()='Maps']")).click();
	
	driver.quit();
	
	
	}

}
