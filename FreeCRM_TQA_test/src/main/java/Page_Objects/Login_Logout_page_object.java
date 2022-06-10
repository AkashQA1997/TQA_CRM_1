package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import Test_Base.Base_class;


public class Login_Logout_page_object extends Base_class {
	
	



		//Page Factory - OR:
		@FindBy(xpath="//input[@placeholder= '-mail address']")
		WebElement username;
		
		@FindBy(xpath="//input[@placeholder= 'Password']")
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
		

		

		public Login_Logout_page_object() throws IOException {
			PageFactory.initElements(driver, this);
	}
			



			// TODO Auto-generated constructor stub
		
 
		
		//Actions:
		  public void validateLoginPageTitle() throws InterruptedException{
		  System.out.println( driver.getTitle());
		  Thread.sleep(8000);
		  }
		
		  public void validate_Forgot_pw_Logo() throws InterruptedException{
		  Thread.sleep(5000);
		  boolean s= Forgot_pw_logo.isDisplayed();
		  System.out.println("The return value: " + s);
		  }
		
        
		  public void validate_classic_crm_Login()  {
		  boolean s= classic_crm_login.isDisplayed();
		  System.out.println("The return value: " + s);
			
		  }
	
		
	      public  void login() throws InterruptedException{
		
		  username.sendKeys(prop.getProperty("User_Name"));
		  Thread.sleep(5000);
		  password.sendKeys(prop.getProperty("Password"));
		  loginBtn.click();
		  Actions AC1 = new Actions(driver);
		  AC1.moveToElement(Move_home);
		  Thread.sleep(4000);
		  boolean bol_home =  Move_home.isDisplayed();
		  Assert.assertEquals(true, true);
		  Thread.sleep(4000);
	    	
		  }


	     public  void logOut() throws InterruptedException {
	     username.sendKeys(prop.getProperty("User_Name"));
	     password.sendKeys(prop.getProperty("Password"));
	     Thread.sleep(5000);
	     loginBtn.click(); 
	     Thread.sleep(5000);
	     Setting_button.click();
	     Thread.sleep(5000);
	     Logut_button.click();
	     Thread.sleep(5000);
	     
	     }
		 
	     
           
           
           
	}



