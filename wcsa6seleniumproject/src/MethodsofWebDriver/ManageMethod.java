package MethodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	 //use manage method to maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//manage method to set the size
    Dimension	targetSize =new Dimension(450,250);
    driver.manage().window().setSize(targetSize);
    Thread.sleep(2000);
     
    //manage method to set the position
  Point targetPosition =new Point(250,350);
  driver.manage().window().setPosition(targetPosition);
  Thread.sleep(2000);
  
  //manage to make window fullScreen
  driver.manage().window().fullscreen();
  driver.close();
  
  

	

	}

	}


