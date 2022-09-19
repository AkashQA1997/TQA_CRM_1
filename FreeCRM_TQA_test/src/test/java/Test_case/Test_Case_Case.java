package Test_case;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Case_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;
import Utility.Read_Excel;

public class Test_Case_Case extends Base_class {


public Login_Logout_page_object login_Obj;
public Case_Page_Object Case_obj;
	
@Parameters ("Browser")	
@BeforeMethod
public void initialization_Case_Object(String Browser) throws InterruptedException, IOException {
	
	Initialization( Browser);
	login_Obj = new Login_Logout_page_object();
	Case_obj = new Case_Page_Object();
	login_Obj.login();
	
	
	
}

@DataProvider(name = "Case_Data")
public Object[][] Excel_Case_Data() throws Throwable{
	
	Object[][] data = Read_Excel.Excel_Data("Case_Data");
	
	return data;
}

	
@Test (dataProvider ="Case_Data" )
public void Test_Case_Case_TC_1(String Title,String Assigned_To,String Contact,String Company,String Deal,String Type, String Deadline_Month,
		String Close_Month,String Tags,String Description,String Priority,String Status,String Identifier, String Date_Closing,String Date_Deadline ) {
	
	Case_obj.Create_New_Case(Title, Assigned_To, Contact, Company, Deal, Type, Deadline_Month, Close_Month, Tags, Description, Priority, Status, Identifier, Date_Closing, Date_Deadline);
	
}
	
	
	
	
	
	
	
	
	
	
	
}
