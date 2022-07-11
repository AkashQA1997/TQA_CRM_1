package Test_case;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Company_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.Read_Excel;

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
     private void Comapny_TC_1() throws Throwable {
        Company_object.Company_creation_form_mandatory_fields();
    	 
     }
     
     
     @DataProvider()
     public Object[][] Excel_data_Company() throws IOException, InvalidFormatException {
    	 
    	Object[][] data =  Read_Excel.Excel_Data("Company_Data");
    	 
    	 return data;
     }
     
     
		
	 @Test (priority = 2 )
	 public void Comapny_TC_2(String First_Name, String Street_Address, String City_Address, String State_Address, String Post_Code, 
				String Phone_number, String Phone_number_place,String Description,String Select_Linkedin_Profile, String Industry_type,String Number_of_Employee,
	            String Rupee_Symbol, String Annual_revenue, String Vat_Number) throws Throwable {
		 Company_object.Create_Company(First_Name, Street_Address, City_Address, State_Address, Post_Code, Phone_number,
				 Phone_number_place, Description, Select_Linkedin_Profile, Industry_type, Number_of_Employee,
				 Rupee_Symbol, Annual_revenue, Vat_Number);
		  
		  }
		  
	 @Test (priority = 3)
	 private void Comapny_TC_3() {
		 Company_object.Create_Varify();
		  
		  }
		  
	@Test (priority = 4)
	private void Comapny_TC_4() throws Throwable {
		 Company_object.Delete_Comany();
		  
		  }
		 


	
	@AfterMethod
	private void  Tear_Down() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
