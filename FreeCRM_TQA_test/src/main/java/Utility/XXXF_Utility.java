package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Project_Constatnt.Framework_Constant;

public class XXXF_Utility {
	
	public Object[] Read_EXCEL(String Sheetname) throws IOException {
		

		FileInputStream file1 = new FileInputStream(Framework_Constant.getExcelFilePath());
		XSSFWorkbook workbook1 = new XSSFWorkbook(file1);
		Sheet sheet1 = workbook1.getSheet(Sheetname);
		
		Object[] data1 = new Object[sheet1.getLastRowNum()];
		
		Map<Object,Object> map;
		
		for(int i=0;i<sheet1.getLastRowNum();i++) {
			map = new HashMap<Object,Object>();
			for(int j =0;j<sheet1.getRow(0).getLastCellNum();j++) {
				map.put(sheet1.getRow(0).getCell(j).toString(),sheet1.getRow(i+1).getCell(j).toString());
				data1[i]=map;
			}
		}
		return data1;
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
