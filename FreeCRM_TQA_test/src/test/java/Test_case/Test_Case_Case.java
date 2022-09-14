package Test_case;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Page_Objects.Case_Page_Object;
import Page_Objects.Login_Logout_page_object;
import Test_Base.Base_class;

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



	
@Test
public void Test_Case_Case_TC_1() {
	
	Case_obj.Create_New_Case();
	
}
	
	
	
	
	
	
	
	
	
	
	
}
