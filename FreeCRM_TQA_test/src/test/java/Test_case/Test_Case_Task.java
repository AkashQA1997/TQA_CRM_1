package Test_case;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Login_Logout_page_object;
import Page_Objects.Task_Page_Object;
import Test_Base.Base_class;
import Utility.MyScreenRecorder;
import Utility.Read_Excel;

public class Test_Case_Task extends Base_class {

	public Task_Page_Object Task_Object;
	public Login_Logout_page_object Login;

	
	public Test_Case_Task() throws IOException {
		super();
		
	}
	@Parameters("Browser")
	@BeforeMethod
	public void Intialization_Task(String Browser) throws IOException, Throwable {
		
		Initialization(Browser);
		Thread.sleep(2000);
		Login = new Login_Logout_page_object();
		Thread.sleep(2000);
		Login.login();
		
		Task_Object = new Task_Page_Object();
		
		
		
	}
	
	
	@Test(priority = 1, dataProvider = "Task_excel_data")
	
	public void Task_TC_1(String Title, String Due_Month, String Close_Month, 
	String  Completion, String Identifier, String Due_Date, 
	String Close_Date, String Type, String Description, String Status, String Priority) throws Throwable {
		MyScreenRecorder.startRecording("Task_TC_2");
		
		Task_Object.Fill_Task_form(Title, Due_Month, Close_Month, Completion, Identifier, Due_Date, 
				Close_Date, Type, Description, Status, Priority );
		
		
	}
	
	
	@DataProvider()
	public Object[][] Task_excel_data() throws Throwable{
		
		Object data [][] = Read_Excel.Excel_Data("Task_Data");
		
		return data;
	}
	
	
	@Test (priority = 2)
	public void Task_TC_2() throws Exception {
		Task_Object.Delete_task();
		
	}
	
	  @AfterMethod public void Tear_down() { 
		  driver.close();
	  
	  }
	 
	

}
