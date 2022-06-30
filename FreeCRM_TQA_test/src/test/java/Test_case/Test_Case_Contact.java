package Test_case;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Objects.Contact_Page_Object;
import Page_Objects.Home_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;

public class Test_Case_Contact extends Base_class {
	public Login_Logout_page_object Login;
	   public Contact_Page_Object Contact_page_tc;
	public Test_Case_Contact() throws IOException {
		super();

	}
	@BeforeMethod
	public void intialization_contact_page() throws InterruptedException, IOException {
		Initialization();
		Thread.sleep(4000);
		Login = new Login_Logout_page_object();
		Login.login();
		Contact_page_tc = new Contact_Page_Object();
		Thread.sleep(4000);
		
	}
	 @Test(priority = 1)
	 public void TC_1() throws InterruptedException {
     
		 Contact_page_tc.Mandatory_Check();
	 }
	
	 @Test(priority = 2)
	 public void TC_2() throws InterruptedException {
     
		 Contact_page_tc.Create_Contact();
	
	 }
	 @Test(enabled= false)
	 public void TC_3() throws InterruptedException {
	     
		 Contact_page_tc.Verify_Contact();
	 
	 

     }
	 
		
		  @AfterMethod public void tear_down() { driver.close(); }
		 
}	 
