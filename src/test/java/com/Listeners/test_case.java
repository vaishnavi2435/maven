package com.Listeners;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 

//@Listeners(com.Listeners.MyListener.class)
public class test_case {
  @Test
  public void testcase1()
  {
	  System.out.println("test case 1");
	  Assert.assertEquals(false, false);
	  System.out.println("assertetion is matched");
  }
  
  
  
  
  @Test
  public void testcase2()
  {
	  System.out.println("test case 2");
	  Assert.assertEquals(true, false,"assertion is not matches");
	  System.out.println("assertetion is matched");
  }
}
