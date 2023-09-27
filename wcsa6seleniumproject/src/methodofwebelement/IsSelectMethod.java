package methodofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("http://127.0.0.1/login.do;jsessionid=5blr6kl8tn1i5");
	    
	    //to click or select the checkBox.
	    driver.findElement(By.name("username")).click();
	   
	    //to check whether the check box is selected or not.
	    WebElement checkbox = driver.findElement(By.name("remember"));
	    boolean result = checkbox.isSelected();
	  System.out.println(result);
	   
	    //to check whether the checkBox is displayed or not 
	   boolean res = checkbox.isDisplayed();
	    System.out.println(res);
	    
	    //to check whether the login button of instagram is enabled
	    driver.navigate().to("https://www.instagram.com/");
	    driver.findElement(By.name("username")).sendKeys("admin123");
	    driver.findElement(By.name("password")).sendKeys("manager123");
	  WebElement loginbutton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	    boolean resl = loginbutton.isEnabled();
	    System.out.println(resl);
	    
	    
	    

	}

}
