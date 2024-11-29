package com.pratice.TestNG;

import org.testng.annotations.DataProvider;

public class dataprovider
{
	
	@DataProvider(name="info")
	public Object[] []info()
	{
		Object[] [] c1= {{"vaishuhabare123@gmail.com","Sid@2061"}};
		return c1;
	}
	
	

}
