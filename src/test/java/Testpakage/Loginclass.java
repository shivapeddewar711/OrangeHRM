package Testpakage;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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

import POMClass.Loginpage;
import Testutility.ReadFiles;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginclass

{
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void beforetest(String browser) throws InterruptedException, EncryptedDocumentException, IOException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			  ChromeOptions option=new ChromeOptions();
		      option.addArguments("--remote-allow-origins=*");
		      WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver(option);
		}	
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	
	 //  System.setProperty("Webdriver.chrome.driver", "D:\\chromedriver.exe");
		 
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit wait
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
	public void test() throws EncryptedDocumentException, InterruptedException, IOException 
	{
	   //	SoftAssert s=new SoftAssert();
		   Loginpage user=new Loginpage(driver);
           user.Sendusername(ReadFiles.fetchExcelsheetdata(1, 0));
           user.sendpassword(ReadFiles.fetchExcelsheetdata(1, 1));
           user.ClickonLoginbutton();
       //  String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
       //  String ActualURL=driver.getCurrentUrl();
         //Hard Assert
      //   Assert.assertEquals(ActualURL, ExpectedURL);
     //  Assert.assertNotEquals(ActualURL, ExpectedURL);
    //   Assert.assertTrue(text);
   //    Assert.assertFalse(text);
  //     Assert.fail();
    
     /*    homepage home=new homepage(driver);
 		 boolean text=home.Admindisplay();
 		 s.assertTrue(text);
 	     System.out.println("Admin option is present");
 		 
 		 boolean text1=home.PIMdisplay();
         s.assertTrue(text1);
         System.out.println("PIM option is present");
         
         boolean text2=home.Leavedisplay();
         s.assertTrue(text1);
         System.out.println("Leave option is present");
         
         String text3=home.getProfileText();
         s.assertEquals(text3,"Paul Collings");
	     s.assertAll();*/
	   //  System.out.println("browser launch");

	}
	@Test
	public void test1()
	{
      System.err.println("Test1 of suit1");
	}
	@Test
	public void test2()
	{
		System.err.println("Test2 of suit1");
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
	public void aftertest()
	{
    // driver.quit();	
	}
}

