package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(75));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://shoppersstack.com/");
		driver.findElement(By.xpath("//img[@alt='jeans']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check"))).click();
		//driver.findElement(By.id("Check")).click();
	}
}
