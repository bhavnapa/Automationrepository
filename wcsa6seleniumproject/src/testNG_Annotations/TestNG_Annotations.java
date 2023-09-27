package testNG_Annotations;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
  @Test
  public void method_test_annotation1() {
	  Reporter.log("Test_Annotation1",true);
  }
  @Test
  public void method_test_annotation2() {
	  Reporter.log("Test_Annotation2",true);
  }
  @BeforeMethod
  public void method_beforeMethod_annotation()
  {
	  Reporter.log("BeforeMethodAnnotation true");  
  }
  @AfterMethod
  public void method_afterMethod_annotation()
  {
	  Reporter.log("AfterMethodAnnotation",true);
  }
  @BeforeClass
  public void method_beforeclass_annotation()
  {
	  Reporter.log("BeforeClassAnnotation",true);
  }
  @AfterClass
  public void method_afterclass_annotation()
  {
	  Reporter.log("AfterClassAnnotation",true);
  }
  @BeforeTest
  public void method_beforetest_annotation()
  {
	  Reporter.log("BeforeTestAnnotation",true);
  }
  @AfterTest
  public void method_aftertest_annotation()
  {
	  Reporter.log("AfterTestAnnotation",true);
  }
  @BeforeSuite
  public void method_beforesuit_annotation()
  {
	  Reporter.log("BeforesuitAnnotation",true);
  }
  @AfterSuite
  public void method_aftersuit_annotation()
  {
	  Reporter.log("AftersuitAnnotation",true);
  }
  
  
  
}
