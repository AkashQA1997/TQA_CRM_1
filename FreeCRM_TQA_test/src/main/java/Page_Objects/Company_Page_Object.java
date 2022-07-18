package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Base.Base_class;

public class Company_Page_Object extends Base_class {

	
	@FindBy (xpath="//span[contains(text(),'Companies')]")
	WebElement Company_Tab;

	@FindBy (xpath="//div[@class='ui right secondary pointing menu toolbar-container']/div/a/button")
	WebElement Create_Company_Button;
	
	@FindBy (xpath="//div[@class='ui right secondary pointing menu toolbar-container']/div/button[2]")
	WebElement Save_Company_Button;
	
	@FindBy (xpath="//span[contains(text(),'The field Name is required')]")
	WebElement Mandatory_Alert;
	
	@FindBy (xpath="//div[@class='ui right corner labeled input'] /input[@name='name']")
	WebElement Name_Of_Comapny;
	
	@FindBy (xpath="//div[@class='fields']/div[5]/div[@name='country']")
	WebElement Country_Address;
	
	@FindBy (xpath="//div[@class='fields']/div[5]/div[@name='country']/div[2]/div[100]")
	WebElement Country_Address_Select;
	
	@FindBy (xpath="//input[@placeholder='Street Address']")
	WebElement StreetAddress;
	
	
	@FindBy (xpath="//input[@placeholder='City']")
	WebElement CityAddress;
	
	@FindBy (xpath="//input[@placeholder='State / County']")
	WebElement StateAddress;
	
	@FindBy (xpath="//input[@placeholder='Post Code']")
	WebElement PostCode;
	
	@FindBy (xpath="//div[@class='four fields']/div/div[@class='ui search selection dropdown']")
	WebElement Phone_number_country_select;
	
	@FindBy (xpath="//div[@class='visible menu transition']/div[102]")
	WebElement Phone_number_country;
	
	@FindBy (xpath="//input[@placeholder='Number']")
	WebElement Phonenumber;
	
	@FindBy (xpath="//input[@placeholder='Home, Work, Mobile...']")
	WebElement Phonenumber_place;
	
	@FindBy (xpath="//textarea[@name='description']")
	WebElement Description_Company;
	
	@FindBy (xpath="//div[@class='three fields']/div[@class='ui field']/div[@class='ui selection dropdown']")
	WebElement Select_Social_media;
	
	@FindBy (xpath="//div[@class='visible menu transition']/div[3]")
	WebElement SelectLinkedin;
	
	@FindBy (xpath="//input[@placeholder='LinkedIn profile link' and @type='text']")
	WebElement SelectLinkedin_Profile;
	
	@FindBy (xpath="//input[@name='industry']")
	WebElement Industrytype;
	
	@FindBy (xpath="//input[@name='num_employees']")
	WebElement Numberof_Employee;
	
	@FindBy (xpath="//input[@name='symbol']")
	WebElement RupeeSymbol;
	
	@FindBy (xpath="//input[@name='annual_revenue']")
	WebElement Annualrevenue;
	
	@FindBy (xpath="//div[@name='priority' and @class='ui selection dropdown']")
	WebElement Priority_Select;
	
	@FindBy (xpath="//div[@name='priority'] /span[contains(text(),'Medium')]")
	WebElement Priority_Medium_Select;
	
	@FindBy (xpath="//div[@name='status' and @role='listbox']")
	WebElement Select_Status;
	
	@FindBy (xpath="//div[@name='status' and @role='option'] /span[contains(text(),'Inactive')]")
	WebElement Select_Status_inactive;
	
	@FindBy (xpath="//div[@name='source' and @role='listbox'] ")
	WebElement Select_Source;
	
	@FindBy (xpath="//div[@name='source' and @role='option'] /span[contains(text(),'Web Service')]")
	WebElement Select_Source_WebService;
	
	@FindBy (xpath="//div[@name='category' and @role='listbox']")
	WebElement Select_Category;
	
