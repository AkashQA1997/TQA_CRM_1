package Page_Objects;

import java.io.IOException;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

import Test_Base.Base_class;
import Utility.Read_Excel;

public class Contact_Page_Object extends Base_class{
	
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement Contact_Tab;
    
	@FindBy(xpath="//div[@id='main-content']/div/div[1]/div[2]/div/a/button")
	WebElement Create_Button;
    
	
	@FindBy(xpath="//span[contains(text(),'The field First Name is required')]")
	WebElement First_name_mandatory_message;
	
	@FindBy(xpath="//span[contains(text(),'The field Last Name is required')]")
	WebElement Last_name_mandatory_message;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement Save_button;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement First_name;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement Last_name;
	
	@FindBy(xpath="//input[@name='middle_name']")
	WebElement Middle_name;
	
	@FindBy(xpath="//div[@id=\"main-content\"]/div/div[2]/form/div[5]/div[1]/div/div")
	WebElement Status;
	
	@FindBy(xpath="//div[@class='visible menu transition']")
	WebElement Status_Menu_Container;
	
	@FindBy(xpath="//div[@name='status']/span[contains(text(),'New')]")
	WebElement New_status;
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement Home_tab;
	
	@FindBy(xpath="//a[contains(text(),'Akas test')]")
	WebElement Verify_Contact_Created;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement Put_Email;
	
	@FindBy(xpath="//div[@id=\"main-content\"]/div/div[2]/form/div[4]/div[2]/div/div")
	WebElement Categories;
	
	@FindBy(xpath="//div[@name='category'] /span[contains(text(),'Contact')]")
	WebElement category_select_Contact;
	
	@FindBy(xpath="//div[@name='timezone']/input[@class='search']")
	WebElement Timezones;
	
	@FindBy(xpath="	//span[contains(text(),'Asia/Kolkata')]")
	WebElement Select_Timezone_Kolakta;
	
	@FindBy(xpath="//input[@name= 'do_not_text']")
	WebElement Donot_Text;
	
	@FindBy(xpath="//input[@placeholder= 'Day']")
	WebElement Birthday_Day;
	
	@FindBy(xpath="//div[@name= 'month']")
	WebElement Birthday_Month;
	
	@FindBy(xpath="//div[@class='visible menu transition'] //span[contains(text(),'May')]")
	WebElement Select_Month;
	
	@FindBy(xpath="//div[@class='ui search selection dropdown']")
	WebElement Phone_Country_button;
	
	@FindBy(xpath="//div[@class='visible menu transition']/div[102]")
	WebElement Phone_Country_India;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	WebElement Phone_Number_India;
	
	@FindBy(xpath="//div[@name='country']")
	WebElement County_Address;
	
	@FindBy(xpath="//div[@class='visible menu transition']/div[100]/span")
	WebElement Country_India;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	WebElement Street_Address;
	
	@FindBy(xpath="//input[@placeholder='City']")
	WebElement City_Address;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	WebElement State_Address;
	
	@FindBy(xpath="//input[@placeholder='Post Code']")
	WebElement Pin_code_Address;
	
	@FindBy(xpath="//input[@placeholder= 'Year']")
	WebElement Birthday_Year;
	
	@FindBy(xpath="//input[@name='image']")
	WebElement Upload_image;
	
	@FindBy(xpath="//i[@class='trash icon']")
	WebElement Contact_trash_button;
	
	@FindBy(xpath="//div[@class='ui attached tabular menu']/a[2]")
	WebElement Edit_Tab_button;
	
	@FindBy(xpath="//button[@class='ui basic icon button custom-note-btn']")
	WebElement Add_note_button;

	@FindBy(xpath="//form[@class='ui form']/textarea[@rows='3']")
	WebElement Add_Note;
	
	@FindBy(xpath="//button[@class='ui green button']")
	WebElement Save_Note;
	
	@FindBy(xpath="//div[@class='extra']/button[2]")
	WebElement Delete_Note;
	
	@FindBy(xpath="//button[@class='ui left floated button']")
	WebElement Cancel_Delete_contact;
	
