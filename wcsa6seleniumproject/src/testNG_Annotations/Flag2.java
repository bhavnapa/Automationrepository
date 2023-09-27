package testNG_Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {

	  @Test(description = "Performs Login",enabled=true)
	  public void method1() {
		  Reporter.log("Method1");
	  }
	  
	  
	  @Test(description = "Performs create user",enabled =false)
	  public void method2() {
		  Reporter.log("Method2");
	  
	}
	  
	  @Test(description = "Perform Log Out",enabled = true)
	  public void method3 (){
		  Reporter.log("Method3");
	  }	  
	  

  }