	@FindBy (xpath="//div[@name='category' and @role='option'] /span[contains(text(),'Prospect')]")
	WebElement Select_Category_Prospect;
	
	@FindBy (xpath="//input[@name='vat_number']")
	WebElement VatNumber;
	
	@FindBy (xpath="//a[contains(text(),'Test_Company')]")
	WebElement Company_created;
	
	@FindBy (xpath="//*[@id=\"main-content\"]/div/div[2]/div/table/tbody/tr/td[2]")
	WebElement Company_created_CheckBox;
	
	@FindBy (xpath="//button[@class='ui icon inverted button']/i[@class='trash icon']")
	WebElement Delete_Company_created;
	
	@FindBy (xpath="//button[@class='ui black button']")
	WebElement Cancel_Company_created;
	
	@FindBy (xpath="//button[@class='ui button']")
	WebElement Confirm_Delete;
	
	
	@FindBy (xpath="///div[contains(text(),'Move to the bin')]")
	WebElement Confirm_Delete_Hader;
	
	
	
	public Company_Page_Object() throws IOException {
		PageFactory.initElements(driver,this);

	}
	
	
	public void Company_creation_form_mandatory_fields() throws Throwable {
		
		Company_Tab.click();
		Thread.sleep(4000);
		Create_Company_Button.click();
		Thread.sleep(3000);
		Save_Company_Button.click();
		Thread.sleep(4000);
		boolean Present = Mandatory_Alert.isDisplayed();
		Assert.assertEquals(true, Present);
		System.out.println("Is the mandatory field is present..:-" + Present);
	}

	public void Create_Company(String First_Name, String Street_Address, String City_Address, String State_Address, String Post_Code, 
			String Phone_number, String Phone_number_place,String Description,String Select_Linkedin_Profile, String Industry_type,String Number_of_Employee,
            String Rupee_Symbol, String Annual_revenue, String Vat_Number  ) throws Throwable {
		Company_Tab.click();
		Thread.sleep(4000);
		Create_Company_Button.click();
		Name_Of_Comapny.sendKeys(First_Name);
		Country_Address.click();
		Country_Address_Select.click();
		StreetAddress.sendKeys(Street_Address);
		CityAddress.sendKeys(City_Address);
		StateAddress.sendKeys(State_Address);
		PostCode.sendKeys(Post_Code);
		Phone_number_country_select.click();
		Phone_number_country.click();
		Phonenumber.sendKeys(Phone_number);
		Phonenumber_place.sendKeys(Phone_number_place);
		Description_Company.sendKeys(Description);
		Select_Social_media.click();
		SelectLinkedin.click();
		SelectLinkedin_Profile.sendKeys(Select_Linkedin_Profile);
		Industrytype.sendKeys(Industry_type);
		Numberof_Employee.sendKeys(Number_of_Employee);
		RupeeSymbol.sendKeys(Rupee_Symbol);
		Annualrevenue.sendKeys(Annual_revenue);
		Priority_Select.click();
		Priority_Medium_Select.click();
		Select_Status.click();
		Select_Status_inactive.click();
		Select_Source.click();
		Select_Source_WebService.click();
		Select_Category.click();
		Select_Category_Prospect.click();
		VatNumber.sendKeys(Vat_Number);
		Thread.sleep(4000);
		Save_Company_Button.click();
		Company_Tab.click();
		Thread.sleep(4000);
		
	}
	
	
	
	public void Create_Varify() {
		
		Company_Tab.click();
		boolean boolean_company_created = Company_created.isDisplayed();
		Assert.assertEquals(true, boolean_company_created);
		System.out.println("The company is created:--"+ boolean_company_created);
	}
	
	
	public void Delete_Comany() throws Throwable {
		Company_Tab.click();
		Company_created_CheckBox.click();
		Delete_Company_created.click();
		Thread.sleep(4000);
		Confirm_Delete.click();
		Thread.sleep(4000);
	}
	

}
