package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath="//input[@placeholder= 'Year']")
	WebElement Birthday_Year;
	
	@FindBy(xpath="//input[@name='image']")
	WebElement Upload_image;
	
	
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
		Thread.sleep(3000);
		Put_Email.sendKeys("Akash@gmail.com");
		Categories.click();
		category_select_Contact.click();
		Timezones.click();
		Select_Timezone_Kolakta.click();
		//Donot_Text.click();
		Birthday_Day.sendKeys("17");
		Birthday_Month.click();
		Thread.sleep(3000);
		Select_Month.click();
		Birthday_Year.sendKeys("1997");
		Thread.sleep(3000);
		Upload_image.sendKeys("D:\\Akash\\young-male-cartoon-design-vector-9775386.jpg");
		Thread.sleep(3000);
		//Save_button.click();
		Thread.sleep(3000);
	}
	
	public void Verify_Contact() {
		Home_tab.click();
		boolean Contact_Creation = First_name_mandatory_message.isDisplayed();
		Assert.assertEquals(Contact_Creation, true);
		System.out.println("Firstname_Mandatory:---" + Contact_Creation);
		
	}
	
	
	
	
	

}
