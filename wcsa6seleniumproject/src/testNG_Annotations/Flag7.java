package testNG_Annotations;

import org.testng.annotations.Test;

public class Flag7 {
	@Test(description="perform login")
	public void loginMethod()
	{
		System.out.println("it is use to perform login!!");
	}
	@Test(description="perform createuser",dependsOnMethods= "loginMethod()")
	public void createUserMethod()
	{
		System.out.println("usercreated");
	}
  @Test(description="perform logout",dependsOnMethods="createUserMethod()")
  public void logoutMethod()
  {
	  System.out.println("it is use to perform logout");
  }


  }

