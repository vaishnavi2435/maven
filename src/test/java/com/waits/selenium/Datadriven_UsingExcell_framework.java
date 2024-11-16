package com.waits.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Datadriven_UsingExcell_framework {
  @Test
  public void datatest() throws Exception
  {
	  
	  //create a file path
	  File f1= new File(System.getProperty("user.dir")+"//Excell.folder//Excelldata.xlsx");
	  
	  
	  //read data to stream
	  FileInputStream fs= new FileInputStream(f1);
	  
	  
	  //workbook object
	  XSSFWorkbook wb= new XSSFWorkbook(fs);
	String  value=  wb.getSheet("userdata").getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);
  }
}
