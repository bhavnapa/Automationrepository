package testNG_Annotations;

import org.testng.annotations.Test;

public class Flag6 {
 
  @Test(groups="functional TC")
  public void ft1(){
	  System.out.println("functional TC1");
  }
 @Test(groups="integration TC")
 public void it3() {	
	 System.out.println("integration TC2");
 }
 @Test(groups="smoke TC")
 public void st3() {
	 System.out.println("smoke TC3");
 }

//------------------------------------------------------------

@Test(groups="functional TC")
public void ft2(){
	  System.out.println("functional TC2");
}
@Test(groups="integration TC")
public void it2()  {	
	 System.out.println("integration TC2");
}
@Test(groups="smoke TC")
public void st2() {
	 System.out.println("smoke TC2");
}
//------------------------------------------------------------

@Test(groups="functional TC")
public void ft3(){
	  System.out.println("functional TC3");
}
@Test(groups="integration TC")
public void it1() {	
	 System.out.println("integration TC3");
}
@Test(groups="smoke TC")
public void st1() {
	 System.out.println("smoke TC3");
}

}
