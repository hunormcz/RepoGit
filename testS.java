
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class testS 
{
	public static void main (String args[])
	{
		
		FirefoxDriver driver = new FirefoxDriver();
		//FirefoxDriver dr2 = new FirefoxDriver();
		
driver.manage().window().maximize();
		

driver.get("http://facebook.com");


//Log in to facebook
Credentials credent = new Credentials();

WebElement element = driver.findElement(By.id("email"));
element.sendKeys(credent.name);
element = driver.findElement(By.id("pass"));
element.sendKeys(credent.pass);
driver.findElement(By.id("loginbutton")).click();

driver.findElement(By.id("userNavigationLabel")).click();
driver.findElement(By.className("_54nh")).click();
 //_54nh
	}

}
