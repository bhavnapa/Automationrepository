package MethodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesourceMethod {
	
	
	//it is use to get the source code of current webpage
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
			//read the source code of login pages
			String loginpagesourcecode = driver.getTitle();
		System.out.println(loginpagesourcecode);
			
			
		
		
		
	}

}
