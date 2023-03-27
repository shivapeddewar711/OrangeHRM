package Testutility;

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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser {
 static WebDriver driver;
	public static WebDriver launchBrowser(String browser,String URL,int timeout)
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
		
		driver.manage().window().maximize();
		driver.get(URL);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		return driver;
	}
}