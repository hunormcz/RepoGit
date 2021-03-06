import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.List;
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
		WebDriverWait wait = new WebDriverWait(driver, 2);
		//FirefoxDriver dr2 = new FirefoxDriver();
		
driver.manage().window().maximize();
		

driver.get("http://facebook.com");


//Log in to facebook


//missing username / pass

driver.findElement(By.id("loginbutton")).click();
java.util.List<WebElement> found = driver.findElements(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]"));
//Assert.assertTrue(found.size() > 0, "Searching for facebook button failed.");
String bodyText = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]")).getText();

if (found.size()>0 && bodyText.equals("Incorrect Email")) {
	System.out.println("Error message 1 '" +bodyText+ "' is Present");
	}else{
		System.out.println("Error message 1 is NOT Present");

	}


//incorrect credentials
WebElement element1 = driver.findElement(By.id("email"));
WebElement element2 = driver.findElement(By.id("pass"));
element1.sendKeys("test");
element2.sendKeys("test");
driver.findElement(By.id("loginbutton")).click();

found = driver.findElements(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]"));
bodyText = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]")).getText();

if (found.size() > 0 && bodyText.equals("Incorrect Email"))
{
	System.out.println("Error message 2 '" +bodyText+ "' is Present");
}
else
	{
		System.out.println("Error message 2 is NOT Present");

	}

Credentials credent = new Credentials();

//incorrect password
element1 = driver.findElement(By.id("email"));
element2 = driver.findElement(By.id("pass"));
element1.sendKeys(credent.name);
element2.sendKeys("test");
driver.findElement(By.id("loginbutton")).click();

found = driver.findElements(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]"));
bodyText = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]")).getText();

if (found.size()>0 && bodyText.equals("Please re-enter your password")) {
	System.out.println("Error message 3 '" +bodyText+ "' is Present");
	}else{
		System.out.println("Error message 3 is NOT Present");

	}

//correct login
driver.get("http://facebook.com");

element1 = driver.findElement(By.id("email"));
element2 = driver.findElement(By.id("pass"));
element1.sendKeys(credent.name);
element2.sendKeys(credent.pass);
driver.findElement(By.id("loginbutton")).click();




//









//Log out
driver.findElement(By.id("userNavigationLabel")).click();


wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span/span")));

driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();

//Close browser
driver.close();
driver.quit();

	}

}
