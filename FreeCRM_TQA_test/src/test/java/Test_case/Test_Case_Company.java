package Test_case;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Company_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;

public class Test_Case_Company extends Base_class {

	public Login_Logout_page_object  Login;
	public Company_Page_Object Company_object;
	
	public Test_Case_Company() throws IOException {
		super();
		
	}
	@BeforeMethod
	@Parameters("Browser")
	public void Setup_Test_Case_Company(String Browser) throws InterruptedException, IOException {
		
		Initialization(Browser);
		Thread.sleep(3000);
		Login= new Login_Logout_page_object();
		Company_object = new Company_Page_Object();
		Login.login();
	}
	
     @Test (priority = 1)
        public void Comapny_TC_1() throws Throwable {
        Company_object.Company_creation_form_mandatory_fields();
    	 
     }
     
		
	 @Test (priority = 2)
	 public void Comapny_TC_2() throws Throwable {
		 Company_object.Create_Company();
		  
		  }
		  
	 @Test (priority = 3)
	 public void Comapny_TC_3() {
		 Company_object.Create_Varify();
		  
		  }
		  
	@Test (priority = 4)
	public void Comapny_TC_4() throws Throwable {
		 Company_object.Delete_Comany();
		  
		  }
		 


	
	@AfterMethod
	public void  Tear_Down() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
