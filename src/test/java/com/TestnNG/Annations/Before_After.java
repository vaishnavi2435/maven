package com.TestnNG.Annations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After {
  @Test
  public void test1() 
  {
	  System.out.println("this is test case 1");
  }
  @Test
  public void test2() 
  {
	  System.out.println("this is test case 2");
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("this is test case 3");
  }
  
  //Annotation
  
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("before the method execution");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("after the method execution");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("before class execute before the first class");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("after class execute after the last class");
  }
}
