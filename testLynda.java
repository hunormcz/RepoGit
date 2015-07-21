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

public class testLynda
{
	public static void main (String args[]) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
	    new WebDriverWait(driver, 4);
		
	   
	    
	    driver.manage().window().maximize();
		
	    driver.get("http://release.lynda.com");

String bodyText = null;

//Log in to lynda
driver.findElement(By.id("login-modal")).click();


Thread.sleep(3000);
driver.switchTo().frame("fancybox-frame");
WebElement element1 = driver.findElement(By.xpath(".//*[@id='usernameInput']"));
WebElement element2 = driver.findElement(By.xpath(".//*[@id='passwordInput']"));

	    

//correct login


element1.sendKeys("lyndaqa_lcip");
element2.sendKeys("lynda1!");
driver.findElement(By.id("lnk_login")).click();


driver.switchTo().defaultContent();




driver.get("http://release.lynda.com/member.aspx");


//Verify My courses pod:
java.util.List<WebElement> found = driver.findElements(By.xpath(".//*[@id='homeCourseHistory']/h1"));
bodyText = driver.findElement(By.xpath(".//*[@id='homeCourseHistory']/h1")).getText();

if (found.size() > 0 && bodyText.equals("My courses"))
{
	System.out.println(bodyText+ "is Present");
}
else
	{
		System.out.println("History Pod is NOT Present");

	}

//Verify newcourses pod:

found = driver.findElements(By.xpath(".//*[@id='latestNewReleasesTop']/h1"));
bodyText = driver.findElement(By.xpath(".//*[@id='latestNewReleasesTop']/h1")).getText();

if (found.size() > 0 && bodyText.equals("New courses"))
{
	System.out.println(bodyText+ "is Present");
}
else
	{
		System.out.println("New Courses Pod is NOT Present");

	}






//log out
driver.findElement(By.xpath(".//*[@id='eyebrow']/ul/li[3]/a")).click();
driver.findElement(By.xpath(".//*[@id='eyebrow']/ul/li[3]/ul/li[1]/a")).click();




//Close browser
driver.close();
driver.quit();

	}

}
