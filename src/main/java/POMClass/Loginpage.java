package POMClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Login;
	
  
	//constructor
	public Loginpage(WebDriver driver) throws InterruptedException
 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
     wait=new WebDriverWait(driver,Duration.ofSeconds(20));

 }
	
	public void Sendusername(String user) throws InterruptedException    //method
	{
        Thread.sleep(3000);
	    
		username.sendKeys(user);
	}
	public void sendpassword(String pass) //method
	{
		password.sendKeys(pass);
	}
	public void ClickonLoginbutton()  //method
	{
       
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));

		Login.click();
	}
	}

	