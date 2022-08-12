package Page_Objects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Test_Base.Base_class;

public class Calender_Page_Object extends Base_class {
	
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement Calendar_Tab;
	
	@FindBy (xpath = "//div[@class='rbc-toolbar']/span[2]" )
	WebElement Months_Years;
	
	@FindBy (xpath ="//i[@class='chevron right icon']//parent :: button")
	WebElement Next_Month;
	
	@FindBy (xpath ="//button[contains(text(),'Create')]")
	WebElement Create_Event;
	
	@FindBy(xpath="//div[@class='rbc-events-container']")
	WebElement Time_Slot;
	
	@FindBy (xpath ="//input[@name='title']")
	WebElement Title_Event;
	
	@FindBy (xpath ="//textarea[@name='description']")
	WebElement Description_Box;
	
	
	@FindBy (xpath ="//button[@class='ui linkedin button']")
	WebElement Save_button;
	
	@FindBy (xpath ="//button[@class='ui linkedin disabled button']")
	WebElement Save_button_disable;
	
	@FindBy (xpath ="//span[text()='Required']")
	WebElement Mandatory_field;
	
	@FindBy (xpath ="//label[text()='Alert Before']//parent::div/div/i[@class='dropdown icon']")
	WebElement Alert_before_dropdown;
	
	
	
	
	
	
	
	
	
	
	
	

	public Calender_Page_Object() throws IOException {
     
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void Create_Event(String Month_Year , String Date, String Title,String Category,
			String Description, String Location, String Alert_Before, String Identifier ) throws Throwable {
		float float_Date = Float.parseFloat(Date);
		Integer Given_Date = Math.round(float_Date);
		Calendar_Tab.click();
// Expected Month 
		 while(true) {
			 
	
		String MM_YY = Months_Years.getText();
		if (MM_YY.equalsIgnoreCase(Month_Year)) {
			
		     break;
		}
		else 
			{
			Next_Month.click();
			}
		 }
		 System.out.println(Given_Date);
		driver.findElement(By.xpath("//a[text()='"+Given_Date+"']")).click();

		

// create event
		Thread.sleep(3000);
		Time_Slot.click(); 
		
		
	}
	
	
	
	
	
	public void Mandatory_field(String Month_Year , String Date, String Title,String Category,
			String Description, String Location, String Alert_Before, String Identifier ) throws Throwable {
		float float_Date = Float.parseFloat(Date);
		Integer Given_Date = Math.round(float_Date);
		 Calendar_Tab.click();
// Expected Month 
		 while(true) {
			 
	
		String MM_YY = Months_Years.getText();
		if (MM_YY.equalsIgnoreCase(Month_Year)) {
			
		     break;
		}
		else 
			{
			Next_Month.click();
			}
		 }
		 System.out.println(Given_Date);
		driver.findElement(By.xpath("//a[text()='"+Given_Date+"']")).click();

		

// create event
		Thread.sleep(3000);
		Time_Slot.click(); 
		Title_Event.click(); 
		Description_Box.click();
		Thread.sleep(2000); 
		boolean bol_disable =Save_button_disable.isDisplayed(); Assert.assertEquals(true, bol_disable);
		boolean bol_Mandetory = Mandatory_field.isDisplayed();
		Assert.assertEquals(true, bol_Mandetory);
			 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
