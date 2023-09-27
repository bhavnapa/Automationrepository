package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationpopup {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/tanma/OneDrive/Desktop/webelement/confirmationpopup.html");
	
	//generate conformation popup
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//handle confirmation popup by using switchTo();
	
	Alert al2 = driver.switchTo().alert();
	Thread.sleep(2000);
	
	//al.accept(); accept the conformation popup
	//al.dismiss(); dismiss the conformation popup
	
	System.out.println(al2.getText());
	al2.accept();
	
	Thread.sleep(2000);
	driver.close();
	
		
	}

}
