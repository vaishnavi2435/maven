package com.pratice.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupTest {
  @Test(groups="SmokeTest")
  public void test1()
  {
	  System.out.println("this is smoke test!!!!!!!!!!!!");
  }
  
  
  
  @Test(groups="Regression")
  public void test2()
  {
	  System.out.println("this is Regression test!!!!!!!!!!!!");
  }
  
  
  
  
  
  
  
  
  @Test(groups="Sanity")
  public void test3()
  {
	  System.out.println("this is sanity test!!!!!!!!!!!!");
  }
  
  
  
  @Test(groups="Enviroment")
  public void test4()
  {
	  System.out.println("this is enviroment test!!!!!!!!!!!!");
  }
}
