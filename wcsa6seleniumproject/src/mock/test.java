package mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static void main(String[] args) {
	WebDriver driver	=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
    String url = driver.getCurrentUrl();
    System.out.println(url);
	}

}
