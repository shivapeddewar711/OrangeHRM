package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement Admin;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIM;
	@FindBy(xpath="//span[text()='Leave']")
	private WebElement Leave;
	@FindBy(xpath="//span[text()='Time']")
	private WebElement Time;
	@FindBy(xpath="//p[text()='Paul  Collings']")
	private WebElement Profilename;	
	
    //constructor
	public homepage(WebDriver driver)
	{
    PageFactory.initElements(driver, this);
    }                                                 
	public boolean Admindisplay()                   //Method
	{
		boolean text=Admin.isDisplayed();   
		System.out.println(text);
		return text;
	    }
	public boolean PIMdisplay()                   //Method
	{
		boolean text=PIM.isDisplayed();   
		System.out.println(text);
		return text;
	}
       public boolean Leavedisplay()               //Method
         {
        	 boolean text=Leave.isDisplayed();  
        	 System.out.println(text);
			 return text;
         }
          public String getProfileText()         //Method
          {
      	  String Name=Profilename.getText();
    	  System.out.println(Name);
		return Name;
      }

}
