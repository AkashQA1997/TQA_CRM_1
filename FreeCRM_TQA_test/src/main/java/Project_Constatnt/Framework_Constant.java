package Project_Constatnt;

public final class Framework_Constant {

	private Framework_Constant() {	
		
	}
	
	//Configuration file path
	private static final String Properties_File_path =".\\Cofig_Folder\\config.properties"; 
	public static String getPropertiesFilePath() {
		return Properties_File_path;
	}
	
	//Failed screenshot file path
	
	private static final String Failed_Screenshot_path =".\\Failed_Screenshots\\";
	
	public static String getFailedScreenshotPath() {
		return Failed_Screenshot_path;
	}

	//Excel file path

	private static final String Excel_File_path =".\\Data_From Excel_File\\TEST_Excel.xlsx";
	public static String getExcelFilePath() {
		return Excel_File_path;
	}
}
