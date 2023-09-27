package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath32 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
    Thread.sleep(7000);
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhavanapatil2509@gmail.com");
    
    
    Thread.sleep(7000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("bhavna2509");
    
    driver.findElement(By.xpath("//input[@id='continue']")).click();
    
    
    
	
	
	}

}
