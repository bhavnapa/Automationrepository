package pompackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//it is pom class
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement passTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement checkBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
	@FindBy(id="licenseLink") private WebElement licenseLink;
	
	
	
	//initialization
	public loginpage (WebDriver driver)
	{
    PageFactory.initElements(driver, this);
	}
}
	//utilization
	
	
