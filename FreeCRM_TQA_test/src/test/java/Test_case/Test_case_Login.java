package Test_case;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;

public class Test_case_Login extends Base_class {
	Login_Logout_page_object login_obj;
	Base_class base;
	
	public Test_case_Login() throws IOException {
		super();
	     }
	@BeforeMethod
	public void Setup() throws InterruptedException, IOException {
		
		Initialization();
	 try {
		login_obj = new Login_Logout_page_object();
	} catch (IOException e) {
		e.printStackTrace();
	}
	 //java.lang.NullPointerException: Cannot invoke "Page_Objects.Home_Page_Object.Home_button_validation()" because "Test_case.Test_Case_Home.Home_page_tc" is null

	}
	
	
    @Test (priority = 1)
    public void TC_1() throws InterruptedException {
	login_obj.validateLoginPageTitle();
	
    }
    
    @Test (priority = 2)
    public void TC_2() throws InterruptedException {
	login_obj.validate_Forgot_pw_Logo();
	
    }
    
    @Test (priority = 3)
    public void TC_3() throws InterruptedException {
	login_obj.validate_classic_crm_Login();
	
    }
    
    @Test (priority = 4)
    public void TC_4() throws InterruptedException {
	login_obj.login();
	Thread.sleep(8000);
	
    }
    
    @Test (priority = 5)
    public void TC_5() throws InterruptedException {
	login_obj.logOut();
	Thread.sleep(8000);
	
    }
    



    @AfterMethod
    public void teardown() {
	driver.close();
    }
	
	
}
