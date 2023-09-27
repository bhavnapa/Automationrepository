package kayworddrivenframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public abstract class basetest extends Flib 
          //to read a data from flib generic reusable method
         //calling method
{
	
	   //non static method
   	//we directly created static webdriver driver

	abstract WebDriver driver();
	private ChromeDriver driver;
	public void openBrowser()
	{
	
		//read the data from property file to get the browservalue
		Flib flib=new Flib();
	    String browservalue	=flib.readPropertyData("./data/config.properties","Browser")
		String url	=flib.readPropertyData(".data/config.property","url");

        if (browservalue.equalsIgnoreCase("Chrome"))
       {
    	   driver=new ChromeDriver();
       }
       else if (browservalue.equals("Firefox"));
	    {
		driver=new FirefoxDriver();
	    }
  
	   else if (browservalue.equals("edge"));
	    {
	   	driver=new EdgeDriver();
	    	
	    }
	}    
}	    
  
