package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search
{
	WebDriver driver;
	
		
	 public Search(WebDriver driver) 
	 {
	  this.driver=driver;
	 }
		
	 By se=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	 public void searchprdct() throws InterruptedException
	 {
	WebElement we= driver.findElement((se));
	we.sendKeys("shoes");
	we.submit();
	Thread.sleep(1000);
	 }

}