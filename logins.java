import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//missing username / pass
//
driver.findElement(By.id("loginbutton")).click();
java.util.List<WebElement> found = driver.findElements(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]"));
//Assert.assertTrue(found.size() > 0, "Searching for facebook button failed.");
bodyText = driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/form/div[1]/div[1]")).getText();

if (found.size()>0 && bodyText.equals("Incorrect Email")) {
	System.out.println("Error message 1 '" +bodyText+ "' is Present");
	}else{
		System.out.println("Error message 1 is NOT Present");

	}

//incorrect credentials

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
