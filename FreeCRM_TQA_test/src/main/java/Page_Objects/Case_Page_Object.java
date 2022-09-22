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
	
	@FindBy(xpath="//label[text()='Company']//parent::div//child::div[@class='ui active visible fluid search selection dropdown']/input")
	WebElement Company_Dropdown_Text;
	
	
	//SearchFields
	
	@FindBy(xpath="//label[text()='Contact']//parent::div//child::div[@class='ui fluid search selection dropdown']")
	WebElement Contact_Search;
	
	@FindBy(xpath="//label[text()='Contact']//parent::div//child::div[@class='ui active visible fluid search selection dropdown']/input")
	WebElement Contact_Search_Text;
	
	@FindBy(xpath="//div[@class='selected item addition']")
	WebElement Contact_Search_Text_Add;
	
	
	
	@FindBy(xpath="//label[text()='Deal']//parent::div//child::div[@class='ui fluid search selection dropdown']")
	WebElement Deals_Search;
	
	@FindBy(xpath="//div[@class='ui active visible fluid search selection dropdown']/input")
	WebElement Deals_Search_text;
	
	
	@FindBy(xpath="//label[text()='Tags']//parent::div//child::div[@class='ui fluid multiple search selection dropdown']")
	WebElement Tags_Search;
	
	@FindBy(xpath="//div[@class='ui active visible fluid multiple search selection dropdown']/input")
	WebElement Tags_Text;
	
	@FindBy(xpath="//span[text()='Add ']//ancestor::div[@class='selected item addition']")
	WebElement Tags_Add;
	
	
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
	
	@FindBy(xpath="//child::button[@class='ui button']")
	WebElement Bin_Delete_Button;

	//filter
	
	@FindBy(xpath="//button[text()='Show Filters']")
	WebElement Show_Filter_Button;
	
	@FindBy(xpath="//div[text()='Search']//parent::div//child::i[@class='dropdown icon']")
	WebElement Title_Dropdown;
	
	@FindBy(xpath="//span[text()='Title']")
	WebElement Title_Select;
	
	@FindBy(xpath="//div[text()='Operator']//parent::div//child::i[@class='dropdown icon']")
	WebElement Operator_Dropdown;
	
	@FindBy(xpath="//span[text()='Equals']")
	WebElement Operator_Select;
	
	@FindBy(xpath="//input[@placeholder='Value']")
	WebElement Value_Select;
	
	@FindBy(xpath="//div[text()='User']//parent::div//child::i[@class='dropdown icon']")
	WebElement Value_User;
	
	@FindBy(xpath="//div[text()='Akash Saha']")
	WebElement Value_User_select;
	
	
	
	
	@FindBy(xpath="//i[@class='search small icon']//parent::button")
	WebElement Search_Select;
	
	
	
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
String Close_Month,String Tags,String Description,String Priority,String Status,String Identifier, String Date_Closing,String Date_Deadline ) throws InterruptedException {
	
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
	
	Priority_Dropdown.click();
	List<WebElement> List_Priorities = driver.findElements(By.xpath("//div[@class='visible menu transition']//child::span"));
	for(WebElement Web_priority : List_Priorities) {
		String Priorities_Select = Web_priority.getText();
		if(Priorities_Select.equalsIgnoreCase(Priority)) {
			Web_priority.click();
		}
		
	}
	
	Contact_Search.click();
	Contact_Search_Text.sendKeys(Contact);
	
	driver.findElement(By.xpath("//span[contains(text(),'"+Contact+"')]")).click();
	
	
	Deals_Search.click();
	Deals_Search_text.sendKeys(Deal);
	driver.findElement(By.xpath("//span[contains(text(),'"+Deal+"')]")).click();
	
	Tags_Search.click();
	Tags_Text.sendKeys(Tags);
    Tags_Add.click();
    
    Company_Dropdown.click();
    Company_Dropdown_Text.sendKeys(Company);
    driver.findElement(By.xpath("//span[contains(text(),'"+Company+"')]")).click();

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
	
	Description_text_field.sendKeys(Description);
	Identifier_text_field.sendKeys(Identifier);
	Thread.sleep(2000);
	Save_Case.click();
	Thread.sleep(2000);
	boolean bol_title = driver.findElement(By.xpath("//div[text()='Title']//following::p[text()='"+Title+"']")).isDisplayed();
	Assert.assertEquals(true, bol_title);
	
	
	
}


	
	
    
	
	
	
	
	




public void Delete_New_Case(String Title,String Assigned_To,String Contact,String Company,String Deal,String Type, String Deadline_Month,
String Close_Month,String Tags,String Description,String Priority,String Status,String Identifier, String Date_Closing,String Date_Deadline ) throws InterruptedException {

	Case_tab.click();
	//driver.findElement(By.xpath("//a[text()='"+Title+"']//preceding::div[@class='ui fitted read-only checkbox']/input")).click();
	driver.findElement(By.xpath("//a[text()='"+Title+"']//ancestor::tr//child::button[@class='ui icon inverted button']")).click();
	Bin_Delete_Button.click();

	
	
	
	
}
	
	
	
	
}
