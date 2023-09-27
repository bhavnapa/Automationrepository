package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagName {
	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    driver.get("https://www.instagram.com/");
    
    //to find the element on the web page
    WebElement usn = driver.findElement(By.name("username"));
    
    //to get the tag name of web element
    String usnTagName = usn.getTagName();
    System.out.println(usnTagName);
    
   WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    System.out.println(loginButton);
    
    
    
    	
   
  

	}

}
