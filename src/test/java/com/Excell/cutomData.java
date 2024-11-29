package com.Excell;



	

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.DataProvider;
	public class cutomData
	{
		public XSSFWorkbook wb;
		@DataProvider(name="mydata")
		public Object[][] testData()
		{
			Object data[][]= {{"Admin","admin123"},{"Rashmi","test123"},{"Sumit","test123"},{"Admin","admin123"}};
			return data;
		}
		
		@DataProvider(name="ExcelData")
		public Object[][] excelData()
		{

			  //path of the file
			  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
			  
			  //read in stream
			  FileInputStream fs;
			  Object data[][]=null;
			  
			try {
				fs = new FileInputStream(f1);
				//logic: wb-->sheet-->row-->cell-->value
				  
				  //Workbook object
				  wb=new XSSFWorkbook(fs);
				  
				  //number of rows
				  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
				  System.out.println("Number of rows: "+rows);//6
				  
				  //number of cells
				  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
				  System.out.println("Number of cells: "+cells);//2
				  
				  //create array of same size like file
				  data=new Object[rows-1][cells];//5 rows
				  
				  //Iterate array and pass data from file to array
				  for(int i=1;i<rows;i++)//skip heading
				  {
					  
					  for(int j=0;j<cells;j++)
					  {
						  //array index always start with 0
						  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
						  
					  }
					
				  }
				  
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  
			return data;  
			  
			  
		}
	}


