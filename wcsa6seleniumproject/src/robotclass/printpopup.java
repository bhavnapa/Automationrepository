package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printpopup {
	public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.selenium.dev/");
	
	//create a object for robot class
    Robot	robot=new Robot();
	
	Thread.sleep(2000);
	//click on control button
	robot.keyPress(KeyEvent.VK_CONTROL);
	
	Thread.sleep(2000);
	//click on p button
	robot.keyPress(KeyEvent.VK_P);
	
	
	//release control button
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	//release p button
	robot.keyRelease(KeyEvent.VK_P);
	Thread.sleep(2000);
	
	//tracefer CONTROL to cancel buton
	robot.keyPress(KeyEvent.VK_TAB);
	
	//release tab button
	robot.keyRelease(KeyEvent.VK_TAB);
	
	Thread.sleep(2000);
	//to press enter
	robot.keyPress(KeyEvent.VK_ENTER);
	
	//to release enter
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	driver.quit();
	
	}

}
