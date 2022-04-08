package Excelsheet_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		
		
		
		 FileInputStream MyFile = new FileInputStream("D:\\selenium java drivers\\testcase.xlsx");

		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		CellType type1 = Mysheet.getRow(0).getCell(0).getCellType();
		CellType type2 = Mysheet.getRow(0).getCell(1).getCellType();
		CellType type3 = Mysheet.getRow(0).getCell(2).getCellType();
		CellType type4 = Mysheet.getRow(0).getCell(3).getCellType();
		
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		
		String value1 = Mysheet.getRow(0).getCell(0).getStringCellValue();
		double value2 = Mysheet.getRow(0).getCell(1).getNumericCellValue();
		boolean value3 = Mysheet.getRow(0).getCell(2).getBooleanCellValue();
		String value4 = Mysheet.getRow(0).getCell(3).getStringCellValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
