package Excelsheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javafx.scene.control.Cell;

public class Excel1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		//file path is given and stored in reference variable
	   FileInputStream MyFile = new FileInputStream("D:\\selenium java drivers\\test2.xlsx");
		    //to get data of row 0 &column 0
		String value= WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	   System.out.println("Data form excel is " +value);
		    
		    
//	  double value1= WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
//	    System.out.println("data from excel is "+value1);
//		Workbook test = WorkbookFactory.create(MyFile);
//		Sheet Mysheet = test.getSheet("Sheet1");
//		Row MyRow = Mysheet.getRow(0);
//		org.apache.poi.ss.usermodel.Cell MyCell = MyRow.getCell(0);
//		String MyValue = MyCell.getStringCellValue();
//		
//		System.out.println(Mysheet.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(Mysheet.getRow(0).getCell(2).getNumericCellValue());
	}

}
