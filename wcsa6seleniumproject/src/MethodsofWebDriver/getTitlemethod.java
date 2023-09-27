package MethodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitlemethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//read the title of login page
	String titleofpage = driver.getTitle();
	System.out.println(titleofpage);
	driver.close();
	
	}

}
