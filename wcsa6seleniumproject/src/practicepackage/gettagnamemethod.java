package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettagnamemethod {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	
	//to find web element on web page
     WebElement      usn	=driver.findElement(By.name("username"));
  
     //to get the tagname of that element
     String usntagname  =usn.getTagName();
     System.out.println(usntagname);
     
  WebElement   loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
            System.out.println(loginbutton);          
                      
                      
	}

}
