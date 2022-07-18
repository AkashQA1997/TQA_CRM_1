package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Read_Excel {//Excel_Data

	public static Workbook WorkBook;
	public static Sheet sheet;
	
	
   public static  Object[][] Excel_Data(String Sheet_Name) throws FileNotFoundException {
	   
	   FileInputStream  Excelfile = new FileInputStream("C:\\Users\\user 1\\git\\TQA_CRM_Test_\\FreeCRM_TQA_test\\Data_From Excel_File\\TEST_Excel.xlsx");
	   
	   try {
		WorkBook = WorkbookFactory.create(Excelfile);
	} catch (InvalidFormatException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   sheet = WorkBook.getSheet(Sheet_Name);
	   
	  
	   Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
	    return data;
	    
	   
	   
   }
     

	
	
}
