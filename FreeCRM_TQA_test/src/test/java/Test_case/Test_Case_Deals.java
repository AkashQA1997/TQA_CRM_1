package Test_case;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Contact_Page_Object;
import Page_Objects.Deals_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.MyScreenRecorder;
import Utility.Read_Excel;

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
	 Thread.sleep(2000);
	 Login = new Login_Logout_page_object();
	 Deals_page = new Deals_Page_Object();
     Thread.sleep(2000);
	 Login.login();
	}
	
      @Test(priority = 1)
	  private  void Deals_page_TC_1() throws Throwable {
      MyScreenRecorder.startRecording("Deals_page_TC_1");
      Deals_page.Check_Mndatory_Fields();
      MyScreenRecorder.stopRecording(); 
	  }
	
	
	  @Test (priority = 2, dataProvider ="Excel_Data_Deals") 
	  
	  private void Deals_page_TC_2(String Title, String Probability, String Descriptions, String
	  Ammounts,String Commissions, String Next_Steps_Descriptions) throws Throwable{ 
	  MyScreenRecorder.startRecording("Deals_page_TC_2"); 
      Deals_page.Create_Deals(Title, Probability, Descriptions, Ammounts,
	  Commissions, Next_Steps_Descriptions);
      MyScreenRecorder.stopRecording();
	  
	  }
	 
	
	  @DataProvider
	  public Object[][] Excel_Data_Deals() throws InvalidFormatException, IOException {
	 	
	  Object [][] data = Read_Excel.Excel_Data("Deals_Data");
		
	  return data;
	
		
	  }
	
	  @Test(priority = 3)
	  private  void Deals_page_TC_3() throws Throwable {
	  MyScreenRecorder.startRecording("Deals_page_TC_3");
	  Deals_page.Manage_targets("5");
	  MyScreenRecorder.stopRecording();
		
	  }
	
	  @Test(priority = 4 , enabled = false)
	  private  void Deals_page_TC_4() throws Throwable {
		MyScreenRecorder.startRecording("Deals_page_TC_4");
		Deals_page.Verify_Deals_dealsFrame();
		MyScreenRecorder.stopRecording();
	
	  }
	  @Test(priority = 5)
	  private  void Deals_page_TC_5() throws Exception{
		MyScreenRecorder.startRecording("Deals_page_TC_5");
		Deals_page.Verify_Deals_Summery();
		MyScreenRecorder.stopRecording();

	  }
	
	  @Test(priority = 6)
	  private  void Deals_page_TC_6() throws Exception{
		MyScreenRecorder.startRecording("Deals_page_TC_6");
		Deals_page.Delete_targets();
		MyScreenRecorder.stopRecording();
	
	
	  }
	  
	  @Test(priority = 7,dataProvider ="Excel_Data_Deals")
	  private  void Deals_page_TC_7(String Title, String Probability, String Descriptions, String
			  Ammounts,String Commissions, String Next_Steps_Descriptions) throws Throwable{
		MyScreenRecorder.startRecording("Deals_page_TC_7");
		Deals_page.Delete_deals(Title, Probability, Descriptions, Ammounts, Commissions, Next_Steps_Descriptions);
		MyScreenRecorder.stopRecording();
	
	
	  }
	
	  @AfterMethod
	
	  public void Tear_Down() {
	  driver.quit();
	  }
	

			 
	

}
