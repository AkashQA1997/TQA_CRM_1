package Page_Objects;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Base.Base_class;

public class Deals_Page_Object extends Base_class {

	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement Deals_Tab;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement Create_Deals_Button;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save_Deals_Button;
	
	@FindBy(xpath="//span[contains(text(),'The field Title is required')]")
	WebElement Mandatory_Fields;
	
	@FindBy(xpath="//input[@name='title']")
	WebElement Title_Deals;
	
	@FindBy(xpath="//div[@class='ui fluid multiple selection dropdown']")
	WebElement Deals_Assigned_To;
	
	@FindBy(xpath="//div[@class='visible menu transition']/div[@class='selected item']/span[contains(text(),'Akash Saha')]")
	WebElement Assigned_To_person;
    
	@FindBy(xpath="//input[@name='probability']")
	WebElement Set_Probability;

	@FindBy(xpath="//textarea[@name='description']")
	WebElement Description;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement Ammount;
	
	@FindBy(xpath="//input[@name='commission']")
	WebElement Commission;
	
	@FindBy(xpath="//div[@name='stage' and @class='ui selection dropdown']")
	WebElement Stage_Dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Qualify')]")
	WebElement Stage_Select;
	
	@FindBy(xpath="//div[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/label")
	WebElement Closed_button;
	
	@FindBy(xpath="//div[@name=\"status\"]/div[contains(text(),'Select')]")
	WebElement Status_Dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Active')]")
	WebElement Status_Select;
	
	@FindBy(xpath="//textarea[@name='next_step']")
	WebElement Next_Steps_Description;
	
	@FindBy(xpath="//div[@name=\"type\" and @role='listbox']")
	WebElement Type_DropDown;
	
	@FindBy(xpath="//div[@name='type']//span[contains(text(),'New')]")
	WebElement Type_Select;
	
	@FindBy(xpath="//div[@name='source' and @class='ui selection dropdown']")
	WebElement Source_DropDown;
	
	@FindBy(xpath="//span[contains(text(),'Partner')]")
	WebElement Source_Select;
	
	@FindBy(xpath="//div[@class='ui right secondary pointing menu toolbar-container']/div/a[1]/button")
	WebElement Board_Button;
	
	@FindBy(xpath="//div[@class='ui card']")
	WebElement Qualify_Frame;
	
	@FindBy(xpath="//div[@class='ui padded equal width grid']/div/div[2]")
	WebElement Prospect_Frame;
	
	@FindBy(xpath="//div[@class='stretched row']/div[4]")
	WebElement Research_Frame;
	
	@FindBy(xpath="//div[@class='ui right secondary pointing menu toolbar-container']/div/a[1]/button")
	WebElement Grid_Button;
	
	@FindBy(xpath="//table[@class='ui celled sortable striped table custom-grid']/tbody/tr/td[2]")
	WebElement Created_Deals_in_Table;
	
	@FindBy(xpath="//td[@class='right aligned collapsing options-buttons-container']/a[1]/button")
	WebElement Eye_Button;
	
	@FindBy(xpath="//div[contains(text(),'Prospect')]")
	WebElement Change_Stage_Prospect;
	
	@FindBy(xpath="//button[contains(text(),'Manage Targets')]")
	WebElement Manage_Targets;
	
	@FindBy(xpath="//button[contains(text(),'Create')]")
	WebElement Create_Targets;
	
	@FindBy(xpath="//div[@class='ui fluid multiple selection dropdown']//i[@class='dropdown icon']")
	WebElement Assigned_List;
	
	@FindBy(xpath="//div[@class='selected item']//span[contains(text(),'Akash Saha')]")
	WebElement Assigned_Person;
	
	@FindBy(name="date_preset")
	WebElement Period_Dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Month')]")
	WebElement Period_Select;
	
	@FindBy(xpath="//input[@placeholder='Enter Sales Target goal']")
	WebElement value_Select;
	
