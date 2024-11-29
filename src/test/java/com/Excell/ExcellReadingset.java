package com.Excell;





	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.*;
	import org.testng.annotations.Test;

	public class ExcellReadingset 
	{
	  @Test
	  public void fileRead() throws IOException
	  {
		  
		  //path of the file
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //read in stream
		  FileInputStream fs=new FileInputStream(f1);
		  
		  //logic: wb-->sheet-->row-->cell-->value
		  
		  //Workbook object
		  XSSFWorkbook wb=new XSSFWorkbook(fs);
		  
		  //number of rows
		  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
		  System.out.println("Number of rows: "+rows);//6
		  
		  //number of cells
		  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
		  System.out.println("Number of cells: "+cells);//2
		  
		  //create array of same size like file
		  Object data[][]=new Object[rows-1][cells];//5 rows
		  
		  //Iterate array and pass data from file to array
		  for(int i=1;i<rows;i++)//skip heading
		  {
			  
			  for(int j=0;j<cells;j++)
			  {
				  //array index always start with 0
				  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
				  System.out.print(data[i-1][j]+"      ");
			  }
			  System.out.println();
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  //to read single entry
//		  String value=wb.getSheet("userdata").getRow(4).getCell(0).getStringCellValue();
//		  
//		  System.out.println(value);
	//	
		  
		  /*
		 XSSFSheet sheet1= wb.getSheet("userdata");
		 XSSFRow row=sheet1.getRow(2);
		 XSSFCell cell=row.getCell(0);
		 String value=cell.getStringCellValue();
		 System.out.println(value);*/
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
	}

}
