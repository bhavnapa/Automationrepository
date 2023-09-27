package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {
	private static WebElement button;

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/tanma/OneDrive/Desktop/webelement/alertpopup.html");
	
	//generate alert popup 
	driver.findElement(By.xpath("//button[text( )='clickme! ']")).click();
	button.click();
	
	//handle alert popup by switching the controls to alert
     Alert al = driver.switchTo().alert();
     Thread.sleep(20);
     //al.accept() to accept the popup
     //al.dismiss() to dismiss the popup
     System.out.println(al.getText());
     
     al.accept();
     Thread.sleep(20);
     driver.close();
  		
	}
	
	
	}


