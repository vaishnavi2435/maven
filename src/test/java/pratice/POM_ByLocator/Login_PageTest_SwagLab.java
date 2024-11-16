package pratice.POM_ByLocator;

import org.testng.annotations.Test;

public class Login_PageTest_SwagLab extends Base_Class_SwagLab
{
  @Test(priority=1)
  public void ValidateDologin() 
  {
	  lp.dologin("standard_user" ,"secret_sauce");

  }
  
  @Test(priority=2)
  public void validateurl() 
  {
	String url=  lp.geturl();
	System.out.println(url);
  }
  
  @Test(priority=3)
  public void validateTittle()
  {
	  String Tittle= lp.getTittle();
	  System.out.println(Tittle);
  }
  
  
}
