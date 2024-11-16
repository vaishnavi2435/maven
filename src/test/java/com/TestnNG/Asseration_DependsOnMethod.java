package com.TestnNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration_DependsOnMethod {
  
  
  @Test(priority=1)
  public void first()
  {
	  System.out.println("i got first number");
  }
  @Test(priority=2, dependsOnMethods="first")
  public void second()
  {
	  System.out.println("i got second number");
	  AssertJUnit.assertEquals(true, false);
  }
  
  @Test( priority=3,dependsOnMethods="second")
  public void third()
  {
	  System.out.println("i got  third number");
  }
  }

