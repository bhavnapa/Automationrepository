package MethodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrentURLmethod {
	
	//it is use to get the url of current webpage
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the 
		driver.get("http://omayo.blogspot.com/");
		//read the URL of login page
		 String urlOfLoginPage = driver.getCurrentUrl();
		System.out.println(urlOfLoginPage);
		
	}

}
