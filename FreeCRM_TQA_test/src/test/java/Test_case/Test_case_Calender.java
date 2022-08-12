package Test_case;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Calender_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.Read_Excel;

public class Test_case_Calender extends Base_class {

	public Calender_Page_Object Calender_object;
	public Login_Logout_page_object  Login;
	public Test_case_Calender() throws IOException {
		super();
		
	}

	@Parameters("Browser")
	@BeforeMethod
	public void Intialization_Calender_page(String Browser) throws Exception, IOException {
		Initialization(Browser);
		Thread.sleep(3000);
		Calender_object = new Calender_Page_Object();
		Login= new Login_Logout_page_object();
		Login.login();
		
	}
	
	@DataProvider
	public Object[][] Calender_data() throws Throwable {
		
		 Object data [][] = Read_Excel.Excel_Data("Calender_Data");
		 return data;
	}
	
	@Test(priority = 1, dataProvider = "Calender_data")
	public void Calender_TC_1(String Month_Year , String Date, String Title,String Category,
			String Description, String Location, String Alert_Before, String Identifier) throws Throwable {
		Calender_object.Mandatory_field(Month_Year, Date, Title, Category, Description, Location, Alert_Before, Identifier);
		
		
	}
	
	@Test(priority = 1, dataProvider = "Calender_data")
	public void Calender_TC_2(String Month_Year , String Date, String Title,String Category,
			String Description, String Location, String Alert_Before, String Identifier) throws Throwable {
		Calender_object.Create_Event(Month_Year, Date, Title, Category, Description, Location, Alert_Before, Identifier);
		
		
	}
	
	
	@AfterMethod
	public void Tear_Down() {
		
		driver.quit();
		
	}
	

}
