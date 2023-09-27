package MethodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//use navigate method and Launch the Web Application
	driver.navigate().to("https://www.google.com");
	//use navigate perform backward operation
	Thread.sleep(2000);
	driver.navigate().back();
	//use navigate to perform forward operation
	Thread.sleep(2000);
	driver.navigate().forward();
	//use navigate to perform refresh operation
	Thread.sleep(2000);
	driver.navigate().refresh();
	 driver.close();
	
	
	
	
	}

}
