package Test_case;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.MyScreenRecorder;
import Utility.Read_Excel;


public class Test_Case_Login extends Base_class {
	Login_Logout_page_object login_obj;
	Base_class base;
	
	public Test_Case_Login() throws IOException {
		super();
	     }
	@BeforeMethod
	@Parameters("Browser")
	public void Setup_Test_Case_Login(String Browser) throws InterruptedException, IOException {
		
		Initialization(Browser);
	 try {
		login_obj = new Login_Logout_page_object();
	} catch (IOException e) {
		e.printStackTrace();
	}
	

	}
	
	
    @Test (priority = 1 )
    private void Login_TC_1() throws Exception {
    MyScreenRecorder.startRecording("Login_TC_1");
	login_obj.validateLoginPageTitle();
	MyScreenRecorder.stopRecording();
	
    }
    
    @Test (priority = 2)
    private void Login_TC_2() throws Throwable {
    MyScreenRecorder.startRecording("Login_TC_2");
	login_obj.validate_Forgot_pw_Logo();
	MyScreenRecorder.stopRecording();
    }
    
    @Test (priority = 3 , dataProvider = "Login_Check" )
    private void Login_TC_6(String User_name, String Password, String expected) throws Throwable {
    MyScreenRecorder.startRecording("Login_TC_4");
	login_obj.login_Check(User_name, Password, expected);
	Thread.sleep(4000);
	MyScreenRecorder.stopRecording();
	
    }
    
	  @DataProvider (name = "Login_Check")
	  public Object[][] Excel_Data_Login() throws InvalidFormatException, IOException {
	 	
	  Object [][] data = Read_Excel.Excel_Data("Login_data");
		
	  return data;
	
		
	  }
	  
	  
    
    @Test (priority = 4)
    private void Login_TC_3() throws Throwable {
    MyScreenRecorder.startRecording("Login_TC_3");
	login_obj.validate_classic_crm_Login();
	MyScreenRecorder.stopRecording();
    }
    
    @Test (priority = 5 )
    private void Login_TC_4() throws Throwable {
    MyScreenRecorder.startRecording("Login_TC_4");
	login_obj.login();
	Thread.sleep(4000);
	MyScreenRecorder.stopRecording();
    }


    
    @Test (priority = 5)
    private void Login_TC_5() throws Throwable {
    MyScreenRecorder.startRecording("Login_TC_5");
	login_obj.logOut();
	Thread.sleep(4000);
	MyScreenRecorder.stopRecording();
    }
    



    @AfterMethod
    private void teardown() {
	driver.close();
    }
	
	
}
