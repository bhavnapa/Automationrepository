package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDown {
	public static void main(String[] args) throws InterruptedException {
    WebDriver	driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.selenium.dev/");
	
	Thread.sleep(15);
		
	//Explicit type casting into JavaScriptExecutor
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,500)");
	}

}
