package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstDemo {
	
	@Test
	public void get() throws InterruptedException
	{
		
		//set property 
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		 
		//use firefox browser
		WebDriver driver = new FirefoxDriver();
		//maximze 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//open url
		driver.get("https://demoqa.com");
		
		Thread.sleep(3000);
		//click on elements
		driver.findElement(By.xpath("//div[@class='home-body']/div/div[1]/div/div[3]")).click();
		
	}

}
