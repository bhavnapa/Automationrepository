package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("www.omayo.blogspot.com");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Open a popup window")).clear();
	driver.close();
	
	}

}
