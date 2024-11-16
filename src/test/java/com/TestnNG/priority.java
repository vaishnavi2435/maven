package com.TestnNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class priority {
  @Test(priority=1)
  public void upload()
  {
	  System.out.println("uplodding ");
  }
  @Test(priority=2,enabled=false)
  public void downoad()
  {
	  System.out.println("download ");
  }
  @Test (priority=3)
  public void searching()
  {
	  System.out.println("searching ");
  }
  @Test(priority=4)
  public void done()
  {
	  System.out.println("done ");
  }
}
