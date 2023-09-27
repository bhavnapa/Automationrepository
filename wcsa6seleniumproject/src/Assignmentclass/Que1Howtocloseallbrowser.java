package Assignmentclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1Howtocloseallbrowser {
	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("http://omayo.blogspot.com/");
    
    Thread.sleep(3000);
    //scroll till the popup window link
    WebElement childBrowser = driver.findElement(By.partialLinkText("open a popup window"));
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
    
    //click on link
    childBrowser.click();
    
    Thread.sleep(3000);
    
    //to close all the browsers we use quit()
    driver.quit();
    

    
    
    
    
    
	}

	}


