package Assignmentclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://jqueryui.com/droppable/");
	
	//driver.findElement(By.linkText("Demos")).clear();
	
	WebElement src = driver.findElement(By.id("draggable"));
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedCondition.visiblicityof(src));
	
	//target
    WebElement target1	=driver.findElement(By.xpath(""));
    
    
	
	
	
	}

}
