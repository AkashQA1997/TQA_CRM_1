package Test_case;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Contact_Page_Object;
import Page_Objects.Home_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.Read_Excel;

public class Test_Case_Contact extends Base_class {
	public Login_Logout_page_object Login;
	   public Contact_Page_Object Contact_page_tc;
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
	 @Test(priority = 1)
	 public void Contact_TC_1() throws InterruptedException {
     
		 Contact_page_tc.Mandatory_Check();
	 }
		/*
		 * @DataProvider public Object[][] Excel_data() throws InvalidFormatException{
		 * Object[][] data = Read_Excel.getTestData("Data"); System.out.println(data);
		 * 
		 * return data; }
		 */
	
	 @Test(priority = 2)
		public void Contact_TC_2(/*
							 * String Username, String Password, String First_Name, String Middle_Name,
							 * String Last_Name , String Email, String Description, String State_Address,
							 * String City_Address, String State, String PostCode, String Mobilenumber,
							 * String Department , String Position
							 */) throws InterruptedException {
     
		 Contact_page_tc.Create_Contact();
	
	 }
	 @Test(priority = 3)
	 public void Contact_TC_3() throws InterruptedException {
	     
		 Contact_page_tc.Verify_Contact();
	 
	 

     }
	 
		
		  @AfterMethod 
		  public void tear_down() { driver.close(); }
		 
}	 
