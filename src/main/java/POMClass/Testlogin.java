package POMClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testlogin {
	WebDriver driver;
	String browser;
	public void NavigateonInstagramLoginpage(String browser)//method
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
        driver.get("https://www.instagram.com/accounts/login/");
        driver.manage().window().maximize();   
	  }}

	
