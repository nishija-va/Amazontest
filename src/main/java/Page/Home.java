package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home
{
	WebDriver driver;
	 WebDriverWait wait;
		
	 public Home(WebDriver driver) 
	 {
	  this.driver=driver;
	 }
		
	 By signin=By.xpath("(//*[text()='Hello, Sign in'])[1]");
	
	 public void LoginAmazon() 
	 {
//	  wait = new WebDriverWait(driver, 20);
//	 WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(signin));
//	 we.click();	
	 driver.findElement(signin).click();

	  }
	 
		
	
}
