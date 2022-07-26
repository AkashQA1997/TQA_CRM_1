package Page_Objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import Test_Base.Base_class;

public class Task_Page_Object extends Base_class {

	
	@FindBy (xpath = "//span[contains(text(),'Tasks')]")
	WebElement Task_Tab;
	
	@FindBy (xpath = "//button[contains(text(),'Create')]")
	WebElement Task_Create;
	
	@FindBy (xpath = "//input[@name='title']")
	WebElement Task_Title;
	
	@FindBy (xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[3]/div[1]/div/div/div/input")
	WebElement Task_Due_Date;
	
	@FindBy (xpath = "//*[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div/div/input")
	WebElement Task_Close_Date;
 
	@FindBy (xpath = "//div[@class='react-datepicker__current-month']")
	WebElement Month_Calender;
	
	@FindBy (xpath = "//button[contains(text(),'Next Month')]")
	WebElement Next_Month_Button;
	
	@FindBy (xpath = "//div[@class='react-datepicker__month']/div[3]/div")
	WebElement Week_List;
	
	@FindBy (xpath = "//form[@class='ui form segment custom-form-container']/div[2]/div[2]/div/div")
	WebElement Type_List_field;
	
	@FindBy (xpath = "//input[@name='completion']")
	WebElement Complition;
	
	@FindBy (xpath = "//textarea[@name='description']")
	WebElement Description_Set;
	
	@FindBy (xpath = "//input[@name='identifier']")
	WebElement Identifier_Set;
	
	@FindBy (xpath = "//button[contains(text(),'Save')]")
	WebElement Save_Button;
	

	
	
	
	
	
	
	
	
	
	
	
	public Task_Page_Object() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Fill_Task_form(String Title, String Due_Month, String Close_Month, String  Completion, 
			String Identifier, String Due_Date, String Close_Date, String Type, String Description) throws InterruptedException {
		System.out.println(Due_Date);
		System.out.println(Close_Date);
		float Due_Date_from_excel=Float.parseFloat(Due_Date);
		Integer Due_date=Math.round(Due_Date_from_excel);
		System.out.println(Due_date);
		
		float Close_Date_from_Excel = Float.parseFloat(Close_Date);
		Integer Close_date = Math.round(Close_Date_from_Excel);
		System.out.println(Close_date);

		Task_Tab.click();
		Thread.sleep(2000);
		Task_Create.click();
		Thread.sleep(2000);
		Task_Title.sendKeys(Title);
		Task_Due_Date.click();
		Thread.sleep(2000);
//Due date loop		
		 while(true) {
			  String Due_month = Month_Calender.getText();
			 String DUE_MONTH[]= Due_month.split(" ");
		  if(DUE_MONTH[0].equals(Due_Month)) {
			  break;		  
		         } 
		  else {  Next_Month_Button.click(); 
			 
			     }
		         }
		
		  List<WebElement> list_due_date = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']/div[2]/div[3]/div"));
		  System.out.println(list_due_date);
		  for (WebElement webElement1 : list_due_date) {
	      String DueDate = webElement1.getText();
	      Integer Actual_due_date= Integer.parseInt(DueDate);
	      System.out.println(DueDate);
		  if(Actual_due_date.equals(Due_date)) {
		  webElement1.click();
		    	  
		         }
		
		        }
		  Thread.sleep(2000);
//Type select Loop
		  Type_List_field.click();
		  Thread.sleep(2000);
		  List<WebElement> List_type = driver.findElements(By.xpath("//div[@class='visible menu transition']/div"));
		  System.out.println(List_type);
		  for(WebElement Types : List_type) {
			  String types = Types.getText(); 
			  if(types.equals(Type)) {
              Types.click();	  
			   }
		     }
		  Thread.sleep(2000);
		  
 // Close date Loop
		  Task_Close_Date.click();

		  
			 while(true) {
				  String month = Month_Calender.getText();
				 String MONTH[]= month.split(" ");
			  if(MONTH[0].equals(Close_Month)) {
				  break;		  
			         } 
			  else {  Next_Month_Button.click(); 
				 
				     }
			         }
			
			 
			  List<WebElement> list_close_date = driver.findElements(By.xpath("//div[@class='react-datepicker__month-container']/div[2]/div[5]/div"));
			  System.out.println(list_close_date);
			  for (WebElement webElement2 : list_close_date) {
		      String CloseDate = webElement2.getText();
		      Integer Actual_close_date= Integer.parseInt(CloseDate);
		      System.out.println(CloseDate);
			  if(Actual_close_date.equals(Close_date)) {
			  webElement2.click();
			    	  
			         }
			
			        }
			  Thread.sleep(2000);
//Completion
			  Complition.sendKeys(Completion);
			  Thread.sleep(2000);
			  Description_Set.sendKeys(Description);
			  Identifier_Set.sendKeys(Identifier);
			  //Save        
			  Thread.sleep(4000);
			  Save_Button.click();
			  Thread.sleep(4000);
			  boolean Title_present =  driver.findElement(By.xpath("//p[contains(text(),'"+Title+"')]")).isDisplayed();
			  Assert.assertEquals(true, Title_present);
	     }
	
	
	
	
	

	

	}

