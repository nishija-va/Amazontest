package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;

public class Login 
{
	WebDriver driver;
	 WebDriverWait wait;
		
	 public Login(WebDriver driver) 
	 {
	  this.driver=driver;
	 }
		
	 By use=By.xpath("//input[@name='email']");
	 By con=By.xpath("//input[@id='continue']");
	 By pass=By.xpath("//input[@name='password']");
	 By sub=By.xpath("(//input[@type='submit'])[1]");
	 
	
	 public void email(String email) 
	 {
//		 wait = new WebDriverWait(driver, 60);
//	WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(use));
//	we.sendKeys(email);
//	WebElement we1 = wait.until(ExpectedConditions.visibilityOfElementLocated(con));
//	we1.click();	
		 driver.findElement(use).sendKeys(email);
		 
		  driver.findElement(con).click();
	 
	 }
	 
	 
	 public void pswrd(String password) 
	 {
//		 wait = new WebDriverWait(driver, 60);
//		    WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(pass));
//			we.sendKeys(password);
//			WebElement we1 = wait.until(ExpectedConditions.visibilityOfElementLocated(sub));
//			we1.click();	
		   driver.findElement(pass).sendKeys(password);
		  driver.findElement(sub).click();
	 }
}
