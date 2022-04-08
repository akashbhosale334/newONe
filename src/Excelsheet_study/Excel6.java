package Excelsheet_study;



import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\\\selenium java drivers\\\\test2.xlsx");
		 org.apache.poi.ss.usermodel.Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		 
		 //for fetching all type of data it maybe int,string,boolean,numeric
			//1.count ofno of rows and column
			int totalRowCount = Mysheet.getLastRowNum();
			int totalColumnCount = Mysheet.getRow(0).getLastCellNum()-1;
			
			
	     //2.using for loop for each 		
			for(int i=0;i<=totalRowCount;i++)// outer for row
			{
				for(int j=0;j<=totalColumnCount;j++)// inner for column
				{
					
		//3.assign values of rows and column and define type		
					 org.apache.poi.ss.usermodel.Cell info = Mysheet.getRow(i).getCell(j);
					CellType type = info.getCellType();// STRING,NUMERIC,BOOLEAN
					
 	  //4.	describe the type using elseif
				if(type==CellType.STRING)
					{
						String value = info.getStringCellValue();
						System.out.print(value+" ");
					}
					else if (type==CellType.NUMERIC)
					{
						double value = info.getNumericCellValue();
						System.out.print(value+" ");
					}
					else if (type==CellType.BOOLEAN) 
					{
					boolean value = info.getBooleanCellValue();
					System.out.print(value+" ");
					
				}
			}
				System.out.println("");
	    }
	}
	}


