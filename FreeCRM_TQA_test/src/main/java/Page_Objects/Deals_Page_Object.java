package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
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
	
	
	public Deals_Page_Object() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	
	public void Check_Mndatory_Fields() {
		
		Deals_Tab.click();
		Create_Deals_Button.click();
		Save_Deals_Button.click();
		boolean MandatoryField=Mandatory_Fields.isDisplayed();
		Assert.assertEquals(true, MandatoryField);
		System.out.println("The Mandatory field is present?     ->    " + MandatoryField);
	}
	  
	
	public void Create_Deals() throws Throwable {
		
		Deals_Tab.click();
		Create_Deals_Button.click();
		Title_Deals.sendKeys("Test_Deals");
		Deals_Assigned_To.click();
		Assigned_To_person.click();
		Set_Probability.sendKeys("70%");
		Thread.sleep(2000);
		Description.sendKeys("This is a test perpose Description");
		Ammount.sendKeys("100");
		Commission.sendKeys("20");
		Stage_Dropdown.click();
		Stage_Select.click();
		Closed_button.click();
		Status_Dropdown.click();
		Status_Select.click();
		Next_Steps_Description.sendKeys("Description for test perpose");
		Type_DropDown.click();
		Type_Select.click();
		Source_DropDown.click();
		Source_Select.click();
		Thread.sleep(3000);
		Save_Deals_Button.click();
	}
	
	
	
	
	
	
	

}