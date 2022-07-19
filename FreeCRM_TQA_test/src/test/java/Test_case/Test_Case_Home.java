package Test_case;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Home_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.MyScreenRecorder;

public class Test_Case_Home extends Base_class {
   public Login_Logout_page_object Login;
   public Home_Page_Object Home_page_tc;
	public Test_Case_Home() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
 
	@BeforeMethod
	@Parameters("Browser")
	public void Setup_Test_Case_Home(String Browser) throws InterruptedException, IOException {
		Initialization(Browser);
		Thread.sleep(4000);
		Login = new Login_Logout_page_object();
		Home_page_tc = new Home_Page_Object();
		Login.login();
		
		
	}
	
	@Test(priority =1)
	private void Home_TC1() throws Exception {
		MyScreenRecorder.startRecording("Home_TC1");
		Thread.sleep(4000);
		Home_page_tc.Home_button_validation();
		MyScreenRecorder.stopRecording();
	}
	@Test(priority =2)
	private void  Home_TC2() throws Exception {
		MyScreenRecorder.startRecording("Home_TC2");
		Thread.sleep(4000);
		Home_page_tc.First_hader_validation();
		MyScreenRecorder.stopRecording();
	}
	@Test(priority =3)
	private void  Home_TC3() throws Throwable {
		MyScreenRecorder.startRecording("Home_TC3");
		Thread.sleep(4000);
		Home_page_tc.Second_hader_validation();
		MyScreenRecorder.stopRecording();
	}
	@Test(priority =4)
	private void  Home_TC4() throws Throwable {
		MyScreenRecorder.startRecording("Home_TC4");
		Thread.sleep(4000);
		Home_page_tc.Forth_hader_validation();
		MyScreenRecorder.stopRecording();
	}
	@Test(priority =5)
	private void  Home_TC5() throws Throwable {
		MyScreenRecorder.startRecording("Home_TC5");
		Thread.sleep(4000);
		Home_page_tc.Fifth_hader_validation();
		MyScreenRecorder.stopRecording();
		
	}
	
	
	
	@AfterMethod
	private void teardown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
