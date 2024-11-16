package com.TestnNG.Datadriven___using.Excellformat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data_driven_Excell
{
	public XSSFWorkbook wb;
	@DataProvider(name="ExcellData")
	
	public Object[][] ExcellData( )
	{
	//create a path
	  File f1=new File(System.getProperty("user.dir")+"//Excell.folder//Excelldata.xlsx");
	  
	  //read data in the Stream
	  FileInputStream fs;
	  Object data [][]=null;
	try {
		fs = new FileInputStream(f1);
		
		//create a object of workbook
		   wb= new XSSFWorkbook(fs);
		  
		  
		
		  
		  //number of row
		int rows=  wb.getSheet("userdata").getPhysicalNumberOfRows();
		System.out.println("number of row :"+rows);
		  
		  //number of cell
		int cells=wb.getSheet("userdata").getRow(2).getPhysicalNumberOfCells();
		System.out.println("number of cell :"+cells);
		
		//crate a array same size of file 
		data=new Object [rows-1] [cells];

		
		for(int a=1;a<rows;a++)
		{
			for(int c=0;c<cells;c++)
			{
				 
				data[a-1][c]=wb.getSheet("userdata").getRow(a).getCell(c).getStringCellValue();
			      
			}
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
	
	return data;
	  
	  
	}
}
