package pratice.Data_Driven_FrameWork_UsingArray;

import org.testng.annotations.DataProvider;

public class DataPRovider_UsingArray
{
	
@DataProvider(name="Mydata")
public Object[][] test()
{
	Object data [][] = {{"Admin","admin123"},{"vaishu","2061"},{"sid","2210"},{"Admin","admin123"}};
	return data;
}
	
	
	
	
}
