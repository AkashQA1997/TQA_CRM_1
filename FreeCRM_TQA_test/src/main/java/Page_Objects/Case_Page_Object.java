package Page_Objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Base.Base_class;

public class Case_Page_Object extends Base_class {

	
	@FindBy(xpath="//span[contains(text(),'Cases')]")
	WebElement Case_tab;
	
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement Create_Case;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save_Case;
	
	@FindBy(xpath="//span[contains(text(),'The field Title is required')]")
	WebElement Required_Field_bol;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement Case_Title;
	
	//DropDowns
	
	@FindBy(xpath="//label[text()='Assigned To']//parent::div//child::div[@class='ui fluid multiple selection dropdown']")
	WebElement Assigned_To_Dropdown;
	
	@FindBy(xpath="//label[text()='Type']//parent::div//child::div[@class='ui selection dropdown']")
	WebElement Type_Dropdown;
	
	@FindBy(xpath="//label[text()='Priority']//parent::div//child::div[@class='ui selection dropdown']")
	WebElement Priority_Dropdown;
	
	@FindBy(xpath="//label[text()='Status']//parent::div//child::div[@class='ui selection dropdown']")
	WebElement Status_Dropdown;
	
	@FindBy(xpath="//label[text()='Company']//parent::div//child::div[@class='ui fluid search selection dropdown']")
	WebElement Company_Dropdown;
	
	//SearchFields
	
	@FindBy(xpath="//label[text()='Contact']//parent::div//child::div[@class='ui fluid search selection dropdown']")
	WebElement Contact_Search;
	
	@FindBy(xpath="//label[text()='Deal']//parent::div//child::div[@class='ui fluid search selection dropdown']")
	WebElement Deals_Search;
	
	@FindBy(xpath="//label[text()='Tags']//parent::div//child::div[@class='ui fluid multiple search selection dropdown']")
	WebElement Tags_Search;
	
    //Test_Fields
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement Description_text_field;
	
	@FindBy(xpath="//input[@name='identifier']")
	WebElement Identifier_text_field;
	
	//ClanderFileds
	
	@FindBy(xpath="//label[text()='Deadline']//parent::div//child::input[@class='calendarField']")
	WebElement Deadline_calender;
	
	@FindBy(xpath="//label[text()='Close Date']//parent::div//child::input[@class='calendarField']")
	WebElement CloseDate_calender;
	
	
	
	
	
	
public Case_Page_Object() throws IOException {
		
	PageFactory.initElements(driver, this);
 }
	
	
	
public void RequiredField_Check() {
		
	Case_tab.click();
	Create_Case.click();
	Save_Case.click();
	boolean bol_required = Required_Field_bol.isDisplayed();
	Assert.assertEquals(true, bol_required);
		
		
		
 }
	
	
public void Create_New_Case(String Title,String Assigned_To,String Contact,String Company,String Deal,String Type, String Deadline_Month,
String Close_Month,String Tags,String Description,String Priority,String Status,String Identifier, String Date_Closing,String Date_Deadline ) {
	
	Case_tab.click();
	Create_Case.click();
	Case_Title.sendKeys(Title);
	Assigned_To_Dropdown.click();
	List<WebElement> Assign_List = driver.findElements(By.xpath("//div[@class='visible menu transition']//child::span"));
	for(WebElement Assign_Ele : Assign_List ) {
         String Assign_Text =	Assign_Ele.getText();
		
		if(Assign_Text.equalsIgnoreCase(Assigned_To)) {
			Assign_Ele.click();
		}
	}
	
	Status_Dropdown.click();
	List<WebElement> List_Status = driver.findElements(By.xpath("//div[@class='visible menu transition']//child::span"));
	System.out.println(List_Status);
	for(WebElement Ele_Status : List_Status) {
		String Status_Text = Ele_Status.getText();
		if(Status_Text.equalsIgnoreCase(Status)) {
			Ele_Status.click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	Deadline_calender.click();
	
	while(true) {
		
		String MM_YY = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		if(MM_YY.equals(Deadline_Month)) {
			break;
		}else {
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
	}
	
	List<WebElement> DeadlineDate_List = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
	for(WebElement Ele_date : DeadlineDate_List ) {
		
		String Date = Ele_date.getText();
		if(Date.equalsIgnoreCase(Date_Deadline)) {
			
			Ele_date.click();
		}
		
		
	}
	
	CloseDate_calender.click();
     while(true) {
		
		String MM_YY = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		if(MM_YY.equals(Close_Month)) {
			break;
		}else {
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
	}
	
	List<WebElement> CloseDate_List = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
	for(WebElement Ele_date : CloseDate_List ) {
		
		String Date = Ele_date.getText();
		if(Date.equalsIgnoreCase(Date_Closing)) {
			
			Ele_date.click();
		}
		
		
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
