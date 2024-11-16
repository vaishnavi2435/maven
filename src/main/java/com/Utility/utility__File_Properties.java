package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class utility__File_Properties

{
	
	 public Properties prop;
	public utility__File_Properties() throws IOException
	{
		//file path 
		File f1= new File(System.getProperty("user.dir")+"//File.Config//file.Properties");
		
		//read the file Stream
		FileInputStream fs;
		try {
			fs = new FileInputStream (f1);
			prop.load(fs);
		}
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		
		//object of file 
		//try {
			//prop.load(fs);
		 catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
		
	}
	public String getdata( String key)
	{
		return prop.getProperty(key);
	}

}
