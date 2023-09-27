package MethodsofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchtoMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	//use switchTo and switch the controls to activeElements
	//on google searchBox
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
	
		
	
	}

}
