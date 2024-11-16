package com.TestnNG.Annations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassB {
  @Test
  public void class2()
  {
	  System.out.println("This is test case B");
  }
  
  @BeforeTest
  public void btest()
  {
	 System.out.println("Before test is executed") ;
  }
  
  
  @AfterTest
  public void atest()
  {
	 System.out.println("After test is executed") ;
  }
  
  
  @BeforeSuite
  public void bsuite()
  {
	System.out.println("before suite will execute before the test ") ; 
  }
  
  
  @AfterSuite
  public void asuite()
  {
	System.out.println("after  suite will execute after the test ") ; 
  }
}
