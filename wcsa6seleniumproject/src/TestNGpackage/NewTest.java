package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void method1()
  {
	 Reporter.log("methos1");
  }
  @Test
  public void method2()
  {
	Reporter.log("method1", true);
  }
  
}
