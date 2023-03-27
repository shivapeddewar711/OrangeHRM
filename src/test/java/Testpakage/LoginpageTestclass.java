package Testpakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testutility.StaticBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageTestclass
{
  WebDriver driver;
    
  @Parameters({"browser"})
	
	@BeforeTest
	public  void beforetest(String browser)
	{
		driver= StaticBrowser.launchBrowser(browser, "https://www.instagram.com/accounts/login/", 10);
	}
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("before Class of suit1");
		}
		@BeforeMethod
		public void Beforemethod()
		{
			System.out.println("Before method of suit1");
		}
		@Test
		public void test()
		{
		   System.out.println("browser launch");
        }
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("After method of suit1");
		}
		@AfterClass
		public void afterclass()
		{
			System.out.println("After class of suit1");
		}
		@AfterTest
		public void aftertest() throws InterruptedException 
		{
		 
	     Thread.sleep(3000);
	     driver.quit();
		}
	}



