package com.pratice.TestNG;

import org.testng.annotations.Test;

public class dependsONMethod {
  @Test()
  public void test1()
  {
	System.out.println("started!!!!!!!!!!") ; 
  }
  
  
  
  @Test(dependsOnMethods= "test1")
  public void test2()
  {
	  System.out.println("Continue!!!!!!!!!!!!!!!") ; 
  }
  
  
  @Test(dependsOnMethods= {"test1","test2"})
  public void test3()
  {
	  System.out.println("close the end!!!!!!!!!!!!!!") ;  
  }
  
  
  @Test()
  public void test4()
  {System.out.println("ENd!!!!!!!!!!!") ; 
	  
  }
}
