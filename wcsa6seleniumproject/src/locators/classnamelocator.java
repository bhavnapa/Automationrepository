package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classnamelocator {
	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();	
    driver.manage().window().maximize();

    driver.get("http://www.google.com/");

    //switch the control to active element
    driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
    
    driver.findElement(By.className("lNPNe")).click();
	}

}
