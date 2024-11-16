package pratice.Data_Driven_FrameWork_UsingArray;

import org.testng.annotations.Test;

public class Data_Driven_UsingArayy_Using_Dataprovider
{
  @Test(dataProvider="Mydata",dataProviderClass=DataPRovider_UsingArray.class)
  public void datadriven(String un,String psw) 
  {
	  System.out.println("username is :"+un);
	  System.out.println("password is :"+psw);
  }
}
