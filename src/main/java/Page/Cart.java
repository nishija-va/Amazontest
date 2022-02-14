package Page;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Cart 
{
	WebDriver driver;
	
    public Cart(WebDriver driver) 
	 {
		 this.driver=driver;
	}

	By teddycart=By.xpath("//*[text()=\"Oxygen-01 Running Shoes for Boys\"]");
	 By addcart=By.xpath("//*[@id=\"add-to-cart-button\"]");
	 public void cartprdct() throws InterruptedException 
	 {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)");
		 driver.findElement(teddycart).click();
		 
		 String handle = driver.getWindowHandle();
		  Set<String> handles = driver.getWindowHandles();
		  handles.remove(handle);
		  String newhandle = handles.iterator().next();
		  driver.switchTo().window(newhandle);
		  
		  JavascriptExecutor js1 = (JavascriptExecutor) driver;
		  js1.executeScript("window.scrollBy(0,350)");
		  driver.findElement(addcart).click();
		  Thread.sleep(10000);
	 }
}