	@FindBy(xpath="//div[@name='type']/i")
	WebElement Type_Target_Dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Completed deal value for period')]")
	WebElement Type_Target;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save_Target;
	
	@FindBy(xpath="//button[contains(text(),'Delete')]")
	WebElement Delete_Target;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement Delete_OK;
	
	@FindBy(xpath="//div[@class='ui fluid container no-margin'] /a[contains(text(),'Test_Deals')]")
	WebElement Verify_deals_indealsFrame;
	
	@FindBy(xpath="//div[@id=\"main-content\"]/div/div[1]/div[2]/div/div[2]/div")
	WebElement Verify_deals_summary;
	
	
	@FindBy(xpath="//div[contains(text(),'Sale Targets')]")
	WebElement Verify_Target;
	
	@FindBy(xpath="//i[@class='trash icon']")
	WebElement Delete_deals;
	
	@FindBy(xpath="//button[contains(text(),'Delete')]")
	WebElement Confirm_Delete;
	
	
	public Deals_Page_Object() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	
	public void Check_Mndatory_Fields() throws Throwable {
		
		Deals_Tab.click();
		Create_Deals_Button.click();
		Thread.sleep(2000);
		Save_Deals_Button.click();
		boolean MandatoryField=Mandatory_Fields.isDisplayed();
		Assert.assertEquals(true, MandatoryField);
		System.out.println("The Mandatory field is present?     ->    " + MandatoryField);
	}
	  
	
	public void Create_Deals(String Title, String Probability, String Descriptions, 
			String Ammounts,String Commissions, String Next_Steps_Descriptions ) throws Throwable {
		
		Deals_Tab.click();
		Create_Deals_Button.click();
		Title_Deals.sendKeys(Title);
		Deals_Assigned_To.click();
		Assigned_To_person.click();
		Set_Probability.sendKeys(Probability);
		Thread.sleep(2000);
		Description.sendKeys(Descriptions);
		Ammount.sendKeys(Ammounts);
		Commission.sendKeys(Commissions);
		Stage_Dropdown.click();
		Stage_Select.click();
		Closed_button.click();
		Status_Dropdown.click();
		Status_Select.click();
		Next_Steps_Description.sendKeys(Next_Steps_Descriptions);
		Type_DropDown.click();
		Type_Select.click();
		Source_DropDown.click();
		Source_Select.click();
		Thread.sleep(3000);
		Save_Deals_Button.click();
		Thread.sleep(3000);
	}
	
  
    public void Manage_targets(String val) throws InterruptedException {
    	
    	Deals_Tab.click();
    	Manage_Targets.click();
    	Create_Targets.click();
    	Assigned_List.click();
    	Assigned_Person.click();
    	Period_Dropdown.click();
    	value_Select.sendKeys(val);
    	Type_Target_Dropdown.click();
    	Type_Target.click();
    	Save_Target.click();
    	Thread.sleep(2000);
	    
	    
   } 
    
    
    public void Verify_Deals_Summery() {
    	
    	
    	boolean Target_present = Verify_deals_summary.isDisplayed();
    	Assert.assertEquals(true, Target_present);
    	
    }
    
    
    
    public void Verify_Deals_dealsFrame() {
    	
    	boolean Target_present = Verify_deals_indealsFrame.isDisplayed();
    	Assert.assertEquals(true, Target_present);
    	
    	
    }
    
    
    public void Verify_targets() {
    	
    	boolean Target_present = Verify_Target.isDisplayed();
    	Assert.assertEquals(true, Target_present);
    	
    }
	
	
    public void Delete_targets() {
    	Deals_Tab.click();
    	Manage_Targets.click();
    	Delete_Target.click();
    	Delete_OK.click();
    	
    }
	
    public void Delete_deals() {
    	Deals_Tab.click();
    	Delete_deals.click();
    	
    	
    	
    	
    }
    
    

}
