package Excelsheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//file path is given and stored file in ref variable 
				FileInputStream MyFile= new FileInputStream("D:\\\\selenium java drivers\\\\test2.xlsx");
				
				//reading single row--> static coding
 				

					 org.apache.poi.ss.usermodel.Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
					for(int i=0;i<=3;i++) 
						
					{
					String Value = Mysheet.getRow(0).getCell(i).getStringCellValue();
					System.out.println(Value);
					}

				
				
	}

}
