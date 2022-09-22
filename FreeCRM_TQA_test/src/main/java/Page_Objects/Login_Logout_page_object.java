package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import Test_Base.Base_class;


public class Login_Logout_page_object extends Base_class {
	
	



		//Page Factory - OR:
		@FindBy(xpath="//input[@placeholder= 'E-mail address']")
		WebElement username;
		
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		
		@FindBy(xpath="//div[@class= 'ui fluid large blue submit button']")
		WebElement loginBtn;
		
		@FindBy(xpath="//a[contains(text(),'Classic CRM')]")
		WebElement classic_crm_login;
		
		@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
		WebElement Forgot_pw_logo;
		
		@FindBy(xpath="//div[@id=\"main-nav\"]/div[1]/a/i")
		WebElement Check_home;
		
		@FindBy(xpath="//span[contains(text(),'Home')]")
		WebElement Move_home;

		
		@FindBy(xpath="//div[@class='ui basic button floating item dropdown']")
		WebElement Setting_button;
		
		@FindBy(xpath="//span[contains(text(),'Log Out')]")
		WebElement Logut_button;
		
		@FindBy(xpath="//form[@class='ui large form']//child::p[contains(text(),'Invalid login')]")
		WebElement Invalid_Login;
		
		@FindBy(xpath="//div[@id='top-header-menu']//child::span[contains(text(),'Akash Saha')]")
		WebElement User;

		

		public Login_Logout_page_object() throws IOException {
			PageFactory.initElements(driver, this);
	}
			



			// TODO Auto-generated constructor stub
		
 
		
		//Actions:
		  public void validateLoginPageTitle() throws InterruptedException{
		  System.out.println( driver.getTitle());
		  Thread.sleep(3000);
		  }
		
		  public void validate_Forgot_pw_Logo() throws InterruptedException{
		  Thread.sleep(3000);
		  boolean s= Forgot_pw_logo.isDisplayed();
		  System.out.println("The return value: " + s);
		  }
		
        
		  public void validate_classic_crm_Login()  {
		  boolean s= classic_crm_login.isDisplayed();
		  System.out.println("The return value: " + s);
			
		  }
	
		  public  void login() throws InterruptedException{
		      Thread.sleep(4000);
			  username.sendKeys(prop.getProperty("User_Name"));
			  Thread.sleep(3000);
			  password.sendKeys(prop.getProperty("Password"));
			  loginBtn.click();
			  

				 
			  
			  
			  
		  
		  }
		  
		
	      public  void login_Check(String User_name, String Password, String expected ) throws InterruptedException{
	      Thread.sleep(3000);
		  username.sendKeys(User_name);
		  Thread.sleep(3000);
		  password.sendKeys(Password);
		  //loginBtn.click();
		  //String inalid_Login_message = Invalid_Login.getText();
			
		  if(expected.equals("Valid")) {
		  
		  loginBtn.click(); Thread.sleep(2000); String Expected_user = User.getText();
		  if(Expected_user.equalsIgnoreCase("Akash Saha")) {
		  
		  Assert.assertTrue(true); 
		  System.out.println("Test Pass"); 
		  }else {
		  Assert.assertTrue(false);
		  
		  System.out.println("Test Fail"); }
		  
		  
		  } else
		  
		  if(expected.equals("Invalid")){
		  
		  loginBtn.click(); 
		  boolean Invalid_message_1 = Invalid_Login.isDisplayed();
		  Assert.assertEquals(true, Invalid_message_1);
		  System.out.println("Test Pass");
		  
		  }else { Assert.assertTrue(false); 
		  System.out.println("Test Fail"); 
		  }
		  Thread.sleep(5000);

		  }


	      
	     public  void logOut() throws InterruptedException {
	     username.sendKeys(prop.getProperty("User_Name"));
	     Thread.sleep(3000);
	     password.sendKeys(prop.getProperty("Password"));
	     Thread.sleep(3000);
	     loginBtn.click(); 
	     Thread.sleep(3000);
	     Setting_button.click();
	     Thread.sleep(2000);
	     Logut_button.click();
	     Thread.sleep(3000);
	     
	     }
		 
	     
           
           
           
	}



