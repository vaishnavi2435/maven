package com.TestnNG.Annations;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Grouping_test {
  @Test(description="smoketest")
  public void test1() 
  {
	  System.out.println("this is case 11");
  }
  @Test(description="smoketest")
  public void test2() 
  {
	  System.out.println("this is case 22");
  }
  @Test(description="functional test")
  public void test3() 
  {
	  System.out.println("this is case 33");
  }
  @Test(description="functional test")
  public void test4() 
  {
	  System.out.println("this is case 44");
  }
  @Test(description="regression test")
  public void test5() 
  {
	  System.out.println("this is case 55");
  }
  @Test(description="regression test")
  public void test6() 
  {
	  System.out.println("this is case 66");
  }
}
