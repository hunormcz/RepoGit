import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class testFirefox
{
	public static void main (String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
	    new WebDriverWait(driver, 4);
		
	   
	    
	    driver.manage().window().maximize();
		
	    driver.get("http://facebook.com");

String bodyText = null;

//Log in to facebook
	    WebElement element1 = driver.findElement(By.id("email"));
	    WebElement element2 = driver.findElement(By.id("pass"));
Credentials credent = new Credentials();



//correct login
driver.get("http://facebook.com");

element1 = driver.findElement(By.id("email"));
element2 = driver.findElement(By.id("pass"));
element1.sendKeys(credent.name);
element2.sendKeys(credent.pass);
driver.findElement(By.id("loginbutton")).click();




//Posting text on facebook
element1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form/div/div[2]/div/div/div[2]/div/div/textarea"));
element1.click();
int i=new Random().nextInt(100);
element1.sendKeys("test1" + i );
driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/div/div/div/form/div/div[5]/div/ul/li[2]/button")).click();
Thread.sleep(5000);
//Verify post


//driver.findElement(By.className("fbxWelcomeBoxName")).click();
Thread.sleep(4000);
String match = "test1" + i;
bodyText = driver.findElement(By.xpath(".//div[*paragraph()=match]")).getText();
System.out.println(bodyText);


//log out
driver.findElement(By.id("userNavigationLabel")).click();
driver.findElement(By.xpath(".//span[*/text()='Log Out']")).click();


//".//*[@id='u_7_1']/div/div/div[1]/div/div/ul/li[12]/a/span/span"
//"/html/body/div[2]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span/span"
//"/html/body/div[3]/div/div/div/div/div[1]/div/div/ul/li[12]/a/span"

Thread.sleep(1000);



//Close browser
driver.close();
driver.quit();

	}

}
