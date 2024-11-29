package com.pratice.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData_Excellshet
{
	@Test()
	public void fileread() throws Exception
	{
	
	File f1= new File(System.getProperty("user.dir")+"//pratice.excelllll//New Microsoft Excel Worksheet.xlsx");
	
	
	
	FileInputStream fs= new FileInputStream(f1);
	
	
	 XSSFWorkbook wb=new XSSFWorkbook(fs);
	 
	 
	 String value= wb.getSheet("data").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);
	 
	 
	 
	 
	
}
}