package testNG_Annotations;


import org.testng.annotations.Test;

public class Flag4 {
  @Test(priority = 0)
  public void method1() 
  {
	  System.out.println("a");;
  }
  
  
  @Test(priority =1)
  public void method2() {
	  System.out.println("b");;
  
}
  
  @Test(priority =2)
  public void method3 (){
	  System.out.println("c");;
  }	 
  @Test(priority =3)
  public void method4 (){
	  System.out.println("d");;
  }
  @Test(priority =4)
  public void method5 (){
	  System.out.println("e");;
  }	 
  @Test(priority =5)
  public void method6 (){
	  System.out.println("f");;
  }	
  @Test(priority =6)
  public void method7 (){
	  System.out.println("g");;
  }	 
  @Test(priority =7)
  public void method8 (){
	  System.out.println("h");;
  }	
  @Test(priority =8)
  public void method9 (){
	  System.out.println("i");;  }	
  @Test(priority =9)
  public void method10 (){
	  System.out.println("j");;
  }	 
  }

