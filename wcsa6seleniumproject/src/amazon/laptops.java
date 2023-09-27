package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class laptops {
public static void main(String[] args) throws InterruptedException {
	 
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);

driver.get("https://www.flipkart.com/");

Thread.sleep(2000);
driver.findElement(By.name("q")).sendKeys("laptops");

Thread.sleep(2000);

driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

}
}

