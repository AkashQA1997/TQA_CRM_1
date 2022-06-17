package Page_Objects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Base.Base_class;

public class Home_Page_Object extends Base_class {
	

	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement Home_Button;
	

	@FindBy(xpath="//div[contains(text(),'Contacts activity stream')]")
	WebElement First_header;
	
	@FindBy(xpath="//div[contains(text(),'Deals')]")
	WebElement Second_header;
	
	@FindBy(xpath="//span[contains(text(),'Call Queue')][1]")
	WebElement Third_header;
	
	@FindBy(xpath="//span[contains(text(),'Upcoming calls')][1]")
	WebElement Forth_header;
	
	@FindBy(xpath="//div[contains(text(),'Twitter')]")
	WebElement Fifth_header;
	
	
	public Home_Page_Object() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Home_button_validation() throws InterruptedException {
		  Actions AC1 = new Actions(driver);
		  AC1.moveToElement(Home_Button);
		  Thread.sleep(4000);
		  boolean home_button =  Home_Button.isDisplayed();
		  Assert.assertEquals(true, home_button);
		  Thread.sleep(4000);
	}
	
	public void First_hader_validation() {
			
		 boolean first_hader = First_header.isDisplayed();	
		// Assert.assertEquals(true, first_hader);
		 System.out.println("First hader is displayed" + first_hader );
	}
	public void Second_hader_validation() {
		
		 boolean second_hader = Second_header.isDisplayed();
	     //Assert.assertEquals(true, Second_header);
		 System.out.println("Second hader is displayed" + second_hader);
	}
	public void Third_hader_validation() {
		
		 boolean Third_hader = Third_header.isDisplayed();	
		 //Assert.assertEquals(true, Third_hader );
		 System.out.println("Third hader is displayed" + Third_hader);
	}
	public void Forth_hader_validation() {
		
		 boolean forth_hader = Forth_header.isDisplayed();
		 //Assert.assertEquals(true, forth_hader);
		 System.out.println("Forth hader is displayed" + forth_hader);
	}
	public void Fifth_hader_validation() {
		
		 boolean fifth_hader = Fifth_header.isDisplayed();
		 //Assert.assertEquals( true,fifth_hader);
		 System.out.println("Fifth hader is displayed" + fifth_hader);
	}
	
	
	
	

}