	@FindBy(xpath="//button[@class='ui red button']")
	WebElement Confirm_Delete_contact;
	
	@FindBy(xpath="//a[contains(text(),'Akash Saha')]")
	WebElement Created_contact;
	
	public Contact_Page_Object() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	
	public void Mandatory_Check() throws InterruptedException {
		Contact_Tab.click();
		Thread.sleep(4000);
		Create_Button.click();
		Thread.sleep(4000);
		Save_button.click();
		Thread.sleep(3000);
		boolean Firstname_mandatory = First_name_mandatory_message.isDisplayed();
		Assert.assertEquals(Firstname_mandatory, true);
		System.out.println("Firstname_Mandatory:---" + Firstname_mandatory);
		boolean Lastname_mandatory = Last_name_mandatory_message.isDisplayed();
		Assert.assertEquals(Lastname_mandatory, true);
		System.out.println("Firstname_Mandatory:---" + Lastname_mandatory);
		
		
	}

	
	public void Create_Contact() throws InterruptedException {
		Contact_Tab.click();
		Thread.sleep(4000);
		Create_Button.click();
		First_name.sendKeys("Akash");
		Last_name.sendKeys("Saha");
		Status.click();
		New_status.click();
		Put_Email.sendKeys(prop.getProperty("Email"));
		Categories.click();
		category_select_Contact.click();
		Timezones.click();
		Select_Timezone_Kolakta.click();
		//Donot_Text.click();
		Birthday_Day.sendKeys("17");
		Birthday_Month.click();
		Select_Month.click();
		Birthday_Year.sendKeys("1997");
		Phone_Country_button.click();
		Phone_Country_India.click();
		Phone_Number_India.sendKeys("7003785365");
		County_Address.click();
		Country_India.click();
		Street_Address.sendKeys("Subhasgram");
		City_Address.sendKeys("Kolkata");
		State_Address.sendKeys("South 24 pgs");
		Pin_code_Address.sendKeys("700147");
		Upload_image.sendKeys("D:\\Akash\\young-male-cartoon-design-vector-9775386.jpg");
		Save_button.click();
		Thread.sleep(3000);
		Edit_Tab_button.click();
		Add_note_button.click();
		Add_Note.sendKeys("For testing");
		Save_Note.click();
		Thread.sleep(3000);
		Delete_Note.click();
		Contact_trash_button.click();
		Confirm_Delete_contact.click();
		Thread.sleep(4000);
	}
	
	public void Verify_Contact() throws InterruptedException {
		Contact_Tab.click();
		Thread.sleep(3000);
		Create_Button.click();
		First_name.sendKeys("Akash");
		Last_name.sendKeys("Saha");
		Status.click();
		New_status.click();
		Put_Email.sendKeys(prop.getProperty("Email"));
		Categories.click();
		category_select_Contact.click();
		Timezones.click();
		Select_Timezone_Kolakta.click();
		//Donot_Text.click();
		Birthday_Day.sendKeys("17");
		Birthday_Month.click();
		Select_Month.click();
		Birthday_Year.sendKeys("1997");
		Phone_Country_button.click();
		Phone_Country_India.click();
		Phone_Number_India.sendKeys("7003785365");
		County_Address.click();
		Country_India.click();
		Street_Address.sendKeys("Subhasgram");
		City_Address.sendKeys("Kolkata");
		State_Address.sendKeys("South 24 pgs");
		Pin_code_Address.sendKeys("700147");
		Upload_image.sendKeys("D:\\Akash\\young-male-cartoon-design-vector-9775386.jpg");
		Save_button.click();
		Edit_Tab_button.click();
		Add_note_button.click();
		Add_Note.sendKeys("For testing");
		Save_Note.click();
		Thread.sleep(3000);
		Delete_Note.click();
		Contact_trash_button.click();
		Cancel_Delete_contact.click();
		Thread.sleep(3000);
		Home_tab.click();
		Thread.sleep(3000);
		boolean Contact_Creation =  Created_contact.isDisplayed();
		Assert.assertEquals(Contact_Creation, true);
		System.out.println("Created:---" + Contact_Creation);
		Contact_Tab.click();		
	}
	
	
	
	
	

}
