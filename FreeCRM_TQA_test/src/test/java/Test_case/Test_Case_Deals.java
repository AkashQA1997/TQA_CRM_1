package Test_case;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Contact_Page_Object;
import Page_Objects.Deals_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;

public class Test_Case_Deals extends Base_class {

	
	public Login_Logout_page_object Login;
	public Deals_Page_Object Deals_page;
	
	public Test_Case_Deals() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	@Parameters("Browser")
	public void Setup_Test_Case_Contact(String Browser) throws InterruptedException, IOException {
		Initialization(Browser);
		Thread.sleep(4000);
		Login = new Login_Logout_page_object();
		Deals_page = new Deals_Page_Object();
	    Thread.sleep(2000);
	    Login.login();
	}
	
	@Test (priority = 1)
	private  void Deals_page_TC_2() throws Throwable {
		Deals_page.Create_Deals();
		
		
	}
	
	@Test(priority = 2, dependsOnMethods= {"Deals_page_TC_2"})
	private  void Deals_page_TC_3() throws Throwable {
		Deals_page.Change_Stage();
		
		
	}
	

}
