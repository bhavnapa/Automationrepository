package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {

	  @Test(description = "Performs Login",invocationCount =10)
	  public void method1() 
	  {
		  Reporter.log("Method1");
	  }
	  
	  
	  @Test(description = "Performs create user",invocationCount = 10)
	  public void method2() {
		  Reporter.log("Method2");
	  
	}
	  
	  @Test(description = "Perform Log Out",invocationCount = 10)
	  public void method3 (){
		  Reporter.log("Method3");
	  }	  
  }

