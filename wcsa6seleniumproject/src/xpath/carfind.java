package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class carfind {
	public static void main(String[] args) throws InterruptedException {
		//navigate to google.com
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("Car");
	//identify all suggestion of car element
	
	Thread.sleep(2000);
	// print all suggestion of car
	
	List<WebElement> carSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	Thread.sleep(2000);
	//to print the list use looping statement
	for (int i = 0; i <carSuggestions .size(); i++)
	{
		System.out.println(carSuggestions.get(i).getText());
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	}

}
