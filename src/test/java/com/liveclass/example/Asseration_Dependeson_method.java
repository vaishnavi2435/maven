package com.liveclass.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseration_Dependeson_method {
  @Test(priority=1)
  public void first()
  {
	  System.out.println("i got first number");
  }
  @Test(priority=2, dependsOnMethods="first")
  public void second()
  {
	  System.out.println("i got second number");
	  Assert.assertEquals(true, false);
  }
  
  @Test( priority=3,dependsOnMethods="second")
  public void third()
  {
	  System.out.println("i got  third number");
  }
}
