package com.pratice.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider_using_sameClass {
	
@DataProvider(name="mydata")	
public Object[][] info()
{
	  Object data[][]= {{"vaishu","6789432"},{"sid","976052"},{"nita","5432907"}};
	 return data;
}
	
	
	
  @Test(dataProvider="mydata")
  public void sameclass (String name,String ph)
  {
	  System.out.println("my name is :"+name);
	  System.out.println("my ph is :"+ph);
	  System.out.println("***********************************");
	  
  }
}
