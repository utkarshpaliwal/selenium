package testcases;

import org.testng.annotations.Test;

public class Recharge {
  @Test(priority=2)
  public void f() {
	  System.out.println("I am Testf");
  }
  
  @Test(priority=1)
  public void Hello(){
	  System.out.println("I am Hello");	  
  }
  
  @Test(priority=3)
  public void Welcome(){
	  System.out.println("I am Welcome");	  
  }
  
  @Test(priority=3)
  public void Hi(){
	  System.out.println("I am Hi");	  
  }

  @Test
  public void b(){
	  System.out.println("b");	  
  }
  
}
