

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class testS {
	public static void main (String args[]){
		
		FirefoxDriver dr1 = new FirefoxDriver();
		//FirefoxDriver dr2 = new FirefoxDriver();
dr1.get("http://yahoo.com");

dr1.until(ExpectedConditions.presenceOfElementLocated(By.id("yui_3_12_0_1_1436197562703_704")));

//dr1.until(ExpectedConditions.elementToBeClickable(By.id("yui_3_12_0_1_1436197562703_704")));
dr1.findElement(By.id("yui_3_12_0_1_1436197562703_704")).click();

System.out.println();
System.out.println();
}
}