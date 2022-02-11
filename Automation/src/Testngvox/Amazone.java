package Testngvox;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazone {

 WebDriver driver;
 String s="https://www.amazon.in/";
	
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception
{
	
if(browser.equalsIgnoreCase("chrome"))
		{
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\nishija\\Desktop\\selenium\\cgromedriver 98\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	  driver.get(s);
       }
	
else if(browser.equalsIgnoreCase("edge"))
{
	System.setProperty("webdriver.edge.driver","C:\\Users\\nishija\\Desktop\\selenium\\edge 98\\edgedriver_win64\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	  driver.get(s);
}
}


 @Test(priority = 0 )
 public void signin() 
 {
 
  WebElement we = driver.findElement(By.xpath("(//*[text()='Hello, Sign in'])[1]"));
  we.click();
 // actions.click(we).perform();
 }

 @Test(priority = 1 )
 @Parameters("email")
 public void email(String email) 
 {
 driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
 
  driver.findElement(By.xpath("//input[@id='continue']")).click();
 }

 @Test(priority = 2 )
 @Parameters("password")
 public void pswrd(String password) 
 {
  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
 }
 @Test(priority = 3 )
 public void search() throws InterruptedException
 {
	WebElement s= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	s.sendKeys("teddy");
	s.submit();
	Thread.sleep(1000);
}
 @Test(priority = 4 )
 public void mob() throws InterruptedException
 {
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,350)");
	 driver.findElement(By.xpath("//*[text()=\"Amazon Brand - Jam & Honey Brown Teddy 33 cm\"]")).click();
	 String handle = driver.getWindowHandle();
	  Set<String> handles = driver.getWindowHandles();
	  handles.remove(handle);
	  String newhandle = handles.iterator().next();
	  driver.switchTo().window(newhandle);
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	  js1.executeScript("window.scrollBy(0,350)");
	  driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	  Thread.sleep(10000);
}
 
 
 

}