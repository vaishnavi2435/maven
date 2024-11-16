package pratice.Data_Driven_FrameWork_UsingExcell_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcellReadingTest
{
  @Test
  public void fileRead() throws IOException
  {
	  
	  //path of the file
	  File f1=new File(System.getProperty("user.dir")+"//Excell.folder//Excelldata.xlsx");
	  
	  //read in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //logic: wb-->sheet-->row-->cell-->value
	  
	  //Workbook object
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of rows: "+rows);
	  
	  //number of cells
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of cells: "+cells);
	  
	  //create array of same size like file
	  Object data[][]=new Object[rows][cells];
	  
	  //Iterate array and pass data from file to array
	  for(int i=1;i<rows;i++)
	  {
		  
		  for(int j=0;j<cells;j++)
		  {
			  
			  data[i][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i][j]+"      ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
