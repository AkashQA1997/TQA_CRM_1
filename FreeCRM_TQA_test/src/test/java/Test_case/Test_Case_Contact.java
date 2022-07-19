package Test_case;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Contact_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.MyScreenRecorder;
import Utility.Read_Excel;

public class Test_Case_Contact extends Base_class {
	public Login_Logout_page_object Login;
	   public Contact_Page_Object Contact_page_tc;
	   String sheetName = "contacts";
	public Test_Case_Contact() throws IOException {
		super();

	}
	@BeforeMethod
	@Parameters("Browser")
	public void Setup_Test_Case_Contact(String Browser) throws InterruptedException, IOException {
		Initialization(Browser);
		Thread.sleep(4000);
		Login = new Login_Logout_page_object();
		Contact_page_tc = new Contact_Page_Object();
		Thread.sleep(2000);
		Login.login();
		
	}
	 @Test(priority = 1 )
	 public void Contact_TC_1() throws Exception {
		 MyScreenRecorder.startRecording("Contact_TC_1");
		 Contact_page_tc.Mandatory_Check();
		 MyScreenRecorder.stopRecording();
	 }
		

     
		 
		 
	
		
		  @Test(priority = 2 ) 
		  public void Contact_TC_2( //String First_Name, String Middle_Name, String Last_Name, String Description, String State_Address, String City_Address,
		  //String State, String PostCode, String Mobilenumber, String Department,
		  //String Position
		  ) throws Throwable {
		  MyScreenRecorder.startRecording("Contact_TC_2");
		  Contact_page_tc.Create_Contact();
		  MyScreenRecorder.stopRecording();
		  
		  }
		 
	 
     @DataProvider
     public Object[][] Excel_data_Contact() throws IOException, InvalidFormatException{
    	 
    	Object[][] data =  Read_Excel.Excel_Data(sheetName);
    	System.out.print(data);
    	return data;
     }
		
		  @Test(priority = 3) 
		  private void Contact_TC_3() throws Exception {
		  MyScreenRecorder.startRecording("Contact_TC_3");
		  Contact_page_tc.Verify_Contact();
		  MyScreenRecorder.stopRecording();
		  
		  
		  }
		  
		  @Test(priority = 4) 
		  private void Contact_TC_4() throws Throwable {
		  MyScreenRecorder.startRecording(" Contact_TC_4");
		  Contact_page_tc.Delete_contact(); 
		  MyScreenRecorder.stopRecording();
		  
		  
		  }
		 
	 
		
	@AfterMethod 
    private void 
    tear_down() { 
	driver.close();
	}
		 
}	 
