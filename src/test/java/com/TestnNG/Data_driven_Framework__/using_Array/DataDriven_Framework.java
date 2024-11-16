package com.TestnNG.Data_driven_Framework__.using_Array;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_Framework
{
//	@DataProvider(name="mydata")
	//public Object[][] Datadriventest1()
//	{
	//	Object data[][]= {{"vaishu","2061"},{"Sid","7976"},{"neha","8765"}};
	//	return data;
//	}
	
  @Test(dataProvider="mydata" ,dataProviderClass= dataforDriven_Array.class )
  public void datadriven(String un ,String psw)
  {
	 System.out.println("username is:"+un) ;
	 System.out.println("password is :"+psw);
  }
}
