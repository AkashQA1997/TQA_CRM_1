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
	
	
public void Create_New_Case() {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	Case_tab.click();
	Create_Case.click();
	Deadline_calender.click();
	
	while(true) {
		
		String MM_YY = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		if(MM_YY.equals("December 2022")) {
			break;
		}else {
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
	}
	
	List<WebElement> DeadlineDate_List = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
	for(WebElement Ele_date : DeadlineDate_List ) {
		
		String Date = Ele_date.getText();
		if(Date.equalsIgnoreCase("15")) {
			
			Ele_date.click();
		}
		
		
	}
	
	CloseDate_calender.click();
     while(true) {
		
		String MM_YY = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
		if(MM_YY.equals("January 2023")) {
			break;
		}else {
			driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
		}
	}
	
	List<WebElement> CloseDate_List = driver.findElements(By.xpath("//div[@class='react-datepicker__month']/div/div"));
	for(WebElement Ele_date : CloseDate_List ) {
		
		String Date = Ele_date.getText();
		if(Date.equalsIgnoreCase("15")) {
			
			Ele_date.click();
		}
		
		
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
