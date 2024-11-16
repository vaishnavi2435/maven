package pratice.TestNGFramework.DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class dataReading_Form_properties_File {
  @Test
  public void propertyfile() throws IOException
  {
	File f1= new File(System.getProperty("user.dir")+"//pratice.config_File(Property)//pratice.config.properties");
	 
	FileInputStream fs= new FileInputStream(f1);
	
	Properties p1= new Properties();
	
	  
	  p1.load(fs);
	  
	  System.out.println(p1.getProperty("bname"));
	  System.out.println(p1.getProperty("un"));
	  System.out.println(p1.getProperty("psw"));
	  System.out.println(p1.getProperty("url"));
	  
	  
	  
	  
  }
}
