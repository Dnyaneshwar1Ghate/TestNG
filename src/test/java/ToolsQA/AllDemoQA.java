package ToolsQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AllDemoQA {
	WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		//WebDriverManager.chromiumdriver().setup();
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		//use firefox browser
		 driver = new FirefoxDriver();
		//maximze 
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
	}
	@Test
	public void getUrl()
	{
		driver.get("http://www.google.com");
	}
	


}
