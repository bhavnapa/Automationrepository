package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {
	public static void main(String[] args) throws InterruptedException {
    WebDriver	driver	=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
    
    Thread.sleep(7000);
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    
    Thread.sleep(7000);
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    
    Thread.sleep(7000);
    driver.findElement(By.xpath("//button[.=' Login ']")).click();
    
    
	}

}
