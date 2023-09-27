package Assignmentclass;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4Howtocloseonlychildbrowser {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("http://omayo.blogspot.com/");
    //get the address of parent browser
    
    String parentHandle = driver.getWindowHandle();
	
	
	Thread.sleep(3000);
	// scroll till open a popup window link
	WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
	
	// click on link
	childBrowser.click();
	
	// get the address of parent and child browser
	Set<String> allHandles = driver.getWindowHandles();
	for(String wh:allHandles)
	{
		if(!parentHandle.equals(wh))
		{
			// close only the child browser
			Thread.sleep(3000);
			driver.switchTo().window(wh).close();
			
		}
	
	}
	}
}
