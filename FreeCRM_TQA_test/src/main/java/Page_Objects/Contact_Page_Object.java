package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import Test_Base.Base_class;

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
	
	@FindBy(xpath="//*[@id=\"main-content\"]/div/div[2]/form/div[7]/div[2]/div/div/div/div[1]/div/div[1]/text()")
	WebElement Phone_Country_button;
	
	@FindBy(xpath="//div[@class='visible menu transition']/div[102]")
	WebElement Phone_Country_India;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	WebElement Phone_Number_India;
	
	@FindBy(xpath="//div[@name='country']")
	WebElement CountyAddress;
	
	@FindBy(xpath="//div[@class='visible menu transition']/div[100]/span")
	WebElement Country_India;
	
	@FindBy(xpath="//input[@placeholder='Street Address']")
	WebElement StreetAddress;
	
	@FindBy(xpath="//input[@placeholder='City']")
	WebElement CityAddress;
	
	@FindBy(xpath="//input[@placeholder='State / County']")
	WebElement StateAddress;
	
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
	
	@FindBy(xpath="//button[@class='ui icon inverted button']")
	WebElement Delete_contact;
	
	@FindBy(xpath="//button[@class='ui button']")
	WebElement Delete_contact_Confirm;
	
	//button[@class='ui button']
	
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

	
	public void Create_Contact(String First_Name, String Middle_Name, String Last_Name, String Description, String State_Address, String City_Address,
			String Email, String State, String PostCode, String Mobilenumber, String Department,String Position) throws InterruptedException {
		Contact_Tab.click();
		Thread.sleep(4000);
		Create_Button.click();
		First_name.sendKeys(First_Name);
		Last_name.sendKeys(Last_Name);
		Status.click();
		New_status.click();
		Put_Email.sendKeys(Email);
		Categories.click();
		category_select_Contact.click();
		Timezones.click();
		Select_Timezone_Kolakta.click();
		//Donot_Text.click();
		Birthday_Day.sendKeys("17");
		Birthday_Month.click();
		Select_Month.click();
		Birthday_Year.sendKeys("1997");
		Thread.sleep(2000);
		//Phone_Country_button.click();
		//Thread.sleep(2000);
		//Phone_Country_India.click();
		//Phone_Number_India.sendKeys("7003785365");
		CountyAddress.click();
		Country_India.click();
		StreetAddress.sendKeys(State_Address);
		CityAddress.sendKeys(City_Address);
		StateAddress.sendKeys(State);
		Pin_code_Address.sendKeys(PostCode);
		Upload_image.sendKeys("D:\\Akash\\young-male-cartoon-design-vector-9775386.jpg");
		Thread.sleep(2000);
		Save_button.click();
		Thread.sleep(2000);
		/*
		 * Edit_Tab_button.click(); Add_note_button.click();
		 * Add_Note.sendKeys("For testing"); Save_Note.click(); Thread.sleep(2000);
		 * Delete_Note.click(); //Contact_trash_button.click(); //Thread.sleep(2000);
		 * //Confirm_Delete_contact.click(); Thread.sleep(4000);
		 */
	}
	
	public void Verify_Contact(String First_Name, String Middle_Name, String Last_Name, String Description, String State_Address, String City_Address,
			String Email, String State, String PostCode, String Mobilenumber, String Department,String Position) throws InterruptedException {
		Contact_Tab.click();
        boolean boolean_Contact_Present =  driver.findElement(By.xpath("//a[text()='"+First_Name+" "+Last_Name+"']")).isDisplayed();
        Assert.assertEquals(true, boolean_Contact_Present);
		
		
	}
	
	public void Delete_contact(String First_Name, String Middle_Name, String Last_Name, String Description, String State_Address, String City_Address,
			String Email, String State, String PostCode, String Mobilenumber, String Department,String Position) throws Throwable {
		
		Contact_Tab.click();
		driver.findElement(By.xpath("//a[text()='"+First_Name+" "+Last_Name+"']//parent::td//following-sibling::td[@class='right aligned collapsing options-buttons-container']//child::button[@class='ui icon inverted button']")).click();
		Thread.sleep(3000);
		Delete_contact_Confirm.click();
		Thread.sleep(5000);
		
	}
	
	
	
	
	

}
