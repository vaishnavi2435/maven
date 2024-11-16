package com.TestnNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Asseration_timeOut {
  
  @Test(timeOut=3000)
  public void testcase1() throws InterruptedException
  {
	  System.out.println("test is case 1");
	  Thread.sleep(2000);
  }
  
  
  @Test(timeOut=2000)
  public void testcase2() throws InterruptedException
  {
	  System.out.println("test is case 1");
	  Thread.sleep(4000);
  }
}
