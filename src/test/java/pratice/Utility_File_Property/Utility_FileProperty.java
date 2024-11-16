package pratice.Utility_File_Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility_FileProperty
{
	public Properties p1;
	public  Utility_FileProperty()
	{
        p1=new Properties ();
        
        File f1=new File(System.getProperty("user.dir")+"//pratice.config_File(Property)//pratice.config.properties");
        
        FileInputStream fs;
		try {
			
	          
			fs = new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
			
		} 
		
		catch (IOException e)
		{
		
			e.printStackTrace();
		}
	}
        public String getdata(String key)
        {
        	 return p1.getProperty(key);
        }
          
          
		
		
		
	

}
