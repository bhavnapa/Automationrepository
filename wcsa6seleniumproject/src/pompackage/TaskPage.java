package pompackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TaskPage {

		//it is ue to store all the web elements of task page
@FindBy(xpath = "//a[text()='Projects & Customers']") private WebElement Projects_Customers_SubModule;
@FindBy(xpath = "//input[@value='Create New Customer']") private WebElement Create_New_Customer_Button;
@FindBy(xpath = "//input[@value='Create New Project']") private WebElement Create_New_Project_Button;
@FindBy(name = "name") private WebElement Customer_Name_TB;
@FindBy(name = "createCustomerSubmit") private WebElement Create_Customer_Button;
@FindBy(xpath = "//select[@name='customerId']") private WebElement Customer_DropDown;
@FindBy(xpath = "//input[@name='name']") private WebElement Project_Name_TB;
@FindBy(name = "createProjectSubmit") private WebElement Create_Project_Button;
        
//initialization
public TaskPage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
        }

//utilization

}
