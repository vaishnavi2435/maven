package com.TestnNG.Data_driven_Framework__.using_Array;

import org.testng.annotations.DataProvider;

public class dataforDriven_Array 
{
	@DataProvider(name="mydata")
	public Object[][] Datadriventest1()
	{
		Object data[][]= {{"Admin","admin123"},{"Sid","7976"},{"neha","8765"},{"Admin","admin123"}};
		return data;
	}

}
