package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Project_Constatnt.Framework_Constant;

public class Read_Excel {
	//Excel_Data

	
   public static  Object[] Excel_Data(String Sheet_Name) throws IOException {
	   
	   FileInputStream  Excelfile = new FileInputStream(Framework_Constant.getExcelFilePath());
	   
	
		XSSFWorkbook workBook = new XSSFWorkbook(Excelfile);
	
	    Sheet sheet = workBook.getSheet(Sheet_Name);
	   
	  
	   Object[] data = new Object[sheet.getLastRowNum()];
	   Map<Object,Object> map;
	   for (int i = 0; i < sheet.getLastRowNum(); i++) {
		   map = new HashMap<>();
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				map.put(sheet.getRow(0).getCell(k).toString(), sheet.getRow(i+1).getCell(k).toString());
				data[i] = map;
				// System.out.println(data[i][k]);
			}
			
		}
	    return data;
	    
	   
	   
   }
     

	
	
}
