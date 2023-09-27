package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUploadpopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("");

		driver.findElement(By.name("")).sendKeys("admin");
		driver.findElement(By.name("")).sendKeys("manager");
		driver.findElement(By.id("")).click();
		
		//click on setting modules
		driver.findElement(By.xpath("")).click();
		
		//click on logo and 'colour scheme'
		driver.findElement(By.xpath("")).click();
		
		Thread.sleep(2000);
		//select the radio button
		
		driver.findElement(By.id("")).click();
		Thread.sleep(4000);
		
		//double click on choose file button
		WebElement target = driver.findElement(By.name(""));
		
		Actions act = new Actions (driver);
		act.doubleClick(target).perform();
		
		//file upload popup will get open
		//handle the file upload popup
		
		File file = new File("");
		String abspath = file.getAbsolutePath();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec(abspath);
		
		Thread.sleep(6000);
		
		Runtime.getRuntime().exec(abspath);
		
		driver.quit();
	}
	

}
