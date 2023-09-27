package methodofwebelement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//identify login button
     Point loginButton =	(Point) driver.findElement(By.xpath("//button[text( )=' Login ']\" ) ).getLocation( )" ));
	
     @SuppressWarnings("unused")
	int xaxis = loginButton.getX();
     @SuppressWarnings("unused")
	int yaxis = loginButton.getY();
     
     org.openqa.selenium.Dimension loginButton1 = driver.findElement(By.xpath("//button[text()=' Login ']")).getSize();
     
     int height = loginButton1.getHeight();
     int width = loginButton1.getWidth();
     
     System.out.println("Hiegt of Login Button :"+height+" "+"Width Of Login Button :"+width);
     
     
     Rectangle loginButton2 = driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
    
      int xaxis1 = loginButton2.getX();
      int yxaxis1 = loginButton2.getY();
      
      int h = loginButton2.getHeight();
      int w = loginButton2.getWidth();
      
     System.out.println(xaxis1+" "+yxaxis1+" "+h+" "+w); 
      
	
	
	}

}
