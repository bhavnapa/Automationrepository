package kayworddrivenframework;

import org.openqa.selenium.By;

import pompackage.BaseTest;

public class validlogintestdata {

	public static void main(String[] args) {
		
		//to open and close the browser 
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	
	//to read valid username and password
	Flib flib = new Flib();
	
	//to identify username tb and password username
	driver.findElement(By.name("username")).sendkeys(flib.readPropertyData(PROP_PATH,"username"));
	
	//to identify username  and password textbox
	driver.findElement(By.name("pwd")).sendkeys(flib.readPropertyData(PROP_PATH,"password"));
		
	//identify the login button and click
	driver.findElement(By.id("loginButton")).click();
	
	Thread.sleep(2000);
	bt.close();
		
	}

}
