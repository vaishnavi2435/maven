package com.TestnNG.Datadriven___using.Excellformat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataDriven_using_Excelldata_file {
 

@Test
  public void readdataformExcell() throws IOException
  {
	 
	
	
	//create a path
	  File f1=new File(System.getProperty("user.dir")+"//Excell.folder//Excelldata.xlsx");
	  
	  //read data in the Stream
	  FileInputStream fs=  new FileInputStream(f1);
	  
	  //create a object of workbook
	  XSSFWorkbook wb= new XSSFWorkbook(fs);
	  
	  //sing variable to find use this 
	//String value=  wb.getSheet("userdata").getRow(2).getCell(0).getStringCellValue();
	//System.out.println(value);
	  
	  //number of row
	int rows=  wb.getSheet("userdata").getPhysicalNumberOfRows();
	System.out.println("number of row :"+rows);
	  
	  //number of cell
	int cells=wb.getSheet("userdata").getRow(2).getPhysicalNumberOfCells();
	System.out.println("number of cell :"+cells);
	
	//crate a array same size of file 
	//iterator the array
	
	
	
	Object data [][]=new Object [rows-1][cells];//Skip heading
		
			
		
		
	
		

	
	for(int a=1;a<rows;a++)
	{
		for(int c=0;c<cells;c++)
		{
			 data[a-1][c]=wb.getSheet("userdata").getRow(a).getCell(c).getStringCellValue();
		      System.out.print(data[a-1][c]+"   ");
		}
		System.out.println();
	
		
	}
	  
	  
	  
  }
}
