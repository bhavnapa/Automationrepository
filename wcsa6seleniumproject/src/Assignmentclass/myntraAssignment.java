package Assignmentclass;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class myntraAssignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.myntra.com");
		
		// get the ADDRESS  of parent window
		String parentHandle = driver.getWindowHandle();
		
		// search for shoes in search Box
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
		
		//click on search icon
		driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconS')]")).click();
		
		//click on first shoes
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		
	    //get the address of parent and child window
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			
		}
 		
		
		//click on size
		driver.findElement(By.xpath("//button[contains(@class,'size-buttons-')]/ancestor::div[@class='size-buttons-buttonContainer']/descendant::p[text()='8']")).click();
		
	   //send the pin code
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411033");
		//click on check
		driver.findElement(By.xpath("//input[@class='pincode-check pincode-button']")).click();
	}

	}


