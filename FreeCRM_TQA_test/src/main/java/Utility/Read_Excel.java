package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {//Excel_Data


	
	
   public static  Object[][] Excel_Data(String Sheet_Name) throws IOException {
	   
	   FileInputStream  Excelfile = new FileInputStream(".\\Data_From Excel_File\\TEST_Excel.xlsx");
	   
	
		Workbook workBook = new XSSFWorkbook(Excelfile);
	
	    Sheet sheet = workBook.getSheet(Sheet_Name);
	   
	  
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
