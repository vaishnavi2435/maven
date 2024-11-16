package com.TestnNG.DataRead__Xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataReadForm__file {
  @Test
  public void datareadFile() throws IOException 
  {
	  
	  //path of the file
	  File f1=new File(System.getProperty("user.dir")+"//File.Config//file.Properties");
	  		
	  
	  
	  //read data form stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  
	  //declare object of properties class
	  Properties prop=new Properties();
	  
	  //load the file 
	  prop.load(fs);
	  
	  
	  //read the file data  using getProperty(key)...........>>>>value 
	  System.out.println("bname name is :"+prop.getProperty("bname"));
	  System.out.println("user name is :"+prop.getProperty("un"));
	  System.out.println("password is :"+prop.getProperty("psw"));
	  System.out.println("url is :"+prop.getProperty("url"));
	  
  }
}
