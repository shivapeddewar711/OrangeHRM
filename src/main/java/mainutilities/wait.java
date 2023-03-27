package mainutilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {
	/*public static void waitImplicit(int timeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	*/
	public static void waitExplicit(String username,int timeout,WebDriver driver)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(username)));
	}
	/*public static void Fluentwait(int timeout,int polling)
	{
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
	             .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	}*/
}