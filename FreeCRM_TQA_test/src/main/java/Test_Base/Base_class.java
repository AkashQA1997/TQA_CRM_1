package Test_Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import Listners.Webevent_Listners;
import Project_Constatnt.Framework_Constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {
	public static Properties prop;
    public static WebDriver driver;

	public static  void Initialization(String Browser) throws InterruptedException, IOException {
		
		prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(Framework_Constant.getPropertiesFilePath());
			prop.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		//String Browser = prop.getProperty("Browser");
		String URL = prop.getProperty("URL");
		System.out.println(URL);
		System.out.println(Browser);

		
		if(Browser.contentEquals("Chrome")) {
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	}else  if (Browser.contentEquals("Firefox")) {
		WebDriverManager.firefoxdriver().setup(); 
		driver = new FirefoxDriver();
	}
	
		EventFiringWebDriver E_driver = new EventFiringWebDriver(driver);
		Webevent_Listners events_Listner = new Webevent_Listners();
		E_driver.register(events_Listner);
		driver= E_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		Thread.sleep(3000);
		
	
		
  }
	
	
	public void onTestfailure(String failed_Method) throws Throwable {
		 File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(srcFile, new File (Framework_Constant.getFailedScreenshotPath() +failed_Method +".jpg"));


		// TODO Auto-generated method stub
		
	}
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
}