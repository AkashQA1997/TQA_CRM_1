package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test_Base.Base_class;

public class Contact_Page_Object extends Base_class{
	
	


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
	
	
	public Contact_Page_Object() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	
	
	
	
	
	

}
