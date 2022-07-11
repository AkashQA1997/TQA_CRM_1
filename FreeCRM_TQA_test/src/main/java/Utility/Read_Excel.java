package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel {

 public static Workbook WorkBook;
 public static Sheet sheet;
	
     public static Object[][] Excel_Data(String Sheet_Name) throws InvalidFormatException, IOException {
    	 

	    FileInputStream file = new FileInputStream("C:\\Users\\user 1\\git\\TQA_CRM_Test_\\FreeCRM_TQA_test\\Data_From Excel_File\\TEST_Excel.xlsx");
			

			WorkBook = WorkbookFactory.create(file);
			
	

			sheet = WorkBook.getSheet(Sheet_Name);
			Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
    	 for(int i = 0; i<sheet.getLastRowNum(); i++) {
    		 for(int k = 0; k<sheet.getRow(0).getLastCellNum();i++) {
    			 
    			 data[i][k]=sheet.getRow(i).getCell(k).toString();
    		
    		 }
    	 }
    	 return data;
    	 
    	 
    	 
     }

	
	
}
